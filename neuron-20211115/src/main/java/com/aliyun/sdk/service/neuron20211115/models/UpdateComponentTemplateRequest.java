// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link UpdateComponentTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateComponentTemplateRequest</p>
 */
public class UpdateComponentTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private ComponentTemplateUpdateCmd body;

    private UpdateComponentTemplateRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComponentTemplateRequest create() {
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
     * @return body
     */
    public ComponentTemplateUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateComponentTemplateRequest, Builder> {
        private Long id; 
        private ComponentTemplateUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComponentTemplateRequest request) {
            super(request);
            this.id = request.id;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(ComponentTemplateUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateComponentTemplateRequest build() {
            return new UpdateComponentTemplateRequest(this);
        } 

    } 

}
