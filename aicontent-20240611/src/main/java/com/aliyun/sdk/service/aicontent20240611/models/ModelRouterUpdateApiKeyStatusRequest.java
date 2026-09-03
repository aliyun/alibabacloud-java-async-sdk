// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterUpdateApiKeyStatusRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterUpdateApiKeyStatusRequest</p>
 */
public class ModelRouterUpdateApiKeyStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ModelRouterUpdateApiKeyStatusRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterUpdateApiKeyStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModelRouterUpdateApiKeyStatusRequest, Builder> {
        private Long id; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterUpdateApiKeyStatusRequest request) {
            super(request);
            this.id = request.id;
            this.status = request.status;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>12578</p>
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModelRouterUpdateApiKeyStatusRequest build() {
            return new ModelRouterUpdateApiKeyStatusRequest(this);
        } 

    } 

}
