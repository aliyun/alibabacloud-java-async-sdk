// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CopyDefenseTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CopyDefenseTemplateResponseBody</p>
 */
public class CopyDefenseTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private CopyDefenseTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDefenseTemplateResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the new protection template.</p>
         * 
         * <strong>example:</strong>
         * <p>12346</p>
         */
        public Builder templateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }

        public CopyDefenseTemplateResponseBody build() {
            return new CopyDefenseTemplateResponseBody(this);
        } 

    } 

}
