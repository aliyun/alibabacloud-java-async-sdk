// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApiExportsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiExportsResponseBody</p>
 */
public class DescribeApiExportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiExports")
    private java.util.List < ApiExports> apiExports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeApiExportsResponseBody(Builder builder) {
        this.apiExports = builder.apiExports;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiExportsResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiExports
     */
    public java.util.List < ApiExports> getApiExports() {
        return this.apiExports;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < ApiExports> apiExports; 
        private String requestId; 
        private Long total; 

        /**
         * <p>The returned data export tasks.</p>
         */
        public Builder apiExports(java.util.List < ApiExports> apiExports) {
            this.apiExports = apiExports;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9532525-E885-54E7-A178-D5554D563AFB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the data export task. Valid values:</p>
         * <ul>
         * <li><strong>expired</strong>: The file is expired.</li>
         * <li><strong>exporting</strong>: Data is being exported.</li>
         * <li><strong>completed</strong>: Data is exported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeApiExportsResponseBody build() {
            return new DescribeApiExportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiExportsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiExportsResponseBody</p>
     */
    public static class ApiExports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ApiExports(Builder builder) {
            this.createTime = builder.createTime;
            this.fileName = builder.fileName;
            this.fileUrl = builder.fileUrl;
            this.format = builder.format;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiExports create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long createTime; 
            private String fileName; 
            private String fileUrl; 
            private String format; 
            private String status; 
            private String type; 

            /**
             * <p>The time when the data export task was created. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1725604852</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>file_16109541456445334c0f01d9a7444e0e908***.csv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The download URL of the exported file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://waf-api-sec-cn.***.aliyuncs.com/file_1610954145***.csv">https://waf-api-sec-cn.***.aliyuncs.com/file_1610954145***.csv</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>The format of the exported file.</p>
             * 
             * <strong>example:</strong>
             * <p>CSV</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The status of the data export task. Valid values:</p>
             * <ul>
             * <li><p><strong>expired</strong>: The file is expired.</p>
             * </li>
             * <li><p><strong>exporting</strong>: Data is being exported.</p>
             * </li>
             * <li><p><strong>completed</strong>: Data is exported.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the data export task. Valid values:</p>
             * <ul>
             * <li><p><strong>apisec_api</strong>: API tasks</p>
             * </li>
             * <li><p><strong>apisec_abnormal</strong>: API risk tasks</p>
             * </li>
             * <li><p><strong>apisec_event</strong>: API security event tasks</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>apisec_api</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ApiExports build() {
                return new ApiExports(this);
            } 

        } 

    }
}
