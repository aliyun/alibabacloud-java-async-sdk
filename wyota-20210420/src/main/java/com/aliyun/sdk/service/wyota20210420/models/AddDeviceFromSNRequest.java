// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddDeviceFromSNRequest} extends {@link RequestModel}
 *
 * <p>AddDeviceFromSNRequest</p>
 */
public class AddDeviceFromSNRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomProperty")
    private String customProperty;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelContents")
    private String labelContents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecureNetworkType")
    private String secureNetworkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNo;

    private AddDeviceFromSNRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.customProperty = builder.customProperty;
        this.groupId = builder.groupId;
        this.labelContents = builder.labelContents;
        this.secureNetworkType = builder.secureNetworkType;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceFromSNRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return customProperty
     */
    public String getCustomProperty() {
        return this.customProperty;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return labelContents
     */
    public String getLabelContents() {
        return this.labelContents;
    }

    /**
     * @return secureNetworkType
     */
    public String getSecureNetworkType() {
        return this.secureNetworkType;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<AddDeviceFromSNRequest, Builder> {
        private String alias; 
        private String customProperty; 
        private String groupId; 
        private String labelContents; 
        private String secureNetworkType; 
        private String serialNo; 

        private Builder() {
            super();
        } 

        private Builder(AddDeviceFromSNRequest request) {
            super(request);
            this.alias = request.alias;
            this.customProperty = request.customProperty;
            this.groupId = request.groupId;
            this.labelContents = request.labelContents;
            this.secureNetworkType = request.secureNetworkType;
            this.serialNo = request.serialNo;
        } 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.putBodyParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * CustomProperty.
         */
        public Builder customProperty(String customProperty) {
            this.putBodyParameter("CustomProperty", customProperty);
            this.customProperty = customProperty;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * LabelContents.
         */
        public Builder labelContents(String labelContents) {
            this.putBodyParameter("LabelContents", labelContents);
            this.labelContents = labelContents;
            return this;
        }

        /**
         * SecureNetworkType.
         */
        public Builder secureNetworkType(String secureNetworkType) {
            this.putBodyParameter("SecureNetworkType", secureNetworkType);
            this.secureNetworkType = secureNetworkType;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public AddDeviceFromSNRequest build() {
            return new AddDeviceFromSNRequest(this);
        } 

    } 

}
