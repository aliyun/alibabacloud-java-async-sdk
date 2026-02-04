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
 * {@link SetInstanceControlConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetInstanceControlConfigurationRequest</p>
 */
public class SetInstanceControlConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlElements")
    private java.util.List<ControlElements> controlElements;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private SetInstanceControlConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.controlElements = builder.controlElements;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetInstanceControlConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return controlElements
     */
    public java.util.List<ControlElements> getControlElements() {
        return this.controlElements;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<SetInstanceControlConfigurationRequest, Builder> {
        private String regionId; 
        private java.util.List<ControlElements> controlElements; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(SetInstanceControlConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.controlElements = request.controlElements;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>实例控制项。</p>
         */
        public Builder controlElements(java.util.List<ControlElements> controlElements) {
            this.putQueryParameter("ControlElements", controlElements);
            this.controlElements = controlElements;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public SetInstanceControlConfigurationRequest build() {
            return new SetInstanceControlConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetInstanceControlConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetInstanceControlConfigurationRequest</p>
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
             * HumanVerificationType.
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
     * {@link SetInstanceControlConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetInstanceControlConfigurationRequest</p>
     */
    public static class ControlElements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElementName")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String elementName;

        @com.aliyun.core.annotation.NameInMap("HumanVerificationConfig")
        private HumanVerificationConfig humanVerificationConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
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
             * <p>实例控制项名称，如human_verification。</p>
             * 
             * <strong>example:</strong>
             * <p>human_verification</p>
             */
            public Builder elementName(String elementName) {
                this.elementName = elementName;
                return this;
            }

            /**
             * HumanVerificationConfig.
             */
            public Builder humanVerificationConfig(HumanVerificationConfig humanVerificationConfig) {
                this.humanVerificationConfig = humanVerificationConfig;
                return this;
            }

            /**
             * <p>实例控制项状态。</p>
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
}
