// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
    @Query
    @NameInMap("AuditContent")
    @Validation(required = true)
    private String auditContent;

    private CreateAuditRequest(Builder builder) {
        super(builder);
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
     * @return auditContent
     */
    public String getAuditContent() {
        return this.auditContent;
    }

    public static final class Builder extends Request.Builder<CreateAuditRequest, Builder> {
        private String auditContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuditRequest request) {
            super(request);
            this.auditContent = request.auditContent;
        } 

        /**
         * The array of the review content.
         * <p>
         * 
         * You can specify a maximum of **20** videos to be reviewed. The array must be converted into a string as the value of this parameter.
         * 
         * For more information about the parameters in AuditContent, see the **AuditContent** section of this topic.
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
