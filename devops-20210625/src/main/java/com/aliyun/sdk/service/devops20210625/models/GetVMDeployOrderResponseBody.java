// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link GetVMDeployOrderResponseBody} extends {@link TeaModel}
 *
 * <p>GetVMDeployOrderResponseBody</p>
 */
public class GetVMDeployOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deployOrder")
    private DeployOrder deployOrder;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetVMDeployOrderResponseBody(Builder builder) {
        this.deployOrder = builder.deployOrder;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVMDeployOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return deployOrder
     */
    public DeployOrder getDeployOrder() {
        return this.deployOrder;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private DeployOrder deployOrder; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * deployOrder.
         */
        public Builder deployOrder(DeployOrder deployOrder) {
            this.deployOrder = deployOrder;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetVMDeployOrderResponseBody build() {
            return new GetVMDeployOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVMDeployOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetVMDeployOrderResponseBody</p>
     */
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disable")
        private Boolean disable;

        @com.aliyun.core.annotation.NameInMap("params")
        private Object params;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Actions(Builder builder) {
            this.disable = builder.disable;
            this.params = builder.params;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return disable
         */
        public Boolean getDisable() {
            return this.disable;
        }

        /**
         * @return params
         */
        public Object getParams() {
            return this.params;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean disable; 
            private Object params; 
            private String type; 

            /**
             * disable.
             */
            public Builder disable(Boolean disable) {
                this.disable = disable;
                return this;
            }

            /**
             * params.
             */
            public Builder params(Object params) {
                this.params = params;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVMDeployOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetVMDeployOrderResponseBody</p>
     */
    public static class DeployMachinesActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disable")
        private Boolean disable;

        @com.aliyun.core.annotation.NameInMap("params")
        private Object params;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DeployMachinesActions(Builder builder) {
            this.disable = builder.disable;
            this.params = builder.params;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployMachinesActions create() {
            return builder().build();
        }

        /**
         * @return disable
         */
        public Boolean getDisable() {
            return this.disable;
        }

        /**
         * @return params
         */
        public Object getParams() {
            return this.params;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean disable; 
            private Object params; 
            private String type; 

            /**
             * disable.
             */
            public Builder disable(Boolean disable) {
                this.disable = disable;
                return this;
            }

            /**
             * params.
             */
            public Builder params(Object params) {
                this.params = params;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DeployMachinesActions build() {
                return new DeployMachinesActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVMDeployOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetVMDeployOrderResponseBody</p>
     */
    public static class DeployMachines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<DeployMachinesActions> actions;

        @com.aliyun.core.annotation.NameInMap("batchNum")
        private Integer batchNum;

        @com.aliyun.core.annotation.NameInMap("clientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("machineSn")
        private String machineSn;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private DeployMachines(Builder builder) {
            this.actions = builder.actions;
            this.batchNum = builder.batchNum;
            this.clientStatus = builder.clientStatus;
            this.createTime = builder.createTime;
            this.ip = builder.ip;
            this.machineSn = builder.machineSn;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployMachines create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<DeployMachinesActions> getActions() {
            return this.actions;
        }

        /**
         * @return batchNum
         */
        public Integer getBatchNum() {
            return this.batchNum;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return machineSn
         */
        public String getMachineSn() {
            return this.machineSn;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<DeployMachinesActions> actions; 
            private Integer batchNum; 
            private String clientStatus; 
            private Long createTime; 
            private String ip; 
            private String machineSn; 
            private String status; 
            private Long updateTime; 

            /**
             * actions.
             */
            public Builder actions(java.util.List<DeployMachinesActions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * batchNum.
             */
            public Builder batchNum(Integer batchNum) {
                this.batchNum = batchNum;
                return this;
            }

            /**
             * clientStatus.
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * machineSn.
             */
            public Builder machineSn(String machineSn) {
                this.machineSn = machineSn;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DeployMachines build() {
                return new DeployMachines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVMDeployOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetVMDeployOrderResponseBody</p>
     */
    public static class DeployMachineInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchNum")
        private Integer batchNum;

        @com.aliyun.core.annotation.NameInMap("deployMachines")
        private java.util.List<DeployMachines> deployMachines;

        @com.aliyun.core.annotation.NameInMap("hostGroupId")
        private Long hostGroupId;

        private DeployMachineInfo(Builder builder) {
            this.batchNum = builder.batchNum;
            this.deployMachines = builder.deployMachines;
            this.hostGroupId = builder.hostGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployMachineInfo create() {
            return builder().build();
        }

        /**
         * @return batchNum
         */
        public Integer getBatchNum() {
            return this.batchNum;
        }

        /**
         * @return deployMachines
         */
        public java.util.List<DeployMachines> getDeployMachines() {
            return this.deployMachines;
        }

        /**
         * @return hostGroupId
         */
        public Long getHostGroupId() {
            return this.hostGroupId;
        }

        public static final class Builder {
            private Integer batchNum; 
            private java.util.List<DeployMachines> deployMachines; 
            private Long hostGroupId; 

            /**
             * batchNum.
             */
            public Builder batchNum(Integer batchNum) {
                this.batchNum = batchNum;
                return this;
            }

            /**
             * deployMachines.
             */
            public Builder deployMachines(java.util.List<DeployMachines> deployMachines) {
                this.deployMachines = deployMachines;
                return this;
            }

            /**
             * hostGroupId.
             */
            public Builder hostGroupId(Long hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            public DeployMachineInfo build() {
                return new DeployMachineInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVMDeployOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetVMDeployOrderResponseBody</p>
     */
    public static class DeployOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<Actions> actions;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("currentBatch")
        private Integer currentBatch;

        @com.aliyun.core.annotation.NameInMap("deployMachineInfo")
        private DeployMachineInfo deployMachineInfo;

        @com.aliyun.core.annotation.NameInMap("deployOrderId")
        private String deployOrderId;

        @com.aliyun.core.annotation.NameInMap("exceptionCode")
        private String exceptionCode;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("totalBatch")
        private Integer totalBatch;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        private DeployOrder(Builder builder) {
            this.actions = builder.actions;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.currentBatch = builder.currentBatch;
            this.deployMachineInfo = builder.deployMachineInfo;
            this.deployOrderId = builder.deployOrderId;
            this.exceptionCode = builder.exceptionCode;
            this.status = builder.status;
            this.totalBatch = builder.totalBatch;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployOrder create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<Actions> getActions() {
            return this.actions;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return currentBatch
         */
        public Integer getCurrentBatch() {
            return this.currentBatch;
        }

        /**
         * @return deployMachineInfo
         */
        public DeployMachineInfo getDeployMachineInfo() {
            return this.deployMachineInfo;
        }

        /**
         * @return deployOrderId
         */
        public String getDeployOrderId() {
            return this.deployOrderId;
        }

        /**
         * @return exceptionCode
         */
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalBatch
         */
        public Integer getTotalBatch() {
            return this.totalBatch;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<Actions> actions; 
            private Long createTime; 
            private String creator; 
            private Integer currentBatch; 
            private DeployMachineInfo deployMachineInfo; 
            private String deployOrderId; 
            private String exceptionCode; 
            private String status; 
            private Integer totalBatch; 
            private Long updateTime; 

            /**
             * actions.
             */
            public Builder actions(java.util.List<Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * currentBatch.
             */
            public Builder currentBatch(Integer currentBatch) {
                this.currentBatch = currentBatch;
                return this;
            }

            /**
             * deployMachineInfo.
             */
            public Builder deployMachineInfo(DeployMachineInfo deployMachineInfo) {
                this.deployMachineInfo = deployMachineInfo;
                return this;
            }

            /**
             * deployOrderId.
             */
            public Builder deployOrderId(String deployOrderId) {
                this.deployOrderId = deployOrderId;
                return this;
            }

            /**
             * exceptionCode.
             */
            public Builder exceptionCode(String exceptionCode) {
                this.exceptionCode = exceptionCode;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * totalBatch.
             */
            public Builder totalBatch(Integer totalBatch) {
                this.totalBatch = totalBatch;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DeployOrder build() {
                return new DeployOrder(this);
            } 

        } 

    }
}
