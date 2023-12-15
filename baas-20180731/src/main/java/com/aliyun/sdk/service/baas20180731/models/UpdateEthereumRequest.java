// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEthereumRequest} extends {@link RequestModel}
 *
 * <p>UpdateEthereumRequest</p>
 */
public class UpdateEthereumRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("EthereumId")
    @Validation(required = true)
    private String ethereumId;

    @Body
    @NameInMap("Name")
    private String name;

    private UpdateEthereumRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.ethereumId = builder.ethereumId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEthereumRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ethereumId
     */
    public String getEthereumId() {
        return this.ethereumId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateEthereumRequest, Builder> {
        private String regionId; 
        private String description; 
        private String ethereumId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEthereumRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.ethereumId = request.ethereumId;
            this.name = request.name;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EthereumId.
         */
        public Builder ethereumId(String ethereumId) {
            this.putBodyParameter("EthereumId", ethereumId);
            this.ethereumId = ethereumId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateEthereumRequest build() {
            return new UpdateEthereumRequest(this);
        } 

    } 

}
