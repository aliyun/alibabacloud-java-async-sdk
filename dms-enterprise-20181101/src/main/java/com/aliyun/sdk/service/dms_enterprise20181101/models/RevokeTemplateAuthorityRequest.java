// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link RevokeTemplateAuthorityRequest} extends {@link RequestModel}
 *
 * <p>RevokeTemplateAuthorityRequest</p>
 */
public class RevokeTemplateAuthorityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userIds;

    private RevokeTemplateAuthorityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
        this.tid = builder.tid;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeTemplateAuthorityRequest create() {
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
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userIds
     */
    public String getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<RevokeTemplateAuthorityRequest, Builder> {
        private String regionId; 
        private Long templateId; 
        private Long tid; 
        private String userIds; 

        private Builder() {
            super();
        } 

        private Builder(RevokeTemplateAuthorityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.templateId = request.templateId;
            this.tid = request.tid;
            this.userIds = request.userIds;
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
         * <p>The ID of the permission template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1563</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The IDs of users from whom you want to revoke permissions by using a permission template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[12***,34***,56***]</p>
         */
        public Builder userIds(String userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public RevokeTemplateAuthorityRequest build() {
            return new RevokeTemplateAuthorityRequest(this);
        } 

    } 

}
