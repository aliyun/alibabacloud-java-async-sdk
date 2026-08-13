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
 * {@link TogglePrimaryObjectFavoriteRequest} extends {@link RequestModel}
 *
 * <p>TogglePrimaryObjectFavoriteRequest</p>
 */
public class TogglePrimaryObjectFavoriteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> objectIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private TogglePrimaryObjectFavoriteRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.objectIds = builder.objectIds;
        this.objectType = builder.objectType;
        this.operatingObjectName = builder.operatingObjectName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TogglePrimaryObjectFavoriteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return objectIds
     */
    public java.util.List<String> getObjectIds() {
        return this.objectIds;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<TogglePrimaryObjectFavoriteRequest, Builder> {
        private String action; 
        private java.util.List<String> objectIds; 
        private String objectType; 
        private String operatingObjectName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(TogglePrimaryObjectFavoriteRequest request) {
            super(request);
            this.action = request.action;
            this.objectIds = request.objectIds;
            this.objectType = request.objectType;
            this.operatingObjectName = request.operatingObjectName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>操作：add-关注，remove-取消关注</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>主对象业务ID列表</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder objectIds(java.util.List<String> objectIds) {
            String objectIdsShrink = shrink(objectIds, "objectIds", "json");
            this.putBodyParameter("objectIds", objectIdsShrink);
            this.objectIds = objectIds;
            return this;
        }

        /**
         * <p>对象类型（如 customer、project）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("objectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>运营对象名称（如 customer_1）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
        public TogglePrimaryObjectFavoriteRequest build() {
            return new TogglePrimaryObjectFavoriteRequest(this);
        } 

    } 

}
