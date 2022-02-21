// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicIpSetRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicIpSetRequest</p>
 */
public class CreateBasicIpSetRequest extends Request {
    @Query
    @NameInMap("AccelerateRegionId")
    @Validation(required = true)
    private String accelerateRegionId;

    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateBasicIpSetRequest(Builder builder) {
        super(builder);
        this.accelerateRegionId = builder.accelerateRegionId;
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicIpSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateRegionId
     */
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateBasicIpSetRequest, Builder> {
        private String accelerateRegionId; 
        private String acceleratorId; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicIpSetRequest response) {
            super(response);
            this.accelerateRegionId = response.accelerateRegionId;
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.regionId = response.regionId;
        } 

        /**
         * 加速地域Id
         */
        public Builder accelerateRegionId(String accelerateRegionId) {
            this.putQueryParameter("AccelerateRegionId", accelerateRegionId);
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }

        /**
         * 基础版全球加速实例Id
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
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
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateBasicIpSetRequest build() {
            return new CreateBasicIpSetRequest(this);
        } 

    } 

}
