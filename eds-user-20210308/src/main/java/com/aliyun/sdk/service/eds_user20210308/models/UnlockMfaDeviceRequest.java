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
 * {@link UnlockMfaDeviceRequest} extends {@link RequestModel}
 *
 * <p>UnlockMfaDeviceRequest</p>
 */
public class UnlockMfaDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdDomain")
    private String adDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNumber;

    private UnlockMfaDeviceRequest(Builder builder) {
        super(builder);
        this.adDomain = builder.adDomain;
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnlockMfaDeviceRequest create() {
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
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static final class Builder extends Request.Builder<UnlockMfaDeviceRequest, Builder> {
        private String adDomain; 
        private String serialNumber; 

        private Builder() {
            super();
        } 

        private Builder(UnlockMfaDeviceRequest request) {
            super(request);
            this.adDomain = request.adDomain;
            this.serialNumber = request.serialNumber;
        } 

        /**
         * <p>The domain of the Active Directory (AD) workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>welab.co.id</p>
         */
        public Builder adDomain(String adDomain) {
            this.putQueryParameter("AdDomain", adDomain);
            this.adDomain = adDomain;
            return this;
        }

        /**
         * <p>The serial number of the virtual MFA device. The serial number is unique for each device.</p>
         * <p>This parameter is required.</p>
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
        public UnlockMfaDeviceRequest build() {
            return new UnlockMfaDeviceRequest(this);
        } 

    } 

}
