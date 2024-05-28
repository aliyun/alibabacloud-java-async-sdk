// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < HealthTasks> healthTasks;

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
    public java.util.List < HealthTasks> getHealthTasks() {
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
        private java.util.List < HealthTasks> healthTasks; 
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
         * AddressId.
         */
        public Builder addressId(String addressId) {
            this.putQueryParameter("AddressId", addressId);
            this.addressId = addressId;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * Name.
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
