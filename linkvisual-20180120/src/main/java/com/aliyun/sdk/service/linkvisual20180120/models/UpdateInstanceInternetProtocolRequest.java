// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceInternetProtocolRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceInternetProtocolRequest</p>
 */
public class UpdateInstanceInternetProtocolRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    private String iotInstanceId;

    @Query
    @NameInMap("IpVersion")
    @Validation(required = true)
    private String ipVersion;

    private UpdateInstanceInternetProtocolRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.ipVersion = builder.ipVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceInternetProtocolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceInternetProtocolRequest, Builder> {
        private String iotInstanceId; 
        private String ipVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceInternetProtocolRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.ipVersion = request.ipVersion;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        @Override
        public UpdateInstanceInternetProtocolRequest build() {
            return new UpdateInstanceInternetProtocolRequest(this);
        } 

    } 

}
