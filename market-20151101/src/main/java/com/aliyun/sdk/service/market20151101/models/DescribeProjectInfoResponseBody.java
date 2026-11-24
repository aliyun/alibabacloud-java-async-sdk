// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeProjectInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ee3e1b3b-6c38-4bcf-be40-5a946cfda761</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.currentStepNo = model.currentStepNo;
                this.customerAliUid = model.customerAliUid;
                this.finalStepNo = model.finalStepNo;
                this.finishType = model.finishType;
                this.gmtCreate = model.gmtCreate;
                this.gmtExpired = model.gmtExpired;
                this.gmtFinished = model.gmtFinished;
                this.instanceId = model.instanceId;
                this.orderId = model.orderId;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.productSkuCode = model.productSkuCode;
                this.productSkuName = model.productSkuName;
                this.projectStatus = model.projectStatus;
                this.supplierAliUid = model.supplierAliUid;
                this.templateId = model.templateId;
                this.templateType = model.templateType;
            } 

            /**
             * <p>The current step in the process.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder currentStepNo(Integer currentStepNo) {
                this.currentStepNo = currentStepNo;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the customer.</p>
             * 
             * <strong>example:</strong>
             * <p>27291111****</p>
             */
            public Builder customerAliUid(Long customerAliUid) {
                this.customerAliUid = customerAliUid;
                return this;
            }

            /**
             * <p>The sequence number of the last step.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder finalStepNo(Integer finalStepNo) {
                this.finalStepNo = finalStepNo;
                return this;
            }

            /**
             * <p>The completion method of the project. Valid values:</p>
             * <ul>
             * <li>null: The default value for unfinished projects.</li>
             * <li>CustomerConfirm: Manually confirmed by the customer.</li>
             * <li>SystemAutoConfirm: Automatically confirmed by the system due to timeout.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder finishType(String finishType) {
                this.finishType = finishType;
                return this;
            }

            /**
             * <p>The creation time of the project. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1588834324000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The expiration time of the project. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1620403200000</p>
             */
            public Builder gmtExpired(Long gmtExpired) {
                this.gmtExpired = gmtExpired;
                return this;
            }

            /**
             * <p>The completion time of the project. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1620403200000</p>
             */
            public Builder gmtFinished(Long gmtFinished) {
                this.gmtFinished = gmtFinished;
                return this;
            }

            /**
             * <p>The business instance ID in Cloud Marketplace.</p>
             * 
             * <strong>example:</strong>
             * <p>4****89</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2059111111111</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The product code.</p>
             * 
             * <strong>example:</strong>
             * <p>cmgj***055</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The name of the Cloud Marketplace product.</p>
             * 
             * <strong>example:</strong>
             * <p>Gongsibao**** accounting</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The code of the Cloud Marketplace product SKU.</p>
             * 
             * <strong>example:</strong>
             * <p>yuncode****500001</p>
             */
            public Builder productSkuCode(String productSkuCode) {
                this.productSkuCode = productSkuCode;
                return this;
            }

            /**
             * <p>The name of the Cloud Marketplace product SKU.</p>
             * 
             * <strong>example:</strong>
             * <p>Small*** taxpayer</p>
             */
            public Builder productSkuName(String productSkuName) {
                this.productSkuName = productSkuName;
                return this;
            }

            /**
             * <p>The execution status of the project. Valid values:</p>
             * <ul>
             * <li>Starting: In progress.</li>
             * <li>Cancel: Canceled.</li>
             * <li>Pause: Paused.</li>
             * <li>Finish: Completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Starting</p>
             */
            public Builder projectStatus(String projectStatus) {
                this.projectStatus = projectStatus;
                return this;
            }

            /**
             * <p>The UID of the supplier to which the project belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>45121111****</p>
             */
            public Builder supplierAliUid(Long supplierAliUid) {
                this.supplierAliUid = supplierAliUid;
                return this;
            }

            /**
             * <p>The ID of the process template to which the project belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>410</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template type of the project. Valid values:</p>
             * <ul>
             * <li>Public: Public template.</li>
             * <li>Private: Private template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
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
