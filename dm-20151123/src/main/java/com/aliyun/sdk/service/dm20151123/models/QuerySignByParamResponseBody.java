// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySignByParamResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySignByParamResponseBody</p>
 */
public class QuerySignByParamResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Data data;

    private QuerySignByParamResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySignByParamResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Data data; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QuerySignByParamResponseBody build() {
            return new QuerySignByParamResponseBody(this);
        } 

    } 

    public static class Sign extends TeaModel {
        @NameInMap("AuditState")
        private String auditState;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("RejectInfo")
        private String rejectInfo;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("SignId")
        private Long signId;

        @NameInMap("SignName")
        private String signName;

        @NameInMap("SignType")
        private String signType;

        private Sign(Builder builder) {
            this.auditState = builder.auditState;
            this.gmtCreate = builder.gmtCreate;
            this.orderId = builder.orderId;
            this.rejectInfo = builder.rejectInfo;
            this.remark = builder.remark;
            this.signId = builder.signId;
            this.signName = builder.signName;
            this.signType = builder.signType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sign create() {
            return builder().build();
        }

        /**
         * @return auditState
         */
        public String getAuditState() {
            return this.auditState;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return rejectInfo
         */
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return signId
         */
        public Long getSignId() {
            return this.signId;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return signType
         */
        public String getSignType() {
            return this.signType;
        }

        public static final class Builder {
            private String auditState; 
            private String gmtCreate; 
            private String orderId; 
            private String rejectInfo; 
            private String remark; 
            private Long signId; 
            private String signName; 
            private String signType; 

            /**
             * AuditState.
             */
            public Builder auditState(String auditState) {
                this.auditState = auditState;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * RejectInfo.
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SignId.
             */
            public Builder signId(Long signId) {
                this.signId = signId;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * SignType.
             */
            public Builder signType(String signType) {
                this.signType = signType;
                return this;
            }

            public Sign build() {
                return new Sign(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("sign")
        private java.util.List < Sign> sign;

        private Data(Builder builder) {
            this.sign = builder.sign;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sign
         */
        public java.util.List < Sign> getSign() {
            return this.sign;
        }

        public static final class Builder {
            private java.util.List < Sign> sign; 

            /**
             * sign.
             */
            public Builder sign(java.util.List < Sign> sign) {
                this.sign = sign;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
