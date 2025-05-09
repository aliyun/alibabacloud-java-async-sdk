// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link CreateApiTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApiTemplateResponseBody</p>
 */
public class CreateApiTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private CreateApiTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private String requestId; 
        private String success; 
        private String templateId; 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Template ID (to be deprecated).</p>
         * 
         * <strong>example:</strong>
         * <p>at-41b4c6a0fc63****</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Template ID (it is recommended to use the parameter TemplateId).</p>
         * 
         * <strong>example:</strong>
         * <p>at-41b4c6a0fc63****</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public CreateApiTemplateResponseBody build() {
            return new CreateApiTemplateResponseBody(this);
        } 

    } 

}
