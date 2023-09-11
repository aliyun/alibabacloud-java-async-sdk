// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConnectKmsInstanceRequest} extends {@link RequestModel}
 *
 * <p>ConnectKmsInstanceRequest</p>
 */
public class ConnectKmsInstanceRequest extends Request {
    @Query
    @NameInMap("KMProvider")
    @Validation(required = true)
    private String KMProvider;

    @Query
    @NameInMap("KmsInstanceId")
    @Validation(required = true)
    private String kmsInstanceId;

    @Query
    @NameInMap("VSwitchIds")
    @Validation(required = true)
    private String vSwitchIds;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("ZoneIds")
    @Validation(required = true)
    private String zoneIds;

    private ConnectKmsInstanceRequest(Builder builder) {
        super(builder);
        this.KMProvider = builder.KMProvider;
        this.kmsInstanceId = builder.kmsInstanceId;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectKmsInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return KMProvider
     */
    public String getKMProvider() {
        return this.KMProvider;
    }

    /**
     * @return kmsInstanceId
     */
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    /**
     * @return vSwitchIds
     */
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneIds
     */
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder extends Request.Builder<ConnectKmsInstanceRequest, Builder> {
        private String KMProvider; 
        private String kmsInstanceId; 
        private String vSwitchIds; 
        private String vpcId; 
        private String zoneIds; 

        private Builder() {
            super();
        } 

        private Builder(ConnectKmsInstanceRequest request) {
            super(request);
            this.KMProvider = request.KMProvider;
            this.kmsInstanceId = request.kmsInstanceId;
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
            this.zoneIds = request.zoneIds;
        } 

        /**
         * KMProvider.
         */
        public Builder KMProvider(String KMProvider) {
            this.putQueryParameter("KMProvider", KMProvider);
            this.KMProvider = KMProvider;
            return this;
        }

        /**
         * KmsInstanceId.
         */
        public Builder kmsInstanceId(String kmsInstanceId) {
            this.putQueryParameter("KmsInstanceId", kmsInstanceId);
            this.kmsInstanceId = kmsInstanceId;
            return this;
        }

        /**
         * VSwitchIds.
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneIds.
         */
        public Builder zoneIds(String zoneIds) {
            this.putQueryParameter("ZoneIds", zoneIds);
            this.zoneIds = zoneIds;
            return this;
        }

        @Override
        public ConnectKmsInstanceRequest build() {
            return new ConnectKmsInstanceRequest(this);
        } 

    } 

}
