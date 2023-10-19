// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachApiProductRequest} extends {@link RequestModel}
 *
 * <p>DetachApiProductRequest</p>
 */
public class DetachApiProductRequest extends Request {
    @Query
    @NameInMap("ApiProductId")
    @Validation(required = true)
    private String apiProductId;

    @Query
    @NameInMap("Apis")
    @Validation(required = true)
    private java.util.List < Apis> apis;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DetachApiProductRequest(Builder builder) {
        super(builder);
        this.apiProductId = builder.apiProductId;
        this.apis = builder.apis;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachApiProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiProductId
     */
    public String getApiProductId() {
        return this.apiProductId;
    }

    /**
     * @return apis
     */
    public java.util.List < Apis> getApis() {
        return this.apis;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DetachApiProductRequest, Builder> {
        private String apiProductId; 
        private java.util.List < Apis> apis; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DetachApiProductRequest request) {
            super(request);
            this.apiProductId = request.apiProductId;
            this.apis = request.apis;
            this.securityToken = request.securityToken;
        } 

        /**
         * ApiProductId.
         */
        public Builder apiProductId(String apiProductId) {
            this.putQueryParameter("ApiProductId", apiProductId);
            this.apiProductId = apiProductId;
            return this;
        }

        /**
         * Apis.
         */
        public Builder apis(java.util.List < Apis> apis) {
            this.putQueryParameter("Apis", apis);
            this.apis = apis;
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

        @Override
        public DetachApiProductRequest build() {
            return new DetachApiProductRequest(this);
        } 

    } 

    public static class Apis extends TeaModel {
        @NameInMap("ApiId")
        @Validation(required = true)
        private String apiId;

        @NameInMap("StageName")
        @Validation(required = true)
        private String stageName;

        private Apis(Builder builder) {
            this.apiId = builder.apiId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apis create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String apiId; 
            private String stageName; 

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public Apis build() {
                return new Apis(this);
            } 

        } 

    }
}
