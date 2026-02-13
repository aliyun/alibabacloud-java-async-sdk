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
 * {@link AISearchResourceUpdateRequest} extends {@link RequestModel}
 *
 * <p>AISearchResourceUpdateRequest</p>
 */
public class AISearchResourceUpdateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AISearchResourceUpdateRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.resourceId = builder.resourceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchResourceUpdateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
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

    public static final class Builder extends Request.Builder<AISearchResourceUpdateRequest, Builder> {
        private Object data; 
        private String resourceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AISearchResourceUpdateRequest request) {
            super(request);
            this.data = request.data;
            this.resourceId = request.resourceId;
            this.type = request.type;
        } 

        /**
         * data.
         */
        public Builder data(Object data) {
            this.putBodyParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WzMGQZwB7nQEs3Qk3ajH</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("resourceId", resourceId);
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
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public AISearchResourceUpdateRequest build() {
            return new AISearchResourceUpdateRequest(this);
        } 

    } 

}
