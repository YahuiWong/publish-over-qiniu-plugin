package cc.meetpasser;

import org.kohsuke.stapler.DataBoundConstructor;

public class QiniuEntry {
    public String profileName, source, bucket, prefix, netUrl, urlsFile/* , formatKey */;
    public boolean noUploadOnExists, noUploadOnFailure;

    public QiniuEntry() {
    }

    @DataBoundConstructor
    public QiniuEntry(String profileName, String source, String bucket, String prefix, String netUrl, String urlsFile,
            /* String formatKey, */boolean noUploadOnFailure, boolean noUploadOnExists) {
        this.profileName = profileName;
        this.source = source;
        this.bucket = bucket;
        this.prefix = prefix;
        this.netUrl = netUrl;
        this.urlsFile = urlsFile;
        this.noUploadOnExists = noUploadOnExists;
        this.noUploadOnFailure = noUploadOnFailure;
        // this.formatKey = formatKey;
    }

}
