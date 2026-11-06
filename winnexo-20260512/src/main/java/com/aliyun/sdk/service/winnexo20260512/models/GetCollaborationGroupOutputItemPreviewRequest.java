// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetCollaborationGroupOutputItemPreviewRequest} extends {@link RequestModel}
 *
 * <p>GetCollaborationGroupOutputItemPreviewRequest</p>
 */
public class GetCollaborationGroupOutputItemPreviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetCollaborationGroupOutputItemPreviewRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.itemId = builder.itemId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCollaborationGroupOutputItemPreviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetCollaborationGroupOutputItemPreviewRequest, Builder> {
        private String collaborationGroupId; 
        private String itemId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetCollaborationGroupOutputItemPreviewRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.itemId = request.itemId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>协作空间ID，必填，长度1至64。调用者必须是该租户下该空间的有效成员。可从ListCollaborationGroups返回的items中获取。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_9401</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>对话生成文件的产出明细ID。取GetNodeDetail返回的artifacts中ref.kind为USER_OUTPUT_ITEM的ref.id；不是artifactId。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>51469466</p>
         */
        public Builder itemId(String itemId) {
            this.putBodyParameter("itemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>业务租户ID，可选。必须属于当前调用身份的可访问租户；无权访问时拒绝请求。未传时按现有鉴权规则解析租户，多租户用户无法唯一确定时需显式指定。</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetCollaborationGroupOutputItemPreviewRequest build() {
            return new GetCollaborationGroupOutputItemPreviewRequest(this);
        } 

    } 

}
