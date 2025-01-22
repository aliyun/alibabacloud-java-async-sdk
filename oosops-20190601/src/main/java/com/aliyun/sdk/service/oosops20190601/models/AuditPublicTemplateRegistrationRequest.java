// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

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
 * {@link AuditPublicTemplateRegistrationRequest} extends {@link RequestModel}
 *
 * <p>AuditPublicTemplateRegistrationRequest</p>
 */
public class AuditPublicTemplateRegistrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditAction")
    private String auditAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrationId")
    private String registrationId;

    private AuditPublicTemplateRegistrationRequest(Builder builder) {
        super(builder);
        this.auditAction = builder.auditAction;
        this.comment = builder.comment;
        this.regionId = builder.regionId;
        this.registrationId = builder.registrationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditPublicTemplateRegistrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditAction
     */
    public String getAuditAction() {
        return this.auditAction;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return registrationId
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    public static final class Builder extends Request.Builder<AuditPublicTemplateRegistrationRequest, Builder> {
        private String auditAction; 
        private String comment; 
        private String regionId; 
        private String registrationId; 

        private Builder() {
            super();
        } 

        private Builder(AuditPublicTemplateRegistrationRequest request) {
            super(request);
            this.auditAction = request.auditAction;
            this.comment = request.comment;
            this.regionId = request.regionId;
            this.registrationId = request.registrationId;
        } 

        /**
         * AuditAction.
         */
        public Builder auditAction(String auditAction) {
            this.putQueryParameter("AuditAction", auditAction);
            this.auditAction = auditAction;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RegistrationId.
         */
        public Builder registrationId(String registrationId) {
            this.putQueryParameter("RegistrationId", registrationId);
            this.registrationId = registrationId;
            return this;
        }

        @Override
        public AuditPublicTemplateRegistrationRequest build() {
            return new AuditPublicTemplateRegistrationRequest(this);
        } 

    } 

}
