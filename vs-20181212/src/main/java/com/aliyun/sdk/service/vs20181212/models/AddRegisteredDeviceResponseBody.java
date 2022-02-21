// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRegisteredDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>AddRegisteredDeviceResponseBody</p>
 */
public class AddRegisteredDeviceResponseBody extends TeaModel {
    @NameInMap("Dsn")
    private String dsn;

    @NameInMap("Id")
    private String id;

    @NameInMap("RegisterCode")
    private String registerCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretKey")
    private String secretKey;

    @NameInMap("Vendor")
    private String vendor;

    private AddRegisteredDeviceResponseBody(Builder builder) {
        this.dsn = builder.dsn;
        this.id = builder.id;
        this.registerCode = builder.registerCode;
        this.requestId = builder.requestId;
        this.secretKey = builder.secretKey;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRegisteredDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dsn
     */
    public String getDsn() {
        return this.dsn;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return registerCode
     */
    public String getRegisterCode() {
        return this.registerCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String dsn; 
        private String id; 
        private String registerCode; 
        private String requestId; 
        private String secretKey; 
        private String vendor; 

        /**
         * Dsn.
         */
        public Builder dsn(String dsn) {
            this.dsn = dsn;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * RegisterCode.
         */
        public Builder registerCode(String registerCode) {
            this.registerCode = registerCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecretKey.
         */
        public Builder secretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public AddRegisteredDeviceResponseBody build() {
            return new AddRegisteredDeviceResponseBody(this);
        } 

    } 

}
