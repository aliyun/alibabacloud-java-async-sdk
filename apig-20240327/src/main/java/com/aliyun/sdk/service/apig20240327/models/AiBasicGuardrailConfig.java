// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiBasicGuardrailConfig} extends {@link TeaModel}
 *
 * <p>AiBasicGuardrailConfig</p>
 */
public class AiBasicGuardrailConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("display")
    private Boolean display;

    @com.aliyun.core.annotation.NameInMap("responseEnabled")
    private Boolean responseEnabled;

    @com.aliyun.core.annotation.NameInMap("responseMode")
    private String responseMode;

    private AiBasicGuardrailConfig(Builder builder) {
        this.display = builder.display;
        this.responseEnabled = builder.responseEnabled;
        this.responseMode = builder.responseMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiBasicGuardrailConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return display
     */
    public Boolean getDisplay() {
        return this.display;
    }

    /**
     * @return responseEnabled
     */
    public Boolean getResponseEnabled() {
        return this.responseEnabled;
    }

    /**
     * @return responseMode
     */
    public String getResponseMode() {
        return this.responseMode;
    }

    public static final class Builder {
        private Boolean display; 
        private Boolean responseEnabled; 
        private String responseMode; 

        private Builder() {
        } 

        private Builder(AiBasicGuardrailConfig model) {
            this.display = model.display;
            this.responseEnabled = model.responseEnabled;
            this.responseMode = model.responseMode;
        } 

        /**
         * <p>The read-only display eligibility, which is calculated by the server based on instance capabilities, regional canary releases, and existing configurations. A value of true indicates that the entry can be displayed, and false indicates that it is not displayed. This value does not indicate that the protection is enabled or published successfully. The client does not need to set this value. It is ignored and not saved when passed back.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder display(Boolean display) {
            this.display = display;
            return this;
        }

        /**
         * <p>Specifies whether to enable basic security detection for model responses. A value of true indicates that the detection is enabled, and false indicates that it is disabled. The field is updated only when a Boolean value is explicitly submitted. If the field is omitted or null is passed, the saved value is retained. If this field has not been saved, response detection is enabled by default at runtime. The overall policy is still controlled by the outer enable field.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder responseEnabled(Boolean responseEnabled) {
            this.responseEnabled = responseEnabled;
            return this;
        }

        /**
         * <p>The response detection mode, which only processes the exact string async. The mode is updated only when async is explicitly submitted. Other values, empty strings, null, or omissions do not modify the saved mode. If no mode is saved, x-ai-guard-response-mode is not delivered. async is an example of an optional configuration, not a default value.</p>
         * 
         * <strong>example:</strong>
         * <p>async</p>
         */
        public Builder responseMode(String responseMode) {
            this.responseMode = responseMode;
            return this;
        }

        public AiBasicGuardrailConfig build() {
            return new AiBasicGuardrailConfig(this);
        } 

    } 

}
