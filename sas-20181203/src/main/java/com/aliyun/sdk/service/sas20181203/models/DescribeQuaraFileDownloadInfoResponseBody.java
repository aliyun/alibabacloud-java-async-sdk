// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeQuaraFileDownloadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQuaraFileDownloadInfoResponseBody</p>
 */
public class DescribeQuaraFileDownloadInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("Md5")
    private String md5;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("QuaraFileId")
    private Integer quaraFileId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.NameInMap("Uuid")
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
         * <p>The URL that is used to download the file. The URL is valid for five minutes.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&OSSAccessKeyId=xxx">https://xxxxxxxx.oss-cn-hangzhou-1.aliyuncs.com/xxxxx/xxxxxxxxxxxxxx?Expires=1671448125&amp;OSSAccessKeyId=xxx</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The MD5 hash value of the quarantined file.</p>
         * 
         * <strong>example:</strong>
         * <p>bb62ef1311bc564377a0378d3axxxxxx</p>
         */
        public Builder md5(String md5) {
            this.md5 = md5;
            return this;
        }

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/test</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The ID of the quarantined file.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder quaraFileId(Integer quaraFileId) {
            this.quaraFileId = quaraFileId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>29874225-EAAC-5415-8501-32DD20FXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tag that is added to the related alert.</p>
         * 
         * <strong>example:</strong>
         * <p>6d4ff40a22b15c86adecf2aa48xxxxx</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
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
