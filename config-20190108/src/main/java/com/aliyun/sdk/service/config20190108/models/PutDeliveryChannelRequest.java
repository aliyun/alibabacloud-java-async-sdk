// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDeliveryChannelRequest} extends {@link RequestModel}
 *
 * <p>PutDeliveryChannelRequest</p>
 */
public class PutDeliveryChannelRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DeliveryChannelAssumeRoleArn")
    @Validation(required = true)
    private String deliveryChannelAssumeRoleArn;

    @Body
    @NameInMap("DeliveryChannelCondition")
    private String deliveryChannelCondition;

    @Body
    @NameInMap("DeliveryChannelId")
    private String deliveryChannelId;

    @Body
    @NameInMap("DeliveryChannelName")
    private String deliveryChannelName;

    @Body
    @NameInMap("DeliveryChannelTargetArn")
    @Validation(required = true)
    private String deliveryChannelTargetArn;

    @Body
    @NameInMap("DeliveryChannelType")
    @Validation(required = true)
    private String deliveryChannelType;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Status")
    private Integer status;

    private PutDeliveryChannelRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.deliveryChannelAssumeRoleArn = builder.deliveryChannelAssumeRoleArn;
        this.deliveryChannelCondition = builder.deliveryChannelCondition;
        this.deliveryChannelId = builder.deliveryChannelId;
        this.deliveryChannelName = builder.deliveryChannelName;
        this.deliveryChannelTargetArn = builder.deliveryChannelTargetArn;
        this.deliveryChannelType = builder.deliveryChannelType;
        this.description = builder.description;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDeliveryChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deliveryChannelAssumeRoleArn
     */
    public String getDeliveryChannelAssumeRoleArn() {
        return this.deliveryChannelAssumeRoleArn;
    }

    /**
     * @return deliveryChannelCondition
     */
    public String getDeliveryChannelCondition() {
        return this.deliveryChannelCondition;
    }

    /**
     * @return deliveryChannelId
     */
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    /**
     * @return deliveryChannelName
     */
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    /**
     * @return deliveryChannelTargetArn
     */
    public String getDeliveryChannelTargetArn() {
        return this.deliveryChannelTargetArn;
    }

    /**
     * @return deliveryChannelType
     */
    public String getDeliveryChannelType() {
        return this.deliveryChannelType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<PutDeliveryChannelRequest, Builder> {
        private String clientToken; 
        private String deliveryChannelAssumeRoleArn; 
        private String deliveryChannelCondition; 
        private String deliveryChannelId; 
        private String deliveryChannelName; 
        private String deliveryChannelTargetArn; 
        private String deliveryChannelType; 
        private String description; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(PutDeliveryChannelRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.deliveryChannelAssumeRoleArn = response.deliveryChannelAssumeRoleArn;
            this.deliveryChannelCondition = response.deliveryChannelCondition;
            this.deliveryChannelId = response.deliveryChannelId;
            this.deliveryChannelName = response.deliveryChannelName;
            this.deliveryChannelTargetArn = response.deliveryChannelTargetArn;
            this.deliveryChannelType = response.deliveryChannelType;
            this.description = response.description;
            this.status = response.status;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DeliveryChannelAssumeRoleArn.
         */
        public Builder deliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.putBodyParameter("DeliveryChannelAssumeRoleArn", deliveryChannelAssumeRoleArn);
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }

        /**
         * DeliveryChannelCondition.
         */
        public Builder deliveryChannelCondition(String deliveryChannelCondition) {
            this.putBodyParameter("DeliveryChannelCondition", deliveryChannelCondition);
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }

        /**
         * DeliveryChannelId.
         */
        public Builder deliveryChannelId(String deliveryChannelId) {
            this.putBodyParameter("DeliveryChannelId", deliveryChannelId);
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }

        /**
         * DeliveryChannelName.
         */
        public Builder deliveryChannelName(String deliveryChannelName) {
            this.putBodyParameter("DeliveryChannelName", deliveryChannelName);
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }

        /**
         * DeliveryChannelTargetArn.
         */
        public Builder deliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.putBodyParameter("DeliveryChannelTargetArn", deliveryChannelTargetArn);
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }

        /**
         * DeliveryChannelType.
         */
        public Builder deliveryChannelType(String deliveryChannelType) {
            this.putBodyParameter("DeliveryChannelType", deliveryChannelType);
            this.deliveryChannelType = deliveryChannelType;
            return this;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public PutDeliveryChannelRequest build() {
            return new PutDeliveryChannelRequest(this);
        } 

    } 

}
