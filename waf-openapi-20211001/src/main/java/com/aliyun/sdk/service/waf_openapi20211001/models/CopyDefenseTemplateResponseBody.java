// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyDefenseTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CopyDefenseTemplateResponseBody</p>
 */
public class CopyDefenseTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateId")
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the new protection template.
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
