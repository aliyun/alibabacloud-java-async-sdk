// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMemoryNodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryNodeResponseBody</p>
 */
public class GetMemoryNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("memoryId")
    private String memoryId;

    @com.aliyun.core.annotation.NameInMap("memoryNodeId")
    private String memoryNodeId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    private GetMemoryNodeResponseBody(Builder builder) {
        this.content = builder.content;
        this.memoryId = builder.memoryId;
        this.memoryNodeId = builder.memoryNodeId;
        this.requestId = builder.requestId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return memoryId
     */
    public String getMemoryId() {
        return this.memoryId;
    }

    /**
     * @return memoryNodeId
     */
    public String getMemoryNodeId() {
        return this.memoryNodeId;
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
        private String content; 
        private String memoryId; 
        private String memoryNodeId; 
        private String requestId; 
        private String workspaceId; 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * memoryId.
         */
        public Builder memoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }

        /**
         * memoryNodeId.
         */
        public Builder memoryNodeId(String memoryNodeId) {
            this.memoryNodeId = memoryNodeId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetMemoryNodeResponseBody build() {
            return new GetMemoryNodeResponseBody(this);
        } 

    } 

}
