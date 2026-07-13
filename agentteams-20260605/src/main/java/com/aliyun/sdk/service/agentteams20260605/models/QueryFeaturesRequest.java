// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link QueryFeaturesRequest} extends {@link RequestModel}
 *
 * <p>QueryFeaturesRequest</p>
 */
public class QueryFeaturesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetScope;

    private QueryFeaturesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceName = builder.resourceName;
        this.targetScope = builder.targetScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFeaturesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return targetScope
     */
    public String getTargetScope() {
        return this.targetScope;
    }

    public static final class Builder extends Request.Builder<QueryFeaturesRequest, Builder> {
        private String instanceId; 
        private String resourceName; 
        private String targetScope; 

        private Builder() {
            super();
        } 

        private Builder(QueryFeaturesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceName = request.resourceName;
            this.targetScope = request.targetScope;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>at-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder targetScope(String targetScope) {
            this.putQueryParameter("TargetScope", targetScope);
            this.targetScope = targetScope;
            return this;
        }

        @Override
        public QueryFeaturesRequest build() {
            return new QueryFeaturesRequest(this);
        } 

    } 

}
