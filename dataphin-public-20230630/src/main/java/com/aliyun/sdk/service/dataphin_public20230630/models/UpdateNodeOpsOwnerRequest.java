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
 * {@link UpdateNodeOpsOwnerRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodeOpsOwnerRequest</p>
 */
public class UpdateNodeOpsOwnerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Command")
    @com.aliyun.core.annotation.Validation(required = true)
    private Command command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private UpdateNodeOpsOwnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.command = builder.command;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodeOpsOwnerRequest create() {
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
     * @return command
     */
    public Command getCommand() {
        return this.command;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<UpdateNodeOpsOwnerRequest, Builder> {
        private String regionId; 
        private Command command; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodeOpsOwnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.command = request.command;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>This parameter is required.</p>
         */
        public Builder command(Command command) {
            String commandShrink = shrink(command, "Command", "json");
            this.putBodyParameter("Command", commandShrink);
            this.command = command;
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public UpdateNodeOpsOwnerRequest build() {
            return new UpdateNodeOpsOwnerRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateNodeOpsOwnerRequest} extends {@link TeaModel}
     *
     * <p>UpdateNodeOpsOwnerRequest</p>
     */
    public static class NodeIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("NodeFromType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeFromType;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeType;

        private NodeIdList(Builder builder) {
            this.id = builder.id;
            this.nodeFromType = builder.nodeFromType;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeIdList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return nodeFromType
         */
        public String getNodeFromType() {
            return this.nodeFromType;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private String id; 
            private String nodeFromType; 
            private String nodeType; 

            private Builder() {
            } 

            private Builder(NodeIdList model) {
                this.id = model.id;
                this.nodeFromType = model.nodeFromType;
                this.nodeType = model.nodeType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>n_8198365584737107968</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder nodeFromType(String nodeFromType) {
                this.nodeFromType = nodeFromType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public NodeIdList build() {
                return new NodeIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateNodeOpsOwnerRequest} extends {@link TeaModel}
     *
     * <p>UpdateNodeOpsOwnerRequest</p>
     */
    public static class Command extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<NodeIdList> nodeIdList;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> opsOwnerList;

        private Command(Builder builder) {
            this.nodeIdList = builder.nodeIdList;
            this.opsOwnerList = builder.opsOwnerList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Command create() {
            return builder().build();
        }

        /**
         * @return nodeIdList
         */
        public java.util.List<NodeIdList> getNodeIdList() {
            return this.nodeIdList;
        }

        /**
         * @return opsOwnerList
         */
        public java.util.List<String> getOpsOwnerList() {
            return this.opsOwnerList;
        }

        public static final class Builder {
            private java.util.List<NodeIdList> nodeIdList; 
            private java.util.List<String> opsOwnerList; 

            private Builder() {
            } 

            private Builder(Command model) {
                this.nodeIdList = model.nodeIdList;
                this.opsOwnerList = model.opsOwnerList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder nodeIdList(java.util.List<NodeIdList> nodeIdList) {
                this.nodeIdList = nodeIdList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder opsOwnerList(java.util.List<String> opsOwnerList) {
                this.opsOwnerList = opsOwnerList;
                return this;
            }

            public Command build() {
                return new Command(this);
            } 

        } 

    }
}
