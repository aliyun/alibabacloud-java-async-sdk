// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetFileContentLengthRequest} extends {@link RequestModel}
 *
 * <p>GetFileContentLengthRequest</p>
 */
public class GetFileContentLengthRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocName")
    private String docName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetFileContentLengthRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.docName = builder.docName;
        this.fileUrl = builder.fileUrl;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileContentLengthRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetFileContentLengthRequest, Builder> {
        private String regionId; 
        private String docName; 
        private String fileUrl; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetFileContentLengthRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.docName = request.docName;
            this.fileUrl = request.fileUrl;
            this.workspaceId = request.workspaceId;
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
         * DocName.
         */
        public Builder docName(String docName) {
            this.putBodyParameter("DocName", docName);
            this.docName = docName;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2setzb9x4ewsd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetFileContentLengthRequest build() {
            return new GetFileContentLengthRequest(this);
        } 

    } 

}
