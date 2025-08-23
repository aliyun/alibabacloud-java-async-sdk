// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link GetFileContentRequest} extends {@link RequestModel}
 *
 * <p>GetFileContentRequest</p>
 */
public class GetFileContentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileKey")
    private String fileKey;

    private GetFileContentRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
        this.workspaceId = builder.workspaceId;
        this.fileKey = builder.fileKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    public static final class Builder extends Request.Builder<GetFileContentRequest, Builder> {
        private String region; 
        private String workspaceId; 
        private String fileKey; 

        private Builder() {
            super();
        } 

        private Builder(GetFileContentRequest request) {
            super(request);
            this.region = request.region;
            this.workspaceId = request.workspaceId;
            this.fileKey = request.fileKey;
        } 

        /**
         * region.
         */
        public Builder region(String region) {
            this.putHostParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * fileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("fileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        @Override
        public GetFileContentRequest build() {
            return new GetFileContentRequest(this);
        } 

    } 

}
