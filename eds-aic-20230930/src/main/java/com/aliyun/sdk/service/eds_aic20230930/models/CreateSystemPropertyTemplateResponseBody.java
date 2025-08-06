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
 * {@link CreateSystemPropertyTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSystemPropertyTemplateResponseBody</p>
 */
public class CreateSystemPropertyTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private CreateSystemPropertyTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSystemPropertyTemplateResponseBody create() {
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

        private Builder(CreateSystemPropertyTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.templateId = model.templateId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public CreateSystemPropertyTemplateResponseBody build() {
            return new CreateSystemPropertyTemplateResponseBody(this);
        } 

    } 

}
