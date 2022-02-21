// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicIpSetRequest} extends {@link RequestModel}
 *
 * <p>GetBasicIpSetRequest</p>
 */
public class GetBasicIpSetRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("IpSetId")
    @Validation(required = true)
    private String ipSetId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetBasicIpSetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ipSetId = builder.ipSetId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicIpSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipSetId
     */
    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetBasicIpSetRequest, Builder> {
        private String clientToken; 
        private String ipSetId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetBasicIpSetRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.ipSetId = response.ipSetId;
            this.regionId = response.regionId;
        } 

        /**
         * 客户端Token
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 加速接入点Id
         */
        public Builder ipSetId(String ipSetId) {
            this.putQueryParameter("IpSetId", ipSetId);
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetBasicIpSetRequest build() {
            return new GetBasicIpSetRequest(this);
        } 

    } 

}
