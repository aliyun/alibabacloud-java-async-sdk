// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetRepoBuildRecordRequest} extends {@link RequestModel}
 *
 * <p>GetRepoBuildRecordRequest</p>
 */
public class GetRepoBuildRecordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildRecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buildRecordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetRepoBuildRecordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildRecordId = builder.buildRecordId;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<GetRepoBuildRecordRequest, Builder> {
        private String regionId; 
        private String buildRecordId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoBuildRecordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buildRecordId = request.buildRecordId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the image building record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a78ec6fb-16ea-4649-93b7-f52afba7d****</p>
         */
        public Builder buildRecordId(String buildRecordId) {
            this.putQueryParameter("BuildRecordId", buildRecordId);
            this.buildRecordId = buildRecordId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcva****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetRepoBuildRecordRequest build() {
            return new GetRepoBuildRecordRequest(this);
        } 

    } 

}
