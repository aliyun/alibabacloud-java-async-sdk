// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackendRequest} extends {@link RequestModel}
 *
 * <p>CreateBackendRequest</p>
 */
public class CreateBackendRequest extends Request {
    @Query
    @NameInMap("BackendName")
    @Validation(required = true)
    private String backendName;

    @Query
    @NameInMap("BackendType")
    @Validation(required = true)
    private String backendType;

    @Query
    @NameInMap("CreateSlr")
    private Boolean createSlr;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateBackendRequest(Builder builder) {
        super(builder);
        this.backendName = builder.backendName;
        this.backendType = builder.backendType;
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
            this.createSlr = request.createSlr;
            this.description = request.description;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
        } 

        /**
         * BackendName.
         */
        public Builder backendName(String backendName) {
            this.putQueryParameter("BackendName", backendName);
            this.backendName = backendName;
            return this;
        }

        /**
         * BackendType.
         */
        public Builder backendType(String backendType) {
            this.putQueryParameter("BackendType", backendType);
            this.backendType = backendType;
            return this;
        }

        /**
         * CreateSlr.
         */
        public Builder createSlr(Boolean createSlr) {
            this.putQueryParameter("CreateSlr", createSlr);
            this.createSlr = createSlr;
            return this;
        }

        /**
         * Description.
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
         * Tag.
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

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
