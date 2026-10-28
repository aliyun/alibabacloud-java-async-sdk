// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link ListExportTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListExportTasksResponseBody</p>
 */
public class ListExportTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListExportTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExportTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListExportTasksResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The status code of the returned result. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>asda1231as</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListExportTasksResponseBody build() {
            return new ListExportTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListExportTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.message = builder.message;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String createTime; 
            private String fileName; 
            private Long id; 
            private String message; 
            private String status; 
            private String statusCode; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.fileName = model.fileName;
                this.id = model.id;
                this.message = model.message;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.url = model.url;
            } 

            /**
             * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-01 10:22:11</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>511376624869_quota_2023-06-22_2023-12-21_all_2023122121310057</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The unique ID of the export task.</p>
             * 
             * <strong>example:</strong>
             * <p>12355</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The prompt message.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The display status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>Export Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status code of the task. Valid values:</p>
             * <ul>
             * <li>2: Exporting.</li>
             * <li>3: Export successful.</li>
             * <li>-1: Export failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The download URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>//aliyun-eco-market-servic-singapore.oss-ap-southeast-1.aliyuncs.com/511376624869_quota_2023-06-22_2023-12-21_all_2023122121310057</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
