// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link ListCampaignsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCampaignsResponseBody</p>
 */
public class ListCampaignsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCampaignsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCampaignsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
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
        private java.util.List<String> params; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCampaignsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>结果码</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>分页查询结果</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>错误信息参数列表</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>请求是否成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCampaignsResponseBody build() {
            return new ListCampaignsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCampaignsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCampaignsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualEndTime")
        private Long actualEndTime;

        @com.aliyun.core.annotation.NameInMap("ActualStartTime")
        private Long actualStartTime;

        @com.aliyun.core.annotation.NameInMap("CampaignId")
        private String campaignId;

        @com.aliyun.core.annotation.NameInMap("CasesAborted")
        private Integer casesAborted;

        @com.aliyun.core.annotation.NameInMap("CasesConnected")
        private Integer casesConnected;

        @com.aliyun.core.annotation.NameInMap("CasesUncompleted")
        private Integer casesUncompleted;

        @com.aliyun.core.annotation.NameInMap("CasesUncompletedAfterAttempted")
        private Integer casesUncompletedAfterAttempted;

        @com.aliyun.core.annotation.NameInMap("CompletedRate")
        private Double completedRate;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("FixedQuota")
        private Integer fixedQuota;

        @com.aliyun.core.annotation.NameInMap("MaxAttemptCount")
        private Integer maxAttemptCount;

        @com.aliyun.core.annotation.NameInMap("MinAttemptInterval")
        private Integer minAttemptInterval;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PlannedEndTime")
        private Long plannedEndTime;

        @com.aliyun.core.annotation.NameInMap("PlannedStartTime")
        private Long plannedStartTime;

        @com.aliyun.core.annotation.NameInMap("RunUntilEndTime")
        private Boolean runUntilEndTime;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TotalCases")
        private Integer totalCases;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private List(Builder builder) {
            this.actualEndTime = builder.actualEndTime;
            this.actualStartTime = builder.actualStartTime;
            this.campaignId = builder.campaignId;
            this.casesAborted = builder.casesAborted;
            this.casesConnected = builder.casesConnected;
            this.casesUncompleted = builder.casesUncompleted;
            this.casesUncompletedAfterAttempted = builder.casesUncompletedAfterAttempted;
            this.completedRate = builder.completedRate;
            this.createdTime = builder.createdTime;
            this.fixedQuota = builder.fixedQuota;
            this.maxAttemptCount = builder.maxAttemptCount;
            this.minAttemptInterval = builder.minAttemptInterval;
            this.name = builder.name;
            this.plannedEndTime = builder.plannedEndTime;
            this.plannedStartTime = builder.plannedStartTime;
            this.runUntilEndTime = builder.runUntilEndTime;
            this.scriptId = builder.scriptId;
            this.state = builder.state;
            this.totalCases = builder.totalCases;
            this.updatedTime = builder.updatedTime;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return actualEndTime
         */
        public Long getActualEndTime() {
            return this.actualEndTime;
        }

        /**
         * @return actualStartTime
         */
        public Long getActualStartTime() {
            return this.actualStartTime;
        }

        /**
         * @return campaignId
         */
        public String getCampaignId() {
            return this.campaignId;
        }

        /**
         * @return casesAborted
         */
        public Integer getCasesAborted() {
            return this.casesAborted;
        }

        /**
         * @return casesConnected
         */
        public Integer getCasesConnected() {
            return this.casesConnected;
        }

        /**
         * @return casesUncompleted
         */
        public Integer getCasesUncompleted() {
            return this.casesUncompleted;
        }

        /**
         * @return casesUncompletedAfterAttempted
         */
        public Integer getCasesUncompletedAfterAttempted() {
            return this.casesUncompletedAfterAttempted;
        }

        /**
         * @return completedRate
         */
        public Double getCompletedRate() {
            return this.completedRate;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return fixedQuota
         */
        public Integer getFixedQuota() {
            return this.fixedQuota;
        }

        /**
         * @return maxAttemptCount
         */
        public Integer getMaxAttemptCount() {
            return this.maxAttemptCount;
        }

        /**
         * @return minAttemptInterval
         */
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return plannedEndTime
         */
        public Long getPlannedEndTime() {
            return this.plannedEndTime;
        }

        /**
         * @return plannedStartTime
         */
        public Long getPlannedStartTime() {
            return this.plannedStartTime;
        }

        /**
         * @return runUntilEndTime
         */
        public Boolean getRunUntilEndTime() {
            return this.runUntilEndTime;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return totalCases
         */
        public Integer getTotalCases() {
            return this.totalCases;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Long actualEndTime; 
            private Long actualStartTime; 
            private String campaignId; 
            private Integer casesAborted; 
            private Integer casesConnected; 
            private Integer casesUncompleted; 
            private Integer casesUncompletedAfterAttempted; 
            private Double completedRate; 
            private Long createdTime; 
            private Integer fixedQuota; 
            private Integer maxAttemptCount; 
            private Integer minAttemptInterval; 
            private String name; 
            private Long plannedEndTime; 
            private Long plannedStartTime; 
            private Boolean runUntilEndTime; 
            private String scriptId; 
            private String state; 
            private Integer totalCases; 
            private Long updatedTime; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(List model) {
                this.actualEndTime = model.actualEndTime;
                this.actualStartTime = model.actualStartTime;
                this.campaignId = model.campaignId;
                this.casesAborted = model.casesAborted;
                this.casesConnected = model.casesConnected;
                this.casesUncompleted = model.casesUncompleted;
                this.casesUncompletedAfterAttempted = model.casesUncompletedAfterAttempted;
                this.completedRate = model.completedRate;
                this.createdTime = model.createdTime;
                this.fixedQuota = model.fixedQuota;
                this.maxAttemptCount = model.maxAttemptCount;
                this.minAttemptInterval = model.minAttemptInterval;
                this.name = model.name;
                this.plannedEndTime = model.plannedEndTime;
                this.plannedStartTime = model.plannedStartTime;
                this.runUntilEndTime = model.runUntilEndTime;
                this.scriptId = model.scriptId;
                this.state = model.state;
                this.totalCases = model.totalCases;
                this.updatedTime = model.updatedTime;
                this.weight = model.weight;
            } 

            /**
             * <p>实际结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1634008800000</p>
             */
            public Builder actualEndTime(Long actualEndTime) {
                this.actualEndTime = actualEndTime;
                return this;
            }

            /**
             * <p>实际开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1634008800000</p>
             */
            public Builder actualStartTime(Long actualStartTime) {
                this.actualStartTime = actualStartTime;
                return this;
            }

            /**
             * <p>活动ID</p>
             * 
             * <strong>example:</strong>
             * <p>7607dae1-91ad-47ea-ad76-3d81ac34f729</p>
             */
            public Builder campaignId(String campaignId) {
                this.campaignId = campaignId;
                return this;
            }

            /**
             * <p>已终止的case数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder casesAborted(Integer casesAborted) {
                this.casesAborted = casesAborted;
                return this;
            }

            /**
             * <p>已接通的case数</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder casesConnected(Integer casesConnected) {
                this.casesConnected = casesConnected;
                return this;
            }

            /**
             * <p>未完成的case数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder casesUncompleted(Integer casesUncompleted) {
                this.casesUncompleted = casesUncompleted;
                return this;
            }

            /**
             * <p>已尝试但未完成的case数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder casesUncompletedAfterAttempted(Integer casesUncompletedAfterAttempted) {
                this.casesUncompletedAfterAttempted = casesUncompletedAfterAttempted;
                return this;
            }

            /**
             * <p>完成率</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder completedRate(Double completedRate) {
                this.completedRate = completedRate;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-27T11:25:15+08:00</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>固定并发数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fixedQuota(Integer fixedQuota) {
                this.fixedQuota = fixedQuota;
                return this;
            }

            /**
             * <p>最大重试次数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxAttemptCount(Integer maxAttemptCount) {
                this.maxAttemptCount = maxAttemptCount;
                return this;
            }

            /**
             * <p>最小重试间隔</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder minAttemptInterval(Integer minAttemptInterval) {
                this.minAttemptInterval = minAttemptInterval;
                return this;
            }

            /**
             * <p>活动名称</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>计划结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1634008800000</p>
             */
            public Builder plannedEndTime(Long plannedEndTime) {
                this.plannedEndTime = plannedEndTime;
                return this;
            }

            /**
             * <p>计划开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1634008800000</p>
             */
            public Builder plannedStartTime(Long plannedStartTime) {
                this.plannedStartTime = plannedStartTime;
                return this;
            }

            /**
             * <p>联系人均拨打完成时是否持续执行至活动结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder runUntilEndTime(Boolean runUntilEndTime) {
                this.runUntilEndTime = runUntilEndTime;
                return this;
            }

            /**
             * <p>IVR流程ID</p>
             * 
             * <strong>example:</strong>
             * <p>8a988bd4-6c6e-45c6-b3a5-3def5ca3bc6f</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>活动状态</p>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>case总数</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCases(Integer totalCases) {
                this.totalCases = totalCases;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1760272478</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>活动权重</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCampaignsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCampaignsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
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
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>外呼活动列表</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>页码</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>每页数量</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>总数</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
