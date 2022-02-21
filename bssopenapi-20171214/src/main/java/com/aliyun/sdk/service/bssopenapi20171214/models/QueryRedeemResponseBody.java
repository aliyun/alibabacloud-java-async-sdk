// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRedeemResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRedeemResponseBody</p>
 */
public class QueryRedeemResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryRedeemResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRedeemResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
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

        public QueryRedeemResponseBody build() {
            return new QueryRedeemResponseBody(this);
        } 

    } 

    public static class Redeem extends TeaModel {
        @NameInMap("ApplicableProducts")
        private String applicableProducts;

        @NameInMap("Balance")
        private String balance;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("ExpiryTime")
        private String expiryTime;

        @NameInMap("GrantedTime")
        private String grantedTime;

        @NameInMap("NominalValue")
        private String nominalValue;

        @NameInMap("RedeemId")
        private String redeemId;

        @NameInMap("RedeemNo")
        private String redeemNo;

        @NameInMap("Specification")
        private String specification;

        @NameInMap("Status")
        private String status;

        private Redeem(Builder builder) {
            this.applicableProducts = builder.applicableProducts;
            this.balance = builder.balance;
            this.effectiveTime = builder.effectiveTime;
            this.expiryTime = builder.expiryTime;
            this.grantedTime = builder.grantedTime;
            this.nominalValue = builder.nominalValue;
            this.redeemId = builder.redeemId;
            this.redeemNo = builder.redeemNo;
            this.specification = builder.specification;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Redeem create() {
            return builder().build();
        }

        /**
         * @return applicableProducts
         */
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        /**
         * @return balance
         */
        public String getBalance() {
            return this.balance;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return expiryTime
         */
        public String getExpiryTime() {
            return this.expiryTime;
        }

        /**
         * @return grantedTime
         */
        public String getGrantedTime() {
            return this.grantedTime;
        }

        /**
         * @return nominalValue
         */
        public String getNominalValue() {
            return this.nominalValue;
        }

        /**
         * @return redeemId
         */
        public String getRedeemId() {
            return this.redeemId;
        }

        /**
         * @return redeemNo
         */
        public String getRedeemNo() {
            return this.redeemNo;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicableProducts; 
            private String balance; 
            private String effectiveTime; 
            private String expiryTime; 
            private String grantedTime; 
            private String nominalValue; 
            private String redeemId; 
            private String redeemNo; 
            private String specification; 
            private String status; 

            /**
             * ApplicableProducts.
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * Balance.
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * ExpiryTime.
             */
            public Builder expiryTime(String expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * GrantedTime.
             */
            public Builder grantedTime(String grantedTime) {
                this.grantedTime = grantedTime;
                return this;
            }

            /**
             * NominalValue.
             */
            public Builder nominalValue(String nominalValue) {
                this.nominalValue = nominalValue;
                return this;
            }

            /**
             * RedeemId.
             */
            public Builder redeemId(String redeemId) {
                this.redeemId = redeemId;
                return this;
            }

            /**
             * RedeemNo.
             */
            public Builder redeemNo(String redeemNo) {
                this.redeemNo = redeemNo;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Redeem build() {
                return new Redeem(this);
            } 

        } 

    }
    public static class DataRedeem extends TeaModel {
        @NameInMap("Redeem")
        private java.util.List < Redeem> redeem;

        private DataRedeem(Builder builder) {
            this.redeem = builder.redeem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataRedeem create() {
            return builder().build();
        }

        /**
         * @return redeem
         */
        public java.util.List < Redeem> getRedeem() {
            return this.redeem;
        }

        public static final class Builder {
            private java.util.List < Redeem> redeem; 

            /**
             * Redeem.
             */
            public Builder redeem(java.util.List < Redeem> redeem) {
                this.redeem = redeem;
                return this;
            }

            public DataRedeem build() {
                return new DataRedeem(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNum")
        private Long pageNum;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Redeem")
        private DataRedeem redeem;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.redeem = builder.redeem;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return redeem
         */
        public DataRedeem getRedeem() {
            return this.redeem;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNum; 
            private Long pageSize; 
            private DataRedeem redeem; 
            private Long totalCount; 

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Redeem.
             */
            public Builder redeem(DataRedeem redeem) {
                this.redeem = redeem;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
