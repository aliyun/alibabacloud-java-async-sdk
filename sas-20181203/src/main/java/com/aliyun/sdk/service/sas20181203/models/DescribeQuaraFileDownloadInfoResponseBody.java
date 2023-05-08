// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
         * The URL that is used to download the file. The URL is valid for five minutes.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * The MD5 hash value of the quarantined file.
         */
        public Builder md5(String md5) {
            this.md5 = md5;
            return this;
        }

        /**
         * The file path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * The ID of the quarantined file.
         */
        public Builder quaraFileId(Integer quaraFileId) {
            this.quaraFileId = quaraFileId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tag that is added to the related alert.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * The UUID of the server.
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
