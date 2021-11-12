// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeQuaraFileDownloadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQuaraFileDownloadInfoResponseBody</p>
 */
public class DescribeQuaraFileDownloadInfoResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    private String downloadUrl;

    @NameInMap("Md5")
    private String md5;

    @NameInMap("Path")
    private String path;

    @NameInMap("QuaraFileId")
    private Integer quaraFileId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tag")
    private String tag;

    @NameInMap("Uuid")
    private String uuid;


    private DescribeQuaraFileDownloadInfoResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.md5 = builder.md5;
        this.path = builder.path;
        this.quaraFileId = builder.quaraFileId;
        this.requestId = builder.requestId;
        this.tag = builder.tag;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQuaraFileDownloadInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return quaraFileId
     */
    public Integer getQuaraFileId() {
        return this.quaraFileId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String downloadUrl; 
        private String md5; 
        private String path; 
        private Integer quaraFileId; 
        private String requestId; 
        private String tag; 
        private String uuid; 

        /**
         * <p>DownloadUrl.</p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>Md5.</p>
         */
        public Builder md5(String md5) {
            this.md5 = md5;
            return this;
        }

        /**
         * <p>Path.</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>QuaraFileId.</p>
         */
        public Builder quaraFileId(Integer quaraFileId) {
            this.quaraFileId = quaraFileId;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Tag.</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public DescribeQuaraFileDownloadInfoResponseBody build() {
            return new DescribeQuaraFileDownloadInfoResponseBody(this);
        } 

    } 

}
