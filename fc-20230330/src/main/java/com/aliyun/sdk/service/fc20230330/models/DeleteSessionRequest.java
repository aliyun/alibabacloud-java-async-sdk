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
 * {@link DeleteSessionRequest} extends {@link RequestModel}
 *
 * <p>DeleteSessionRequest</p>
 */
public class DeleteSessionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    private DeleteSessionRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.sessionId = builder.sessionId;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSessionRequest create() {
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
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<DeleteSessionRequest, Builder> {
        private String functionName; 
        private String sessionId; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSessionRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.sessionId = request.sessionId;
            this.qualifier = request.qualifier;
        } 

        /**
         * <p>The function name.</p>
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
         * <p>The ID of the session to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>test-session-id-1</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The function alias or version associated with the session to be deleted.</p>
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
        public DeleteSessionRequest build() {
            return new DeleteSessionRequest(this);
        } 

    } 

}
