// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuditRequest} extends {@link RequestModel}
 *
 * <p>CreateAuditRequest</p>
 */
public class CreateAuditRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AuditContent")
    @Validation(required = true)
    private String auditContent;

    private CreateAuditRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.auditContent = builder.auditContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuditRequest create() {
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
     * @return auditContent
     */
    public String getAuditContent() {
        return this.auditContent;
    }

    public static final class Builder extends Request.Builder<CreateAuditRequest, Builder> {
        private String regionId; 
        private String auditContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuditRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.auditContent = request.auditContent;
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
         * AuditContent.
         */
        public Builder auditContent(String auditContent) {
            this.putQueryParameter("AuditContent", auditContent);
            this.auditContent = auditContent;
            return this;
        }

        @Override
        public CreateAuditRequest build() {
            return new CreateAuditRequest(this);
        } 

    } 

}
