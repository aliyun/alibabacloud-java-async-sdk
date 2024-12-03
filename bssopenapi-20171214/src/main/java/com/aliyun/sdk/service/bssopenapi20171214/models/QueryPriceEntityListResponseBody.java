// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryPriceEntityListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPriceEntityListResponseBody</p>
 */
public class QueryPriceEntityListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryPriceEntityListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPriceEntityListResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful！</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPriceEntityListResponseBody build() {
            return new QueryPriceEntityListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPriceEntityListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPriceEntityListResponseBody</p>
     */
    public static class PriceFactorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PriceFactorCode")
        private String priceFactorCode;

        @com.aliyun.core.annotation.NameInMap("PriceFactorName")
        private String priceFactorName;

        @com.aliyun.core.annotation.NameInMap("PriceFactorValueList")
        private java.util.List < String > priceFactorValueList;

        private PriceFactorList(Builder builder) {
            this.priceFactorCode = builder.priceFactorCode;
            this.priceFactorName = builder.priceFactorName;
            this.priceFactorValueList = builder.priceFactorValueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceFactorList create() {
            return builder().build();
        }

        /**
         * @return priceFactorCode
         */
        public String getPriceFactorCode() {
            return this.priceFactorCode;
        }

        /**
         * @return priceFactorName
         */
        public String getPriceFactorName() {
            return this.priceFactorName;
        }

        /**
         * @return priceFactorValueList
         */
        public java.util.List < String > getPriceFactorValueList() {
            return this.priceFactorValueList;
        }

        public static final class Builder {
            private String priceFactorCode; 
            private String priceFactorName; 
            private java.util.List < String > priceFactorValueList; 

            /**
             * <p>The code of the factor.</p>
             * 
             * <strong>example:</strong>
             * <p>vm_region_no</p>
             */
            public Builder priceFactorCode(String priceFactorCode) {
                this.priceFactorCode = priceFactorCode;
                return this;
            }

            /**
             * <p>The name of the factor.</p>
             * 
             * <strong>example:</strong>
             * <p>Region</p>
             */
            public Builder priceFactorName(String priceFactorName) {
                this.priceFactorName = priceFactorName;
                return this;
            }

            /**
             * <p>The values of the factor.</p>
             */
            public Builder priceFactorValueList(java.util.List < String > priceFactorValueList) {
                this.priceFactorValueList = priceFactorValueList;
                return this;
            }

            public PriceFactorList build() {
                return new PriceFactorList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPriceEntityListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPriceEntityListResponseBody</p>
     */
    public static class PriceEntityInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PriceEntityCode")
        private String priceEntityCode;

        @com.aliyun.core.annotation.NameInMap("PriceEntityName")
        private String priceEntityName;

        @com.aliyun.core.annotation.NameInMap("PriceFactorList")
        private java.util.List < PriceFactorList> priceFactorList;

        private PriceEntityInfoList(Builder builder) {
            this.priceEntityCode = builder.priceEntityCode;
            this.priceEntityName = builder.priceEntityName;
            this.priceFactorList = builder.priceFactorList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceEntityInfoList create() {
            return builder().build();
        }

        /**
         * @return priceEntityCode
         */
        public String getPriceEntityCode() {
            return this.priceEntityCode;
        }

        /**
         * @return priceEntityName
         */
        public String getPriceEntityName() {
            return this.priceEntityName;
        }

        /**
         * @return priceFactorList
         */
        public java.util.List < PriceFactorList> getPriceFactorList() {
            return this.priceFactorList;
        }

        public static final class Builder {
            private String priceEntityCode; 
            private String priceEntityName; 
            private java.util.List < PriceFactorList> priceFactorList; 

            /**
             * <p>The code of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_type</p>
             */
            public Builder priceEntityCode(String priceEntityCode) {
                this.priceEntityCode = priceEntityCode;
                return this;
            }

            /**
             * <p>The name of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute Service (ECS) instance</p>
             */
            public Builder priceEntityName(String priceEntityName) {
                this.priceEntityName = priceEntityName;
                return this;
            }

            /**
             * <p>The factors of the billable item.</p>
             */
            public Builder priceFactorList(java.util.List < PriceFactorList> priceFactorList) {
                this.priceFactorList = priceFactorList;
                return this;
            }

            public PriceEntityInfoList build() {
                return new PriceEntityInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPriceEntityListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPriceEntityListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PriceEntityInfoList")
        private java.util.List < PriceEntityInfoList> priceEntityInfoList;

        private Data(Builder builder) {
            this.priceEntityInfoList = builder.priceEntityInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return priceEntityInfoList
         */
        public java.util.List < PriceEntityInfoList> getPriceEntityInfoList() {
            return this.priceEntityInfoList;
        }

        public static final class Builder {
            private java.util.List < PriceEntityInfoList> priceEntityInfoList; 

            /**
             * <p>The information about the billable items.</p>
             */
            public Builder priceEntityInfoList(java.util.List < PriceEntityInfoList> priceEntityInfoList) {
                this.priceEntityInfoList = priceEntityInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
