// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VoiceIdentityRegisterRequest} extends {@link RequestModel}
 *
 * <p>VoiceIdentityRegisterRequest</p>
 */
public class VoiceIdentityRegisterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientInfo")
    private String clientInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private VoiceIdentityRegisterRequest(Builder builder) {
        super(builder);
        this.clientInfo = builder.clientInfo;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VoiceIdentityRegisterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientInfo
     */
    public String getClientInfo() {
        return this.clientInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<VoiceIdentityRegisterRequest, Builder> {
        private String clientInfo; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(VoiceIdentityRegisterRequest request) {
            super(request);
            this.clientInfo = request.clientInfo;
            this.regionId = request.regionId;
        } 

        /**
         * ClientInfo.
         */
        public Builder clientInfo(String clientInfo) {
            this.putQueryParameter("ClientInfo", clientInfo);
            this.clientInfo = clientInfo;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public VoiceIdentityRegisterRequest build() {
            return new VoiceIdentityRegisterRequest(this);
        } 

    } 

}
