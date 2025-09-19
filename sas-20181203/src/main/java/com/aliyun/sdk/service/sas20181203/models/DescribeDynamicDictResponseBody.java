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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDynamicDictResponseBody model) {
            this.count = model.count;
            this.fileName = model.fileName;
            this.fileSize = model.fileSize;
            this.limit = model.limit;
            this.ossUrl = model.ossUrl;
            this.requestId = model.requestId;
            this.uploadTime = model.uploadTime;
        } 

        /**
         * <p>The number of weak password rules that are added.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The name of the OSS object that contains custom weak passwords.</p>
         * 
         * <strong>example:</strong>
         * <p>test_dict.plain</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The size of the OSS object. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * <p>The maximum number of weak password rules that can be added.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * <p>The IP address of the Object Storage Service (OSS) object.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudtest01/661767e1-5ae3-4ec5-865f-03039436893a/sacc2*****</p>
         */
        public Builder ossUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3D7C47D-3F11-57BB-90E8-E5C20C61****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timestamp when the OSS object was uploaded. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719919421</p>
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
