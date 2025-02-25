// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateAuditRequest} extends {@link RequestModel}
 *
 * <p>CreateAuditRequest</p>
 */
public class CreateAuditRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditContent")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The review results. You can specify the results for a maximum of 20 videos at a time. The value must be converted to a string. For more information about the parameters in AuditContent, see the &quot;AuditContent&quot; section of this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;MediaId&quot;: &quot;93ab850b4f<em><strong><strong>b54b6e91d24d81d4&quot;,
         *             &quot;Status&quot;: &quot;Normal&quot;
         *       },
         *       {
         *             &quot;MediaId&quot;: &quot;f867fbfb58</strong></strong></em>8bbab65c4480ae1d&quot;,
         *             &quot;Status&quot;: &quot;Blocked&quot;,
         *             &quot;Reason&quot;: &quot;xxxx&quot;,
         *             &quot;Comment&quot;: &quot;xxxx&quot;
         *       }
         * ]</p>
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
