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
 * {@link RevokeConsumerModelCardGrantsRequest} extends {@link RequestModel}
 *
 * <p>RevokeConsumerModelCardGrantsRequest</p>
 */
public class RevokeConsumerModelCardGrantsRequest extends Request {
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

    private RevokeConsumerModelCardGrantsRequest(Builder builder) {
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

    public static RevokeConsumerModelCardGrantsRequest create() {
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

    public static final class Builder extends Request.Builder<RevokeConsumerModelCardGrantsRequest, Builder> {
        private String httpApiId; 
        private java.util.List<String> modelCardIds; 
        private java.util.List<String> modelGroupIds; 
        private String principalId; 
        private String principalType; 

        private Builder() {
            super();
        } 

        private Builder(RevokeConsumerModelCardGrantsRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.modelCardIds = request.modelCardIds;
            this.modelGroupIds = request.modelGroupIds;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
        } 

        /**
         * <p>The immutable ID of the new Model API. The authorization is valid only within this API.</p>
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
         * <p>The IDs of the model cards for which entitlements are revoked in this API. Revoking non-existent entitlements is a valid no-op.</p>
         */
        public Builder modelCardIds(java.util.List<String> modelCardIds) {
            this.putBodyParameter("modelCardIds", modelCardIds);
            this.modelCardIds = modelCardIds;
            return this;
        }

        /**
         * <p>The IDs of the actual model groups for which entitlements are revoked in this API. If you revoke only group entitlements, modelCardIds can be empty, and the group or principal is not required to exist. At least one of the two target types must be specified. This operation does not delete consumers, keys, or quotas.</p>
         */
        public Builder modelGroupIds(java.util.List<String> modelGroupIds) {
            this.putBodyParameter("modelGroupIds", modelGroupIds);
            this.modelGroupIds = modelGroupIds;
            return this;
        }

        /**
         * <p>The immutable ID of the principal for which entitlements are revoked. This is not the name.</p>
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
         * <p>The type of the principal for which entitlements are revoked. Valid values:</p>
         * <ul>
         * <li>Consumer</li>
         * <li>ConsumerGroup</li>
         * </ul>
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
        public RevokeConsumerModelCardGrantsRequest build() {
            return new RevokeConsumerModelCardGrantsRequest(this);
        } 

    } 

}
