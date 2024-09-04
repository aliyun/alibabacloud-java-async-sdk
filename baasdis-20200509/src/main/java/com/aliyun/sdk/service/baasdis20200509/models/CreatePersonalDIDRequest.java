// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baasdis20200509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePersonalDIDRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalDIDRequest</p>
 */
public class CreatePersonalDIDRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OwnerUniqueID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ownerUniqueID;

    private CreatePersonalDIDRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.ownerUniqueID = builder.ownerUniqueID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalDIDRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerUniqueID
     */
    public String getOwnerUniqueID() {
        return this.ownerUniqueID;
    }

    public static final class Builder extends Request.Builder<CreatePersonalDIDRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String ownerUniqueID; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalDIDRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.ownerUniqueID = request.ownerUniqueID;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OwnerUniqueID.
         */
        public Builder ownerUniqueID(String ownerUniqueID) {
            this.putBodyParameter("OwnerUniqueID", ownerUniqueID);
            this.ownerUniqueID = ownerUniqueID;
            return this;
        }

        @Override
        public CreatePersonalDIDRequest build() {
            return new CreatePersonalDIDRequest(this);
        } 

    } 

}
