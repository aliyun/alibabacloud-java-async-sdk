// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link PageDemandPlanWithDemandInfoResponseBody} extends {@link TeaModel}
 *
 * <p>PageDemandPlanWithDemandInfoResponseBody</p>
 */
public class PageDemandPlanWithDemandInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private PageDemandPlanWithDemandInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageDemandPlanWithDemandInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(PageDemandPlanWithDemandInfoResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.traceId = model.traceId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public PageDemandPlanWithDemandInfoResponseBody build() {
            return new PageDemandPlanWithDemandInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PageDemandPlanWithDemandInfoResponseBody} extends {@link TeaModel}
     *
     * <p>PageDemandPlanWithDemandInfoResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("accountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("approvalNodeStatus")
        private String approvalNodeStatus;

        @com.aliyun.core.annotation.NameInMap("approvalStatus")
        private String approvalStatus;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("deliveryPlanId")
        private String deliveryPlanId;

        @com.aliyun.core.annotation.NameInMap("deliveryStatus")
        private String deliveryStatus;

        @com.aliyun.core.annotation.NameInMap("demandDesc")
        private String demandDesc;

        @com.aliyun.core.annotation.NameInMap("demandId")
        private Long demandId;

        @com.aliyun.core.annotation.NameInMap("demandName")
        private String demandName;

        @com.aliyun.core.annotation.NameInMap("demandPlanId")
        private Double demandPlanId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("requirementObjectCode")
        private String requirementObjectCode;

        @com.aliyun.core.annotation.NameInMap("uid")
        private Long uid;

        private DataData(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.approvalNodeStatus = builder.approvalNodeStatus;
            this.approvalStatus = builder.approvalStatus;
            this.creator = builder.creator;
            this.deliveryPlanId = builder.deliveryPlanId;
            this.deliveryStatus = builder.deliveryStatus;
            this.demandDesc = builder.demandDesc;
            this.demandId = builder.demandId;
            this.demandName = builder.demandName;
            this.demandPlanId = builder.demandPlanId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.modifier = builder.modifier;
            this.requirementObjectCode = builder.requirementObjectCode;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return approvalNodeStatus
         */
        public String getApprovalNodeStatus() {
            return this.approvalNodeStatus;
        }

        /**
         * @return approvalStatus
         */
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deliveryPlanId
         */
        public String getDeliveryPlanId() {
            return this.deliveryPlanId;
        }

        /**
         * @return deliveryStatus
         */
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

        /**
         * @return demandDesc
         */
        public String getDemandDesc() {
            return this.demandDesc;
        }

        /**
         * @return demandId
         */
        public Long getDemandId() {
            return this.demandId;
        }

        /**
         * @return demandName
         */
        public String getDemandName() {
            return this.demandName;
        }

        /**
         * @return demandPlanId
         */
        public Double getDemandPlanId() {
            return this.demandPlanId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return requirementObjectCode
         */
        public String getRequirementObjectCode() {
            return this.requirementObjectCode;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private String approvalNodeStatus; 
            private String approvalStatus; 
            private String creator; 
            private String deliveryPlanId; 
            private String deliveryStatus; 
            private String demandDesc; 
            private Long demandId; 
            private String demandName; 
            private Double demandPlanId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String modifier; 
            private String requirementObjectCode; 
            private Long uid; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.approvalNodeStatus = model.approvalNodeStatus;
                this.approvalStatus = model.approvalStatus;
                this.creator = model.creator;
                this.deliveryPlanId = model.deliveryPlanId;
                this.deliveryStatus = model.deliveryStatus;
                this.demandDesc = model.demandDesc;
                this.demandId = model.demandId;
                this.demandName = model.demandName;
                this.demandPlanId = model.demandPlanId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.modifier = model.modifier;
                this.requirementObjectCode = model.requirementObjectCode;
                this.uid = model.uid;
            } 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * accountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * approvalNodeStatus.
             */
            public Builder approvalNodeStatus(String approvalNodeStatus) {
                this.approvalNodeStatus = approvalNodeStatus;
                return this;
            }

            /**
             * approvalStatus.
             */
            public Builder approvalStatus(String approvalStatus) {
                this.approvalStatus = approvalStatus;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * deliveryPlanId.
             */
            public Builder deliveryPlanId(String deliveryPlanId) {
                this.deliveryPlanId = deliveryPlanId;
                return this;
            }

            /**
             * deliveryStatus.
             */
            public Builder deliveryStatus(String deliveryStatus) {
                this.deliveryStatus = deliveryStatus;
                return this;
            }

            /**
             * demandDesc.
             */
            public Builder demandDesc(String demandDesc) {
                this.demandDesc = demandDesc;
                return this;
            }

            /**
             * demandId.
             */
            public Builder demandId(Long demandId) {
                this.demandId = demandId;
                return this;
            }

            /**
             * demandName.
             */
            public Builder demandName(String demandName) {
                this.demandName = demandName;
                return this;
            }

            /**
             * demandPlanId.
             */
            public Builder demandPlanId(Double demandPlanId) {
                this.demandPlanId = demandPlanId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * requirementObjectCode.
             */
            public Builder requirementObjectCode(String requirementObjectCode) {
                this.requirementObjectCode = requirementObjectCode;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link PageDemandPlanWithDemandInfoResponseBody} extends {@link TeaModel}
     *
     * <p>PageDemandPlanWithDemandInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("pageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.data = builder.data;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
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
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
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
