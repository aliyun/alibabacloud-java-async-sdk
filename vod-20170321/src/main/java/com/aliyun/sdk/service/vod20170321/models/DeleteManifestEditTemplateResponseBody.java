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
 * {@link DeleteManifestEditTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteManifestEditTemplateResponseBody</p>
 */
public class DeleteManifestEditTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private DeleteManifestEditTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteManifestEditTemplateResponseBody create() {
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

        private Builder(DeleteManifestEditTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.templateId = model.templateId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the deleted ManifestEdit template.</p>
         * 
         * <strong>example:</strong>
         * <p>9c6581d59240de5e258ffa4c71a3e01b</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public DeleteManifestEditTemplateResponseBody build() {
            return new DeleteManifestEditTemplateResponseBody(this);
        } 

    } 

}
