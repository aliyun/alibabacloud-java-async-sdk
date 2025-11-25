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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SdlEventDetailList.
         */
        public Builder sdlEventDetailList(java.util.List<SdlEventDetailList> sdlEventDetailList) {
            this.sdlEventDetailList = sdlEventDetailList;
            return this;
        }

        /**
         * TotalCount.
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
             * AssetName.
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * AssetPrivateIp.
             */
            public Builder assetPrivateIp(String assetPrivateIp) {
                this.assetPrivateIp = assetPrivateIp;
                return this;
            }

            /**
             * AssetType.
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * CategoryClassId.
             */
            public Builder categoryClassId(String categoryClassId) {
                this.categoryClassId = categoryClassId;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * CityId.
             */
            public Builder cityId(String cityId) {
                this.cityId = cityId;
                return this;
            }

            /**
             * CountryId.
             */
            public Builder countryId(String countryId) {
                this.countryId = countryId;
                return this;
            }

            /**
             * DstIp.
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * DstPortList.
             */
            public Builder dstPortList(String dstPortList) {
                this.dstPortList = dstPortList;
                return this;
            }

            /**
             * EventCnt.
             */
            public Builder eventCnt(Long eventCnt) {
                this.eventCnt = eventCnt;
                return this;
            }

            /**
             * EventLevel.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * FirstTime.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * LastTime.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * LocationName.
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * Payload.
             */
            public Builder payload(String payload) {
                this.payload = payload;
                return this;
            }

            /**
             * ProtoList.
             */
            public Builder protoList(String protoList) {
                this.protoList = protoList;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceIdType.
             */
            public Builder resourceIdType(Integer resourceIdType) {
                this.resourceIdType = resourceIdType;
                return this;
            }

            /**
             * SensitiveDataCnt.
             */
            public Builder sensitiveDataCnt(Long sensitiveDataCnt) {
                this.sensitiveDataCnt = sensitiveDataCnt;
                return this;
            }

            /**
             * SensitiveDataList.
             */
            public Builder sensitiveDataList(java.util.List<String> sensitiveDataList) {
                this.sensitiveDataList = sensitiveDataList;
                return this;
            }

            /**
             * SensitiveLevel.
             */
            public Builder sensitiveLevel(String sensitiveLevel) {
                this.sensitiveLevel = sensitiveLevel;
                return this;
            }

            /**
             * SensitiveType.
             */
            public Builder sensitiveType(String sensitiveType) {
                this.sensitiveType = sensitiveType;
                return this;
            }

            /**
             * SrcIp.
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * SrcPortList.
             */
            public Builder srcPortList(String srcPortList) {
                this.srcPortList = srcPortList;
                return this;
            }

            /**
             * TrafficBytes.
             */
            public Builder trafficBytes(Long trafficBytes) {
                this.trafficBytes = trafficBytes;
                return this;
            }

            /**
             * Uuid.
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
