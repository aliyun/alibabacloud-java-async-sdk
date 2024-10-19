// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateBackendRequest} extends {@link RequestModel}
 *
 * <p>CreateBackendRequest</p>
 */
public class CreateBackendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backendName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backendType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateEventBridgeServiceLinkedRole")
    private Boolean createEventBridgeServiceLinkedRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateSlr")
    private Boolean createSlr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateBackendRequest(Builder builder) {
        super(builder);
        this.backendName = builder.backendName;
        this.backendType = builder.backendType;
        this.createEventBridgeServiceLinkedRole = builder.createEventBridgeServiceLinkedRole;
        this.createSlr = builder.createSlr;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendName
     */
    public String getBackendName() {
        return this.backendName;
    }

    /**
     * @return backendType
     */
    public String getBackendType() {
        return this.backendType;
    }

    /**
     * @return createEventBridgeServiceLinkedRole
     */
    public Boolean getCreateEventBridgeServiceLinkedRole() {
        return this.createEventBridgeServiceLinkedRole;
    }

    /**
     * @return createSlr
     */
    public Boolean getCreateSlr() {
        return this.createSlr;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateBackendRequest, Builder> {
        private String backendName; 
        private String backendType; 
        private Boolean createEventBridgeServiceLinkedRole; 
        private Boolean createSlr; 
        private String description; 
        private String securityToken; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackendRequest request) {
            super(request);
            this.backendName = request.backendName;
            this.backendType = request.backendType;
            this.createEventBridgeServiceLinkedRole = request.createEventBridgeServiceLinkedRole;
            this.createSlr = request.createSlr;
            this.description = request.description;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
        } 

        /**
         * <p>The name of the backend service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testBackendService</p>
         */
        public Builder backendName(String backendName) {
            this.putQueryParameter("BackendName", backendName);
            this.backendName = backendName;
            return this;
        }

        /**
         * <p>The type of the backend service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder backendType(String backendType) {
            this.putQueryParameter("BackendType", backendType);
            this.backendType = backendType;
            return this;
        }

        /**
         * <p>Specifies to create a EventBridge service-linked role.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder createEventBridgeServiceLinkedRole(Boolean createEventBridgeServiceLinkedRole) {
            this.putQueryParameter("CreateEventBridgeServiceLinkedRole", createEventBridgeServiceLinkedRole);
            this.createEventBridgeServiceLinkedRole = createEventBridgeServiceLinkedRole;
            return this;
        }

        /**
         * <p>Specifies to create a service-linked role.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder createSlr(Boolean createSlr) {
            this.putQueryParameter("CreateSlr", createSlr);
            this.createSlr = createSlr;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>release data api 411055691504981</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateBackendRequest build() {
            return new CreateBackendRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBackendRequest} extends {@link TeaModel}
     *
     * <p>CreateBackendRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
