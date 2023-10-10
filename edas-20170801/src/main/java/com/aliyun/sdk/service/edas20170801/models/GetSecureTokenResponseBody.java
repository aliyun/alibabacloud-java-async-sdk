// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecureTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecureTokenResponseBody</p>
 */
public class GetSecureTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecureToken")
    private SecureToken secureToken;

    private GetSecureTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secureToken = builder.secureToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecureTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secureToken
     */
    public SecureToken getSecureToken() {
        return this.secureToken;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private SecureToken secureToken; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message returned for the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned security token.
         */
        public Builder secureToken(SecureToken secureToken) {
            this.secureToken = secureToken;
            return this;
        }

        public GetSecureTokenResponseBody build() {
            return new GetSecureTokenResponseBody(this);
        } 

    } 

    public static class SecureToken extends TeaModel {
        @NameInMap("AccessKey")
        private String accessKey;

        @NameInMap("AddressServerHost")
        private String addressServerHost;

        @NameInMap("BelongRegion")
        private String belongRegion;

        @NameInMap("Description")
        private String description;

        @NameInMap("EdasId")
        private String edasId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MseInstanceId")
        private String mseInstanceId;

        @NameInMap("MseInternetAddress")
        private String mseInternetAddress;

        @NameInMap("MseIntranetAddress")
        private String mseIntranetAddress;

        @NameInMap("MseRegistryType")
        private String mseRegistryType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("SecretKey")
        private String secretKey;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("UserId")
        private String userId;

        private SecureToken(Builder builder) {
            this.accessKey = builder.accessKey;
            this.addressServerHost = builder.addressServerHost;
            this.belongRegion = builder.belongRegion;
            this.description = builder.description;
            this.edasId = builder.edasId;
            this.id = builder.id;
            this.mseInstanceId = builder.mseInstanceId;
            this.mseInternetAddress = builder.mseInternetAddress;
            this.mseIntranetAddress = builder.mseIntranetAddress;
            this.mseRegistryType = builder.mseRegistryType;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.secretKey = builder.secretKey;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecureToken create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return addressServerHost
         */
        public String getAddressServerHost() {
            return this.addressServerHost;
        }

        /**
         * @return belongRegion
         */
        public String getBelongRegion() {
            return this.belongRegion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return edasId
         */
        public String getEdasId() {
            return this.edasId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mseInstanceId
         */
        public String getMseInstanceId() {
            return this.mseInstanceId;
        }

        /**
         * @return mseInternetAddress
         */
        public String getMseInternetAddress() {
            return this.mseInternetAddress;
        }

        /**
         * @return mseIntranetAddress
         */
        public String getMseIntranetAddress() {
            return this.mseIntranetAddress;
        }

        /**
         * @return mseRegistryType
         */
        public String getMseRegistryType() {
            return this.mseRegistryType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String accessKey; 
            private String addressServerHost; 
            private String belongRegion; 
            private String description; 
            private String edasId; 
            private Long id; 
            private String mseInstanceId; 
            private String mseInternetAddress; 
            private String mseIntranetAddress; 
            private String mseRegistryType; 
            private String regionId; 
            private String regionName; 
            private String secretKey; 
            private String tenantId; 
            private String userId; 

            /**
             * The AccessKey ID used in the namespace.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * The address of Address Server associated with the namespace.
             */
            public Builder addressServerHost(String addressServerHost) {
                this.addressServerHost = addressServerHost;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * The description of the namespace.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that activated Enterprise Distributed Application Service (EDAS).
             */
            public Builder edasId(String edasId) {
                this.edasId = edasId;
                return this;
            }

            /**
             * The ID of the security token.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the MSE instance.
             */
            public Builder mseInstanceId(String mseInstanceId) {
                this.mseInstanceId = mseInstanceId;
                return this;
            }

            /**
             * The public endpoint of the MSE registry.
             */
            public Builder mseInternetAddress(String mseInternetAddress) {
                this.mseInternetAddress = mseInternetAddress;
                return this;
            }

            /**
             * The private endpoint of the MSE registry.
             */
            public Builder mseIntranetAddress(String mseIntranetAddress) {
                this.mseIntranetAddress = mseIntranetAddress;
                return this;
            }

            /**
             * The type of the Microservices Engine (MSE) registry.
             * <p>
             * 
             * *   default: the shared registry of EDAS
             * *   exclusive_mse: MSE Nacos registry
             */
            public Builder mseRegistryType(String mseRegistryType) {
                this.mseRegistryType = mseRegistryType;
                return this;
            }

            /**
             * The ID of the region where the namespace resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the region where the namespace resides.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The AccessKey secret used in the namespace.
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * The tenant ID of the namespace.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public SecureToken build() {
                return new SecureToken(this);
            } 

        } 

    }
}
