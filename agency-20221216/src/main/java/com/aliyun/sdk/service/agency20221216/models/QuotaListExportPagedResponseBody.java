// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuotaListExportPagedResponseBody} extends {@link TeaModel}
 *
 * <p>QuotaListExportPagedResponseBody</p>
 */
public class QuotaListExportPagedResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private QuotaListExportPagedResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaListExportPagedResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private java.util.List < Data> data; 
        private String msg; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * Status code of returning result, 200 means success.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Listed data of returning result
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Description of returning result
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Current page number
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * Record number on each page
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ID of the Request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total volume
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QuotaListExportPagedResponseBody build() {
            return new QuotaListExportPagedResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Message")
        private String message;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusCode")
        private String statusCode;

        @NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.fileName = builder.fileName;
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
            private String message; 
            private String status; 
            private String statusCode; 
            private String url; 

            /**
             * Create Time
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * File Name
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Notification Message
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Display of Task Status
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Task Status Enum</br>
             * <p>
             * 2: Exporting</br>
             * 3: Export Success</br>
             * -1: Export Fail</br>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * The link to download exported file.
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
