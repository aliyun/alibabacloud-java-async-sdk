// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link QueryInnerProductInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInnerProductInfoResponseBody</p>
 */
public class QueryInnerProductInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryInnerProductInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInnerProductInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryInnerProductInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryInnerProductInfoResponseBody build() {
            return new QueryInnerProductInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryInnerProductInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInnerProductInfoResponseBody</p>
     */
    public static class DataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InnerProductCode")
        private String innerProductCode;

        @com.aliyun.core.annotation.NameInMap("InnerProductName")
        private String innerProductName;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        private DataInfo(Builder builder) {
            this.innerProductCode = builder.innerProductCode;
            this.innerProductName = builder.innerProductName;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInfo create() {
            return builder().build();
        }

        /**
         * @return innerProductCode
         */
        public String getInnerProductCode() {
            return this.innerProductCode;
        }

        /**
         * @return innerProductName
         */
        public String getInnerProductName() {
            return this.innerProductName;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private String innerProductCode; 
            private String innerProductName; 
            private String productCode; 
            private String productName; 

            private Builder() {
            } 

            private Builder(DataInfo model) {
                this.innerProductCode = model.innerProductCode;
                this.innerProductName = model.innerProductName;
                this.productCode = model.productCode;
                this.productName = model.productName;
            } 

            /**
             * InnerProductCode.
             */
            public Builder innerProductCode(String innerProductCode) {
                this.innerProductCode = innerProductCode;
                return this;
            }

            /**
             * InnerProductName.
             */
            public Builder innerProductName(String innerProductName) {
                this.innerProductName = innerProductName;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public DataInfo build() {
                return new DataInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryInnerProductInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInnerProductInfoResponseBody</p>
     */
    public static class Pagination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        private Pagination(Builder builder) {
            this.limit = builder.limit;
            this.page = builder.page;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        public static final class Builder {
            private Integer limit; 
            private Integer page; 

            private Builder() {
            } 

            private Builder(Pagination model) {
                this.limit = model.limit;
                this.page = model.page;
            } 

            /**
             * Limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryInnerProductInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInnerProductInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInfo")
        private java.util.List<DataInfo> dataInfo;

        @com.aliyun.core.annotation.NameInMap("Pagination")
        private Pagination pagination;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.dataInfo = builder.dataInfo;
            this.pagination = builder.pagination;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataInfo
         */
        public java.util.List<DataInfo> getDataInfo() {
            return this.dataInfo;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<DataInfo> dataInfo; 
            private Pagination pagination; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataInfo = model.dataInfo;
                this.pagination = model.pagination;
                this.total = model.total;
            } 

            /**
             * DataInfo.
             */
            public Builder dataInfo(java.util.List<DataInfo> dataInfo) {
                this.dataInfo = dataInfo;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
