// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AuthorizeConsumerModelCardGrantsRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeConsumerModelCardGrantsRequest</p>
 */
public class AuthorizeConsumerModelCardGrantsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCardIds")
    private java.util.List<String> modelCardIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelGroupIds")
    private java.util.List<String> modelGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("principalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("principalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalType;

    private AuthorizeConsumerModelCardGrantsRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.modelCardIds = builder.modelCardIds;
        this.modelGroupIds = builder.modelGroupIds;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeConsumerModelCardGrantsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return modelCardIds
     */
    public java.util.List<String> getModelCardIds() {
        return this.modelCardIds;
    }

    /**
     * @return modelGroupIds
     */
    public java.util.List<String> getModelGroupIds() {
        return this.modelGroupIds;
    }

    /**
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    public static final class Builder extends Request.Builder<AuthorizeConsumerModelCardGrantsRequest, Builder> {
        private String httpApiId; 
        private java.util.List<String> modelCardIds; 
        private java.util.List<String> modelGroupIds; 
        private String principalId; 
        private String principalType; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeConsumerModelCardGrantsRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.modelCardIds = request.modelCardIds;
            this.modelGroupIds = request.modelGroupIds;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
        } 

        /**
         * <p>The immutable ID of the new model API. The authorization is valid only within this API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-d00000000000000000000</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The collection of selected model card IDs for this API. This parameter can be empty or omitted, but at least one of modelCardIds and modelGroupIds must be non-empty.</p>
         */
        public Builder modelCardIds(java.util.List<String> modelCardIds) {
            this.putBodyParameter("modelCardIds", modelCardIds);
            this.modelCardIds = modelCardIds;
            return this;
        }

        /**
         * <p>The actual model group IDs of the current instance. The modelCardIds parameter can be empty only when group licenses are granted. Group licenses allow zero intersection with the current API, but principal relationships with both target types empty cannot be saved.</p>
         */
        public Builder modelGroupIds(java.util.List<String> modelGroupIds) {
            this.putBodyParameter("modelGroupIds", modelGroupIds);
            this.modelGroupIds = modelGroupIds;
            return this;
        }

        /**
         * <p>The immutable ID of the authorization principal, not the name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-d00000000000000000000</p>
         */
        public Builder principalId(String principalId) {
            this.putBodyParameter("principalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * <p>The type of the authorization principal. Valid values: Consumer and ConsumerGroup.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Consumer</p>
         */
        public Builder principalType(String principalType) {
            this.putBodyParameter("principalType", principalType);
            this.principalType = principalType;
            return this;
        }

        @Override
        public AuthorizeConsumerModelCardGrantsRequest build() {
            return new AuthorizeConsumerModelCardGrantsRequest(this);
        } 

    } 

}
