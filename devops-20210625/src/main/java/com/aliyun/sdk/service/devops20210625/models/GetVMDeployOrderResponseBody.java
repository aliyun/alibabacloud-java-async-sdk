// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVMDeployOrderResponseBody} extends {@link TeaModel}
 *
 * <p>GetVMDeployOrderResponseBody</p>
 */
public class GetVMDeployOrderResponseBody extends TeaModel {
    @NameInMap("deployOrder")
    private DeployOrder deployOrder;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
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
         * 部署单
         */
        public Builder deployOrder(DeployOrder deployOrder) {
            this.deployOrder = deployOrder;
            return this;
        }

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetVMDeployOrderResponseBody build() {
            return new GetVMDeployOrderResponseBody(this);
        } 

    } 

    public static class Actions extends TeaModel {
        @NameInMap("disable")
        private Boolean disable;

        @NameInMap("params")
        private java.util.Map < String, ? > params;

        @NameInMap("type")
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
        public java.util.Map < String, ? > getParams() {
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
            private java.util.Map < String, ? > params; 
            private String type; 

            /**
             * 是否可用
             */
            public Builder disable(Boolean disable) {
                this.disable = disable;
                return this;
            }

            /**
             * 参数
             */
            public Builder params(java.util.Map < String, ? > params) {
                this.params = params;
                return this;
            }

            /**
             * Action
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
    public static class DeployMachinesActions extends TeaModel {
        @NameInMap("disable")
        private Boolean disable;

        @NameInMap("params")
        private java.util.Map < String, ? > params;

        @NameInMap("type")
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
        public java.util.Map < String, ? > getParams() {
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
            private java.util.Map < String, ? > params; 
            private String type; 

            /**
             * 是否可用
             */
            public Builder disable(Boolean disable) {
                this.disable = disable;
                return this;
            }

            /**
             * 参数
             */
            public Builder params(java.util.Map < String, ? > params) {
                this.params = params;
                return this;
            }

            /**
             * Action
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
    public static class DeployMachines extends TeaModel {
        @NameInMap("actions")
        private java.util.List < DeployMachinesActions> actions;

        @NameInMap("batchNum")
        private Integer batchNum;

        @NameInMap("clientStatus")
        private String clientStatus;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("ip")
        private String ip;

        @NameInMap("machineSn")
        private String machineSn;

        @NameInMap("status")
        private String status;

        @NameInMap("updateTime")
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
        public java.util.List < DeployMachinesActions> getActions() {
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
            private java.util.List < DeployMachinesActions> actions; 
            private Integer batchNum; 
            private String clientStatus; 
            private Long createTime; 
            private String ip; 
            private String machineSn; 
            private String status; 
            private Long updateTime; 

            /**
             * 后续action
             */
            public Builder actions(java.util.List < DeployMachinesActions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * 部署批次
             */
            public Builder batchNum(Integer batchNum) {
                this.batchNum = batchNum;
                return this;
            }

            /**
             * 机器状态
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 机器IP
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * 机器sn
             */
            public Builder machineSn(String machineSn) {
                this.machineSn = machineSn;
                return this;
            }

            /**
             * 部署状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 修改时间
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
    public static class DeployMachineInfo extends TeaModel {
        @NameInMap("batchNum")
        private Integer batchNum;

        @NameInMap("deployMachines")
        private java.util.List < DeployMachines> deployMachines;

        @NameInMap("hostGroupId")
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
        public java.util.List < DeployMachines> getDeployMachines() {
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
            private java.util.List < DeployMachines> deployMachines; 
            private Long hostGroupId; 

            /**
             * 发布批次
             */
            public Builder batchNum(Integer batchNum) {
                this.batchNum = batchNum;
                return this;
            }

            /**
             * 部署机器列表
             */
            public Builder deployMachines(java.util.List < DeployMachines> deployMachines) {
                this.deployMachines = deployMachines;
                return this;
            }

            /**
             * 主机组ID
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
    public static class DeployOrder extends TeaModel {
        @NameInMap("actions")
        private java.util.List < Actions> actions;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creator")
        private String creator;

        @NameInMap("currentBatch")
        private Integer currentBatch;

        @NameInMap("deployMachineInfo")
        private DeployMachineInfo deployMachineInfo;

        @NameInMap("deployOrderId")
        private String deployOrderId;

        @NameInMap("exceptionCode")
        private String exceptionCode;

        @NameInMap("status")
        private String status;

        @NameInMap("totalBatch")
        private Integer totalBatch;

        @NameInMap("updateTime")
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
        public java.util.List < Actions> getActions() {
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
            private java.util.List < Actions> actions; 
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
             * 后续action
             */
            public Builder actions(java.util.List < Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * 创建时时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 创建人
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * 当前发布批次
             */
            public Builder currentBatch(Integer currentBatch) {
                this.currentBatch = currentBatch;
                return this;
            }

            /**
             * 部署机器信息
             */
            public Builder deployMachineInfo(DeployMachineInfo deployMachineInfo) {
                this.deployMachineInfo = deployMachineInfo;
                return this;
            }

            /**
             * 部署单ID
             */
            public Builder deployOrderId(String deployOrderId) {
                this.deployOrderId = deployOrderId;
                return this;
            }

            /**
             * 错误码
             */
            public Builder exceptionCode(String exceptionCode) {
                this.exceptionCode = exceptionCode;
                return this;
            }

            /**
             * 发布状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 总发布批次
             */
            public Builder totalBatch(Integer totalBatch) {
                this.totalBatch = totalBatch;
                return this;
            }

            /**
             * 修改时间
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
