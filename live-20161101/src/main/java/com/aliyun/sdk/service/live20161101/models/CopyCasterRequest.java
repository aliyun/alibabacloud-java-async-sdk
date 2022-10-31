// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyCasterRequest} extends {@link RequestModel}
 *
 * <p>CopyCasterRequest</p>
 */
public class CopyCasterRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterName")
    @Validation(required = true)
    private String casterName;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SrcCasterId")
    @Validation(required = true)
    private String srcCasterId;

    private CopyCasterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterName = builder.casterName;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.srcCasterId = builder.srcCasterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyCasterRequest create() {
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
     * @return casterName
     */
    public String getCasterName() {
        return this.casterName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return srcCasterId
     */
    public String getSrcCasterId() {
        return this.srcCasterId;
    }

    public static final class Builder extends Request.Builder<CopyCasterRequest, Builder> {
        private String regionId; 
        private String casterName; 
        private String clientToken; 
        private Long ownerId; 
        private String srcCasterId; 

        private Builder() {
            super();
        } 

        private Builder(CopyCasterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterName = request.casterName;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.srcCasterId = request.srcCasterId;
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
         * CasterName.
         */
        public Builder casterName(String casterName) {
            this.putQueryParameter("CasterName", casterName);
            this.casterName = casterName;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SrcCasterId.
         */
        public Builder srcCasterId(String srcCasterId) {
            this.putQueryParameter("SrcCasterId", srcCasterId);
            this.srcCasterId = srcCasterId;
            return this;
        }

        @Override
        public CopyCasterRequest build() {
            return new CopyCasterRequest(this);
        } 

    } 

}
