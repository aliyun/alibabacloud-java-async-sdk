// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
 * {@link GetDistillationTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetDistillationTemplateResponseBody</p>
 */
public class GetDistillationTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DistillationTemplate")
    private DistillationTemplate distillationTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDistillationTemplateResponseBody(Builder builder) {
        this.distillationTemplate = builder.distillationTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDistillationTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return distillationTemplate
     */
    public DistillationTemplate getDistillationTemplate() {
        return this.distillationTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DistillationTemplate distillationTemplate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDistillationTemplateResponseBody model) {
            this.distillationTemplate = model.distillationTemplate;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The distillation template details.</p>
         */
        public Builder distillationTemplate(DistillationTemplate distillationTemplate) {
            this.distillationTemplate = distillationTemplate;
            return this;
        }

        /**
         * <p><strong>Request ID</strong></p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDistillationTemplateResponseBody build() {
            return new GetDistillationTemplateResponseBody(this);
        } 

    } 

}
