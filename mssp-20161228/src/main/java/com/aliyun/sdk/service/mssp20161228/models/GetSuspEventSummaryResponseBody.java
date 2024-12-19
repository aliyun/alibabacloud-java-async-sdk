// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetSuspEventSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetSuspEventSummaryResponseBody</p>
 */
public class GetSuspEventSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSuspEventSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSuspEventSummaryResponseBody create() {
        return builder().build();
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>API response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data returned by the interface.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Prompt message for the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9B2DAE9B-B901-5818-AFEF-E5637D938280</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call was successful.</p>
         * <ul>
         * <li>true: Call succeeded.</li>
         * <li>false: Call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSuspEventSummaryResponseBody build() {
            return new GetSuspEventSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSuspEventSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventSummaryResponseBody</p>
     */
    public static class TrendList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DdosCount")
        private Long ddosCount;

        @com.aliyun.core.annotation.NameInMap("EipCount")
        private Long eipCount;

        @com.aliyun.core.annotation.NameInMap("WafCount")
        private Long wafCount;

        private TrendList(Builder builder) {
            this.date = builder.date;
            this.ddosCount = builder.ddosCount;
            this.eipCount = builder.eipCount;
            this.wafCount = builder.wafCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrendList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return ddosCount
         */
        public Long getDdosCount() {
            return this.ddosCount;
        }

        /**
         * @return eipCount
         */
        public Long getEipCount() {
            return this.eipCount;
        }

        /**
         * @return wafCount
         */
        public Long getWafCount() {
            return this.wafCount;
        }

        public static final class Builder {
            private String date; 
            private Long ddosCount; 
            private Long eipCount; 
            private Long wafCount; 

            /**
             * <p>Date.</p>
             * 
             * <strong>example:</strong>
             * <p>202409或20240901</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>DDoS count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ddosCount(Long ddosCount) {
                this.ddosCount = ddosCount;
                return this;
            }

            /**
             * <p>EIP count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder eipCount(Long eipCount) {
                this.eipCount = eipCount;
                return this;
            }

            /**
             * <p>WAF count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder wafCount(Long wafCount) {
                this.wafCount = wafCount;
                return this;
            }

            public TrendList build() {
                return new TrendList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSuspEventSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventSummaryResponseBody</p>
     */
    public static class NetworkAttackTrendDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrendList")
        private java.util.List<TrendList> trendList;

        private NetworkAttackTrendDTO(Builder builder) {
            this.trendList = builder.trendList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAttackTrendDTO create() {
            return builder().build();
        }

        /**
         * @return trendList
         */
        public java.util.List<TrendList> getTrendList() {
            return this.trendList;
        }

        public static final class Builder {
            private java.util.List<TrendList> trendList; 

            /**
             * <p>Collection of trend nodes for each attack item.</p>
             */
            public Builder trendList(java.util.List<TrendList> trendList) {
                this.trendList = trendList;
                return this;
            }

            public NetworkAttackTrendDTO build() {
                return new NetworkAttackTrendDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSuspEventSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventSummaryResponseBody</p>
     */
    public static class SuspEventDealSummaryDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompletedCount")
        private Long completedCount;

        @com.aliyun.core.annotation.NameInMap("HandingCount")
        private Long handingCount;

        @com.aliyun.core.annotation.NameInMap("HandingRate")
        private String handingRate;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalGrowthRate")
        private String totalGrowthRate;

        @com.aliyun.core.annotation.NameInMap("WaitHandleCount")
        private Long waitHandleCount;

        private SuspEventDealSummaryDTO(Builder builder) {
            this.completedCount = builder.completedCount;
            this.handingCount = builder.handingCount;
            this.handingRate = builder.handingRate;
            this.totalCount = builder.totalCount;
            this.totalGrowthRate = builder.totalGrowthRate;
            this.waitHandleCount = builder.waitHandleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspEventDealSummaryDTO create() {
            return builder().build();
        }

        /**
         * @return completedCount
         */
        public Long getCompletedCount() {
            return this.completedCount;
        }

        /**
         * @return handingCount
         */
        public Long getHandingCount() {
            return this.handingCount;
        }

        /**
         * @return handingRate
         */
        public String getHandingRate() {
            return this.handingRate;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalGrowthRate
         */
        public String getTotalGrowthRate() {
            return this.totalGrowthRate;
        }

        /**
         * @return waitHandleCount
         */
        public Long getWaitHandleCount() {
            return this.waitHandleCount;
        }

        public static final class Builder {
            private Long completedCount; 
            private Long handingCount; 
            private String handingRate; 
            private Long totalCount; 
            private String totalGrowthRate; 
            private Long waitHandleCount; 

            /**
             * <p>Completed.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder completedCount(Long completedCount) {
                this.completedCount = completedCount;
                return this;
            }

            /**
             * <p>In progress.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder handingCount(Long handingCount) {
                this.handingCount = handingCount;
                return this;
            }

            /**
             * <p>Alert handling rate.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder handingRate(String handingRate) {
                this.handingRate = handingRate;
                return this;
            }

            /**
             * <p>Total number of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>Year-over-year comparison of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalGrowthRate(String totalGrowthRate) {
                this.totalGrowthRate = totalGrowthRate;
                return this;
            }

            /**
             * <p>Number of unhandled alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder waitHandleCount(Long waitHandleCount) {
                this.waitHandleCount = waitHandleCount;
                return this;
            }

            public SuspEventDealSummaryDTO build() {
                return new SuspEventDealSummaryDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSuspEventSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventSummaryResponseBody</p>
     */
    public static class SuspEventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("TaskCount")
        private Long taskCount;

        private SuspEventList(Builder builder) {
            this.eventName = builder.eventName;
            this.taskCount = builder.taskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspEventList create() {
            return builder().build();
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return taskCount
         */
        public Long getTaskCount() {
            return this.taskCount;
        }

        public static final class Builder {
            private String eventName; 
            private Long taskCount; 

            /**
             * <p>Alert name.</p>
             * 
             * <strong>example:</strong>
             * <p>主动外连风险 IP</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>Count.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder taskCount(Long taskCount) {
                this.taskCount = taskCount;
                return this;
            }

            public SuspEventList build() {
                return new SuspEventList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSuspEventSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventSummaryResponseBody</p>
     */
    public static class SuspEventTopDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SuspEventList")
        private java.util.List<SuspEventList> suspEventList;

        private SuspEventTopDTO(Builder builder) {
            this.suspEventList = builder.suspEventList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspEventTopDTO create() {
            return builder().build();
        }

        /**
         * @return suspEventList
         */
        public java.util.List<SuspEventList> getSuspEventList() {
            return this.suspEventList;
        }

        public static final class Builder {
            private java.util.List<SuspEventList> suspEventList; 

            /**
             * <p>Top 10 before handling alarms</p>
             */
            public Builder suspEventList(java.util.List<SuspEventList> suspEventList) {
                this.suspEventList = suspEventList;
                return this;
            }

            public SuspEventTopDTO build() {
                return new SuspEventTopDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSuspEventSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventSummaryResponseBody</p>
     */
    public static class SuspEventTrendDTOTrendList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DealCount")
        private Long dealCount;

        @com.aliyun.core.annotation.NameInMap("FindCount")
        private Long findCount;

        private SuspEventTrendDTOTrendList(Builder builder) {
            this.date = builder.date;
            this.dealCount = builder.dealCount;
            this.findCount = builder.findCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspEventTrendDTOTrendList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return dealCount
         */
        public Long getDealCount() {
            return this.dealCount;
        }

        /**
         * @return findCount
         */
        public Long getFindCount() {
            return this.findCount;
        }

        public static final class Builder {
            private String date; 
            private Long dealCount; 
            private Long findCount; 

            /**
             * <p>Time point.</p>
             * 
             * <strong>example:</strong>
             * <p>202405或者20240501</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>Number of handled alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dealCount(Long dealCount) {
                this.dealCount = dealCount;
                return this;
            }

            /**
             * <p>Number of discovered alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder findCount(Long findCount) {
                this.findCount = findCount;
                return this;
            }

            public SuspEventTrendDTOTrendList build() {
                return new SuspEventTrendDTOTrendList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSuspEventSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventSummaryResponseBody</p>
     */
    public static class SuspEventTrendDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrendList")
        private java.util.List<SuspEventTrendDTOTrendList> trendList;

        private SuspEventTrendDTO(Builder builder) {
            this.trendList = builder.trendList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspEventTrendDTO create() {
            return builder().build();
        }

        /**
         * @return trendList
         */
        public java.util.List<SuspEventTrendDTOTrendList> getTrendList() {
            return this.trendList;
        }

        public static final class Builder {
            private java.util.List<SuspEventTrendDTOTrendList> trendList; 

            /**
             * <p>Trend of alerts.</p>
             */
            public Builder trendList(java.util.List<SuspEventTrendDTOTrendList> trendList) {
                this.trendList = trendList;
                return this;
            }

            public SuspEventTrendDTO build() {
                return new SuspEventTrendDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSuspEventSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetSuspEventSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkAttackTrendDTO")
        private NetworkAttackTrendDTO networkAttackTrendDTO;

        @com.aliyun.core.annotation.NameInMap("SuspEventDealSummaryDTO")
        private SuspEventDealSummaryDTO suspEventDealSummaryDTO;

        @com.aliyun.core.annotation.NameInMap("SuspEventTopDTO")
        private SuspEventTopDTO suspEventTopDTO;

        @com.aliyun.core.annotation.NameInMap("SuspEventTrendDTO")
        private SuspEventTrendDTO suspEventTrendDTO;

        private Data(Builder builder) {
            this.networkAttackTrendDTO = builder.networkAttackTrendDTO;
            this.suspEventDealSummaryDTO = builder.suspEventDealSummaryDTO;
            this.suspEventTopDTO = builder.suspEventTopDTO;
            this.suspEventTrendDTO = builder.suspEventTrendDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return networkAttackTrendDTO
         */
        public NetworkAttackTrendDTO getNetworkAttackTrendDTO() {
            return this.networkAttackTrendDTO;
        }

        /**
         * @return suspEventDealSummaryDTO
         */
        public SuspEventDealSummaryDTO getSuspEventDealSummaryDTO() {
            return this.suspEventDealSummaryDTO;
        }

        /**
         * @return suspEventTopDTO
         */
        public SuspEventTopDTO getSuspEventTopDTO() {
            return this.suspEventTopDTO;
        }

        /**
         * @return suspEventTrendDTO
         */
        public SuspEventTrendDTO getSuspEventTrendDTO() {
            return this.suspEventTrendDTO;
        }

        public static final class Builder {
            private NetworkAttackTrendDTO networkAttackTrendDTO; 
            private SuspEventDealSummaryDTO suspEventDealSummaryDTO; 
            private SuspEventTopDTO suspEventTopDTO; 
            private SuspEventTrendDTO suspEventTrendDTO; 

            /**
             * <p>Network attack trend.</p>
             */
            public Builder networkAttackTrendDTO(NetworkAttackTrendDTO networkAttackTrendDTO) {
                this.networkAttackTrendDTO = networkAttackTrendDTO;
                return this;
            }

            /**
             * <p>Overview of alert handling.</p>
             */
            public Builder suspEventDealSummaryDTO(SuspEventDealSummaryDTO suspEventDealSummaryDTO) {
                this.suspEventDealSummaryDTO = suspEventDealSummaryDTO;
                return this;
            }

            /**
             * <p>Top 10 alerts before handling.</p>
             */
            public Builder suspEventTopDTO(SuspEventTopDTO suspEventTopDTO) {
                this.suspEventTopDTO = suspEventTopDTO;
                return this;
            }

            /**
             * <p>Trend of alert responses.</p>
             */
            public Builder suspEventTrendDTO(SuspEventTrendDTO suspEventTrendDTO) {
                this.suspEventTrendDTO = suspEventTrendDTO;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
