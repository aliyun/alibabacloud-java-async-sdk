// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeployDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeployDetailResponseBody</p>
 */
public class GetDeployDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private Long nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private GetDeployDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeployDetailResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public Long getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private Long nextToken; 
        private String requestId; 
        private Long totalCount; 

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
        public Builder data(java.util.List < Data> data) {
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
         * NextToken.
         */
        public Builder nextToken(Long nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetDeployDetailResponseBody build() {
            return new GetDeployDetailResponseBody(this);
        } 

    } 

    public static class Operation extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Operations")
        private java.util.Map < String, ? > operations;

        private Operation(Builder builder) {
            this.name = builder.name;
            this.operations = builder.operations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operation create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operations
         */
        public java.util.Map < String, ? > getOperations() {
            return this.operations;
        }

        public static final class Builder {
            private String name; 
            private java.util.Map < String, ? > operations; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Operations.
             */
            public Builder operations(java.util.Map < String, ? > operations) {
                this.operations = operations;
                return this;
            }

            public Operation build() {
                return new Operation(this);
            } 

        } 

    }
    public static class ResourceList extends TeaModel {
        @NameInMap("BuyDuration")
        private String buyDuration;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ExecutionStrategy")
        private String executionStrategy;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("MonitorURL")
        private String monitorURL;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Operation")
        private Operation operation;

        @NameInMap("RefId")
        private Long refId;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ResourceCode")
        private String resourceCode;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        private ResourceList(Builder builder) {
            this.buyDuration = builder.buyDuration;
            this.chargeType = builder.chargeType;
            this.executionStrategy = builder.executionStrategy;
            this.modifiedTime = builder.modifiedTime;
            this.monitorURL = builder.monitorURL;
            this.nodeName = builder.nodeName;
            this.operation = builder.operation;
            this.refId = builder.refId;
            this.remark = builder.remark;
            this.resourceCode = builder.resourceCode;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return buyDuration
         */
        public String getBuyDuration() {
            return this.buyDuration;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return executionStrategy
         */
        public String getExecutionStrategy() {
            return this.executionStrategy;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return monitorURL
         */
        public String getMonitorURL() {
            return this.monitorURL;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return operation
         */
        public Operation getOperation() {
            return this.operation;
        }

        /**
         * @return refId
         */
        public Long getRefId() {
            return this.refId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceCode
         */
        public String getResourceCode() {
            return this.resourceCode;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String buyDuration; 
            private String chargeType; 
            private String executionStrategy; 
            private Long modifiedTime; 
            private String monitorURL; 
            private String nodeName; 
            private Operation operation; 
            private Long refId; 
            private String remark; 
            private String resourceCode; 
            private String resourceId; 
            private String resourceType; 
            private String status; 

            /**
             * BuyDuration.
             */
            public Builder buyDuration(String buyDuration) {
                this.buyDuration = buyDuration;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ExecutionStrategy.
             */
            public Builder executionStrategy(String executionStrategy) {
                this.executionStrategy = executionStrategy;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * MonitorURL.
             */
            public Builder monitorURL(String monitorURL) {
                this.monitorURL = monitorURL;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(Operation operation) {
                this.operation = operation;
                return this;
            }

            /**
             * RefId.
             */
            public Builder refId(Long refId) {
                this.refId = refId;
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
             * ResourceCode.
             */
            public Builder resourceCode(String resourceCode) {
                this.resourceCode = resourceCode;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CurrentProcess")
        private String currentProcess;

        @NameInMap("DeletingNodeList")
        private java.util.List < java.util.Map<String, ?>> deletingNodeList;

        @NameInMap("DeployPercent")
        private Double deployPercent;

        @NameInMap("DeployedNodeList")
        private java.util.List < java.util.Map<String, ?>> deployedNodeList;

        @NameInMap("DeployingNodeList")
        private java.util.List < java.util.Map<String, ?>> deployingNodeList;

        @NameInMap("Error")
        private String error;

        @NameInMap("ExecutionTime")
        private Integer executionTime;

        @NameInMap("FailStatus")
        private Integer failStatus;

        @NameInMap("OrderIdList")
        private java.util.List < String > orderIdList;

        @NameInMap("PdfUrl")
        private String pdfUrl;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceList")
        private java.util.List < ResourceList> resourceList;

        @NameInMap("Status")
        private String status;

        @NameInMap("TerraformScriptUrl")
        private String terraformScriptUrl;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.currentProcess = builder.currentProcess;
            this.deletingNodeList = builder.deletingNodeList;
            this.deployPercent = builder.deployPercent;
            this.deployedNodeList = builder.deployedNodeList;
            this.deployingNodeList = builder.deployingNodeList;
            this.error = builder.error;
            this.executionTime = builder.executionTime;
            this.failStatus = builder.failStatus;
            this.orderIdList = builder.orderIdList;
            this.pdfUrl = builder.pdfUrl;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceList = builder.resourceList;
            this.status = builder.status;
            this.terraformScriptUrl = builder.terraformScriptUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentProcess
         */
        public String getCurrentProcess() {
            return this.currentProcess;
        }

        /**
         * @return deletingNodeList
         */
        public java.util.List < java.util.Map<String, ?>> getDeletingNodeList() {
            return this.deletingNodeList;
        }

        /**
         * @return deployPercent
         */
        public Double getDeployPercent() {
            return this.deployPercent;
        }

        /**
         * @return deployedNodeList
         */
        public java.util.List < java.util.Map<String, ?>> getDeployedNodeList() {
            return this.deployedNodeList;
        }

        /**
         * @return deployingNodeList
         */
        public java.util.List < java.util.Map<String, ?>> getDeployingNodeList() {
            return this.deployingNodeList;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return executionTime
         */
        public Integer getExecutionTime() {
            return this.executionTime;
        }

        /**
         * @return failStatus
         */
        public Integer getFailStatus() {
            return this.failStatus;
        }

        /**
         * @return orderIdList
         */
        public java.util.List < String > getOrderIdList() {
            return this.orderIdList;
        }

        /**
         * @return pdfUrl
         */
        public String getPdfUrl() {
            return this.pdfUrl;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceList
         */
        public java.util.List < ResourceList> getResourceList() {
            return this.resourceList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terraformScriptUrl
         */
        public String getTerraformScriptUrl() {
            return this.terraformScriptUrl;
        }

        public static final class Builder {
            private String appId; 
            private Long createTime; 
            private String currentProcess; 
            private java.util.List < java.util.Map<String, ?>> deletingNodeList; 
            private Double deployPercent; 
            private java.util.List < java.util.Map<String, ?>> deployedNodeList; 
            private java.util.List < java.util.Map<String, ?>> deployingNodeList; 
            private String error; 
            private Integer executionTime; 
            private Integer failStatus; 
            private java.util.List < String > orderIdList; 
            private String pdfUrl; 
            private String resourceGroupId; 
            private java.util.List < ResourceList> resourceList; 
            private String status; 
            private String terraformScriptUrl; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CurrentProcess.
             */
            public Builder currentProcess(String currentProcess) {
                this.currentProcess = currentProcess;
                return this;
            }

            /**
             * DeletingNodeList.
             */
            public Builder deletingNodeList(java.util.List < java.util.Map<String, ?>> deletingNodeList) {
                this.deletingNodeList = deletingNodeList;
                return this;
            }

            /**
             * DeployPercent.
             */
            public Builder deployPercent(Double deployPercent) {
                this.deployPercent = deployPercent;
                return this;
            }

            /**
             * DeployedNodeList.
             */
            public Builder deployedNodeList(java.util.List < java.util.Map<String, ?>> deployedNodeList) {
                this.deployedNodeList = deployedNodeList;
                return this;
            }

            /**
             * DeployingNodeList.
             */
            public Builder deployingNodeList(java.util.List < java.util.Map<String, ?>> deployingNodeList) {
                this.deployingNodeList = deployingNodeList;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * ExecutionTime.
             */
            public Builder executionTime(Integer executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * FailStatus.
             */
            public Builder failStatus(Integer failStatus) {
                this.failStatus = failStatus;
                return this;
            }

            /**
             * OrderIdList.
             */
            public Builder orderIdList(java.util.List < String > orderIdList) {
                this.orderIdList = orderIdList;
                return this;
            }

            /**
             * PdfUrl.
             */
            public Builder pdfUrl(String pdfUrl) {
                this.pdfUrl = pdfUrl;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceList.
             */
            public Builder resourceList(java.util.List < ResourceList> resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TerraformScriptUrl.
             */
            public Builder terraformScriptUrl(String terraformScriptUrl) {
                this.terraformScriptUrl = terraformScriptUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
