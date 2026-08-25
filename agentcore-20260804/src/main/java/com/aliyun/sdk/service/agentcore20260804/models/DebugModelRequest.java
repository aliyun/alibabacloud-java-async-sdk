// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link DebugModelRequest} extends {@link RequestModel}
 *
 * <p>DebugModelRequest</p>
 */
public class DebugModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private DebugModelRequestBody body;

    private DebugModelRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.modelId = builder.modelId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return body
     */
    public DebugModelRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DebugModelRequest, Builder> {
        private String workspaceId; 
        private String modelId; 
        private DebugModelRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(DebugModelRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.modelId = request.modelId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-1</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(DebugModelRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public DebugModelRequest build() {
            return new DebugModelRequest(this);
        } 

    } 

    /**
     * 
     * {@link DebugModelRequest} extends {@link TeaModel}
     *
     * <p>DebugModelRequest</p>
     */
    public static class DebugModelRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("prompt")
        @com.aliyun.core.annotation.Validation(required = true)
        private String prompt;

        private DebugModelRequestBody(Builder builder) {
            this.prompt = builder.prompt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DebugModelRequestBody create() {
            return builder().build();
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        public static final class Builder {
            private String prompt; 

            private Builder() {
            } 

            private Builder(DebugModelRequestBody model) {
                this.prompt = model.prompt;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            public DebugModelRequestBody build() {
                return new DebugModelRequestBody(this);
            } 

        } 

    }
}
