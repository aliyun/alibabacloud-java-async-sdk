// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link GetMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryResponseBody</p>
 */
public class GetMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("memoryId")
    private String memoryId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private GetMemoryResponseBody(Builder builder) {
        this.description = builder.description;
        this.memoryId = builder.memoryId;
        this.requestId = builder.requestId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return memoryId
     */
    public String getMemoryId() {
        return this.memoryId;
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
        private String description; 
        private String memoryId; 
        private String requestId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetMemoryResponseBody model) {
            this.description = model.description;
            this.memoryId = model.memoryId;
            this.requestId = model.requestId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The description of the long-term memory.</p>
         * 
         * <strong>example:</strong>
         * <p>我的大模型应用$APP_ID关于A用户的长期记忆体</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the long-term memory.</p>
         * 
         * <strong>example:</strong>
         * <p>6bff4f317a14442fbc9f73d29dbdxxxx</p>
         */
        public Builder memoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6a71f2d9-f1c9-913b-818b-11402910xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the long-term memory belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vexxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetMemoryResponseBody build() {
            return new GetMemoryResponseBody(this);
        } 

    } 

}
