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
 * {@link CreateMemoryNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryNodeRequest</p>
 */
public class CreateMemoryNodeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    private CreateMemoryNodeRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryId = builder.memoryId;
        this.regionId = builder.regionId;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryNodeRequest create() {
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
     * @return memoryId
     */
    public String getMemoryId() {
        return this.memoryId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<CreateMemoryNodeRequest, Builder> {
        private String workspaceId; 
        private String memoryId; 
        private String regionId; 
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryNodeRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryId = request.memoryId;
            this.regionId = request.regionId;
            this.content = request.content;
        } 

        /**
         * <p>The ID of the workspace to which the long-term memory belongs. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use workspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-us9hjmt32nysdm5v</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The long-term memory ID, which is the memoryId returned by the <strong>CreateMemory</strong> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6bff4f317a14442fbc9f73d29dbd5fc3</p>
         */
        public Builder memoryId(String memoryId) {
            this.putPathParameter("memoryId", memoryId);
            this.memoryId = memoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The content of the memory node. The content must be 1 to 200 characters in length and can contain letters, digits, underscores (_), hyphens (-), periods (.), and colons (:).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>用户喜欢吃西红柿炒鸡蛋</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("content", content);
            this.content = content;
            return this;
        }

        @Override
        public CreateMemoryNodeRequest build() {
            return new CreateMemoryNodeRequest(this);
        } 

    } 

}
