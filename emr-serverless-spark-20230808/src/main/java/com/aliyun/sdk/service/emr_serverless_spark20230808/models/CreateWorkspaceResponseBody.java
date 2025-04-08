// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkspaceResponseBody</p>
 */
public class CreateWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("operationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private CreateWorkspaceResponseBody(Builder builder) {
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String operationId; 
        private String requestId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(CreateWorkspaceResponseBody model) {
            this.operationId = model.operationId;
            this.requestId = model.requestId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-******</p>
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-******</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public CreateWorkspaceResponseBody build() {
            return new CreateWorkspaceResponseBody(this);
        } 

    } 

}
