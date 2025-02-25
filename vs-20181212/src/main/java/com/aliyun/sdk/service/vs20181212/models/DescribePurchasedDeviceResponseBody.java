// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribePurchasedDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurchasedDeviceResponseBody</p>
 */
public class DescribePurchasedDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RegisterCode")
    private String registerCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubType")
    private String subType;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private DescribePurchasedDeviceResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.id = builder.id;
        this.name = builder.name;
        this.orderId = builder.orderId;
        this.region = builder.region;
        this.registerCode = builder.registerCode;
        this.requestId = builder.requestId;
        this.subType = builder.subType;
        this.type = builder.type;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePurchasedDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return registerCode
     */
    public String getRegisterCode() {
        return this.registerCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String groupId; 
        private String groupName; 
        private String id; 
        private String name; 
        private String orderId; 
        private String region; 
        private String registerCode; 
        private String requestId; 
        private String subType; 
        private String type; 
        private String vendor; 

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * RegisterCode.
         */
        public Builder registerCode(String registerCode) {
            this.registerCode = registerCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubType.
         */
        public Builder subType(String subType) {
            this.subType = subType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public DescribePurchasedDeviceResponseBody build() {
            return new DescribePurchasedDeviceResponseBody(this);
        } 

    } 

}
