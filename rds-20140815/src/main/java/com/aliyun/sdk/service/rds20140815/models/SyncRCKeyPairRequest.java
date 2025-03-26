// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncMode")
    private Boolean syncMode;

    private SyncRCKeyPairRequest(Builder builder) {
        super(builder);
        this.keyPairName = builder.keyPairName;
        this.regionId = builder.regionId;
        this.syncMode = builder.syncMode;
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

    /**
     * @return syncMode
     */
    public Boolean getSyncMode() {
        return this.syncMode;
    }

    public static final class Builder extends Request.Builder<SyncRCKeyPairRequest, Builder> {
        private String keyPairName; 
        private String regionId; 
        private Boolean syncMode; 

        private Builder() {
            super();
        } 

        private Builder(SyncRCKeyPairRequest request) {
            super(request);
            this.keyPairName = request.keyPairName;
            this.regionId = request.regionId;
            this.syncMode = request.syncMode;
        } 

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_keypairs</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SyncMode.
         */
        public Builder syncMode(Boolean syncMode) {
            this.putQueryParameter("SyncMode", syncMode);
            this.syncMode = syncMode;
            return this;
        }

        @Override
        public SyncRCKeyPairRequest build() {
            return new SyncRCKeyPairRequest(this);
        } 

    } 

}
