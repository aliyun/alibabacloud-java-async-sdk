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
 * {@link SaveGroupOutputFileToGroupResourceRequest} extends {@link RequestModel}
 *
 * <p>SaveGroupOutputFileToGroupResourceRequest</p>
 */
public class SaveGroupOutputFileToGroupResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> itemIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private SaveGroupOutputFileToGroupResourceRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.groupId = builder.groupId;
        this.itemIds = builder.itemIds;
        this.mode = builder.mode;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveGroupOutputFileToGroupResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return itemIds
     */
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<SaveGroupOutputFileToGroupResourceRequest, Builder> {
        private String directoryId; 
        private String groupId; 
        private java.util.List<String> itemIds; 
        private String mode; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(SaveGroupOutputFileToGroupResourceRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.groupId = request.groupId;
            this.itemIds = request.itemIds;
            this.mode = request.mode;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>目标群资料目录 ID；不传时使用目标群默认目录</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>目标协作群 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleGroupId</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>itemIds</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;item-1&quot;,&quot;item-2&quot;]</p>
         */
        public Builder itemIds(java.util.List<String> itemIds) {
            String itemIdsShrink = shrink(itemIds, "itemIds", "json");
            this.putBodyParameter("itemIds", itemIdsShrink);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * <p>保存方式：link=保持产出关联，copy=创建独立快照</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>link</p>
         */
        public Builder mode(String mode) {
            this.putBodyParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public SaveGroupOutputFileToGroupResourceRequest build() {
            return new SaveGroupOutputFileToGroupResourceRequest(this);
        } 

    } 

}
