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
 * {@link AsyncUploadTenderDocRequest} extends {@link RequestModel}
 *
 * <p>AsyncUploadTenderDocRequest</p>
 */
public class AsyncUploadTenderDocRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenderDocName")
    private String tenderDocName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private AsyncUploadTenderDocRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileKey = builder.fileKey;
        this.tenderDocName = builder.tenderDocName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncUploadTenderDocRequest create() {
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
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return tenderDocName
     */
    public String getTenderDocName() {
        return this.tenderDocName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AsyncUploadTenderDocRequest, Builder> {
        private String regionId; 
        private String fileKey; 
        private String tenderDocName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AsyncUploadTenderDocRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileKey = request.fileKey;
            this.tenderDocName = request.tenderDocName;
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
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * TenderDocName.
         */
        public Builder tenderDocName(String tenderDocName) {
            this.putBodyParameter("TenderDocName", tenderDocName);
            this.tenderDocName = tenderDocName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AsyncUploadTenderDocRequest build() {
            return new AsyncUploadTenderDocRequest(this);
        } 

    } 

}
