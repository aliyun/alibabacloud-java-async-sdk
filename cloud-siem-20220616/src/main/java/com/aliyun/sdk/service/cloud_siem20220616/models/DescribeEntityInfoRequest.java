// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEntityInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeEntityInfoRequest</p>
 */
public class DescribeEntityInfoRequest extends Request {
    @Body
    @NameInMap("EntityId")
    private Long entityId;

    @Body
    @NameInMap("EntityIdentity")
    private String entityIdentity;

    @Body
    @NameInMap("IncidentUuid")
    private String incidentUuid;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SophonTaskId")
    private String sophonTaskId;

    private DescribeEntityInfoRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.entityIdentity = builder.entityIdentity;
        this.incidentUuid = builder.incidentUuid;
        this.regionId = builder.regionId;
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
            this.sophonTaskId = request.sophonTaskId;
        } 

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * EntityIdentity.
         */
        public Builder entityIdentity(String entityIdentity) {
            this.putBodyParameter("EntityIdentity", entityIdentity);
            this.entityIdentity = entityIdentity;
            return this;
        }

        /**
         * IncidentUuid.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SophonTaskId.
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
