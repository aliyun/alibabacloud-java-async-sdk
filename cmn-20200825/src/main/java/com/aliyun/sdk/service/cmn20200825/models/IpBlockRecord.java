// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IpBlockRecord} extends {@link TeaModel}
 *
 * <p>IpBlockRecord</p>
 */
public class IpBlockRecord extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Creator")
    private Long creator;

    @NameInMap("Description")
    private String description;

    @NameInMap("Detail")
    private java.util.List < Detail> detail;

    @NameInMap("IpBlockCode")
    private java.util.List < String > ipBlockCode;

    @NameInMap("IpBlockRecordId")
    @Validation(required = true)
    private String ipBlockRecordId;

    @NameInMap("NetType")
    private String netType;

    @NameInMap("RecordType")
    private String recordType;

    @NameInMap("Status")
    private String status;

    @NameInMap("Title")
    private String title;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("WorkNo")
    private String workNo;

    @NameInMap("ZoneName")
    private String zoneName;

    private IpBlockRecord(Builder builder) {
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.description = builder.description;
        this.detail = builder.detail;
        this.ipBlockCode = builder.ipBlockCode;
        this.ipBlockRecordId = builder.ipBlockRecordId;
        this.netType = builder.netType;
        this.recordType = builder.recordType;
        this.status = builder.status;
        this.title = builder.title;
        this.updateTime = builder.updateTime;
        this.workNo = builder.workNo;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IpBlockRecord create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public Long getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detail
     */
    public java.util.List < Detail> getDetail() {
        return this.detail;
    }

    /**
     * @return ipBlockCode
     */
    public java.util.List < String > getIpBlockCode() {
        return this.ipBlockCode;
    }

    /**
     * @return ipBlockRecordId
     */
    public String getIpBlockRecordId() {
        return this.ipBlockRecordId;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return workNo
     */
    public String getWorkNo() {
        return this.workNo;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder {
        private String createTime; 
        private Long creator; 
        private String description; 
        private java.util.List < Detail> detail; 
        private java.util.List < String > ipBlockCode; 
        private String ipBlockRecordId; 
        private String netType; 
        private String recordType; 
        private String status; 
        private String title; 
        private String updateTime; 
        private String workNo; 
        private String zoneName; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(Long creator) {
            this.creator = creator;
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
         * Detail.
         */
        public Builder detail(java.util.List < Detail> detail) {
            this.detail = detail;
            return this;
        }

        /**
         * IpBlockCode.
         */
        public Builder ipBlockCode(java.util.List < String > ipBlockCode) {
            this.ipBlockCode = ipBlockCode;
            return this;
        }

        /**
         * IpBlockRecordId.
         */
        public Builder ipBlockRecordId(String ipBlockRecordId) {
            this.ipBlockRecordId = ipBlockRecordId;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.netType = netType;
            return this;
        }

        /**
         * RecordType.
         */
        public Builder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
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
         * WorkNo.
         */
        public Builder workNo(String workNo) {
            this.workNo = workNo;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        public IpBlockRecord build() {
            return new IpBlockRecord(this);
        } 

    } 

    public static class ZoneLayer extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private ZoneLayer(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneLayer create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ZoneLayer build() {
                return new ZoneLayer(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @NameInMap("BusinessTypeName")
        private String businessTypeName;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("Gateway")
        private String gateway;

        @NameInMap("ParentIpBlocks")
        private java.util.List < String > parentIpBlocks;

        @NameInMap("ZoneLayer")
        private java.util.List < ZoneLayer> zoneLayer;

        private Detail(Builder builder) {
            this.businessTypeName = builder.businessTypeName;
            this.deviceName = builder.deviceName;
            this.gateway = builder.gateway;
            this.parentIpBlocks = builder.parentIpBlocks;
            this.zoneLayer = builder.zoneLayer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return businessTypeName
         */
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
        }

        /**
         * @return parentIpBlocks
         */
        public java.util.List < String > getParentIpBlocks() {
            return this.parentIpBlocks;
        }

        /**
         * @return zoneLayer
         */
        public java.util.List < ZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

        public static final class Builder {
            private String businessTypeName; 
            private String deviceName; 
            private String gateway; 
            private java.util.List < String > parentIpBlocks; 
            private java.util.List < ZoneLayer> zoneLayer; 

            /**
             * BusinessTypeName.
             */
            public Builder businessTypeName(String businessTypeName) {
                this.businessTypeName = businessTypeName;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * Gateway.
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * ParentIpBlocks.
             */
            public Builder parentIpBlocks(java.util.List < String > parentIpBlocks) {
                this.parentIpBlocks = parentIpBlocks;
                return this;
            }

            /**
             * ZoneLayer.
             */
            public Builder zoneLayer(java.util.List < ZoneLayer> zoneLayer) {
                this.zoneLayer = zoneLayer;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
}
