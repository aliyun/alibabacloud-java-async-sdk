// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddManifestEditTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>AddManifestEditTemplateResponseBody</p>
 */
public class AddManifestEditTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private AddManifestEditTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddManifestEditTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private String requestId; 
        private String templateId; 

        private Builder() {
        } 

        private Builder(AddManifestEditTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.templateId = model.templateId;
        } 

        /**
         * <p><strong>The request ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>req-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p><strong>The ID of the new template.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>met-abc123</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public AddManifestEditTemplateResponseBody build() {
            return new AddManifestEditTemplateResponseBody(this);
        } 

    } 

}
