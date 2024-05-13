// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantTemplateAuthorityRequest} extends {@link RequestModel}
 *
 * <p>GrantTemplateAuthorityRequest</p>
 */
public class GrantTemplateAuthorityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expireDate;

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

    private GrantTemplateAuthorityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.expireDate = builder.expireDate;
        this.templateId = builder.templateId;
        this.tid = builder.tid;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantTemplateAuthorityRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return expireDate
     */
    public String getExpireDate() {
        return this.expireDate;
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

    public static final class Builder extends Request.Builder<GrantTemplateAuthorityRequest, Builder> {
        private String regionId; 
        private String comment; 
        private String expireDate; 
        private Long templateId; 
        private Long tid; 
        private String userIds; 

        private Builder() {
            super();
        } 

        private Builder(GrantTemplateAuthorityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.expireDate = request.expireDate;
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
         * The reason why you want to grant permissions on resources to the users by using the permission template.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The time when the permission expires. Specify the time in the yyyy-MM-DD HH:mm:ss format.
         */
        public Builder expireDate(String expireDate) {
            this.putQueryParameter("ExpireDate", expireDate);
            this.expireDate = expireDate;
            return this;
        }

        /**
         * The ID of the permission template.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The IDs of users to which you want to grant permissions on resources by using the permission template.
         */
        public Builder userIds(String userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public GrantTemplateAuthorityRequest build() {
            return new GrantTemplateAuthorityRequest(this);
        } 

    } 

}
