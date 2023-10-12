// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BusinessType} extends {@link TeaModel}
 *
 * <p>BusinessType</p>
 */
public class BusinessType extends TeaModel {
    @NameInMap("Abbr")
    private String abbr;

    @NameInMap("ActionFlag")
    private String actionFlag;

    @NameInMap("BusinessTypeId")
    private String businessTypeId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Direction")
    private Long direction;

    @NameInMap("Gateway")
    private Long gateway;

    @NameInMap("LeaseTime")
    private String leaseTime;

    @NameInMap("Mask")
    private String mask;

    @NameInMap("Name")
    private String name;

    @NameInMap("ReserveNumber")
    private Long reserveNumber;

    @NameInMap("Sharing")
    private String sharing;

    @NameInMap("Type")
    private String type;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("Vlan")
    private String vlan;

    @NameInMap("ZoneType")
    private String zoneType;

    private BusinessType(Builder builder) {
        this.abbr = builder.abbr;
        this.actionFlag = builder.actionFlag;
        this.businessTypeId = builder.businessTypeId;
        this.createTime = builder.createTime;
        this.direction = builder.direction;
        this.gateway = builder.gateway;
        this.leaseTime = builder.leaseTime;
        this.mask = builder.mask;
        this.name = builder.name;
        this.reserveNumber = builder.reserveNumber;
        this.sharing = builder.sharing;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
        this.vlan = builder.vlan;
        this.zoneType = builder.zoneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BusinessType create() {
        return builder().build();
    }

    /**
     * @return abbr
     */
    public String getAbbr() {
        return this.abbr;
    }

    /**
     * @return actionFlag
     */
    public String getActionFlag() {
        return this.actionFlag;
    }

    /**
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return direction
     */
    public Long getDirection() {
        return this.direction;
    }

    /**
     * @return gateway
     */
    public Long getGateway() {
        return this.gateway;
    }

    /**
     * @return leaseTime
     */
    public String getLeaseTime() {
        return this.leaseTime;
    }

    /**
     * @return mask
     */
    public String getMask() {
        return this.mask;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return reserveNumber
     */
    public Long getReserveNumber() {
        return this.reserveNumber;
    }

    /**
     * @return sharing
     */
    public String getSharing() {
        return this.sharing;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return vlan
     */
    public String getVlan() {
        return this.vlan;
    }

    /**
     * @return zoneType
     */
    public String getZoneType() {
        return this.zoneType;
    }

    public static final class Builder {
        private String abbr; 
        private String actionFlag; 
        private String businessTypeId; 
        private String createTime; 
        private Long direction; 
        private Long gateway; 
        private String leaseTime; 
        private String mask; 
        private String name; 
        private Long reserveNumber; 
        private String sharing; 
        private String type; 
        private String updateTime; 
        private String vlan; 
        private String zoneType; 

        /**
         * Abbr.
         */
        public Builder abbr(String abbr) {
            this.abbr = abbr;
            return this;
        }

        /**
         * ActionFlag.
         */
        public Builder actionFlag(String actionFlag) {
            this.actionFlag = actionFlag;
            return this;
        }

        /**
         * BusinessTypeId.
         */
        public Builder businessTypeId(String businessTypeId) {
            this.businessTypeId = businessTypeId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(Long direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Gateway.
         */
        public Builder gateway(Long gateway) {
            this.gateway = gateway;
            return this;
        }

        /**
         * LeaseTime.
         */
        public Builder leaseTime(String leaseTime) {
            this.leaseTime = leaseTime;
            return this;
        }

        /**
         * Mask.
         */
        public Builder mask(String mask) {
            this.mask = mask;
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
         * ReserveNumber.
         */
        public Builder reserveNumber(Long reserveNumber) {
            this.reserveNumber = reserveNumber;
            return this;
        }

        /**
         * Sharing.
         */
        public Builder sharing(String sharing) {
            this.sharing = sharing;
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
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Vlan.
         */
        public Builder vlan(String vlan) {
            this.vlan = vlan;
            return this;
        }

        /**
         * ZoneType.
         */
        public Builder zoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }

        public BusinessType build() {
            return new BusinessType(this);
        } 

    } 

}
