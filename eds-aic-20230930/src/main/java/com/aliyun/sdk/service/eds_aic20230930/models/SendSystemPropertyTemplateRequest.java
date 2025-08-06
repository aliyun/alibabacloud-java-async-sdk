// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link SendSystemPropertyTemplateRequest} extends {@link RequestModel}
 *
 * <p>SendSystemPropertyTemplateRequest</p>
 */
public class SendSystemPropertyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    private java.util.List<String> templateIds;

    private SendSystemPropertyTemplateRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.templateId = builder.templateId;
        this.templateIds = builder.templateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSystemPropertyTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateIds
     */
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public static final class Builder extends Request.Builder<SendSystemPropertyTemplateRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private String templateId; 
        private java.util.List<String> templateIds; 

        private Builder() {
            super();
        } 

        private Builder(SendSystemPropertyTemplateRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.templateId = request.templateId;
            this.templateIds = request.templateIds;
        } 

        /**
         * AndroidInstanceIds.
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putBodyParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateIds.
         */
        public Builder templateIds(java.util.List<String> templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        @Override
        public SendSystemPropertyTemplateRequest build() {
            return new SendSystemPropertyTemplateRequest(this);
        } 

    } 

}
