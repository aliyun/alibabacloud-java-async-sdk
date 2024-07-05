// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuditRequest} extends {@link RequestModel}
 *
 * <p>CreateAuditRequest</p>
 */
public class CreateAuditRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditContent")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The review content. You can specify up to **100** audio or video files in a request. The value must be converted to a string.\
         * <p>
         * For more information about this parameter, see the **AuditContent** section of this topic.
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
