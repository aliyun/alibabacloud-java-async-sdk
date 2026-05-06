// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DeleteModelTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelTemplateRequest</p>
 */
public class DeleteModelTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelTemplateId;

    private DeleteModelTemplateRequest(Builder builder) {
        super(builder);
        this.modelTemplateId = builder.modelTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public static final class Builder extends Request.Builder<DeleteModelTemplateRequest, Builder> {
        private String modelTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelTemplateRequest request) {
            super(request);
            this.modelTemplateId = request.modelTemplateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putQueryParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        @Override
        public DeleteModelTemplateRequest build() {
            return new DeleteModelTemplateRequest(this);
        } 

    } 

}
