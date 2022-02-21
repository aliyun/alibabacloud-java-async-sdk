// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoBuildRecordRequest} extends {@link RequestModel}
 *
 * <p>GetRepoBuildRecordRequest</p>
 */
public class GetRepoBuildRecordRequest extends Request {
    @Query
    @NameInMap("BuildRecordId")
    @Validation(required = true)
    private String buildRecordId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetRepoBuildRecordRequest(Builder builder) {
        super(builder);
        this.buildRecordId = builder.buildRecordId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoBuildRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildRecordId
     */
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetRepoBuildRecordRequest, Builder> {
        private String buildRecordId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoBuildRecordRequest response) {
            super(response);
            this.buildRecordId = response.buildRecordId;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * BuildRecordId.
         */
        public Builder buildRecordId(String buildRecordId) {
            this.putQueryParameter("BuildRecordId", buildRecordId);
            this.buildRecordId = buildRecordId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetRepoBuildRecordRequest build() {
            return new GetRepoBuildRecordRequest(this);
        } 

    } 

}
