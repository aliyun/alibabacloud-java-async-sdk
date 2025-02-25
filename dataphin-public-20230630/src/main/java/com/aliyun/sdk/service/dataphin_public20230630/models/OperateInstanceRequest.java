// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link OperateInstanceRequest} extends {@link RequestModel}
 *
 * <p>OperateInstanceRequest</p>
 */
public class OperateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private OperateCommand operateCommand;

    private OperateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.env = builder.env;
        this.opTenantId = builder.opTenantId;
        this.operateCommand = builder.operateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateInstanceRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return operateCommand
     */
    public OperateCommand getOperateCommand() {
        return this.operateCommand;
    }

    public static final class Builder extends Request.Builder<OperateInstanceRequest, Builder> {
        private String regionId; 
        private String env; 
        private Long opTenantId; 
        private OperateCommand operateCommand; 

        private Builder() {
            super();
        } 

        private Builder(OperateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.env = request.env;
            this.opTenantId = request.opTenantId;
            this.operateCommand = request.operateCommand;
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
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder operateCommand(OperateCommand operateCommand) {
            String operateCommandShrink = shrink(operateCommand, "OperateCommand", "json");
            this.putBodyParameter("OperateCommand", operateCommandShrink);
            this.operateCommand = operateCommand;
            return this;
        }

        @Override
        public OperateInstanceRequest build() {
            return new OperateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link OperateInstanceRequest} extends {@link TeaModel}
     *
     * <p>OperateInstanceRequest</p>
     */
    public static class InstanceIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldInstanceIdList")
        private java.util.List<String> fieldInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        private InstanceIdList(Builder builder) {
            this.fieldInstanceIdList = builder.fieldInstanceIdList;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIdList create() {
            return builder().build();
        }

        /**
         * @return fieldInstanceIdList
         */
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<String> fieldInstanceIdList; 
            private String id; 

            /**
             * FieldInstanceIdList.
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t_32111312</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public InstanceIdList build() {
                return new InstanceIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link OperateInstanceRequest} extends {@link TeaModel}
     *
     * <p>OperateInstanceRequest</p>
     */
    public static class OperateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<InstanceIdList> instanceIdList;

        @com.aliyun.core.annotation.NameInMap("Operation")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operation;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 132324)
        private Long projectId;

        private OperateCommand(Builder builder) {
            this.instanceIdList = builder.instanceIdList;
            this.operation = builder.operation;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateCommand create() {
            return builder().build();
        }

        /**
         * @return instanceIdList
         */
        public java.util.List<InstanceIdList> getInstanceIdList() {
            return this.instanceIdList;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private java.util.List<InstanceIdList> instanceIdList; 
            private String operation; 
            private Long projectId; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder instanceIdList(java.util.List<InstanceIdList> instanceIdList) {
                this.instanceIdList = instanceIdList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RERUN</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>132311</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public OperateCommand build() {
                return new OperateCommand(this);
            } 

        } 

    }
}
