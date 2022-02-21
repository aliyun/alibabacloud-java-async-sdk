// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRegisteredDeviceRequest} extends {@link RequestModel}
 *
 * <p>AddRegisteredDeviceRequest</p>
 */
public class AddRegisteredDeviceRequest extends Request {
    @Query
    @NameInMap("Dsn")
    @Validation(required = true)
    private String dsn;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegisterCode")
    @Validation(required = true)
    private String registerCode;

    @Query
    @NameInMap("SecretKey")
    @Validation(required = true)
    private String secretKey;

    @Query
    @NameInMap("Vendor")
    @Validation(required = true)
    private String vendor;

    private AddRegisteredDeviceRequest(Builder builder) {
        super(builder);
        this.dsn = builder.dsn;
        this.ownerId = builder.ownerId;
        this.registerCode = builder.registerCode;
        this.secretKey = builder.secretKey;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRegisteredDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dsn
     */
    public String getDsn() {
        return this.dsn;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return registerCode
     */
    public String getRegisterCode() {
        return this.registerCode;
    }

    /**
     * @return secretKey
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<AddRegisteredDeviceRequest, Builder> {
        private String dsn; 
        private Long ownerId; 
        private String registerCode; 
        private String secretKey; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(AddRegisteredDeviceRequest response) {
            super(response);
            this.dsn = response.dsn;
            this.ownerId = response.ownerId;
            this.registerCode = response.registerCode;
            this.secretKey = response.secretKey;
            this.vendor = response.vendor;
        } 

        /**
         * Dsn.
         */
        public Builder dsn(String dsn) {
            this.putQueryParameter("Dsn", dsn);
            this.dsn = dsn;
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
         * RegisterCode.
         */
        public Builder registerCode(String registerCode) {
            this.putQueryParameter("RegisterCode", registerCode);
            this.registerCode = registerCode;
            return this;
        }

        /**
         * SecretKey.
         */
        public Builder secretKey(String secretKey) {
            this.putQueryParameter("SecretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public AddRegisteredDeviceRequest build() {
            return new AddRegisteredDeviceRequest(this);
        } 

    } 

}
