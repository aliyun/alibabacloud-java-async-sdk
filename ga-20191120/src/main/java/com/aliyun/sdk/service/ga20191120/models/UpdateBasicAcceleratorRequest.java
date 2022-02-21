// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBasicAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>UpdateBasicAcceleratorRequest</p>
 */
public class UpdateBasicAcceleratorRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private UpdateBasicAcceleratorRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBasicAcceleratorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateBasicAcceleratorRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private String description; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBasicAcceleratorRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.name = response.name;
            this.regionId = response.regionId;
        } 

        /**
         * 全球加速实例Id
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
         * 全球加速实例描述
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 全球加速实例名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public UpdateBasicAcceleratorRequest build() {
            return new UpdateBasicAcceleratorRequest(this);
        } 

    } 

}
