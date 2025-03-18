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
 * {@link DeleteDocsRequest} extends {@link RequestModel}
 *
 * <p>DeleteDocsRequest</p>
 */
public class DeleteDocsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> docIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeleteDocsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.docIds = builder.docIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDocsRequest create() {
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
     * @return docIds
     */
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteDocsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> docIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDocsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.docIds = request.docIds;
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
         * <p>This parameter is required.</p>
         */
        public Builder docIds(java.util.List<String> docIds) {
            String docIdsShrink = shrink(docIds, "DocIds", "json");
            this.putBodyParameter("DocIds", docIdsShrink);
            this.docIds = docIds;
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
        public DeleteDocsRequest build() {
            return new DeleteDocsRequest(this);
        } 

    } 

}
