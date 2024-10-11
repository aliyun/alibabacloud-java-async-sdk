// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteManualNodeRequest} extends {@link RequestModel}
 *
 * <p>ExecuteManualNodeRequest</p>
 */
public class ExecuteManualNodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecuteCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ExecuteCommand executeCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ExecuteManualNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.env = builder.env;
        this.executeCommand = builder.executeCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteManualNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return executeCommand
     */
    public ExecuteCommand getExecuteCommand() {
        return this.executeCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<ExecuteManualNodeRequest, Builder> {
        private String regionId; 
        private String env; 
        private ExecuteCommand executeCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteManualNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.env = request.env;
            this.executeCommand = request.executeCommand;
            this.opTenantId = request.opTenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder executeCommand(ExecuteCommand executeCommand) {
            String executeCommandShrink = shrink(executeCommand, "ExecuteCommand", "json");
            this.putBodyParameter("ExecuteCommand", executeCommandShrink);
            this.executeCommand = executeCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public ExecuteManualNodeRequest build() {
            return new ExecuteManualNodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteManualNodeRequest} extends {@link TeaModel}
     *
     * <p>ExecuteManualNodeRequest</p>
     */
    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ParamList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecuteManualNodeRequest} extends {@link TeaModel}
     *
     * <p>ExecuteManualNodeRequest</p>
     */
    public static class ExecuteCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndBizDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endBizDate;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List < ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("StartBizDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String startBizDate;

        private ExecuteCommand(Builder builder) {
            this.endBizDate = builder.endBizDate;
            this.flowName = builder.flowName;
            this.nodeId = builder.nodeId;
            this.paramList = builder.paramList;
            this.projectId = builder.projectId;
            this.startBizDate = builder.startBizDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecuteCommand create() {
            return builder().build();
        }

        /**
         * @return endBizDate
         */
        public String getEndBizDate() {
            return this.endBizDate;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return paramList
         */
        public java.util.List < ParamList> getParamList() {
            return this.paramList;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return startBizDate
         */
        public String getStartBizDate() {
            return this.startBizDate;
        }

        public static final class Builder {
            private String endBizDate; 
            private String flowName; 
            private String nodeId; 
            private java.util.List < ParamList> paramList; 
            private Long projectId; 
            private String startBizDate; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-07</p>
             */
            public Builder endBizDate(String endBizDate) {
                this.endBizDate = endBizDate;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>n_12132</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * ParamList.
             */
            public Builder paramList(java.util.List < ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123324</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-01</p>
             */
            public Builder startBizDate(String startBizDate) {
                this.startBizDate = startBizDate;
                return this;
            }

            public ExecuteCommand build() {
                return new ExecuteCommand(this);
            } 

        } 

    }
}
