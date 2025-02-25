// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
    private java.util.List<HealthTasks> healthTasks;

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
    public java.util.List<HealthTasks> getHealthTasks() {
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
        private java.util.List<HealthTasks> healthTasks; 
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>IP address or domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>223.5.XX.XX</p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>Address ownership information.</p>
         * 
         * <strong>example:</strong>
         * <p>当前版本不支持传入此参数，请不要传入参数。</p>
         */
        public Builder attributeInfo(String attributeInfo) {
            this.putQueryParameter("AttributeInfo", attributeInfo);
            this.attributeInfo = attributeInfo;
            return this;
        }

        /**
         * <p>The failover mode that is used when address exceptions are identified. Valid values:</p>
         * <ul>
         * <li>auto: the automatic mode. The system determines whether to return an address based on the health check results. If the address fails health checks, the system does not return the address. If the address passes health checks, the system returns the address.</li>
         * <li>manual: the manual mode. If an address is in the unavailable state, the address is not returned for DNS requests even if the address passes health checks. If an address is in the available state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder availableMode(String availableMode) {
            this.putQueryParameter("AvailableMode", availableMode);
            this.availableMode = availableMode;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Indicates the current enabled status of the address:</p>
         * <ul>
         * <li>enable: Enabled status </li>
         * <li>disable: Disabled status</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * <p>The condition for determining the health status of the address. This parameter is required when HealthTasks is specified. Valid values:</p>
         * <ul>
         * <li>any_ok: The health check results of at least one health check template are normal.</li>
         * <li>p30_ok: The health check results of at least 30% of health check templates are normal.</li>
         * <li>p50_ok: The health check results of at least 50% of health check templates are normal.</li>
         * <li>p70_ok: The health check results of at least 70% of health check templates are normal.</li>
         * <li>all_ok: The health check results of all health check templates are normal.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p50_ok</p>
         */
        public Builder healthJudgement(String healthJudgement) {
            this.putQueryParameter("HealthJudgement", healthJudgement);
            this.healthJudgement = healthJudgement;
            return this;
        }

        /**
         * <p>The health check tasks associated with the address.</p>
         */
        public Builder healthTasks(java.util.List<HealthTasks> healthTasks) {
            String healthTasksShrink = shrink(healthTasks, "HealthTasks", "json");
            this.putQueryParameter("HealthTasks", healthTasksShrink);
            this.healthTasks = healthTasks;
            return this;
        }

        /**
         * <p>The availability state of the address. This parameter is required when AvailableMode is set to <strong>manual</strong>. Valid values:</p>
         * <ul>
         * <li>available: The address is normal. In this state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
         * <li>unavailable: The address is abnormal. In this state, the address is not returned for DNS requests even if the address passes health checks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        public Builder manualAvailableStatus(String manualAvailableStatus) {
            this.putQueryParameter("ManualAvailableStatus", manualAvailableStatus);
            this.manualAvailableStatus = manualAvailableStatus;
            return this;
        }

        /**
         * <p>Address name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Address-1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>Address type:</p>
         * <ul>
         * <li>IPv4</li>
         * <li>IPv6</li>
         * <li>domain</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
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

    /**
     * 
     * {@link CreateCloudGtmAddressRequest} extends {@link TeaModel}
     *
     * <p>CreateCloudGtmAddressRequest</p>
     */
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
             * <p>The service port of the address on which health check tasks are performed. If the ping protocol is used for health checks, the configuration of the service port is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the health check template associated with the address.</p>
             * 
             * <strong>example:</strong>
             * <p>mtp-89518052425100**80</p>
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
