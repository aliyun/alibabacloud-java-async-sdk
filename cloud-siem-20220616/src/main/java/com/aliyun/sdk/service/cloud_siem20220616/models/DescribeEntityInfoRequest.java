// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeEntityInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeEntityInfoRequest</p>
 */
public class DescribeEntityInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private Long entityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityIdentity")
    private String entityIdentity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncidentUuid")
    private String incidentUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SophonTaskId")
    private String sophonTaskId;

    private DescribeEntityInfoRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.entityIdentity = builder.entityIdentity;
        this.incidentUuid = builder.incidentUuid;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.sophonTaskId = builder.sophonTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEntityInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityIdentity
     */
    public String getEntityIdentity() {
        return this.entityIdentity;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return sophonTaskId
     */
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeEntityInfoRequest, Builder> {
        private Long entityId; 
        private String entityIdentity; 
        private String incidentUuid; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String sophonTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEntityInfoRequest request) {
            super(request);
            this.entityId = request.entityId;
            this.entityIdentity = request.entityIdentity;
            this.incidentUuid = request.incidentUuid;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.sophonTaskId = request.sophonTaskId;
        } 

        /**
         * <p>The logical ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The feature value of the entity. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test22.php</p>
         */
        public Builder entityIdentity(String entityIdentity) {
            this.putBodyParameter("EntityIdentity", entityIdentity);
            this.entityIdentity = entityIdentity;
            return this;
        }

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the account that you switch from the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The ID of the SOAR handling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>577bbf90-a770-44a7-8154-586aa2d318fa</p>
         */
        public Builder sophonTaskId(String sophonTaskId) {
            this.putBodyParameter("SophonTaskId", sophonTaskId);
            this.sophonTaskId = sophonTaskId;
            return this;
        }

        @Override
        public DescribeEntityInfoRequest build() {
            return new DescribeEntityInfoRequest(this);
        } 

    } 

}
