// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudOutboundObClidReportResponseBody} extends {@link TeaModel}
 *
 * <p>CloudOutboundObClidReportResponseBody</p>
 */
public class CloudOutboundObClidReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudOutboundObClidReportResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudOutboundObClidReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudOutboundObClidReportResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudOutboundObClidReportResponseBody build() {
            return new CloudOutboundObClidReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudOutboundObClidReportResponseBody} extends {@link TeaModel}
     *
     * <p>CloudOutboundObClidReportResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnsweredCount")
        private String answeredCount;

        @com.aliyun.core.annotation.NameInMap("AvgBridgeTime")
        private String avgBridgeTime;

        @com.aliyun.core.annotation.NameInMap("AvgPreviewObWaitTime")
        private Long avgPreviewObWaitTime;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Clid")
        private String clid;

        @com.aliyun.core.annotation.NameInMap("ClidRate")
        private String clidRate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomerBillMinute")
        private Long customerBillMinute;

        @com.aliyun.core.annotation.NameInMap("DateTimeRange")
        private String dateTimeRange;

        @com.aliyun.core.annotation.NameInMap("Day")
        private String day;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Hour")
        private String hour;

        @com.aliyun.core.annotation.NameInMap("MaxBridgeTime")
        private String maxBridgeTime;

        @com.aliyun.core.annotation.NameInMap("MinBridgeTime")
        private String minBridgeTime;

        @com.aliyun.core.annotation.NameInMap("PreviewObCustomerRingingCount")
        private Long previewObCustomerRingingCount;

        @com.aliyun.core.annotation.NameInMap("PreviewObCustomerRingingRate")
        private String previewObCustomerRingingRate;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("RowName")
        private String rowName;

        @com.aliyun.core.annotation.NameInMap("TotalBridgeTime")
        private String totalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        @com.aliyun.core.annotation.NameInMap("TrunkGroupKey")
        private String trunkGroupKey;

        @com.aliyun.core.annotation.NameInMap("ValidAvgBridgeTime")
        private String validAvgBridgeTime;

        @com.aliyun.core.annotation.NameInMap("ValidCalls")
        private String validCalls;

        @com.aliyun.core.annotation.NameInMap("ValidTotalBridgeTime")
        private String validTotalBridgeTime;

        private List(Builder builder) {
            this.answeredCount = builder.answeredCount;
            this.avgBridgeTime = builder.avgBridgeTime;
            this.avgPreviewObWaitTime = builder.avgPreviewObWaitTime;
            this.callType = builder.callType;
            this.city = builder.city;
            this.clid = builder.clid;
            this.clidRate = builder.clidRate;
            this.createTime = builder.createTime;
            this.customerBillMinute = builder.customerBillMinute;
            this.dateTimeRange = builder.dateTimeRange;
            this.day = builder.day;
            this.enterpriseId = builder.enterpriseId;
            this.hour = builder.hour;
            this.maxBridgeTime = builder.maxBridgeTime;
            this.minBridgeTime = builder.minBridgeTime;
            this.previewObCustomerRingingCount = builder.previewObCustomerRingingCount;
            this.previewObCustomerRingingRate = builder.previewObCustomerRingingRate;
            this.province = builder.province;
            this.rowName = builder.rowName;
            this.totalBridgeTime = builder.totalBridgeTime;
            this.totalCount = builder.totalCount;
            this.trunkGroupKey = builder.trunkGroupKey;
            this.validAvgBridgeTime = builder.validAvgBridgeTime;
            this.validCalls = builder.validCalls;
            this.validTotalBridgeTime = builder.validTotalBridgeTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return answeredCount
         */
        public String getAnsweredCount() {
            return this.answeredCount;
        }

        /**
         * @return avgBridgeTime
         */
        public String getAvgBridgeTime() {
            return this.avgBridgeTime;
        }

        /**
         * @return avgPreviewObWaitTime
         */
        public Long getAvgPreviewObWaitTime() {
            return this.avgPreviewObWaitTime;
        }

        /**
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return clid
         */
        public String getClid() {
            return this.clid;
        }

        /**
         * @return clidRate
         */
        public String getClidRate() {
            return this.clidRate;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customerBillMinute
         */
        public Long getCustomerBillMinute() {
            return this.customerBillMinute;
        }

        /**
         * @return dateTimeRange
         */
        public String getDateTimeRange() {
            return this.dateTimeRange;
        }

        /**
         * @return day
         */
        public String getDay() {
            return this.day;
        }

        /**
         * @return enterpriseId
         */
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return hour
         */
        public String getHour() {
            return this.hour;
        }

        /**
         * @return maxBridgeTime
         */
        public String getMaxBridgeTime() {
            return this.maxBridgeTime;
        }

        /**
         * @return minBridgeTime
         */
        public String getMinBridgeTime() {
            return this.minBridgeTime;
        }

        /**
         * @return previewObCustomerRingingCount
         */
        public Long getPreviewObCustomerRingingCount() {
            return this.previewObCustomerRingingCount;
        }

        /**
         * @return previewObCustomerRingingRate
         */
        public String getPreviewObCustomerRingingRate() {
            return this.previewObCustomerRingingRate;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return rowName
         */
        public String getRowName() {
            return this.rowName;
        }

        /**
         * @return totalBridgeTime
         */
        public String getTotalBridgeTime() {
            return this.totalBridgeTime;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return trunkGroupKey
         */
        public String getTrunkGroupKey() {
            return this.trunkGroupKey;
        }

        /**
         * @return validAvgBridgeTime
         */
        public String getValidAvgBridgeTime() {
            return this.validAvgBridgeTime;
        }

        /**
         * @return validCalls
         */
        public String getValidCalls() {
            return this.validCalls;
        }

        /**
         * @return validTotalBridgeTime
         */
        public String getValidTotalBridgeTime() {
            return this.validTotalBridgeTime;
        }

        public static final class Builder {
            private String answeredCount; 
            private String avgBridgeTime; 
            private Long avgPreviewObWaitTime; 
            private String callType; 
            private String city; 
            private String clid; 
            private String clidRate; 
            private String createTime; 
            private Long customerBillMinute; 
            private String dateTimeRange; 
            private String day; 
            private Long enterpriseId; 
            private String hour; 
            private String maxBridgeTime; 
            private String minBridgeTime; 
            private Long previewObCustomerRingingCount; 
            private String previewObCustomerRingingRate; 
            private String province; 
            private String rowName; 
            private String totalBridgeTime; 
            private String totalCount; 
            private String trunkGroupKey; 
            private String validAvgBridgeTime; 
            private String validCalls; 
            private String validTotalBridgeTime; 

            private Builder() {
            } 

            private Builder(List model) {
                this.answeredCount = model.answeredCount;
                this.avgBridgeTime = model.avgBridgeTime;
                this.avgPreviewObWaitTime = model.avgPreviewObWaitTime;
                this.callType = model.callType;
                this.city = model.city;
                this.clid = model.clid;
                this.clidRate = model.clidRate;
                this.createTime = model.createTime;
                this.customerBillMinute = model.customerBillMinute;
                this.dateTimeRange = model.dateTimeRange;
                this.day = model.day;
                this.enterpriseId = model.enterpriseId;
                this.hour = model.hour;
                this.maxBridgeTime = model.maxBridgeTime;
                this.minBridgeTime = model.minBridgeTime;
                this.previewObCustomerRingingCount = model.previewObCustomerRingingCount;
                this.previewObCustomerRingingRate = model.previewObCustomerRingingRate;
                this.province = model.province;
                this.rowName = model.rowName;
                this.totalBridgeTime = model.totalBridgeTime;
                this.totalCount = model.totalCount;
                this.trunkGroupKey = model.trunkGroupKey;
                this.validAvgBridgeTime = model.validAvgBridgeTime;
                this.validCalls = model.validCalls;
                this.validTotalBridgeTime = model.validTotalBridgeTime;
            } 

            /**
             * <p>客户接听数</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder answeredCount(String answeredCount) {
                this.answeredCount = answeredCount;
                return this;
            }

            /**
             * <p>平均通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:02:12</p>
             */
            public Builder avgBridgeTime(String avgBridgeTime) {
                this.avgBridgeTime = avgBridgeTime;
                return this;
            }

            /**
             * <p>平均等待时长</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder avgPreviewObWaitTime(Long avgPreviewObWaitTime) {
                this.avgPreviewObWaitTime = avgPreviewObWaitTime;
                return this;
            }

            /**
             * CallType.
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>外显号码</p>
             * 
             * <strong>example:</strong>
             * <p>01089192349</p>
             */
            public Builder clid(String clid) {
                this.clid = clid;
                return this;
            }

            /**
             * <p>号码接听率</p>
             * 
             * <strong>example:</strong>
             * <p>20%</p>
             */
            public Builder clidRate(String clidRate) {
                this.clidRate = clidRate;
                return this;
            }

            /**
             * <p>创建日期</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 10:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>客户侧计费分钟数</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder customerBillMinute(Long customerBillMinute) {
                this.customerBillMinute = customerBillMinute;
                return this;
            }

            /**
             * <p>时间范围</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder dateTimeRange(String dateTimeRange) {
                this.dateTimeRange = dateTimeRange;
                return this;
            }

            /**
             * <p>报表日期</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20</p>
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

            /**
             * <p>企业Id</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>小时</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hour(String hour) {
                this.hour = hour;
                return this;
            }

            /**
             * <p>最长通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:45</p>
             */
            public Builder maxBridgeTime(String maxBridgeTime) {
                this.maxBridgeTime = maxBridgeTime;
                return this;
            }

            /**
             * <p>最短通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:03</p>
             */
            public Builder minBridgeTime(String minBridgeTime) {
                this.minBridgeTime = minBridgeTime;
                return this;
            }

            /**
             * <p>响铃数</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder previewObCustomerRingingCount(Long previewObCustomerRingingCount) {
                this.previewObCustomerRingingCount = previewObCustomerRingingCount;
                return this;
            }

            /**
             * <p>响铃率</p>
             * 
             * <strong>example:</strong>
             * <p>95%</p>
             */
            public Builder previewObCustomerRingingRate(String previewObCustomerRingingRate) {
                this.previewObCustomerRingingRate = previewObCustomerRingingRate;
                return this;
            }

            /**
             * <p>省份</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>格式化日期</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder rowName(String rowName) {
                this.rowName = rowName;
                return this;
            }

            /**
             * <p>总通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:08:48</p>
             */
            public Builder totalBridgeTime(String totalBridgeTime) {
                this.totalBridgeTime = totalBridgeTime;
                return this;
            }

            /**
             * <p>外呼总数</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>中继群组代号</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder trunkGroupKey(String trunkGroupKey) {
                this.trunkGroupKey = trunkGroupKey;
                return this;
            }

            /**
             * <p>有效通话平均时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:21</p>
             */
            public Builder validAvgBridgeTime(String validAvgBridgeTime) {
                this.validAvgBridgeTime = validAvgBridgeTime;
                return this;
            }

            /**
             * <p>有效通话次数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder validCalls(String validCalls) {
                this.validCalls = validCalls;
                return this;
            }

            /**
             * <p>有效通话总时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:42</p>
             */
            public Builder validTotalBridgeTime(String validTotalBridgeTime) {
                this.validTotalBridgeTime = validTotalBridgeTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudOutboundObClidReportResponseBody} extends {@link TeaModel}
     *
     * <p>CloudOutboundObClidReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private Data(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List<List> list; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
            } 

            /**
             * <p>返回数据</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
