// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSdlEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSdlEventListResponseBody</p>
 */
public class DescribeSdlEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SdlEventDetailList")
    private java.util.List<SdlEventDetailList> sdlEventDetailList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSdlEventListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sdlEventDetailList = builder.sdlEventDetailList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdlEventListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sdlEventDetailList
     */
    public java.util.List<SdlEventDetailList> getSdlEventDetailList() {
        return this.sdlEventDetailList;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SdlEventDetailList> sdlEventDetailList; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSdlEventListResponseBody model) {
            this.requestId = model.requestId;
            this.sdlEventDetailList = model.sdlEventDetailList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F06DE24D-6EB9-5F55-B588-7BB946DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array of data leakage events.</p>
         */
        public Builder sdlEventDetailList(java.util.List<SdlEventDetailList> sdlEventDetailList) {
            this.sdlEventDetailList = sdlEventDetailList;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSdlEventListResponseBody build() {
            return new DescribeSdlEventListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSdlEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSdlEventListResponseBody</p>
     */
    public static class SdlEventDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("AssetPrivateIp")
        private String assetPrivateIp;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("CategoryClassId")
        private String categoryClassId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("CityId")
        private String cityId;

        @com.aliyun.core.annotation.NameInMap("CountryId")
        private String countryId;

        @com.aliyun.core.annotation.NameInMap("DstIp")
        private String dstIp;

        @com.aliyun.core.annotation.NameInMap("DstPortList")
        private String dstPortList;

        @com.aliyun.core.annotation.NameInMap("EventCnt")
        private Long eventCnt;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("LocationName")
        private String locationName;

        @com.aliyun.core.annotation.NameInMap("Payload")
        private String payload;

        @com.aliyun.core.annotation.NameInMap("ProtoList")
        private String protoList;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceIdType")
        private Integer resourceIdType;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataCnt")
        private Long sensitiveDataCnt;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataList")
        private java.util.List<String> sensitiveDataList;

        @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
        private String sensitiveLevel;

        @com.aliyun.core.annotation.NameInMap("SensitiveType")
        private String sensitiveType;

        @com.aliyun.core.annotation.NameInMap("SrcIp")
        private String srcIp;

        @com.aliyun.core.annotation.NameInMap("SrcPortList")
        private String srcPortList;

        @com.aliyun.core.annotation.NameInMap("TrafficBytes")
        private Long trafficBytes;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private SdlEventDetailList(Builder builder) {
            this.assetName = builder.assetName;
            this.assetPrivateIp = builder.assetPrivateIp;
            this.assetType = builder.assetType;
            this.categoryClassId = builder.categoryClassId;
            this.categoryName = builder.categoryName;
            this.cityId = builder.cityId;
            this.countryId = builder.countryId;
            this.dstIp = builder.dstIp;
            this.dstPortList = builder.dstPortList;
            this.eventCnt = builder.eventCnt;
            this.eventLevel = builder.eventLevel;
            this.eventName = builder.eventName;
            this.firstTime = builder.firstTime;
            this.lastTime = builder.lastTime;
            this.locationName = builder.locationName;
            this.payload = builder.payload;
            this.protoList = builder.protoList;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceIdType = builder.resourceIdType;
            this.sensitiveDataCnt = builder.sensitiveDataCnt;
            this.sensitiveDataList = builder.sensitiveDataList;
            this.sensitiveLevel = builder.sensitiveLevel;
            this.sensitiveType = builder.sensitiveType;
            this.srcIp = builder.srcIp;
            this.srcPortList = builder.srcPortList;
            this.trafficBytes = builder.trafficBytes;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdlEventDetailList create() {
            return builder().build();
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return assetPrivateIp
         */
        public String getAssetPrivateIp() {
            return this.assetPrivateIp;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return categoryClassId
         */
        public String getCategoryClassId() {
            return this.categoryClassId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return cityId
         */
        public String getCityId() {
            return this.cityId;
        }

        /**
         * @return countryId
         */
        public String getCountryId() {
            return this.countryId;
        }

        /**
         * @return dstIp
         */
        public String getDstIp() {
            return this.dstIp;
        }

        /**
         * @return dstPortList
         */
        public String getDstPortList() {
            return this.dstPortList;
        }

        /**
         * @return eventCnt
         */
        public Long getEventCnt() {
            return this.eventCnt;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return locationName
         */
        public String getLocationName() {
            return this.locationName;
        }

        /**
         * @return payload
         */
        public String getPayload() {
            return this.payload;
        }

        /**
         * @return protoList
         */
        public String getProtoList() {
            return this.protoList;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceIdType
         */
        public Integer getResourceIdType() {
            return this.resourceIdType;
        }

        /**
         * @return sensitiveDataCnt
         */
        public Long getSensitiveDataCnt() {
            return this.sensitiveDataCnt;
        }

        /**
         * @return sensitiveDataList
         */
        public java.util.List<String> getSensitiveDataList() {
            return this.sensitiveDataList;
        }

        /**
         * @return sensitiveLevel
         */
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        /**
         * @return sensitiveType
         */
        public String getSensitiveType() {
            return this.sensitiveType;
        }

        /**
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
        }

        /**
         * @return srcPortList
         */
        public String getSrcPortList() {
            return this.srcPortList;
        }

        /**
         * @return trafficBytes
         */
        public Long getTrafficBytes() {
            return this.trafficBytes;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String assetName; 
            private String assetPrivateIp; 
            private String assetType; 
            private String categoryClassId; 
            private String categoryName; 
            private String cityId; 
            private String countryId; 
            private String dstIp; 
            private String dstPortList; 
            private Long eventCnt; 
            private String eventLevel; 
            private String eventName; 
            private Long firstTime; 
            private Long lastTime; 
            private String locationName; 
            private String payload; 
            private String protoList; 
            private String regionId; 
            private String resourceId; 
            private Integer resourceIdType; 
            private Long sensitiveDataCnt; 
            private java.util.List<String> sensitiveDataList; 
            private String sensitiveLevel; 
            private String sensitiveType; 
            private String srcIp; 
            private String srcPortList; 
            private Long trafficBytes; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(SdlEventDetailList model) {
                this.assetName = model.assetName;
                this.assetPrivateIp = model.assetPrivateIp;
                this.assetType = model.assetType;
                this.categoryClassId = model.categoryClassId;
                this.categoryName = model.categoryName;
                this.cityId = model.cityId;
                this.countryId = model.countryId;
                this.dstIp = model.dstIp;
                this.dstPortList = model.dstPortList;
                this.eventCnt = model.eventCnt;
                this.eventLevel = model.eventLevel;
                this.eventName = model.eventName;
                this.firstTime = model.firstTime;
                this.lastTime = model.lastTime;
                this.locationName = model.locationName;
                this.payload = model.payload;
                this.protoList = model.protoList;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceIdType = model.resourceIdType;
                this.sensitiveDataCnt = model.sensitiveDataCnt;
                this.sensitiveDataList = model.sensitiveDataList;
                this.sensitiveLevel = model.sensitiveLevel;
                this.sensitiveType = model.sensitiveType;
                this.srcIp = model.srcIp;
                this.srcPortList = model.srcPortList;
                this.trafficBytes = model.trafficBytes;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The asset name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The private IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.102.XXX</p>
             */
            public Builder assetPrivateIp(String assetPrivateIp) {
                this.assetPrivateIp = assetPrivateIp;
                return this;
            }

            /**
             * <p>The asset type.</p>
             * 
             * <strong>example:</strong>
             * <p>EIP</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The intelligence tag category. Valid values:</p>
             * <ul>
             * <li><p><strong>Suspicious</strong>: suspicious</p>
             * </li>
             * <li><p><strong>Malicious</strong>: malicious</p>
             * </li>
             * <li><p><strong>Trusted</strong>: trusted</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Trusted</p>
             */
            public Builder categoryClassId(String categoryClassId) {
                this.categoryClassId = categoryClassId;
                return this;
            }

            /**
             * <p>The category name.</p>
             * 
             * <strong>example:</strong>
             * <p>Trusted</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The city ID.</p>
             * 
             * <strong>example:</strong>
             * <p>000</p>
             */
            public Builder cityId(String cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * <p>The country ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder countryId(String countryId) {
                this.countryId = countryId;
                return this;
            }

            /**
             * <p>The destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>106.14.74.XXX</p>
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * <p>The destination port.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder dstPortList(String dstPortList) {
                this.dstPortList = dstPortList;
                return this;
            }

            /**
             * <p>The number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventCnt(Long eventCnt) {
                this.eventCnt = eventCnt;
                return this;
            }

            /**
             * <p>The event\&quot;s risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sensitive ID card data leakage</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The first time the event occurred, as a Unix timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1735697768</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The last time the event occurred, as a Unix timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1738636157</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The location of the destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>Yuhang District, Hangzhou City, Zhejiang Province</p>
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * <p>The payload of the intrusion prevention event.</p>
             * 
             * <strong>example:</strong>
             * <p>3082002f02010004067075626c6963a082002002044c33a756020100020100308200103082000c06082b060102010105000500</p>
             */
            public Builder payload(String payload) {
                this.payload = payload;
                return this;
            }

            /**
             * <p>The protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protoList(String protoList) {
                this.protoList = protoList;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ce347a98f41e849188aa51c56b02a****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder resourceIdType(Integer resourceIdType) {
                this.resourceIdType = resourceIdType;
                return this;
            }

            /**
             * <p>The number of sensitive data items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sensitiveDataCnt(Long sensitiveDataCnt) {
                this.sensitiveDataCnt = sensitiveDataCnt;
                return this;
            }

            /**
             * <p>An array of sensitive data.</p>
             */
            public Builder sensitiveDataList(java.util.List<String> sensitiveDataList) {
                this.sensitiveDataList = sensitiveDataList;
                return this;
            }

            /**
             * <p>The sensitive data level.</p>
             * 
             * <strong>example:</strong>
             * <p>S3</p>
             */
            public Builder sensitiveLevel(String sensitiveLevel) {
                this.sensitiveLevel = sensitiveLevel;
                return this;
            }

            /**
             * <p>The sensitive data type.</p>
             * 
             * <strong>example:</strong>
             * <p>Identity Card</p>
             */
            public Builder sensitiveType(String sensitiveType) {
                this.sensitiveType = sensitiveType;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>104.28.226.XX</p>
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * <p>The source port.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder srcPortList(String srcPortList) {
                this.srcPortList = srcPortList;
                return this;
            }

            /**
             * <p>The traffic volume in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder trafficBytes(Long trafficBytes) {
                this.trafficBytes = trafficBytes;
                return this;
            }

            /**
             * <p>The unique identifier for the event.</p>
             * 
             * <strong>example:</strong>
             * <p>b91035dc-8be4-411d-bec5-e6320af9****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public SdlEventDetailList build() {
                return new SdlEventDetailList(this);
            } 

        } 

    }
}
