// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncRCKeyPairRequest} extends {@link RequestModel}
 *
 * <p>SyncRCKeyPairRequest</p>
 */
public class SyncRCKeyPairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SyncRCKeyPairRequest(Builder builder) {
        super(builder);
        this.keyPairName = builder.keyPairName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncRCKeyPairRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SyncRCKeyPairRequest, Builder> {
        private String keyPairName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SyncRCKeyPairRequest request) {
            super(request);
            this.keyPairName = request.keyPairName;
            this.regionId = request.regionId;
        } 

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
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
        public SyncRCKeyPairRequest build() {
            return new SyncRCKeyPairRequest(this);
        } 

    } 

}
