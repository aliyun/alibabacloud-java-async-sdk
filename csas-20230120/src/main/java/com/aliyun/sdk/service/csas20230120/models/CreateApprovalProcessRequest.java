// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateApprovalProcessRequest} extends {@link RequestModel}
 *
 * <p>CreateApprovalProcessRequest</p>
 */
public class CreateApprovalProcessRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchSchemas")
    private MatchSchemas matchSchemas;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessNodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.List<String>> processNodes;

    private CreateApprovalProcessRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.matchSchemas = builder.matchSchemas;
        this.processName = builder.processName;
        this.processNodes = builder.processNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApprovalProcessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return matchSchemas
     */
    public MatchSchemas getMatchSchemas() {
        return this.matchSchemas;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return processNodes
     */
    public java.util.List<java.util.List<String>> getProcessNodes() {
        return this.processNodes;
    }

    public static final class Builder extends Request.Builder<CreateApprovalProcessRequest, Builder> {
        private String description; 
        private MatchSchemas matchSchemas; 
        private String processName; 
        private java.util.List<java.util.List<String>> processNodes; 

        private Builder() {
            super();
        } 

        private Builder(CreateApprovalProcessRequest request) {
            super(request);
            this.description = request.description;
            this.matchSchemas = request.matchSchemas;
            this.processName = request.processName;
            this.processNodes = request.processNodes;
        } 

        /**
         * <p>The description of the approval flow. The description must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. Chinese characters are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an approval flow</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The matched approval templates.</p>
         */
        public Builder matchSchemas(MatchSchemas matchSchemas) {
            String matchSchemasShrink = shrink(matchSchemas, "MatchSchemas", "json");
            this.putBodyParameter("MatchSchemas", matchSchemasShrink);
            this.matchSchemas = matchSchemas;
            return this;
        }

        /**
         * <p>The flow name. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). Chinese characters are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_process</p>
         */
        public Builder processName(String processName) {
            this.putBodyParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * <p>The list of approval nodes. You can define up to 5 approval nodes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder processNodes(java.util.List<java.util.List<String>> processNodes) {
            this.putBodyParameter("ProcessNodes", processNodes);
            this.processNodes = processNodes;
            return this;
        }

        @Override
        public CreateApprovalProcessRequest build() {
            return new CreateApprovalProcessRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApprovalProcessRequest} extends {@link TeaModel}
     *
     * <p>CreateApprovalProcessRequest</p>
     */
    public static class MatchSchemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppUninstallSchemaId")
        private String appUninstallSchemaId;

        @com.aliyun.core.annotation.NameInMap("DeviceRegistrationSchemaId")
        private String deviceRegistrationSchemaId;

        @com.aliyun.core.annotation.NameInMap("DlpSendSchemaId")
        private String dlpSendSchemaId;

        @com.aliyun.core.annotation.NameInMap("DomainBlacklistSchemaId")
        private String domainBlacklistSchemaId;

        @com.aliyun.core.annotation.NameInMap("DomainWhitelistSchemaId")
        private String domainWhitelistSchemaId;

        @com.aliyun.core.annotation.NameInMap("EndpointHardeningSchemaId")
        private String endpointHardeningSchemaId;

        @com.aliyun.core.annotation.NameInMap("PeripheralBlockSchemaId")
        private String peripheralBlockSchemaId;

        @com.aliyun.core.annotation.NameInMap("PrivateAccessBlockSchemaId")
        private String privateAccessBlockSchemaId;

        @com.aliyun.core.annotation.NameInMap("SoftwareBlockSchemaId")
        private String softwareBlockSchemaId;

        @com.aliyun.core.annotation.NameInMap("SoftwareHardeningSchemaId")
        private String softwareHardeningSchemaId;

        private MatchSchemas(Builder builder) {
            this.appUninstallSchemaId = builder.appUninstallSchemaId;
            this.deviceRegistrationSchemaId = builder.deviceRegistrationSchemaId;
            this.dlpSendSchemaId = builder.dlpSendSchemaId;
            this.domainBlacklistSchemaId = builder.domainBlacklistSchemaId;
            this.domainWhitelistSchemaId = builder.domainWhitelistSchemaId;
            this.endpointHardeningSchemaId = builder.endpointHardeningSchemaId;
            this.peripheralBlockSchemaId = builder.peripheralBlockSchemaId;
            this.privateAccessBlockSchemaId = builder.privateAccessBlockSchemaId;
            this.softwareBlockSchemaId = builder.softwareBlockSchemaId;
            this.softwareHardeningSchemaId = builder.softwareHardeningSchemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchSchemas create() {
            return builder().build();
        }

        /**
         * @return appUninstallSchemaId
         */
        public String getAppUninstallSchemaId() {
            return this.appUninstallSchemaId;
        }

        /**
         * @return deviceRegistrationSchemaId
         */
        public String getDeviceRegistrationSchemaId() {
            return this.deviceRegistrationSchemaId;
        }

        /**
         * @return dlpSendSchemaId
         */
        public String getDlpSendSchemaId() {
            return this.dlpSendSchemaId;
        }

        /**
         * @return domainBlacklistSchemaId
         */
        public String getDomainBlacklistSchemaId() {
            return this.domainBlacklistSchemaId;
        }

        /**
         * @return domainWhitelistSchemaId
         */
        public String getDomainWhitelistSchemaId() {
            return this.domainWhitelistSchemaId;
        }

        /**
         * @return endpointHardeningSchemaId
         */
        public String getEndpointHardeningSchemaId() {
            return this.endpointHardeningSchemaId;
        }

        /**
         * @return peripheralBlockSchemaId
         */
        public String getPeripheralBlockSchemaId() {
            return this.peripheralBlockSchemaId;
        }

        /**
         * @return privateAccessBlockSchemaId
         */
        public String getPrivateAccessBlockSchemaId() {
            return this.privateAccessBlockSchemaId;
        }

        /**
         * @return softwareBlockSchemaId
         */
        public String getSoftwareBlockSchemaId() {
            return this.softwareBlockSchemaId;
        }

        /**
         * @return softwareHardeningSchemaId
         */
        public String getSoftwareHardeningSchemaId() {
            return this.softwareHardeningSchemaId;
        }

        public static final class Builder {
            private String appUninstallSchemaId; 
            private String deviceRegistrationSchemaId; 
            private String dlpSendSchemaId; 
            private String domainBlacklistSchemaId; 
            private String domainWhitelistSchemaId; 
            private String endpointHardeningSchemaId; 
            private String peripheralBlockSchemaId; 
            private String privateAccessBlockSchemaId; 
            private String softwareBlockSchemaId; 
            private String softwareHardeningSchemaId; 

            private Builder() {
            } 

            private Builder(MatchSchemas model) {
                this.appUninstallSchemaId = model.appUninstallSchemaId;
                this.deviceRegistrationSchemaId = model.deviceRegistrationSchemaId;
                this.dlpSendSchemaId = model.dlpSendSchemaId;
                this.domainBlacklistSchemaId = model.domainBlacklistSchemaId;
                this.domainWhitelistSchemaId = model.domainWhitelistSchemaId;
                this.endpointHardeningSchemaId = model.endpointHardeningSchemaId;
                this.peripheralBlockSchemaId = model.peripheralBlockSchemaId;
                this.privateAccessBlockSchemaId = model.privateAccessBlockSchemaId;
                this.softwareBlockSchemaId = model.softwareBlockSchemaId;
                this.softwareHardeningSchemaId = model.softwareHardeningSchemaId;
            } 

            /**
             * <p>The ID of the device uninstall approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder appUninstallSchemaId(String appUninstallSchemaId) {
                this.appUninstallSchemaId = appUninstallSchemaId;
                return this;
            }

            /**
             * <p>The ID of the device registration approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder deviceRegistrationSchemaId(String deviceRegistrationSchemaId) {
                this.deviceRegistrationSchemaId = deviceRegistrationSchemaId;
                return this;
            }

            /**
             * <p>The ID of the file outbound approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder dlpSendSchemaId(String dlpSendSchemaId) {
                this.dlpSendSchemaId = dlpSendSchemaId;
                return this;
            }

            /**
             * <p>The ID of the domain name blacklist approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder domainBlacklistSchemaId(String domainBlacklistSchemaId) {
                this.domainBlacklistSchemaId = domainBlacklistSchemaId;
                return this;
            }

            /**
             * <p>The ID of the domain name whitelist approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder domainWhitelistSchemaId(String domainWhitelistSchemaId) {
                this.domainWhitelistSchemaId = domainWhitelistSchemaId;
                return this;
            }

            /**
             * EndpointHardeningSchemaId.
             */
            public Builder endpointHardeningSchemaId(String endpointHardeningSchemaId) {
                this.endpointHardeningSchemaId = endpointHardeningSchemaId;
                return this;
            }

            /**
             * <p>The ID of the peripheral control approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder peripheralBlockSchemaId(String peripheralBlockSchemaId) {
                this.peripheralBlockSchemaId = peripheralBlockSchemaId;
                return this;
            }

            /**
             * PrivateAccessBlockSchemaId.
             */
            public Builder privateAccessBlockSchemaId(String privateAccessBlockSchemaId) {
                this.privateAccessBlockSchemaId = privateAccessBlockSchemaId;
                return this;
            }

            /**
             * <p>The ID of the software blocking approval template.</p>
             * 
             * <strong>example:</strong>
             * <p>approval-schema-090134f1ebff****</p>
             */
            public Builder softwareBlockSchemaId(String softwareBlockSchemaId) {
                this.softwareBlockSchemaId = softwareBlockSchemaId;
                return this;
            }

            /**
             * SoftwareHardeningSchemaId.
             */
            public Builder softwareHardeningSchemaId(String softwareHardeningSchemaId) {
                this.softwareHardeningSchemaId = softwareHardeningSchemaId;
                return this;
            }

            public MatchSchemas build() {
                return new MatchSchemas(this);
            } 

        } 

    }
}
