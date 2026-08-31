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
 * {@link GetKgNeighborRequest} extends {@link RequestModel}
 *
 * <p>GetKgNeighborRequest</p>
 */
public class GetKgNeighborRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityDataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityDataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeighborsQuery")
    private NeighborsQuery neighborsQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetKgNeighborRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityDataId = builder.entityDataId;
        this.entityType = builder.entityType;
        this.neighborsQuery = builder.neighborsQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKgNeighborRequest create() {
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
     * @return entityDataId
     */
    public String getEntityDataId() {
        return this.entityDataId;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return neighborsQuery
     */
    public NeighborsQuery getNeighborsQuery() {
        return this.neighborsQuery;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetKgNeighborRequest, Builder> {
        private String regionId; 
        private String entityDataId; 
        private String entityType; 
        private NeighborsQuery neighborsQuery; 
        private Long opTenantId; 
        private String opUserId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetKgNeighborRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityDataId = request.entityDataId;
            this.entityType = request.entityType;
            this.neighborsQuery = request.neighborsQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.workspaceId = request.workspaceId;
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
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder entityDataId(String entityDataId) {
            this.putQueryParameter("EntityDataId", entityDataId);
            this.entityDataId = entityDataId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Student</p>
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * NeighborsQuery.
         */
        public Builder neighborsQuery(NeighborsQuery neighborsQuery) {
            String neighborsQueryShrink = shrink(neighborsQuery, "NeighborsQuery", "json");
            this.putBodyParameter("NeighborsQuery", neighborsQueryShrink);
            this.neighborsQuery = neighborsQuery;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1d4559a4db044158305e2d89bccf81f</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetKgNeighborRequest build() {
            return new GetKgNeighborRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetKgNeighborRequest} extends {@link TeaModel}
     *
     * <p>GetKgNeighborRequest</p>
     */
    public static class NeighborsQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Depth")
        private Integer depth;

        @com.aliyun.core.annotation.NameInMap("DirectionType")
        private String directionType;

        @com.aliyun.core.annotation.NameInMap("RelationTypes")
        private java.util.List<String> relationTypes;

        private NeighborsQuery(Builder builder) {
            this.depth = builder.depth;
            this.directionType = builder.directionType;
            this.relationTypes = builder.relationTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NeighborsQuery create() {
            return builder().build();
        }

        /**
         * @return depth
         */
        public Integer getDepth() {
            return this.depth;
        }

        /**
         * @return directionType
         */
        public String getDirectionType() {
            return this.directionType;
        }

        /**
         * @return relationTypes
         */
        public java.util.List<String> getRelationTypes() {
            return this.relationTypes;
        }

        public static final class Builder {
            private Integer depth; 
            private String directionType; 
            private java.util.List<String> relationTypes; 

            private Builder() {
            } 

            private Builder(NeighborsQuery model) {
                this.depth = model.depth;
                this.directionType = model.directionType;
                this.relationTypes = model.relationTypes;
            } 

            /**
             * Depth.
             */
            public Builder depth(Integer depth) {
                this.depth = depth;
                return this;
            }

            /**
             * DirectionType.
             */
            public Builder directionType(String directionType) {
                this.directionType = directionType;
                return this;
            }

            /**
             * RelationTypes.
             */
            public Builder relationTypes(java.util.List<String> relationTypes) {
                this.relationTypes = relationTypes;
                return this;
            }

            public NeighborsQuery build() {
                return new NeighborsQuery(this);
            } 

        } 

    }
}
