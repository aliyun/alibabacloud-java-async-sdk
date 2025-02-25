// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20220307.models;

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
 * {@link GenerateCoordinationCodeRequest} extends {@link RequestModel}
 *
 * <p>GenerateCoordinationCodeRequest</p>
 */
public class GenerateCoordinationCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginRegionId")
    private String loginRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private GenerateCoordinationCodeRequest(Builder builder) {
        super(builder);
        this.loginRegionId = builder.loginRegionId;
        this.loginToken = builder.loginToken;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceType = builder.resourceType;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCoordinationCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loginRegionId
     */
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<GenerateCoordinationCodeRequest, Builder> {
        private String loginRegionId; 
        private String loginToken; 
        private String resourceId; 
        private String resourceName; 
        private String resourceRegionId; 
        private String resourceType; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateCoordinationCodeRequest request) {
            super(request);
            this.loginRegionId = request.loginRegionId;
            this.loginToken = request.loginToken;
            this.resourceId = request.resourceId;
            this.resourceName = request.resourceName;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceType = request.resourceType;
            this.sessionId = request.sessionId;
        } 

        /**
         * LoginRegionId.
         */
        public Builder loginRegionId(String loginRegionId) {
            this.putBodyParameter("LoginRegionId", loginRegionId);
            this.loginRegionId = loginRegionId;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.putBodyParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putBodyParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ResourceRegionId.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putBodyParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GenerateCoordinationCodeRequest build() {
            return new GenerateCoordinationCodeRequest(this);
        } 

    } 

}
