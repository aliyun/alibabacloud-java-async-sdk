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
 * {@link AISearchResourceAddRequest} extends {@link RequestModel}
 *
 * <p>AISearchResourceAddRequest</p>
 */
public class AISearchResourceAddRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AISearchResourceAddRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchResourceAddRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AISearchResourceAddRequest, Builder> {
        private Object data; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AISearchResourceAddRequest request) {
            super(request);
            this.data = request.data;
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
         * <p>miniapp</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public AISearchResourceAddRequest build() {
            return new AISearchResourceAddRequest(this);
        } 

    } 

}
