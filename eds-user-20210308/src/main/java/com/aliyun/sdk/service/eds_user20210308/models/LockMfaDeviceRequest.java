// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link LockMfaDeviceRequest} extends {@link RequestModel}
 *
 * <p>LockMfaDeviceRequest</p>
 */
public class LockMfaDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdDomain")
    private String adDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    private LockMfaDeviceRequest(Builder builder) {
        super(builder);
        this.adDomain = builder.adDomain;
        this.businessChannel = builder.businessChannel;
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockMfaDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adDomain
     */
    public String getAdDomain() {
        return this.adDomain;
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static final class Builder extends Request.Builder<LockMfaDeviceRequest, Builder> {
        private String adDomain; 
        private String businessChannel; 
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(LockMfaDeviceRequest request) {
            super(request);
            this.adDomain = request.adDomain;
            this.businessChannel = request.businessChannel;
            this.serialNumber = request.serialNumber;
        } 

        /**
         * <p>The domain of the Active Directory (AD) workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-jifenn.com</p>
         */
        public Builder adDomain(String adDomain) {
            this.putQueryParameter("AdDomain", adDomain);
            this.adDomain = adDomain;
            return this;
        }

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>The serial number of the virtual MFA device. The serial number is unique for each device.</p>
         * 
         * <strong>example:</strong>
         * <p>dc856334-446b-4035-bfbc-18af261e****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        @Override
        public LockMfaDeviceRequest build() {
            return new LockMfaDeviceRequest(this);
        } 

    } 

}
