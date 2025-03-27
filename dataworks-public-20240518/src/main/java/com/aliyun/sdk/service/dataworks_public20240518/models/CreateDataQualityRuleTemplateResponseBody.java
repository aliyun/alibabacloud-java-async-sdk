// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateDataQualityRuleTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataQualityRuleTemplateResponseBody</p>
 */
public class CreateDataQualityRuleTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataQualityRuleTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataQualityRuleTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDataQualityRuleTemplateResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Code of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>UserDefined:3001</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>691CA452-D37A-4ED0-9441</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataQualityRuleTemplateResponseBody build() {
            return new CreateDataQualityRuleTemplateResponseBody(this);
        } 

    } 

}
