// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link UpdateSessionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSessionRequest</p>
 */
public class UpdateSessionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateSessionInput body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    private UpdateSessionRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.sessionId = builder.sessionId;
        this.body = builder.body;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return body
     */
    public UpdateSessionInput getBody() {
        return this.body;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<UpdateSessionRequest, Builder> {
        private String functionName; 
        private String sessionId; 
        private UpdateSessionInput body; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSessionRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.sessionId = request.sessionId;
            this.body = request.body;
            this.qualifier = request.qualifier;
        } 

        /**
         * <p>The name of the function to which the session belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-func</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The ID of the session to be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>test-sessionid-1</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The session update configuration.</p>
         */
        public Builder body(UpdateSessionInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The function alias or version associated with the session to be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>aliasName1</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public UpdateSessionRequest build() {
            return new UpdateSessionRequest(this);
        } 

    } 

}
