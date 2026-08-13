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
 * {@link ListAuthorizedUsersRequest} extends {@link RequestModel}
 *
 * <p>ListAuthorizedUsersRequest</p>
 */
public class ListAuthorizedUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("granteeType")
    private String granteeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("permission")
    private String permission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListAuthorizedUsersRequest(Builder builder) {
        super(builder);
        this.granteeType = builder.granteeType;
        this.keyword = builder.keyword;
        this.operatingObjectName = builder.operatingObjectName;
        this.permission = builder.permission;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return granteeType
     */
    public String getGranteeType() {
        return this.granteeType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListAuthorizedUsersRequest, Builder> {
        private String granteeType; 
        private String keyword; 
        private String operatingObjectName; 
        private String permission; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListAuthorizedUsersRequest request) {
            super(request);
            this.granteeType = request.granteeType;
            this.keyword = request.keyword;
            this.operatingObjectName = request.operatingObjectName;
            this.permission = request.permission;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>筛选类型：USER / USER_GROUP / 不传则返回全部</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder granteeType(String granteeType) {
            this.putBodyParameter("granteeType", granteeType);
            this.granteeType = granteeType;
            return this;
        }

        /**
         * <p>搜索关键词，按用户名或组名模糊匹配</p>
         * 
         * <strong>example:</strong>
         * <p>示例关键词</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>数字员工名称</p>
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
         * <p>Permission</p>
         * 
         * <strong>example:</strong>
         * <p>USE</p>
         */
        public Builder permission(String permission) {
            this.putBodyParameter("permission", permission);
            this.permission = permission;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
        public ListAuthorizedUsersRequest build() {
            return new ListAuthorizedUsersRequest(this);
        } 

    } 

}
