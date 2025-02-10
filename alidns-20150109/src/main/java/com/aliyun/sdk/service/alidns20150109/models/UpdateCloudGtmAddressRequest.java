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
 * {@link UpdateCloudGtmAddressRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmAddressRequest</p>
 */
public class UpdateCloudGtmAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttributeInfo")
    private String attributeInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthJudgement")
    private String healthJudgement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthTasks")
    private java.util.List<HealthTasks> healthTasks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateCloudGtmAddressRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.address = builder.address;
        this.addressId = builder.addressId;
        this.attributeInfo = builder.attributeInfo;
        this.clientToken = builder.clientToken;
        this.healthJudgement = builder.healthJudgement;
        this.healthTasks = builder.healthTasks;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmAddressRequest create() {
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
     * @return addressId
     */
    public String getAddressId() {
        return this.addressId;
    }

    /**
     * @return attributeInfo
     */
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmAddressRequest, Builder> {
        private String acceptLanguage; 
        private String address; 
        private String addressId; 
        private String attributeInfo; 
        private String clientToken; 
        private String healthJudgement; 
        private java.util.List<HealthTasks> healthTasks; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmAddressRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.address = request.address;
            this.addressId = request.addressId;
            this.attributeInfo = request.attributeInfo;
            this.clientToken = request.clientToken;
            this.healthJudgement = request.healthJudgement;
            this.healthTasks = request.healthTasks;
            this.name = request.name;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The IP address or domain name.</p>
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
         * <p>The ID of the address. This ID uniquely identifies the address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>addr-89518218114368**92</p>
         */
        public Builder addressId(String addressId) {
            this.putQueryParameter("AddressId", addressId);
            this.addressId = addressId;
            return this;
        }

        /**
         * <p>Address Attribution information.</p>
         * 
         * <strong>example:</strong>
         * <p>This parameter is not supported in the current version and does not need to be input.</p>
         */
        public Builder attributeInfo(String attributeInfo) {
            this.putQueryParameter("AttributeInfo", attributeInfo);
            this.attributeInfo = attributeInfo;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can specify a custom value for this parameter, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The new condition for determining the health state of the address. Valid values:</p>
         * <ul>
         * <li>any_ok: The health check results of at least one health check template are normal.</li>
         * <li>p30_ok: The health check results of at least 30% of health check templates are normal.</li>
         * <li>p50_ok: The health check results of at least 50% of health check templates are normal.</li>
         * <li>p70_ok: The health check results of at least 70% of health check templates are normal.</li>
         * <li>all_ok: The health check results of all health check templates are normal.</li>
         * </ul>
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
         * <p>The health check tasks.</p>
         */
        public Builder healthTasks(java.util.List<HealthTasks> healthTasks) {
            String healthTasksShrink = shrink(healthTasks, "HealthTasks", "json");
            this.putQueryParameter("HealthTasks", healthTasksShrink);
            this.healthTasks = healthTasks;
            return this;
        }

        /**
         * <p>The name of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>Address-1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateCloudGtmAddressRequest build() {
            return new UpdateCloudGtmAddressRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCloudGtmAddressRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudGtmAddressRequest</p>
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
             * <ul>
             * <li>If you leave this parameter empty, the existing service port is deleted.</li>
             * <li>If you specify this parameter, the existing service port is updated based on the value of this parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the health check template that is associated with the address. This parameter is required if you specify a service port of the address for health check tasks.</p>
             * <ul>
             * <li>If you leave this parameter empty, the associated health check template is disassociated from the address.</li>
             * <li>If you specify this parameter, the associated health check template is updated based on the value of this parameter.</li>
             * </ul>
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
