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
 * {@link DescribeCustomizedDictResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizedDictResponseBody</p>
 */
public class DescribeCustomizedDictResponseBody extends TeaModel {
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

    private DescribeCustomizedDictResponseBody(Builder builder) {
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

    public static DescribeCustomizedDictResponseBody create() {
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

        private Builder(DescribeCustomizedDictResponseBody model) {
            this.count = model.count;
            this.fileName = model.fileName;
            this.fileSize = model.fileSize;
            this.limit = model.limit;
            this.ossUrl = model.ossUrl;
            this.requestId = model.requestId;
            this.uploadTime = model.uploadTime;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * FileSize.
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * OssUrl.
         */
        public Builder ossUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadTime.
         */
        public Builder uploadTime(Long uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }

        public DescribeCustomizedDictResponseBody build() {
            return new DescribeCustomizedDictResponseBody(this);
        } 

    } 

}
