// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetNodeUpDownStreamRequest} extends {@link RequestModel}
 *
 * <p>GetNodeUpDownStreamRequest</p>
 */
public class GetNodeUpDownStreamRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownStreamDepth")
    private Integer downStreamDepth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodeId nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpStreamDepth")
    private Integer upStreamDepth;

    private GetNodeUpDownStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.downStreamDepth = builder.downStreamDepth;
        this.env = builder.env;
        this.nodeId = builder.nodeId;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
        this.upStreamDepth = builder.upStreamDepth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeUpDownStreamRequest create() {
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
     * @return downStreamDepth
     */
    public Integer getDownStreamDepth() {
        return this.downStreamDepth;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return nodeId
     */
    public NodeId getNodeId() {
        return this.nodeId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return upStreamDepth
     */
    public Integer getUpStreamDepth() {
        return this.upStreamDepth;
    }

    public static final class Builder extends Request.Builder<GetNodeUpDownStreamRequest, Builder> {
        private String regionId; 
        private Integer downStreamDepth; 
        private String env; 
        private NodeId nodeId; 
        private Long opTenantId; 
        private Long projectId; 
        private Integer upStreamDepth; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeUpDownStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.downStreamDepth = request.downStreamDepth;
            this.env = request.env;
            this.nodeId = request.nodeId;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
            this.upStreamDepth = request.upStreamDepth;
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
         * DownStreamDepth.
         */
        public Builder downStreamDepth(Integer downStreamDepth) {
            this.putQueryParameter("DownStreamDepth", downStreamDepth);
            this.downStreamDepth = downStreamDepth;
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
        public Builder nodeId(NodeId nodeId) {
            String nodeIdShrink = shrink(nodeId, "NodeId", "json");
            this.putBodyParameter("NodeId", nodeIdShrink);
            this.nodeId = nodeId;
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
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * UpStreamDepth.
         */
        public Builder upStreamDepth(Integer upStreamDepth) {
            this.putQueryParameter("UpStreamDepth", upStreamDepth);
            this.upStreamDepth = upStreamDepth;
            return this;
        }

        @Override
        public GetNodeUpDownStreamRequest build() {
            return new GetNodeUpDownStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetNodeUpDownStreamRequest} extends {@link TeaModel}
     *
     * <p>GetNodeUpDownStreamRequest</p>
     */
    public static class NodeId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldIdList")
        private String fieldIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        private NodeId(Builder builder) {
            this.fieldIdList = builder.fieldIdList;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeId create() {
            return builder().build();
        }

        /**
         * @return fieldIdList
         */
        public String getFieldIdList() {
            return this.fieldIdList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String fieldIdList; 
            private String id; 

            /**
             * FieldIdList.
             */
            public Builder fieldIdList(String fieldIdList) {
                this.fieldIdList = fieldIdList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>11313</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public NodeId build() {
                return new NodeId(this);
            } 

        } 

    }
}
