// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHostShareKeyRequest} extends {@link RequestModel}
 *
 * <p>GetHostShareKeyRequest</p>
 */
public class GetHostShareKeyRequest extends Request {
    @Query
    @NameInMap("HostShareKeyId")
    @Validation(required = true)
    private String hostShareKeyId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetHostShareKeyRequest(Builder builder) {
        super(builder);
        this.hostShareKeyId = builder.hostShareKeyId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHostShareKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostShareKeyId
     */
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
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

    public static final class Builder extends Request.Builder<GetHostShareKeyRequest, Builder> {
        private String hostShareKeyId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetHostShareKeyRequest request) {
            super(request);
            this.hostShareKeyId = request.hostShareKeyId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The time when the information about the shared key was last modified.
         */
        public Builder hostShareKeyId(String hostShareKeyId) {
            this.putQueryParameter("HostShareKeyId", hostShareKeyId);
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }

        /**
         * The ID of the shared key whose details you want to query.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the shared key.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetHostShareKeyRequest build() {
            return new GetHostShareKeyRequest(this);
        } 

    } 

}
