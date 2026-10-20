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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMemoryNodeResponseBody model) {
            this.content = model.content;
            this.memoryId = model.memoryId;
            this.memoryNodeId = model.memoryNodeId;
            this.requestId = model.requestId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The content of the memory fragment.</p>
         * 
         * <strong>example:</strong>
         * <p>用户喜欢吃西红柿炒鸡蛋</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The long-term memory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6bff4f317a14442fbc9f73d29dbd5fc3</p>
         */
        public Builder memoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }

        /**
         * <p>The memory fragment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68de06c95368463a8be4a84efc872cc5</p>
         */
        public Builder memoryNodeId(String memoryNodeId) {
            this.memoryNodeId = memoryNodeId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8C56C7AF-6573-19CE-B018-E05E1EDCF4C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-us9hjmt32nysdm5v</p>
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
