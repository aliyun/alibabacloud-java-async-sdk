// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeProjectInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectInfoResponseBody</p>
 */
public class DescribeProjectInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeProjectInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeProjectInfoResponseBody build() {
            return new DescribeProjectInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProjectInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentStepNo")
        private Integer currentStepNo;

        @com.aliyun.core.annotation.NameInMap("CustomerAliUid")
        private Long customerAliUid;

        @com.aliyun.core.annotation.NameInMap("FinalStepNo")
        private Integer finalStepNo;

        @com.aliyun.core.annotation.NameInMap("FinishType")
        private String finishType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtExpired")
        private Long gmtExpired;

        @com.aliyun.core.annotation.NameInMap("GmtFinished")
        private Long gmtFinished;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("ProductSkuCode")
        private String productSkuCode;

        @com.aliyun.core.annotation.NameInMap("ProductSkuName")
        private String productSkuName;

        @com.aliyun.core.annotation.NameInMap("ProjectStatus")
        private String projectStatus;

        @com.aliyun.core.annotation.NameInMap("SupplierAliUid")
        private Long supplierAliUid;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        private Result(Builder builder) {
            this.currentStepNo = builder.currentStepNo;
            this.customerAliUid = builder.customerAliUid;
            this.finalStepNo = builder.finalStepNo;
            this.finishType = builder.finishType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtExpired = builder.gmtExpired;
            this.gmtFinished = builder.gmtFinished;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.productSkuCode = builder.productSkuCode;
            this.productSkuName = builder.productSkuName;
            this.projectStatus = builder.projectStatus;
            this.supplierAliUid = builder.supplierAliUid;
            this.templateId = builder.templateId;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return currentStepNo
         */
        public Integer getCurrentStepNo() {
            return this.currentStepNo;
        }

        /**
         * @return customerAliUid
         */
        public Long getCustomerAliUid() {
            return this.customerAliUid;
        }

        /**
         * @return finalStepNo
         */
        public Integer getFinalStepNo() {
            return this.finalStepNo;
        }

        /**
         * @return finishType
         */
        public String getFinishType() {
            return this.finishType;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtExpired
         */
        public Long getGmtExpired() {
            return this.gmtExpired;
        }

        /**
         * @return gmtFinished
         */
        public Long getGmtFinished() {
            return this.gmtFinished;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
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

        /**
         * @return productSkuCode
         */
        public String getProductSkuCode() {
            return this.productSkuCode;
        }

        /**
         * @return productSkuName
         */
        public String getProductSkuName() {
            return this.productSkuName;
        }

        /**
         * @return projectStatus
         */
        public String getProjectStatus() {
            return this.projectStatus;
        }

        /**
         * @return supplierAliUid
         */
        public Long getSupplierAliUid() {
            return this.supplierAliUid;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private Integer currentStepNo; 
            private Long customerAliUid; 
            private Integer finalStepNo; 
            private String finishType; 
            private Long gmtCreate; 
            private Long gmtExpired; 
            private Long gmtFinished; 
            private String instanceId; 
            private Long orderId; 
            private String productCode; 
            private String productName; 
            private String productSkuCode; 
            private String productSkuName; 
            private String projectStatus; 
            private Long supplierAliUid; 
            private Long templateId; 
            private String templateType; 

            /**
             * CurrentStepNo.
             */
            public Builder currentStepNo(Integer currentStepNo) {
                this.currentStepNo = currentStepNo;
                return this;
            }

            /**
             * CustomerAliUid.
             */
            public Builder customerAliUid(Long customerAliUid) {
                this.customerAliUid = customerAliUid;
                return this;
            }

            /**
             * FinalStepNo.
             */
            public Builder finalStepNo(Integer finalStepNo) {
                this.finalStepNo = finalStepNo;
                return this;
            }

            /**
             * FinishType.
             */
            public Builder finishType(String finishType) {
                this.finishType = finishType;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtExpired.
             */
            public Builder gmtExpired(Long gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * GmtFinished.
             */
            public Builder gmtFinished(Long gmtFinished) {
                this.gmtFinished = gmtFinished;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
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

            /**
             * ProductSkuCode.
             */
            public Builder productSkuCode(String productSkuCode) {
                this.productSkuCode = productSkuCode;
                return this;
            }

            /**
             * ProductSkuName.
             */
            public Builder productSkuName(String productSkuName) {
                this.productSkuName = productSkuName;
                return this;
            }

            /**
             * ProjectStatus.
             */
            public Builder projectStatus(String projectStatus) {
                this.projectStatus = projectStatus;
                return this;
            }

            /**
             * SupplierAliUid.
             */
            public Builder supplierAliUid(Long supplierAliUid) {
                this.supplierAliUid = supplierAliUid;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
