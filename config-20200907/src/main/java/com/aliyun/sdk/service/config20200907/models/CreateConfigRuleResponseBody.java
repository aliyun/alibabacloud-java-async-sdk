// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link CreateConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConfigRuleResponseBody</p>
 */
public class CreateConfigRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    private String configRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateConfigRuleResponseBody(Builder builder) {
        this.configRuleId = builder.configRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configRuleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateConfigRuleResponseBody model) {
            this.configRuleId = model.configRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-5772ba41209e007b****</p>
         */
        public Builder configRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConfigRuleResponseBody build() {
            return new CreateConfigRuleResponseBody(this);
        } 

    } 

}
