// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link CreateArtifactRequest} extends {@link RequestModel}
 *
 * <p>CreateArtifactRequest</p>
 */
public class CreateArtifactRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Artifact body;

    private CreateArtifactRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateArtifactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public Artifact getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateArtifactRequest, Builder> {
        private Artifact body; 

        private Builder() {
            super();
        } 

        private Builder(CreateArtifactRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(Artifact body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateArtifactRequest build() {
            return new CreateArtifactRequest(this);
        } 

    } 

}
