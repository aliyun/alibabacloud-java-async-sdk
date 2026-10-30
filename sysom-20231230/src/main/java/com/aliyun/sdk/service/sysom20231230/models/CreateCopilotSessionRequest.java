// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link CreateCopilotSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateCopilotSessionRequest</p>
 */
public class CreateCopilotSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(maxLength = 255, minLength = 1)
    private String name;

    private CreateCopilotSessionRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCopilotSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateCopilotSessionRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateCopilotSessionRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * <p>不填为 New Session</p>
         * 
         * <strong>example:</strong>
         * <p>排查 CPU 负载</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateCopilotSessionRequest build() {
            return new CreateCopilotSessionRequest(this);
        } 

    } 

}
