// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link AISearchResourceDeleteRequest} extends {@link RequestModel}
 *
 * <p>AISearchResourceDeleteRequest</p>
 */
public class AISearchResourceDeleteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AISearchResourceDeleteRequest(Builder builder) {
        super(builder);
        this.resourceId = builder.resourceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchResourceDeleteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AISearchResourceDeleteRequest, Builder> {
        private String resourceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AISearchResourceDeleteRequest request) {
            super(request);
            this.resourceId = request.resourceId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WzMGQZwB7nQEs3Qk3ajH</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>miniapp</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public AISearchResourceDeleteRequest build() {
            return new AISearchResourceDeleteRequest(this);
        } 

    } 

}
