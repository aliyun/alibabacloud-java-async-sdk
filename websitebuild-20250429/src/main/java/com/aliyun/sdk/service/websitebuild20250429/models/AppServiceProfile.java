// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link AppServiceProfile} extends {@link TeaModel}
 *
 * <p>AppServiceProfile</p>
 */
public class AppServiceProfile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("DesignType")
    private String designType;

    @com.aliyun.core.annotation.NameInMap("DesignTypeText")
    private String designTypeText;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("ServiceSpec")
    private String serviceSpec;

    @com.aliyun.core.annotation.NameInMap("ServiceSpecText")
    private String serviceSpecText;

    private AppServiceProfile(Builder builder) {
        this.bizId = builder.bizId;
        this.designType = builder.designType;
        this.designTypeText = builder.designTypeText;
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
        this.serviceSpec = builder.serviceSpec;
        this.serviceSpecText = builder.serviceSpecText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppServiceProfile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return designType
     */
    public String getDesignType() {
        return this.designType;
    }

    /**
     * @return designTypeText
     */
    public String getDesignTypeText() {
        return this.designTypeText;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return serviceSpec
     */
    public String getServiceSpec() {
        return this.serviceSpec;
    }

    /**
     * @return serviceSpecText
     */
    public String getServiceSpecText() {
        return this.serviceSpecText;
    }

    public static final class Builder {
        private String bizId; 
        private String designType; 
        private String designTypeText; 
        private String instanceId; 
        private String orderId; 
        private String serviceSpec; 
        private String serviceSpecText; 

        private Builder() {
        } 

        private Builder(AppServiceProfile model) {
            this.bizId = model.bizId;
            this.designType = model.designType;
            this.designTypeText = model.designTypeText;
            this.instanceId = model.instanceId;
            this.orderId = model.orderId;
            this.serviceSpec = model.serviceSpec;
            this.serviceSpecText = model.serviceSpecText;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * DesignType.
         */
        public Builder designType(String designType) {
            this.designType = designType;
            return this;
        }

        /**
         * DesignTypeText.
         */
        public Builder designTypeText(String designTypeText) {
            this.designTypeText = designTypeText;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * ServiceSpec.
         */
        public Builder serviceSpec(String serviceSpec) {
            this.serviceSpec = serviceSpec;
            return this;
        }

        /**
         * ServiceSpecText.
         */
        public Builder serviceSpecText(String serviceSpecText) {
            this.serviceSpecText = serviceSpecText;
            return this;
        }

        public AppServiceProfile build() {
            return new AppServiceProfile(this);
        } 

    } 

}
