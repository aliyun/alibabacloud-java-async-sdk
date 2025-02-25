// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryChannelItemBillDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>QueryChannelItemBillDownloadUrlResponseBody</p>
 */
public class QueryChannelItemBillDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryChannelItemBillDownloadUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChannelItemBillDownloadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryChannelItemBillDownloadUrlResponseBody build() {
            return new QueryChannelItemBillDownloadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryChannelItemBillDownloadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChannelItemBillDownloadUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillId")
        private String billId;

        @com.aliyun.core.annotation.NameInMap("FileDownloadUrl")
        private String fileDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Data(Builder builder) {
            this.billId = builder.billId;
            this.fileDownloadUrl = builder.fileDownloadUrl;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return billId
         */
        public String getBillId() {
            return this.billId;
        }

        /**
         * @return fileDownloadUrl
         */
        public String getFileDownloadUrl() {
            return this.fileDownloadUrl;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String billId; 
            private String fileDownloadUrl; 
            private String message; 

            /**
             * BillId.
             */
            public Builder billId(String billId) {
                this.billId = billId;
                return this;
            }

            /**
             * FileDownloadUrl.
             */
            public Builder fileDownloadUrl(String fileDownloadUrl) {
                this.fileDownloadUrl = fileDownloadUrl;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryChannelItemBillDownloadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChannelItemBillDownloadUrlResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Model(Builder builder) {
            this.data = builder.data;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
