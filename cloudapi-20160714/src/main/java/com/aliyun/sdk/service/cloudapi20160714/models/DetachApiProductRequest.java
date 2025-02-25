// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DetachApiProductRequest} extends {@link RequestModel}
 *
 * <p>DetachApiProductRequest</p>
 */
public class DetachApiProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiProductId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Apis")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Apis> apis;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
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
    public java.util.List<Apis> getApis() {
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
        private java.util.List<Apis> apis; 
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
         * <p>The ID of the API product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>117b7a64a8b3f064eaa4a47ac62aac5e</p>
         */
        public Builder apiProductId(String apiProductId) {
            this.putQueryParameter("ApiProductId", apiProductId);
            this.apiProductId = apiProductId;
            return this;
        }

        /**
         * <p>The APIs that you want to detach from the API product.</p>
         * <p>This parameter is required.</p>
         */
        public Builder apis(java.util.List<Apis> apis) {
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

    /**
     * 
     * {@link DetachApiProductRequest} extends {@link TeaModel}
     *
     * <p>DetachApiProductRequest</p>
     */
    public static class Apis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The API ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ba84c55eca46488598da17c0609f3ead</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The environment to which the API is published. Valid values:</p>
             * <ul>
             * <li><strong>RELEASE</strong>: the production environment</li>
             * <li><strong>PRE</strong>: the pre-release environment</li>
             * <li><strong>TEST</strong>: the test environment</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
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
