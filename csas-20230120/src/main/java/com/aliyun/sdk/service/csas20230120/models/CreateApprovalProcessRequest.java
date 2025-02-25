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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * MatchSchemas.
         */
        public Builder matchSchemas(MatchSchemas matchSchemas) {
            String matchSchemasShrink = shrink(matchSchemas, "MatchSchemas", "json");
            this.putBodyParameter("MatchSchemas", matchSchemasShrink);
            this.matchSchemas = matchSchemas;
            return this;
        }

        /**
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

        @com.aliyun.core.annotation.NameInMap("PeripheralBlockSchemaId")
        private String peripheralBlockSchemaId;

        @com.aliyun.core.annotation.NameInMap("SoftwareBlockSchemaId")
        private String softwareBlockSchemaId;

        private MatchSchemas(Builder builder) {
            this.appUninstallSchemaId = builder.appUninstallSchemaId;
            this.deviceRegistrationSchemaId = builder.deviceRegistrationSchemaId;
            this.dlpSendSchemaId = builder.dlpSendSchemaId;
            this.domainBlacklistSchemaId = builder.domainBlacklistSchemaId;
            this.domainWhitelistSchemaId = builder.domainWhitelistSchemaId;
            this.peripheralBlockSchemaId = builder.peripheralBlockSchemaId;
            this.softwareBlockSchemaId = builder.softwareBlockSchemaId;
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
         * @return peripheralBlockSchemaId
         */
        public String getPeripheralBlockSchemaId() {
            return this.peripheralBlockSchemaId;
        }

        /**
         * @return softwareBlockSchemaId
         */
        public String getSoftwareBlockSchemaId() {
            return this.softwareBlockSchemaId;
        }

        public static final class Builder {
            private String appUninstallSchemaId; 
            private String deviceRegistrationSchemaId; 
            private String dlpSendSchemaId; 
            private String domainBlacklistSchemaId; 
            private String domainWhitelistSchemaId; 
            private String peripheralBlockSchemaId; 
            private String softwareBlockSchemaId; 

            /**
             * AppUninstallSchemaId.
             */
            public Builder appUninstallSchemaId(String appUninstallSchemaId) {
                this.appUninstallSchemaId = appUninstallSchemaId;
                return this;
            }

            /**
             * DeviceRegistrationSchemaId.
             */
            public Builder deviceRegistrationSchemaId(String deviceRegistrationSchemaId) {
                this.deviceRegistrationSchemaId = deviceRegistrationSchemaId;
                return this;
            }

            /**
             * DlpSendSchemaId.
             */
            public Builder dlpSendSchemaId(String dlpSendSchemaId) {
                this.dlpSendSchemaId = dlpSendSchemaId;
                return this;
            }

            /**
             * DomainBlacklistSchemaId.
             */
            public Builder domainBlacklistSchemaId(String domainBlacklistSchemaId) {
                this.domainBlacklistSchemaId = domainBlacklistSchemaId;
                return this;
            }

            /**
             * DomainWhitelistSchemaId.
             */
            public Builder domainWhitelistSchemaId(String domainWhitelistSchemaId) {
                this.domainWhitelistSchemaId = domainWhitelistSchemaId;
                return this;
            }

            /**
             * PeripheralBlockSchemaId.
             */
            public Builder peripheralBlockSchemaId(String peripheralBlockSchemaId) {
                this.peripheralBlockSchemaId = peripheralBlockSchemaId;
                return this;
            }

            /**
             * SoftwareBlockSchemaId.
             */
            public Builder softwareBlockSchemaId(String softwareBlockSchemaId) {
                this.softwareBlockSchemaId = softwareBlockSchemaId;
                return this;
            }

            public MatchSchemas build() {
                return new MatchSchemas(this);
            } 

        } 

    }
}
