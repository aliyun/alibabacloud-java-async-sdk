// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link GetUrgentDemandItemListResponseBody} extends {@link TeaModel}
 *
 * <p>GetUrgentDemandItemListResponseBody</p>
 */
public class GetUrgentDemandItemListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private GetUrgentDemandItemListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUrgentDemandItemListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(GetUrgentDemandItemListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public GetUrgentDemandItemListResponseBody build() {
            return new GetUrgentDemandItemListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUrgentDemandItemListResponseBody} extends {@link TeaModel}
     *
     * <p>GetUrgentDemandItemListResponseBody</p>
     */
    public static class UrgentDemandEbsRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("commodityNum")
        private Long commodityNum;

        @com.aliyun.core.annotation.NameInMap("commodityTypeCode")
        private String commodityTypeCode;

        @com.aliyun.core.annotation.NameInMap("dataDiskSize")
        private Long dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("performanceLevel")
        private Long performanceLevel;

        private UrgentDemandEbsRequest(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityNum = builder.commodityNum;
            this.commodityTypeCode = builder.commodityTypeCode;
            this.dataDiskSize = builder.dataDiskSize;
            this.itemId = builder.itemId;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrgentDemandEbsRequest create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityNum
         */
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        /**
         * @return commodityTypeCode
         */
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        /**
         * @return dataDiskSize
         */
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return performanceLevel
         */
        public Long getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String commodityCode; 
            private Long commodityNum; 
            private String commodityTypeCode; 
            private Long dataDiskSize; 
            private Long itemId; 
            private Long performanceLevel; 

            private Builder() {
            } 

            private Builder(UrgentDemandEbsRequest model) {
                this.commodityCode = model.commodityCode;
                this.commodityNum = model.commodityNum;
                this.commodityTypeCode = model.commodityTypeCode;
                this.dataDiskSize = model.dataDiskSize;
                this.itemId = model.itemId;
                this.performanceLevel = model.performanceLevel;
            } 

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * commodityNum.
             */
            public Builder commodityNum(Long commodityNum) {
                this.commodityNum = commodityNum;
                return this;
            }

            /**
             * commodityTypeCode.
             */
            public Builder commodityTypeCode(String commodityTypeCode) {
                this.commodityTypeCode = commodityTypeCode;
                return this;
            }

            /**
             * dataDiskSize.
             */
            public Builder dataDiskSize(Long dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * itemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * performanceLevel.
             */
            public Builder performanceLevel(Long performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public UrgentDemandEbsRequest build() {
                return new UrgentDemandEbsRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUrgentDemandItemListResponseBody} extends {@link TeaModel}
     *
     * <p>GetUrgentDemandItemListResponseBody</p>
     */
    public static class UrgentDemandEcsRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("commodityNum")
        private Long commodityNum;

        @com.aliyun.core.annotation.NameInMap("commodityTypeCode")
        private String commodityTypeCode;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("vcpuCount")
        private Long vcpuCount;

        private UrgentDemandEcsRequest(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityNum = builder.commodityNum;
            this.commodityTypeCode = builder.commodityTypeCode;
            this.itemId = builder.itemId;
            this.vcpuCount = builder.vcpuCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrgentDemandEcsRequest create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityNum
         */
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        /**
         * @return commodityTypeCode
         */
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return vcpuCount
         */
        public Long getVcpuCount() {
            return this.vcpuCount;
        }

        public static final class Builder {
            private String commodityCode; 
            private Long commodityNum; 
            private String commodityTypeCode; 
            private Long itemId; 
            private Long vcpuCount; 

            private Builder() {
            } 

            private Builder(UrgentDemandEcsRequest model) {
                this.commodityCode = model.commodityCode;
                this.commodityNum = model.commodityNum;
                this.commodityTypeCode = model.commodityTypeCode;
                this.itemId = model.itemId;
                this.vcpuCount = model.vcpuCount;
            } 

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * commodityNum.
             */
            public Builder commodityNum(Long commodityNum) {
                this.commodityNum = commodityNum;
                return this;
            }

            /**
             * commodityTypeCode.
             */
            public Builder commodityTypeCode(String commodityTypeCode) {
                this.commodityTypeCode = commodityTypeCode;
                return this;
            }

            /**
             * itemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * vcpuCount.
             */
            public Builder vcpuCount(Long vcpuCount) {
                this.vcpuCount = vcpuCount;
                return this;
            }

            public UrgentDemandEcsRequest build() {
                return new UrgentDemandEcsRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUrgentDemandItemListResponseBody} extends {@link TeaModel}
     *
     * <p>GetUrgentDemandItemListResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("commodityNum")
        private Long commodityNum;

        @com.aliyun.core.annotation.NameInMap("commodityTypeCode")
        private String commodityTypeCode;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("effectTime")
        private String effectTime;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("modifierName")
        private String modifierName;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("payDuration")
        private Long payDuration;

        @com.aliyun.core.annotation.NameInMap("payDurationUnit")
        private String payDurationUnit;

        @com.aliyun.core.annotation.NameInMap("payType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("planId")
        private Long planId;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("urgentDemandEbsRequest")
        private UrgentDemandEbsRequest urgentDemandEbsRequest;

        @com.aliyun.core.annotation.NameInMap("urgentDemandEcsRequest")
        private UrgentDemandEcsRequest urgentDemandEcsRequest;

        private Records(Builder builder) {
            this.zone = builder.zone;
            this.accountId = builder.accountId;
            this.commodityCode = builder.commodityCode;
            this.commodityNum = builder.commodityNum;
            this.commodityTypeCode = builder.commodityTypeCode;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.effectTime = builder.effectTime;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.modifier = builder.modifier;
            this.modifierName = builder.modifierName;
            this.networkType = builder.networkType;
            this.payDuration = builder.payDuration;
            this.payDurationUnit = builder.payDurationUnit;
            this.payType = builder.payType;
            this.planId = builder.planId;
            this.region = builder.region;
            this.urgentDemandEbsRequest = builder.urgentDemandEbsRequest;
            this.urgentDemandEcsRequest = builder.urgentDemandEcsRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityNum
         */
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        /**
         * @return commodityTypeCode
         */
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return effectTime
         */
        public String getEffectTime() {
            return this.effectTime;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifierName
         */
        public String getModifierName() {
            return this.modifierName;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return payDuration
         */
        public Long getPayDuration() {
            return this.payDuration;
        }

        /**
         * @return payDurationUnit
         */
        public String getPayDurationUnit() {
            return this.payDurationUnit;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return planId
         */
        public Long getPlanId() {
            return this.planId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return urgentDemandEbsRequest
         */
        public UrgentDemandEbsRequest getUrgentDemandEbsRequest() {
            return this.urgentDemandEbsRequest;
        }

        /**
         * @return urgentDemandEcsRequest
         */
        public UrgentDemandEcsRequest getUrgentDemandEcsRequest() {
            return this.urgentDemandEcsRequest;
        }

        public static final class Builder {
            private String zone; 
            private String accountId; 
            private String commodityCode; 
            private Long commodityNum; 
            private String commodityTypeCode; 
            private String creator; 
            private String creatorName; 
            private String effectTime; 
            private String gmtModified; 
            private Long id; 
            private String modifier; 
            private String modifierName; 
            private String networkType; 
            private Long payDuration; 
            private String payDurationUnit; 
            private String payType; 
            private Long planId; 
            private String region; 
            private UrgentDemandEbsRequest urgentDemandEbsRequest; 
            private UrgentDemandEcsRequest urgentDemandEcsRequest; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.zone = model.zone;
                this.accountId = model.accountId;
                this.commodityCode = model.commodityCode;
                this.commodityNum = model.commodityNum;
                this.commodityTypeCode = model.commodityTypeCode;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.effectTime = model.effectTime;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.modifier = model.modifier;
                this.modifierName = model.modifierName;
                this.networkType = model.networkType;
                this.payDuration = model.payDuration;
                this.payDurationUnit = model.payDurationUnit;
                this.payType = model.payType;
                this.planId = model.planId;
                this.region = model.region;
                this.urgentDemandEbsRequest = model.urgentDemandEbsRequest;
                this.urgentDemandEcsRequest = model.urgentDemandEcsRequest;
            } 

            /**
             * Zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * commodityNum.
             */
            public Builder commodityNum(Long commodityNum) {
                this.commodityNum = commodityNum;
                return this;
            }

            /**
             * commodityTypeCode.
             */
            public Builder commodityTypeCode(String commodityTypeCode) {
                this.commodityTypeCode = commodityTypeCode;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * creatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * effectTime.
             */
            public Builder effectTime(String effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * modifierName.
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * networkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * payDuration.
             */
            public Builder payDuration(Long payDuration) {
                this.payDuration = payDuration;
                return this;
            }

            /**
             * payDurationUnit.
             */
            public Builder payDurationUnit(String payDurationUnit) {
                this.payDurationUnit = payDurationUnit;
                return this;
            }

            /**
             * payType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * planId.
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * urgentDemandEbsRequest.
             */
            public Builder urgentDemandEbsRequest(UrgentDemandEbsRequest urgentDemandEbsRequest) {
                this.urgentDemandEbsRequest = urgentDemandEbsRequest;
                return this;
            }

            /**
             * urgentDemandEcsRequest.
             */
            public Builder urgentDemandEcsRequest(UrgentDemandEcsRequest urgentDemandEcsRequest) {
                this.urgentDemandEcsRequest = urgentDemandEcsRequest;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUrgentDemandItemListResponseBody} extends {@link TeaModel}
     *
     * <p>GetUrgentDemandItemListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("current")
        private Long current;

        @com.aliyun.core.annotation.NameInMap("pages")
        private Long pages;

        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.current = builder.current;
            this.pages = builder.pages;
            this.records = builder.records;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Long getCurrent() {
            return this.current;
        }

        /**
         * @return pages
         */
        public Long getPages() {
            return this.pages;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long current; 
            private Long pages; 
            private java.util.List<Records> records; 
            private Long size; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.current = model.current;
                this.pages = model.pages;
                this.records = model.records;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * current.
             */
            public Builder current(Long current) {
                this.current = current;
                return this;
            }

            /**
             * pages.
             */
            public Builder pages(Long pages) {
                this.pages = pages;
                return this;
            }

            /**
             * records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
