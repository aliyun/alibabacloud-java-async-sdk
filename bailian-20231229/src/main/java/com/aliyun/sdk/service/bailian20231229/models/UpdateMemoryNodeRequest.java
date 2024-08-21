// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMemoryNodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemoryNodeRequest</p>
 */
public class UpdateMemoryNodeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryNodeId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    private UpdateMemoryNodeRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryId = builder.memoryId;
        this.memoryNodeId = builder.memoryNodeId;
        this.regionId = builder.regionId;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemoryNodeRequest create() {
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
     * @return memoryNodeId
     */
    public String getMemoryNodeId() {
        return this.memoryNodeId;
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

    public static final class Builder extends Request.Builder<UpdateMemoryNodeRequest, Builder> {
        private String workspaceId; 
        private String memoryId; 
        private String memoryNodeId; 
        private String regionId; 
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemoryNodeRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryId = request.memoryId;
            this.memoryNodeId = request.memoryNodeId;
            this.regionId = request.regionId;
            this.content = request.content;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * memoryId.
         */
        public Builder memoryId(String memoryId) {
            this.putPathParameter("memoryId", memoryId);
            this.memoryId = memoryId;
            return this;
        }

        /**
         * memoryNodeId.
         */
        public Builder memoryNodeId(String memoryNodeId) {
            this.putPathParameter("memoryNodeId", memoryNodeId);
            this.memoryNodeId = memoryNodeId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.putQueryParameter("content", content);
            this.content = content;
            return this;
        }

        @Override
        public UpdateMemoryNodeRequest build() {
            return new UpdateMemoryNodeRequest(this);
        } 

    } 

}
