// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link UpdateModelProxyRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelProxyRequest</p>
 */
public class UpdateModelProxyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelProxyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelProxyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateModelProxyInput body;

    private UpdateModelProxyRequest(Builder builder) {
        super(builder);
        this.modelProxyName = builder.modelProxyName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelProxyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelProxyName
     */
    public String getModelProxyName() {
        return this.modelProxyName;
    }

    /**
     * @return body
     */
    public UpdateModelProxyInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateModelProxyRequest, Builder> {
        private String modelProxyName; 
        private UpdateModelProxyInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelProxyRequest request) {
            super(request);
            this.modelProxyName = request.modelProxyName;
            this.body = request.body;
        } 

        /**
         * <p>modelProxyName</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>modelProxyName</p>
         */
        public Builder modelProxyName(String modelProxyName) {
            this.putPathParameter("modelProxyName", modelProxyName);
            this.modelProxyName = modelProxyName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateModelProxyInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateModelProxyRequest build() {
            return new UpdateModelProxyRequest(this);
        } 

    } 

}
