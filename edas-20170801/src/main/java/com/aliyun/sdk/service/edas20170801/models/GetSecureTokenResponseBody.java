// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetSecureTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecureTokenResponseBody</p>
 */
public class GetSecureTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecureToken")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetSecureTokenResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.secureToken = model.secureToken;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D16979DC-4D42-*************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned security token.</p>
         */
        public Builder secureToken(SecureToken secureToken) {
            this.secureToken = secureToken;
            return this;
        }

        public GetSecureTokenResponseBody build() {
            return new GetSecureTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecureTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecureTokenResponseBody</p>
     */
    public static class SecureToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("AddressServerHost")
        private String addressServerHost;

        @com.aliyun.core.annotation.NameInMap("BelongRegion")
        private String belongRegion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EdasId")
        private String edasId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MseInstanceId")
        private String mseInstanceId;

        @com.aliyun.core.annotation.NameInMap("MseInternetAddress")
        private String mseInternetAddress;

        @com.aliyun.core.annotation.NameInMap("MseIntranetAddress")
        private String mseIntranetAddress;

        @com.aliyun.core.annotation.NameInMap("MseRegistryType")
        private String mseRegistryType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(SecureToken model) {
                this.accessKey = model.accessKey;
                this.addressServerHost = model.addressServerHost;
                this.belongRegion = model.belongRegion;
                this.description = model.description;
                this.edasId = model.edasId;
                this.id = model.id;
                this.mseInstanceId = model.mseInstanceId;
                this.mseInternetAddress = model.mseInternetAddress;
                this.mseIntranetAddress = model.mseIntranetAddress;
                this.mseRegistryType = model.mseRegistryType;
                this.regionId = model.regionId;
                this.regionName = model.regionName;
                this.secretKey = model.secretKey;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
            } 

            /**
             * <p>The AccessKey ID used in the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>f676f1**************</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The address of Address Server associated with the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>addr-<strong><strong>-</strong></strong>.edas.aliyun.com</p>
             */
            public Builder addressServerHost(String addressServerHost) {
                this.addressServerHost = addressServerHost;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * <p>The description of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>”“</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that activated Enterprise Distributed Application Service (EDAS).</p>
             * 
             * <strong>example:</strong>
             * <p>11727458********</p>
             */
            public Builder edasId(String edasId) {
                this.edasId = edasId;
                return this;
            }

            /**
             * <p>The ID of the security token.</p>
             * 
             * <strong>example:</strong>
             * <p>7279</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the MSE instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse_prepaid_public_cn-tl32p******</p>
             */
            public Builder mseInstanceId(String mseInstanceId) {
                this.mseInstanceId = mseInstanceId;
                return this;
            }

            /**
             * <p>The public endpoint of the MSE registry.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-aa2******-p.nacos-ans.mse.aliyuncs.com</p>
             */
            public Builder mseInternetAddress(String mseInternetAddress) {
                this.mseInternetAddress = mseInternetAddress;
                return this;
            }

            /**
             * <p>The private endpoint of the MSE registry.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-72******-nacos-ans.mse.aliyuncs.com</p>
             */
            public Builder mseIntranetAddress(String mseIntranetAddress) {
                this.mseIntranetAddress = mseIntranetAddress;
                return this;
            }

            /**
             * <p>The type of the Microservices Engine (MSE) registry.</p>
             * <ul>
             * <li>default: the shared registry of EDAS</li>
             * <li>exclusive_mse: MSE Nacos registry</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exclusive_mse</p>
             */
            public Builder mseRegistryType(String mseRegistryType) {
                this.mseRegistryType = mseRegistryType;
                return this;
            }

            /**
             * <p>The ID of the region where the namespace resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen:x*******</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region where the namespace resides.</p>
             * 
             * <strong>example:</strong>
             * <p>x******</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The AccessKey secret used in the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>gOSgbgR2R*************</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The tenant ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>401b7bc8-9441-4693-<strong><strong>-</strong></strong>********</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>edas_com***_****@<em><em><strong><strong>-</strong></strong></em>.</em>**</p>
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
