// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link RemoveProjectManagerRequest} extends {@link RequestModel}
 *
 * <p>RemoveProjectManagerRequest</p>
 */
public class RemoveProjectManagerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("org_entities")
    private java.util.List<OrgEntities> orgEntities;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_project_id")
    private String outProjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("project_id")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remove_all")
    private Boolean removeAll;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private RemoveProjectManagerRequest(Builder builder) {
        super(builder);
        this.orgEntities = builder.orgEntities;
        this.outProjectId = builder.outProjectId;
        this.projectId = builder.projectId;
        this.removeAll = builder.removeAll;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveProjectManagerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgEntities
     */
    public java.util.List<OrgEntities> getOrgEntities() {
        return this.orgEntities;
    }

    /**
     * @return outProjectId
     */
    public String getOutProjectId() {
        return this.outProjectId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return removeAll
     */
    public Boolean getRemoveAll() {
        return this.removeAll;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<RemoveProjectManagerRequest, Builder> {
        private java.util.List<OrgEntities> orgEntities; 
        private String outProjectId; 
        private Long projectId; 
        private Boolean removeAll; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(RemoveProjectManagerRequest request) {
            super(request);
            this.orgEntities = request.orgEntities;
            this.outProjectId = request.outProjectId;
            this.projectId = request.projectId;
            this.removeAll = request.removeAll;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * org_entities.
         */
        public Builder orgEntities(java.util.List<OrgEntities> orgEntities) {
            String orgEntitiesShrink = shrink(orgEntities, "org_entities", "json");
            this.putBodyParameter("org_entities", orgEntitiesShrink);
            this.orgEntities = orgEntities;
            return this;
        }

        /**
         * out_project_id.
         */
        public Builder outProjectId(String outProjectId) {
            this.putBodyParameter("out_project_id", outProjectId);
            this.outProjectId = outProjectId;
            return this;
        }

        /**
         * project_id.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("project_id", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * remove_all.
         */
        public Builder removeAll(Boolean removeAll) {
            this.putBodyParameter("remove_all", removeAll);
            this.removeAll = removeAll;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public RemoveProjectManagerRequest build() {
            return new RemoveProjectManagerRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveProjectManagerRequest} extends {@link TeaModel}
     *
     * <p>RemoveProjectManagerRequest</p>
     */
    public static class OrgEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entity_id")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_type")
        private String entityType;

        private OrgEntities(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrgEntities create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        public static final class Builder {
            private String entityId; 
            private String entityType; 

            private Builder() {
            } 

            private Builder(OrgEntities model) {
                this.entityId = model.entityId;
                this.entityType = model.entityType;
            } 

            /**
             * entity_id.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * entity_type.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            public OrgEntities build() {
                return new OrgEntities(this);
            } 

        } 

    }
}
