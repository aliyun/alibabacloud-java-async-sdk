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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePurchasedDeviceResponseBody model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.groupId = model.groupId;
            this.groupName = model.groupName;
            this.id = model.id;
            this.name = model.name;
            this.orderId = model.orderId;
            this.region = model.region;
            this.registerCode = model.registerCode;
            this.requestId = model.requestId;
            this.subType = model.subType;
            this.type = model.type;
            this.vendor = model.vendor;
        } 

        /**
         * <p>The time when the device was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-10T21:00:00Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The device description.</p>
         * 
         * <strong>example:</strong>
         * <p>Camera at xxx intersection</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****174-cn-qingdao</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test group</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>33763****77224964-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The device name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2117*****0447</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The region to which the group belongs, which is the service center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The device registration code.</p>
         * 
         * <strong>example:</strong>
         * <p>12345*****67890</p>
         */
        public Builder registerCode(String registerCode) {
            this.registerCode = registerCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The device subtype. Valid values:</p>
         * <ul>
         * <li>bullet: Bullet camera.</li>
         * <li>dome: Dome camera.</li>
         * <li>ptz: PTZ camera.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dome</p>
         */
        public Builder subType(String subType) {
            this.subType = subType;
            return this;
        }

        /**
         * <p>The device type. Valid values:</p>
         * <ul>
         * <li>ipc: Camera.</li>
         * <li>platform: Platform.</li>
         * <li>ied: Intelligent device.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipc</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The device vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>8yd*****qem</p>
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
