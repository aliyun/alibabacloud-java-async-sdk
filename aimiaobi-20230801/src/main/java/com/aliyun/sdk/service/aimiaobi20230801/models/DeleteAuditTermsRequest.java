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
 * {@link DeleteAuditTermsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAuditTermsRequest</p>
 */
public class DeleteAuditTermsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdList")
    private java.util.List<Long> idList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeleteAuditTermsRequest(Builder builder) {
        super(builder);
        this.idList = builder.idList;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAuditTermsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idList
     */
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteAuditTermsRequest, Builder> {
        private java.util.List<Long> idList; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAuditTermsRequest request) {
            super(request);
            this.idList = request.idList;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * IdList.
         */
        public Builder idList(java.util.List<Long> idList) {
            String idListShrink = shrink(idList, "IdList", "json");
            this.putBodyParameter("IdList", idListShrink);
            this.idList = idList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteAuditTermsRequest build() {
            return new DeleteAuditTermsRequest(this);
        } 

    } 

}
