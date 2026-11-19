// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link DeliveryInfo} extends {@link TeaModel}
 *
 * <p>DeliveryInfo</p>
 */
public class DeliveryInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("postFee")
    private Long postFee;

    @com.aliyun.core.annotation.NameInMap("serviceType")
    private Long serviceType;

    private DeliveryInfo(Builder builder) {
        this.displayName = builder.displayName;
        this.id = builder.id;
        this.postFee = builder.postFee;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeliveryInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return postFee
     */
    public Long getPostFee() {
        return this.postFee;
    }

    /**
     * @return serviceType
     */
    public Long getServiceType() {
        return this.serviceType;
    }

    public static final class Builder {
        private String displayName; 
        private String id; 
        private Long postFee; 
        private Long serviceType; 

        private Builder() {
        } 

        private Builder(DeliveryInfo model) {
            this.displayName = model.displayName;
            this.id = model.id;
            this.postFee = model.postFee;
            this.serviceType = model.serviceType;
        } 

        /**
         * <p>Display name</p>
         * 
         * <strong>example:</strong>
         * <p>快递 免邮</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Unique ID</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Shipping fee amount</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder postFee(Long postFee) {
            this.postFee = postFee;
            return this;
        }

        /**
         * <p>serviceType</p>
         * 
         * <strong>example:</strong>
         * <p>-4</p>
         */
        public Builder serviceType(Long serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public DeliveryInfo build() {
            return new DeliveryInfo(this);
        } 

    } 

}
