// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetSecuritySecretKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecuritySecretKeyResponseBody</p>
 */
public class GetSecuritySecretKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecuritySecretKeyInfo")
    private SecuritySecretKeyInfo securitySecretKeyInfo;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSecuritySecretKeyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.securitySecretKeyInfo = builder.securitySecretKeyInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecuritySecretKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return securitySecretKeyInfo
     */
    public SecuritySecretKeyInfo getSecuritySecretKeyInfo() {
        return this.securitySecretKeyInfo;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private SecuritySecretKeyInfo securitySecretKeyInfo; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSecuritySecretKeyResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.securitySecretKeyInfo = model.securitySecretKeyInfo;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security key details.</p>
         */
        public Builder securitySecretKeyInfo(SecuritySecretKeyInfo securitySecretKeyInfo) {
            this.securitySecretKeyInfo = securitySecretKeyInfo;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSecuritySecretKeyResponseBody build() {
            return new GetSecuritySecretKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecuritySecretKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecuritySecretKeyResponseBody</p>
     */
    public static class SecuritySecretKeyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgorithmType")
        private String algorithmType;

        @com.aliyun.core.annotation.NameInMap("AlgorithmTypeAlias")
        private String algorithmTypeAlias;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableOpenapiQuery")
        private Boolean enableOpenapiQuery;

        @com.aliyun.core.annotation.NameInMap("GenerationType")
        private String generationType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsOwnerManageOnly")
        private Boolean isOwnerManageOnly;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("SecretKeyList")
        private java.util.List<String> secretKeyList;

        @com.aliyun.core.annotation.NameInMap("SubKeyCount")
        private Long subKeyCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SecuritySecretKeyInfo(Builder builder) {
            this.algorithmType = builder.algorithmType;
            this.algorithmTypeAlias = builder.algorithmTypeAlias;
            this.description = builder.description;
            this.enableOpenapiQuery = builder.enableOpenapiQuery;
            this.generationType = builder.generationType;
            this.id = builder.id;
            this.isOwnerManageOnly = builder.isOwnerManageOnly;
            this.name = builder.name;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.secretKeyList = builder.secretKeyList;
            this.subKeyCount = builder.subKeyCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecuritySecretKeyInfo create() {
            return builder().build();
        }

        /**
         * @return algorithmType
         */
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        /**
         * @return algorithmTypeAlias
         */
        public String getAlgorithmTypeAlias() {
            return this.algorithmTypeAlias;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableOpenapiQuery
         */
        public Boolean getEnableOpenapiQuery() {
            return this.enableOpenapiQuery;
        }

        /**
         * @return generationType
         */
        public String getGenerationType() {
            return this.generationType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isOwnerManageOnly
         */
        public Boolean getIsOwnerManageOnly() {
            return this.isOwnerManageOnly;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return secretKeyList
         */
        public java.util.List<String> getSecretKeyList() {
            return this.secretKeyList;
        }

        /**
         * @return subKeyCount
         */
        public Long getSubKeyCount() {
            return this.subKeyCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String algorithmType; 
            private String algorithmTypeAlias; 
            private String description; 
            private Boolean enableOpenapiQuery; 
            private String generationType; 
            private Long id; 
            private Boolean isOwnerManageOnly; 
            private String name; 
            private String owner; 
            private String ownerName; 
            private java.util.List<String> secretKeyList; 
            private Long subKeyCount; 
            private String type; 

            private Builder() {
            } 

            private Builder(SecuritySecretKeyInfo model) {
                this.algorithmType = model.algorithmType;
                this.algorithmTypeAlias = model.algorithmTypeAlias;
                this.description = model.description;
                this.enableOpenapiQuery = model.enableOpenapiQuery;
                this.generationType = model.generationType;
                this.id = model.id;
                this.isOwnerManageOnly = model.isOwnerManageOnly;
                this.name = model.name;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.secretKeyList = model.secretKeyList;
                this.subKeyCount = model.subKeyCount;
                this.type = model.type;
            } 

            /**
             * <p>The algorithm type. Valid values: AES, DES, DESEDE, SM2, SM4, RSA, and FF1.</p>
             * 
             * <strong>example:</strong>
             * <p>AES</p>
             */
            public Builder algorithmType(String algorithmType) {
                this.algorithmType = algorithmType;
                return this;
            }

            /**
             * <p>The alias of the algorithm type.</p>
             * 
             * <strong>example:</strong>
             * <p>AES</p>
             */
            public Builder algorithmTypeAlias(String algorithmTypeAlias) {
                this.algorithmTypeAlias = algorithmTypeAlias;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether OpenAPI query is supported.</p>
             */
            public Builder enableOpenapiQuery(Boolean enableOpenapiQuery) {
                this.enableOpenapiQuery = enableOpenapiQuery;
                return this;
            }

            /**
             * <p>The generation method. Valid values:</p>
             * <ul>
             * <li>SYSTEM_GENERATION: system-generated.</li>
             * <li>USER_GENERATION: user-generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM_GENERATION</p>
             */
            public Builder generationType(String generationType) {
                this.generationType = generationType;
                return this;
            }

            /**
             * <p>The key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether only the owner can manage the key.</p>
             */
            public Builder isOwnerManageOnly(Boolean isOwnerManageOnly) {
                this.isOwnerManageOnly = isOwnerManageOnly;
                return this;
            }

            /**
             * <p>The key name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The owner name.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The key values.</p>
             */
            public Builder secretKeyList(java.util.List<String> secretKeyList) {
                this.secretKeyList = secretKeyList;
                return this;
            }

            /**
             * <p>The number of sub-keys.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder subKeyCount(Long subKeyCount) {
                this.subKeyCount = subKeyCount;
                return this;
            }

            /**
             * <p>The key type. Valid values:</p>
             * <ul>
             * <li>HASH: hashing and masking.</li>
             * <li>ENCRYPT: encryption and decryption.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HASH</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SecuritySecretKeyInfo build() {
                return new SecuritySecretKeyInfo(this);
            } 

        } 

    }
}
