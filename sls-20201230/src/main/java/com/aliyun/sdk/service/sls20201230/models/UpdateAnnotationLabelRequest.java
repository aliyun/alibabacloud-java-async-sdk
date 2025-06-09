// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpdateAnnotationLabelRequest} extends {@link RequestModel}
 *
 * <p>UpdateAnnotationLabelRequest</p>
 */
public class UpdateAnnotationLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private MLLabelParam body;

    private UpdateAnnotationLabelRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAnnotationLabelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MLLabelParam getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateAnnotationLabelRequest, Builder> {
        private MLLabelParam body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAnnotationLabelRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>The data structure of the request.</p>
         */
        public Builder body(MLLabelParam body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateAnnotationLabelRequest build() {
            return new UpdateAnnotationLabelRequest(this);
        } 

    } 

}
