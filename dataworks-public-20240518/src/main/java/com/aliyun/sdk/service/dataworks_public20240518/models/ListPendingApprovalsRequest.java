// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListPendingApprovalsRequest} extends {@link RequestModel}
 *
 * <p>ListPendingApprovalsRequest</p>
 */
public class ListPendingApprovalsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessTypes")
    private java.util.List<String> accessTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefSchema")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defSchema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Grantee")
    private Grantee grantee;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ListPendingApprovalsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessTypes = builder.accessTypes;
        this.defSchema = builder.defSchema;
        this.endTime = builder.endTime;
        this.grantee = builder.grantee;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.resource = builder.resource;
        this.resourceType = builder.resourceType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPendingApprovalsRequest create() {
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
     * @return accessTypes
     */
    public java.util.List<String> getAccessTypes() {
        return this.accessTypes;
    }

    /**
     * @return defSchema
     */
    public String getDefSchema() {
        return this.defSchema;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return grantee
     */
    public Grantee getGrantee() {
        return this.grantee;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    /**
     * @return resourceType
     */
    public java.util.List<String> getResourceType() {
        return this.resourceType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListPendingApprovalsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> accessTypes; 
        private String defSchema; 
        private Long endTime; 
        private Grantee grantee; 
        private String nextToken; 
        private Integer pageSize; 
        private Resource resource; 
        private java.util.List<String> resourceType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListPendingApprovalsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessTypes = request.accessTypes;
            this.defSchema = request.defSchema;
            this.endTime = request.endTime;
            this.grantee = request.grantee;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.resource = request.resource;
            this.resourceType = request.resourceType;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AccessTypes.
         */
        public Builder accessTypes(java.util.List<String> accessTypes) {
            String accessTypesShrink = shrink(accessTypes, "AccessTypes", "json");
            this.putBodyParameter("AccessTypes", accessTypesShrink);
            this.accessTypes = accessTypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder defSchema(String defSchema) {
            this.putBodyParameter("DefSchema", defSchema);
            this.defSchema = defSchema;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Grantee.
         */
        public Builder grantee(Grantee grantee) {
            String granteeShrink = shrink(grantee, "Grantee", "json");
            this.putBodyParameter("Grantee", granteeShrink);
            this.grantee = grantee;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(Resource resource) {
            String resourceShrink = shrink(resource, "Resource", "json");
            this.putBodyParameter("Resource", resourceShrink);
            this.resource = resource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;table&quot;, &quot;column&quot;]</p>
         */
        public Builder resourceType(java.util.List<String> resourceType) {
            String resourceTypeShrink = shrink(resourceType, "ResourceType", "json");
            this.putBodyParameter("ResourceType", resourceTypeShrink);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListPendingApprovalsRequest build() {
            return new ListPendingApprovalsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListPendingApprovalsRequest} extends {@link TeaModel}
     *
     * <p>ListPendingApprovalsRequest</p>
     */
    public static class Grantee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private Grantee(Builder builder) {
            this.principalId = builder.principalId;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Grantee create() {
            return builder().build();
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalId; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(Grantee model) {
                this.principalId = model.principalId;
                this.principalType = model.principalType;
            } 

            /**
             * PrincipalId.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * PrincipalType.
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public Grantee build() {
                return new Grantee(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPendingApprovalsRequest} extends {@link TeaModel}
     *
     * <p>ListPendingApprovalsRequest</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefSchema")
        private String defSchema;

        @com.aliyun.core.annotation.NameInMap("DefVersion")
        private String defVersion;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private java.util.Map<String, ?> metaData;

        private Resource(Builder builder) {
            this.defSchema = builder.defSchema;
            this.defVersion = builder.defVersion;
            this.metaData = builder.metaData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return defSchema
         */
        public String getDefSchema() {
            return this.defSchema;
        }

        /**
         * @return defVersion
         */
        public String getDefVersion() {
            return this.defVersion;
        }

        /**
         * @return metaData
         */
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

        public static final class Builder {
            private String defSchema; 
            private String defVersion; 
            private java.util.Map<String, ?> metaData; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.defSchema = model.defSchema;
                this.defVersion = model.defVersion;
                this.metaData = model.metaData;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder defSchema(String defSchema) {
                this.defSchema = defSchema;
                return this;
            }

            /**
             * DefVersion.
             */
            public Builder defVersion(String defVersion) {
                this.defVersion = defVersion;
                return this;
            }

            /**
             * MetaData.
             */
            public Builder metaData(java.util.Map<String, ?> metaData) {
                this.metaData = metaData;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
