// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociateAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>UnassociateAnycastEipAddressRequest</p>
 */
public class UnassociateAnycastEipAddressRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    @Validation(required = true)
    private String anycastId;

    @Query
    @NameInMap("BindInstanceId")
    @Validation(required = true)
    private String bindInstanceId;

    @Query
    @NameInMap("BindInstanceRegionId")
    @Validation(required = true)
    private String bindInstanceRegionId;

    @Query
    @NameInMap("BindInstanceType")
    @Validation(required = true)
    private String bindInstanceType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private String dryRun;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    private UnassociateAnycastEipAddressRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.bindInstanceId = builder.bindInstanceId;
        this.bindInstanceRegionId = builder.bindInstanceRegionId;
        this.bindInstanceType = builder.bindInstanceType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassociateAnycastEipAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return bindInstanceId
     */
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    /**
     * @return bindInstanceRegionId
     */
    public String getBindInstanceRegionId() {
        return this.bindInstanceRegionId;
    }

    /**
     * @return bindInstanceType
     */
    public String getBindInstanceType() {
        return this.bindInstanceType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<UnassociateAnycastEipAddressRequest, Builder> {
        private String anycastId; 
        private String bindInstanceId; 
        private String bindInstanceRegionId; 
        private String bindInstanceType; 
        private String clientToken; 
        private String dryRun; 
        private String privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(UnassociateAnycastEipAddressRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.bindInstanceId = request.bindInstanceId;
            this.bindInstanceRegionId = request.bindInstanceRegionId;
            this.bindInstanceType = request.bindInstanceType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.privateIpAddress = request.privateIpAddress;
        } 

        /**
         * AnycastId.
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * BindInstanceId.
         */
        public Builder bindInstanceId(String bindInstanceId) {
            this.putQueryParameter("BindInstanceId", bindInstanceId);
            this.bindInstanceId = bindInstanceId;
            return this;
        }

        /**
         * BindInstanceRegionId.
         */
        public Builder bindInstanceRegionId(String bindInstanceRegionId) {
            this.putQueryParameter("BindInstanceRegionId", bindInstanceRegionId);
            this.bindInstanceRegionId = bindInstanceRegionId;
            return this;
        }

        /**
         * BindInstanceType.
         */
        public Builder bindInstanceType(String bindInstanceType) {
            this.putQueryParameter("BindInstanceType", bindInstanceType);
            this.bindInstanceType = bindInstanceType;
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
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * PrivateIpAddress.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        @Override
        public UnassociateAnycastEipAddressRequest build() {
            return new UnassociateAnycastEipAddressRequest(this);
        } 

    } 

}
