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
 * {@link UpdateModelServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelServiceRequest</p>
 */
public class UpdateModelServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelServiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateModelServiceInput body;

    private UpdateModelServiceRequest(Builder builder) {
        super(builder);
        this.modelServiceName = builder.modelServiceName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    /**
     * @return body
     */
    public UpdateModelServiceInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateModelServiceRequest, Builder> {
        private String modelServiceName; 
        private UpdateModelServiceInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelServiceRequest request) {
            super(request);
            this.modelServiceName = request.modelServiceName;
            this.body = request.body;
        } 

        /**
         * <p>modelServiceName</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>modelServiceName</p>
         */
        public Builder modelServiceName(String modelServiceName) {
            this.putPathParameter("modelServiceName", modelServiceName);
            this.modelServiceName = modelServiceName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateModelServiceInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateModelServiceRequest build() {
            return new UpdateModelServiceRequest(this);
        } 

    } 

}
