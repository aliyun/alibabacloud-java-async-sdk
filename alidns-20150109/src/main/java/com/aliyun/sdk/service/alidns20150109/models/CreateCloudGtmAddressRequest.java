// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudGtmAddressRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudGtmAddressRequest</p>
 */
public class CreateCloudGtmAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    @com.aliyun.core.annotation.Validation(required = true)
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttributeInfo")
    private String attributeInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String availableMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthJudgement")
    @com.aliyun.core.annotation.Validation(required = true)
    private String healthJudgement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthTasks")
    private java.util.List < HealthTasks> healthTasks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManualAvailableStatus")
    private String manualAvailableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateCloudGtmAddressRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.address = builder.address;
        this.attributeInfo = builder.attributeInfo;
        this.availableMode = builder.availableMode;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
        this.healthJudgement = builder.healthJudgement;
        this.healthTasks = builder.healthTasks;
        this.manualAvailableStatus = builder.manualAvailableStatus;
        this.name = builder.name;
        this.remark = builder.remark;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudGtmAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return attributeInfo
     */
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    /**
     * @return availableMode
     */
    public String getAvailableMode() {
        return this.availableMode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return healthJudgement
     */
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    /**
     * @return healthTasks
     */
    public java.util.List < HealthTasks> getHealthTasks() {
        return this.healthTasks;
    }

    /**
     * @return manualAvailableStatus
     */
    public String getManualAvailableStatus() {
        return this.manualAvailableStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateCloudGtmAddressRequest, Builder> {
        private String acceptLanguage; 
        private String address; 
        private String attributeInfo; 
        private String availableMode; 
        private String clientToken; 
        private String enableStatus; 
        private String healthJudgement; 
        private java.util.List < HealthTasks> healthTasks; 
        private String manualAvailableStatus; 
        private String name; 
        private String remark; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudGtmAddressRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.address = request.address;
            this.attributeInfo = request.attributeInfo;
            this.availableMode = request.availableMode;
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
            this.healthJudgement = request.healthJudgement;
            this.healthTasks = request.healthTasks;
            this.manualAvailableStatus = request.manualAvailableStatus;
            this.name = request.name;
            this.remark = request.remark;
            this.type = request.type;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * AttributeInfo.
         */
        public Builder attributeInfo(String attributeInfo) {
            this.putQueryParameter("AttributeInfo", attributeInfo);
            this.attributeInfo = attributeInfo;
            return this;
        }

        /**
         * AvailableMode.
         */
        public Builder availableMode(String availableMode) {
            this.putQueryParameter("AvailableMode", availableMode);
            this.availableMode = availableMode;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EnableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * HealthJudgement.
         */
        public Builder healthJudgement(String healthJudgement) {
            this.putQueryParameter("HealthJudgement", healthJudgement);
            this.healthJudgement = healthJudgement;
            return this;
        }

        /**
         * HealthTasks.
         */
        public Builder healthTasks(java.util.List < HealthTasks> healthTasks) {
            String healthTasksShrink = shrink(healthTasks, "HealthTasks", "json");
            this.putQueryParameter("HealthTasks", healthTasksShrink);
            this.healthTasks = healthTasks;
            return this;
        }

        /**
         * ManualAvailableStatus.
         */
        public Builder manualAvailableStatus(String manualAvailableStatus) {
            this.putQueryParameter("ManualAvailableStatus", manualAvailableStatus);
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateCloudGtmAddressRequest build() {
            return new CreateCloudGtmAddressRequest(this);
        } 

    } 

    public static class HealthTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private HealthTasks(Builder builder) {
            this.port = builder.port;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthTasks create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private Integer port; 
            private String templateId; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public HealthTasks build() {
                return new HealthTasks(this);
            } 

        } 

    }
}
