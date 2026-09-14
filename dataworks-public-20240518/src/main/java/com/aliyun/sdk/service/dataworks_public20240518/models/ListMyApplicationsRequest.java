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
 * {@link ListMyApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListMyApplicationsRequest</p>
 */
public class ListMyApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefSchema")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defSchema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    private ListMyApplicationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.defSchema = builder.defSchema;
        this.endTime = builder.endTime;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.resource = builder.resource;
        this.resourceType = builder.resourceType;
        this.startTime = builder.startTime;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMyApplicationsRequest create() {
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

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListMyApplicationsRequest, Builder> {
        private String regionId; 
        private String defSchema; 
        private Long endTime; 
        private String nextToken; 
        private Integer pageSize; 
        private Resource resource; 
        private java.util.List<String> resourceType; 
        private Long startTime; 
        private java.util.List<String> statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListMyApplicationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.defSchema = request.defSchema;
            this.endTime = request.endTime;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.resource = request.resource;
            this.resourceType = request.resourceType;
            this.startTime = request.startTime;
            this.statuses = request.statuses;
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
         * <p>Filters by resource type.</p>
         * <p>Note: The resource types supported by the system for applications are constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
         * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for International site</a></p>
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
         * <p>The end time of the application period (millisecond timestamp).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1779724799999</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The pagination cursor.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJpZCI6MTIzfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters by resource with exact or wildcard matching. The resource description is constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.</p>
         * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for International site</a></p>
         */
        public Builder resource(Resource resource) {
            String resourceShrink = shrink(resource, "Resource", "json");
            this.putBodyParameter("Resource", resourceShrink);
            this.resource = resource;
            return this;
        }

        /**
         * <p>Filters by minimum permission resource type.</p>
         * <p>Note: The minimum permission resource type is constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources[*].isValidLeaf being true.</p>
         * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for International site</a></p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceType(java.util.List<String> resourceType) {
            String resourceTypeShrink = shrink(resourceType, "ResourceType", "json");
            this.putBodyParameter("ResourceType", resourceTypeShrink);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The start time of the application period (millisecond timestamp).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1771948800000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Filters by approval status. Valid values:</p>
         * <ul>
         * <li>WaitApproval: pending approval.</li>
         * <li>Confirmed: pending authorization.</li>
         * <li>RejectApproval: approval rejected.</li>
         * <li>AuthorizeSucceed: authorization succeeded.</li>
         * <li>AuthorizeFailed: authorization failed.</li>
         * <li>Deleted: deleted.</li>
         * <li>Canceled: withdrawn.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deleted</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            String statusesShrink = shrink(statuses, "Statuses", "json");
            this.putBodyParameter("Statuses", statusesShrink);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListMyApplicationsRequest build() {
            return new ListMyApplicationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMyApplicationsRequest} extends {@link TeaModel}
     *
     * <p>ListMyApplicationsRequest</p>
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
             * <p>The resource type.</p>
             * <p>Note: The resource types supported by the system for applications are constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.name.</p>
             * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for International site</a></p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder defSchema(String defSchema) {
                this.defSchema = defSchema;
                return this;
            }

            /**
             * <p>The resource parsing version, which is constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.version.</p>
             * <p><a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for International site</a></p>
             * 
             * <strong>example:</strong>
             * <p>v1.0.0</p>
             */
            public Builder defVersion(String defVersion) {
                this.defVersion = defVersion;
                return this;
            }

            /**
             * <p>The resource metadata.</p>
             * <p>Note: The metadata is constrained by <a href="https://help.aliyun.com/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources. A valid resource declaration must include the full-path metadata declarations from level 0 to the validLeaf level.</p>
             * <p>See also: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation for International site</a></p>
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
