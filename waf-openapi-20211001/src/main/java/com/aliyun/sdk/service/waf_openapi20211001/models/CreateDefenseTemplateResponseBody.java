// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDefenseTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDefenseTemplateResponseBody</p>
 */
public class CreateDefenseTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private CreateDefenseTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefenseTemplateResponseBody create() {
        return builder().build();
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
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private String requestId; 
        private Long templateId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F48ABDF7-D777-5F26-892A-57349765D7A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the protection rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>2212</p>
         */
        public Builder templateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }

        public CreateDefenseTemplateResponseBody build() {
            return new CreateDefenseTemplateResponseBody(this);
        } 

    } 

}
