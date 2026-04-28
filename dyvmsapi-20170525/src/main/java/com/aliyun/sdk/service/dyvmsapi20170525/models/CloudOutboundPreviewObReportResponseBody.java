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
 * {@link CloudOutboundPreviewObReportResponseBody} extends {@link TeaModel}
 *
 * <p>CloudOutboundPreviewObReportResponseBody</p>
 */
public class CloudOutboundPreviewObReportResponseBody extends TeaModel {
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

    private CloudOutboundPreviewObReportResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudOutboundPreviewObReportResponseBody create() {
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

        private Builder(CloudOutboundPreviewObReportResponseBody model) {
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

        public CloudOutboundPreviewObReportResponseBody build() {
            return new CloudOutboundPreviewObReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudOutboundPreviewObReportResponseBody} extends {@link TeaModel}
     *
     * <p>CloudOutboundPreviewObReportResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAnsweredCount")
        private String agentAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("AgentRate")
        private String agentRate;

        @com.aliyun.core.annotation.NameInMap("AvgBridgeTime")
        private String avgBridgeTime;

        @com.aliyun.core.annotation.NameInMap("AxbBothAnsweredCount")
        private String axbBothAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("AxbBothAnsweredRate")
        private String axbBothAnsweredRate;

        @com.aliyun.core.annotation.NameInMap("AxbBothAnsweredTime")
        private String axbBothAnsweredTime;

        @com.aliyun.core.annotation.NameInMap("AxbObTotalCount")
        private String axbObTotalCount;

        @com.aliyun.core.annotation.NameInMap("BothAnsweredCount")
        private String bothAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("BothAnsweredTime")
        private String bothAnsweredTime;

        @com.aliyun.core.annotation.NameInMap("CallBridgedRate")
        private String callBridgedRate;

        @com.aliyun.core.annotation.NameInMap("CallTotalCount")
        private String callTotalCount;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CustomerAnsweredCount")
        private String customerAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("CustomerRate")
        private String customerRate;

        @com.aliyun.core.annotation.NameInMap("DateTimeRange")
        private String dateTimeRange;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("InterceptionCount")
        private String interceptionCount;

        @com.aliyun.core.annotation.NameInMap("InterceptionRate")
        private String interceptionRate;

        @com.aliyun.core.annotation.NameInMap("LandlineBothAnsweredCount")
        private String landlineBothAnsweredCount;

        @com.aliyun.core.annotation.NameInMap("LandlineBothAnsweredRate")
        private String landlineBothAnsweredRate;

        @com.aliyun.core.annotation.NameInMap("LandlineBothAnsweredTime")
        private String landlineBothAnsweredTime;

        @com.aliyun.core.annotation.NameInMap("LandlineObTotalCount")
        private String landlineObTotalCount;

        @com.aliyun.core.annotation.NameInMap("MaxBridgeTime")
        private String maxBridgeTime;

        @com.aliyun.core.annotation.NameInMap("MinBridgeTime")
        private String minBridgeTime;

        @com.aliyun.core.annotation.NameInMap("TotalBridgeTime")
        private String totalBridgeTime;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        @com.aliyun.core.annotation.NameInMap("VadRate")
        private String vadRate;

        @com.aliyun.core.annotation.NameInMap("ValidAvgBridgeTime")
        private String validAvgBridgeTime;

        @com.aliyun.core.annotation.NameInMap("ValidCalls")
        private String validCalls;

        @com.aliyun.core.annotation.NameInMap("ValidTotalBridgeTime")
        private String validTotalBridgeTime;

        private List(Builder builder) {
            this.agentAnsweredCount = builder.agentAnsweredCount;
            this.agentName = builder.agentName;
            this.agentRate = builder.agentRate;
            this.avgBridgeTime = builder.avgBridgeTime;
            this.axbBothAnsweredCount = builder.axbBothAnsweredCount;
            this.axbBothAnsweredRate = builder.axbBothAnsweredRate;
            this.axbBothAnsweredTime = builder.axbBothAnsweredTime;
            this.axbObTotalCount = builder.axbObTotalCount;
            this.bothAnsweredCount = builder.bothAnsweredCount;
            this.bothAnsweredTime = builder.bothAnsweredTime;
            this.callBridgedRate = builder.callBridgedRate;
            this.callTotalCount = builder.callTotalCount;
            this.cno = builder.cno;
            this.customerAnsweredCount = builder.customerAnsweredCount;
            this.customerRate = builder.customerRate;
            this.dateTimeRange = builder.dateTimeRange;
            this.enterpriseId = builder.enterpriseId;
            this.interceptionCount = builder.interceptionCount;
            this.interceptionRate = builder.interceptionRate;
            this.landlineBothAnsweredCount = builder.landlineBothAnsweredCount;
            this.landlineBothAnsweredRate = builder.landlineBothAnsweredRate;
            this.landlineBothAnsweredTime = builder.landlineBothAnsweredTime;
            this.landlineObTotalCount = builder.landlineObTotalCount;
            this.maxBridgeTime = builder.maxBridgeTime;
            this.minBridgeTime = builder.minBridgeTime;
            this.totalBridgeTime = builder.totalBridgeTime;
            this.totalCount = builder.totalCount;
            this.vadRate = builder.vadRate;
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
         * @return agentAnsweredCount
         */
        public String getAgentAnsweredCount() {
            return this.agentAnsweredCount;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return agentRate
         */
        public String getAgentRate() {
            return this.agentRate;
        }

        /**
         * @return avgBridgeTime
         */
        public String getAvgBridgeTime() {
            return this.avgBridgeTime;
        }

        /**
         * @return axbBothAnsweredCount
         */
        public String getAxbBothAnsweredCount() {
            return this.axbBothAnsweredCount;
        }

        /**
         * @return axbBothAnsweredRate
         */
        public String getAxbBothAnsweredRate() {
            return this.axbBothAnsweredRate;
        }

        /**
         * @return axbBothAnsweredTime
         */
        public String getAxbBothAnsweredTime() {
            return this.axbBothAnsweredTime;
        }

        /**
         * @return axbObTotalCount
         */
        public String getAxbObTotalCount() {
            return this.axbObTotalCount;
        }

        /**
         * @return bothAnsweredCount
         */
        public String getBothAnsweredCount() {
            return this.bothAnsweredCount;
        }

        /**
         * @return bothAnsweredTime
         */
        public String getBothAnsweredTime() {
            return this.bothAnsweredTime;
        }

        /**
         * @return callBridgedRate
         */
        public String getCallBridgedRate() {
            return this.callBridgedRate;
        }

        /**
         * @return callTotalCount
         */
        public String getCallTotalCount() {
            return this.callTotalCount;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return customerAnsweredCount
         */
        public String getCustomerAnsweredCount() {
            return this.customerAnsweredCount;
        }

        /**
         * @return customerRate
         */
        public String getCustomerRate() {
            return this.customerRate;
        }

        /**
         * @return dateTimeRange
         */
        public String getDateTimeRange() {
            return this.dateTimeRange;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return interceptionCount
         */
        public String getInterceptionCount() {
            return this.interceptionCount;
        }

        /**
         * @return interceptionRate
         */
        public String getInterceptionRate() {
            return this.interceptionRate;
        }

        /**
         * @return landlineBothAnsweredCount
         */
        public String getLandlineBothAnsweredCount() {
            return this.landlineBothAnsweredCount;
        }

        /**
         * @return landlineBothAnsweredRate
         */
        public String getLandlineBothAnsweredRate() {
            return this.landlineBothAnsweredRate;
        }

        /**
         * @return landlineBothAnsweredTime
         */
        public String getLandlineBothAnsweredTime() {
            return this.landlineBothAnsweredTime;
        }

        /**
         * @return landlineObTotalCount
         */
        public String getLandlineObTotalCount() {
            return this.landlineObTotalCount;
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
         * @return vadRate
         */
        public String getVadRate() {
            return this.vadRate;
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
            private String agentAnsweredCount; 
            private String agentName; 
            private String agentRate; 
            private String avgBridgeTime; 
            private String axbBothAnsweredCount; 
            private String axbBothAnsweredRate; 
            private String axbBothAnsweredTime; 
            private String axbObTotalCount; 
            private String bothAnsweredCount; 
            private String bothAnsweredTime; 
            private String callBridgedRate; 
            private String callTotalCount; 
            private String cno; 
            private String customerAnsweredCount; 
            private String customerRate; 
            private String dateTimeRange; 
            private String enterpriseId; 
            private String interceptionCount; 
            private String interceptionRate; 
            private String landlineBothAnsweredCount; 
            private String landlineBothAnsweredRate; 
            private String landlineBothAnsweredTime; 
            private String landlineObTotalCount; 
            private String maxBridgeTime; 
            private String minBridgeTime; 
            private String totalBridgeTime; 
            private String totalCount; 
            private String vadRate; 
            private String validAvgBridgeTime; 
            private String validCalls; 
            private String validTotalBridgeTime; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentAnsweredCount = model.agentAnsweredCount;
                this.agentName = model.agentName;
                this.agentRate = model.agentRate;
                this.avgBridgeTime = model.avgBridgeTime;
                this.axbBothAnsweredCount = model.axbBothAnsweredCount;
                this.axbBothAnsweredRate = model.axbBothAnsweredRate;
                this.axbBothAnsweredTime = model.axbBothAnsweredTime;
                this.axbObTotalCount = model.axbObTotalCount;
                this.bothAnsweredCount = model.bothAnsweredCount;
                this.bothAnsweredTime = model.bothAnsweredTime;
                this.callBridgedRate = model.callBridgedRate;
                this.callTotalCount = model.callTotalCount;
                this.cno = model.cno;
                this.customerAnsweredCount = model.customerAnsweredCount;
                this.customerRate = model.customerRate;
                this.dateTimeRange = model.dateTimeRange;
                this.enterpriseId = model.enterpriseId;
                this.interceptionCount = model.interceptionCount;
                this.interceptionRate = model.interceptionRate;
                this.landlineBothAnsweredCount = model.landlineBothAnsweredCount;
                this.landlineBothAnsweredRate = model.landlineBothAnsweredRate;
                this.landlineBothAnsweredTime = model.landlineBothAnsweredTime;
                this.landlineObTotalCount = model.landlineObTotalCount;
                this.maxBridgeTime = model.maxBridgeTime;
                this.minBridgeTime = model.minBridgeTime;
                this.totalBridgeTime = model.totalBridgeTime;
                this.totalCount = model.totalCount;
                this.vadRate = model.vadRate;
                this.validAvgBridgeTime = model.validAvgBridgeTime;
                this.validCalls = model.validCalls;
                this.validTotalBridgeTime = model.validTotalBridgeTime;
            } 

            /**
             * <p>座席接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder agentAnsweredCount(String agentAnsweredCount) {
                this.agentAnsweredCount = agentAnsweredCount;
                return this;
            }

            /**
             * <p>座席姓名</p>
             * 
             * <strong>example:</strong>
             * <p>name3</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>座席接听率</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder agentRate(String agentRate) {
                this.agentRate = agentRate;
                return this;
            }

            /**
             * <p>平均通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:12</p>
             */
            public Builder avgBridgeTime(String avgBridgeTime) {
                this.avgBridgeTime = avgBridgeTime;
                return this;
            }

            /**
             * <p>AXB双方接听数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder axbBothAnsweredCount(String axbBothAnsweredCount) {
                this.axbBothAnsweredCount = axbBothAnsweredCount;
                return this;
            }

            /**
             * <p>AXB双方接听率 = AXB双方接听数 / AXB外呼总数</p>
             * 
             * <strong>example:</strong>
             * <p>0%</p>
             */
            public Builder axbBothAnsweredRate(String axbBothAnsweredRate) {
                this.axbBothAnsweredRate = axbBothAnsweredRate;
                return this;
            }

            /**
             * <p>AXB外呼双方接听分钟数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder axbBothAnsweredTime(String axbBothAnsweredTime) {
                this.axbBothAnsweredTime = axbBothAnsweredTime;
                return this;
            }

            /**
             * <p>AXB外呼总数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder axbObTotalCount(String axbObTotalCount) {
                this.axbObTotalCount = axbObTotalCount;
                return this;
            }

            /**
             * <p>双方接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bothAnsweredCount(String bothAnsweredCount) {
                this.bothAnsweredCount = bothAnsweredCount;
                return this;
            }

            /**
             * <p>双方接听时长</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bothAnsweredTime(String bothAnsweredTime) {
                this.bothAnsweredTime = bothAnsweredTime;
                return this;
            }

            /**
             * <p>呼叫接通率</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder callBridgedRate(String callBridgedRate) {
                this.callBridgedRate = callBridgedRate;
                return this;
            }

            /**
             * <p>发起呼叫次数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder callTotalCount(String callTotalCount) {
                this.callTotalCount = callTotalCount;
                return this;
            }

            /**
             * <p>座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>3008</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>客户接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder customerAnsweredCount(String customerAnsweredCount) {
                this.customerAnsweredCount = customerAnsweredCount;
                return this;
            }

            /**
             * <p>客户接听率</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder customerRate(String customerRate) {
                this.customerRate = customerRate;
                return this;
            }

            /**
             * <p>统计周期</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder dateTimeRange(String dateTimeRange) {
                this.dateTimeRange = dateTimeRange;
                return this;
            }

            /**
             * <p>企业Id</p>
             * 
             * <strong>example:</strong>
             * <p>6000001</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>拦截次数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder interceptionCount(String interceptionCount) {
                this.interceptionCount = interceptionCount;
                return this;
            }

            /**
             * <p>拦截率</p>
             * 
             * <strong>example:</strong>
             * <p>0%</p>
             */
            public Builder interceptionRate(String interceptionRate) {
                this.interceptionRate = interceptionRate;
                return this;
            }

            /**
             * <p>固话双方接听数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder landlineBothAnsweredCount(String landlineBothAnsweredCount) {
                this.landlineBothAnsweredCount = landlineBothAnsweredCount;
                return this;
            }

            /**
             * <p>固话双方接听率 = 固话双方接听数 / 固话外呼总数</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder landlineBothAnsweredRate(String landlineBothAnsweredRate) {
                this.landlineBothAnsweredRate = landlineBothAnsweredRate;
                return this;
            }

            /**
             * <p>固话双方接听分钟数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder landlineBothAnsweredTime(String landlineBothAnsweredTime) {
                this.landlineBothAnsweredTime = landlineBothAnsweredTime;
                return this;
            }

            /**
             * <p>固话外呼总数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder landlineObTotalCount(String landlineObTotalCount) {
                this.landlineObTotalCount = landlineObTotalCount;
                return this;
            }

            /**
             * <p>最长通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:14</p>
             */
            public Builder maxBridgeTime(String maxBridgeTime) {
                this.maxBridgeTime = maxBridgeTime;
                return this;
            }

            /**
             * <p>最短通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:11</p>
             */
            public Builder minBridgeTime(String minBridgeTime) {
                this.minBridgeTime = minBridgeTime;
                return this;
            }

            /**
             * <p>总通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:38</p>
             */
            public Builder totalBridgeTime(String totalBridgeTime) {
                this.totalBridgeTime = totalBridgeTime;
                return this;
            }

            /**
             * <p>外呼总数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>通话占比</p>
             * 
             * <strong>example:</strong>
             * <p>0%</p>
             */
            public Builder vadRate(String vadRate) {
                this.vadRate = vadRate;
                return this;
            }

            /**
             * <p>有效通话平均通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:12</p>
             */
            public Builder validAvgBridgeTime(String validAvgBridgeTime) {
                this.validAvgBridgeTime = validAvgBridgeTime;
                return this;
            }

            /**
             * <p>有效通话次数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder validCalls(String validCalls) {
                this.validCalls = validCalls;
                return this;
            }

            /**
             * <p>有效通话总通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:38</p>
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
     * {@link CloudOutboundPreviewObReportResponseBody} extends {@link TeaModel}
     *
     * <p>CloudOutboundPreviewObReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPageCount")
        private String totalPageCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
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

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageCount
         */
        public String getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private String pageSize; 
            private String totalCount; 
            private String totalPageCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.totalPageCount = model.totalPageCount;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>外呼总数</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPageCount.
             */
            public Builder totalPageCount(String totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
