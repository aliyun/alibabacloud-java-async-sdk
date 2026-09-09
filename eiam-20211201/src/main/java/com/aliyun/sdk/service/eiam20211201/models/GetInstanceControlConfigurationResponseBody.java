// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetInstanceControlConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceControlConfigurationResponseBody</p>
 */
public class GetInstanceControlConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceControlConfiguration")
    private InstanceControlConfiguration instanceControlConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceControlConfigurationResponseBody(Builder builder) {
        this.instanceControlConfiguration = builder.instanceControlConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceControlConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceControlConfiguration
     */
    public InstanceControlConfiguration getInstanceControlConfiguration() {
        return this.instanceControlConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceControlConfiguration instanceControlConfiguration; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceControlConfigurationResponseBody model) {
            this.instanceControlConfiguration = model.instanceControlConfiguration;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance control configuration.</p>
         */
        public Builder instanceControlConfiguration(InstanceControlConfiguration instanceControlConfiguration) {
            this.instanceControlConfiguration = instanceControlConfiguration;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceControlConfigurationResponseBody build() {
            return new GetInstanceControlConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceControlConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceControlConfigurationResponseBody</p>
     */
    public static class HumanVerificationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HumanVerificationType")
        private String humanVerificationType;

        private HumanVerificationConfig(Builder builder) {
            this.humanVerificationType = builder.humanVerificationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HumanVerificationConfig create() {
            return builder().build();
        }

        /**
         * @return humanVerificationType
         */
        public String getHumanVerificationType() {
            return this.humanVerificationType;
        }

        public static final class Builder {
            private String humanVerificationType; 

            private Builder() {
            } 

            private Builder(HumanVerificationConfig model) {
                this.humanVerificationType = model.humanVerificationType;
            } 

            /**
             * <p>The CAPTCHA type.</p>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:humanverification:alibaba-cloud-jigsaw-verification</p>
             */
            public Builder humanVerificationType(String humanVerificationType) {
                this.humanVerificationType = humanVerificationType;
                return this;
            }

            public HumanVerificationConfig build() {
                return new HumanVerificationConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceControlConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceControlConfigurationResponseBody</p>
     */
    public static class ControlElements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElementName")
        private String elementName;

        @com.aliyun.core.annotation.NameInMap("HumanVerificationConfig")
        private HumanVerificationConfig humanVerificationConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ControlElements(Builder builder) {
            this.elementName = builder.elementName;
            this.humanVerificationConfig = builder.humanVerificationConfig;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlElements create() {
            return builder().build();
        }

        /**
         * @return elementName
         */
        public String getElementName() {
            return this.elementName;
        }

        /**
         * @return humanVerificationConfig
         */
        public HumanVerificationConfig getHumanVerificationConfig() {
            return this.humanVerificationConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String elementName; 
            private HumanVerificationConfig humanVerificationConfig; 
            private String status; 

            private Builder() {
            } 

            private Builder(ControlElements model) {
                this.elementName = model.elementName;
                this.humanVerificationConfig = model.humanVerificationConfig;
                this.status = model.status;
            } 

            /**
             * <p>The name of the instance control item.</p>
             * 
             * <strong>example:</strong>
             * <p>human_verification</p>
             */
            public Builder elementName(String elementName) {
                this.elementName = elementName;
                return this;
            }

            /**
             * <p>The Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) authenticate configuration.</p>
             */
            public Builder humanVerificationConfig(HumanVerificationConfig humanVerificationConfig) {
                this.humanVerificationConfig = humanVerificationConfig;
                return this;
            }

            /**
             * <p>The status of the instance control item.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ControlElements build() {
                return new ControlElements(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceControlConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceControlConfigurationResponseBody</p>
     */
    public static class InstanceControlConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlElements")
        private java.util.List<ControlElements> controlElements;

        private InstanceControlConfiguration(Builder builder) {
            this.controlElements = builder.controlElements;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceControlConfiguration create() {
            return builder().build();
        }

        /**
         * @return controlElements
         */
        public java.util.List<ControlElements> getControlElements() {
            return this.controlElements;
        }

        public static final class Builder {
            private java.util.List<ControlElements> controlElements; 

            private Builder() {
            } 

            private Builder(InstanceControlConfiguration model) {
                this.controlElements = model.controlElements;
            } 

            /**
             * <p>The instance control configuration.</p>
             */
            public Builder controlElements(java.util.List<ControlElements> controlElements) {
                this.controlElements = controlElements;
                return this;
            }

            public InstanceControlConfiguration build() {
                return new InstanceControlConfiguration(this);
            } 

        } 

    }
}
