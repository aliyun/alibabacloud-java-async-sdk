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
 * {@link SaveOutputFileToResourceRequest} extends {@link RequestModel}
 *
 * <p>SaveOutputFileToResourceRequest</p>
 */
public class SaveOutputFileToResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> itemIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private SaveOutputFileToResourceRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.itemIds = builder.itemIds;
        this.mode = builder.mode;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveOutputFileToResourceRequest create() {
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

    public static final class Builder extends Request.Builder<SaveOutputFileToResourceRequest, Builder> {
        private String directoryId; 
        private java.util.List<String> itemIds; 
        private String mode; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(SaveOutputFileToResourceRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.itemIds = request.itemIds;
            this.mode = request.mode;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>目标个人目录 ID；不传则自动解析用户默认目录。</p>
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
         * <p>itemIds</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder itemIds(java.util.List<String> itemIds) {
            String itemIdsShrink = shrink(itemIds, "itemIds", "json");
            this.putBodyParameter("itemIds", itemIdsShrink);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * <p>保存方式：link=链接（1:1 幂等，编辑产出会同步资源） / copy=复制（不限次，快照）</p>
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
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public SaveOutputFileToResourceRequest build() {
            return new SaveOutputFileToResourceRequest(this);
        } 

    } 

}
