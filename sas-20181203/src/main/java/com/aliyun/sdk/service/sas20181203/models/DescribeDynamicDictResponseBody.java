// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDynamicDictResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDynamicDictResponseBody</p>
 */
public class DescribeDynamicDictResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.NameInMap("OssUrl")
    private String ossUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadTime")
    private Long uploadTime;

    private DescribeDynamicDictResponseBody(Builder builder) {
        this.count = builder.count;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.limit = builder.limit;
        this.ossUrl = builder.ossUrl;
        this.requestId = builder.requestId;
        this.uploadTime = builder.uploadTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDynamicDictResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return ossUrl
     */
    public String getOssUrl() {
        return this.ossUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadTime
     */
    public Long getUploadTime() {
        return this.uploadTime;
    }

    public static final class Builder {
        private Integer count; 
        private String fileName; 
        private Long fileSize; 
        private Integer limit; 
        private String ossUrl; 
        private String requestId; 
        private Long uploadTime; 

        /**
         * The number of weak password rules that are added.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The name of the OSS object that contains custom weak passwords.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * The size of the OSS object. Unit: bytes.
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * The maximum number of weak password rules that can be added.
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The IP address of the Object Storage Service (OSS) object.
         */
        public Builder ossUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The timestamp when the OSS object was uploaded. Unit: milliseconds.
         */
        public Builder uploadTime(Long uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }

        public DescribeDynamicDictResponseBody build() {
            return new DescribeDynamicDictResponseBody(this);
        } 

    } 

}
