// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListInstanceHistoryEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceHistoryEventsResponseBody</p>
 */
public class ListInstanceHistoryEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListInstanceHistoryEventsResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceHistoryEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListInstanceHistoryEventsResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The response headers.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D1A6830A-F59B-4E05-BFAC-9496C21DBBA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListInstanceHistoryEventsResponseBody build() {
            return new ListInstanceHistoryEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceHistoryEventsResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Long xTotalCount;

        @com.aliyun.core.annotation.NameInMap("X-Total-Failed")
        private Long xTotalFailed;

        @com.aliyun.core.annotation.NameInMap("X-Total-Success")
        private Long xTotalSuccess;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
            this.xTotalFailed = builder.xTotalFailed;
            this.xTotalSuccess = builder.xTotalSuccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Long getXTotalCount() {
            return this.xTotalCount;
        }

        /**
         * @return xTotalFailed
         */
        public Long getXTotalFailed() {
            return this.xTotalFailed;
        }

        /**
         * @return xTotalSuccess
         */
        public Long getXTotalSuccess() {
            return this.xTotalSuccess;
        }

        public static final class Builder {
            private Long xTotalCount; 
            private Long xTotalFailed; 
            private Long xTotalSuccess; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.xTotalCount = model.xTotalCount;
                this.xTotalFailed = model.xTotalFailed;
                this.xTotalSuccess = model.xTotalSuccess;
            } 

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder xTotalCount(Long xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            /**
             * <p>The total number of failures.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder xTotalFailed(Long xTotalFailed) {
                this.xTotalFailed = xTotalFailed;
                return this;
            }

            /**
             * <p>The total number of successes.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder xTotalSuccess(Long xTotalSuccess) {
                this.xTotalSuccess = xTotalSuccess;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceHistoryEventsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ecsId")
        private String ecsId;

        @com.aliyun.core.annotation.NameInMap("eventCreateTime")
        private String eventCreateTime;

        @com.aliyun.core.annotation.NameInMap("eventCycleStatus")
        private String eventCycleStatus;

        @com.aliyun.core.annotation.NameInMap("eventExecuteTime")
        private String eventExecuteTime;

        @com.aliyun.core.annotation.NameInMap("eventFinashTime")
        private String eventFinashTime;

        @com.aliyun.core.annotation.NameInMap("eventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("eventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("nodeIP")
        private String nodeIP;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private Result(Builder builder) {
            this.ecsId = builder.ecsId;
            this.eventCreateTime = builder.eventCreateTime;
            this.eventCycleStatus = builder.eventCycleStatus;
            this.eventExecuteTime = builder.eventExecuteTime;
            this.eventFinashTime = builder.eventFinashTime;
            this.eventLevel = builder.eventLevel;
            this.eventType = builder.eventType;
            this.instanceId = builder.instanceId;
            this.nodeIP = builder.nodeIP;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
        }

        /**
         * @return eventCreateTime
         */
        public String getEventCreateTime() {
            return this.eventCreateTime;
        }

        /**
         * @return eventCycleStatus
         */
        public String getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        /**
         * @return eventExecuteTime
         */
        public String getEventExecuteTime() {
            return this.eventExecuteTime;
        }

        /**
         * @return eventFinashTime
         */
        public String getEventFinashTime() {
            return this.eventFinashTime;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeIP
         */
        public String getNodeIP() {
            return this.nodeIP;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String ecsId; 
            private String eventCreateTime; 
            private String eventCycleStatus; 
            private String eventExecuteTime; 
            private String eventFinashTime; 
            private String eventLevel; 
            private String eventType; 
            private String instanceId; 
            private String nodeIP; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.ecsId = model.ecsId;
                this.eventCreateTime = model.eventCreateTime;
                this.eventCycleStatus = model.eventCycleStatus;
                this.eventExecuteTime = model.eventExecuteTime;
                this.eventFinashTime = model.eventFinashTime;
                this.eventLevel = model.eventLevel;
                this.eventType = model.eventType;
                this.instanceId = model.instanceId;
                this.nodeIP = model.nodeIP;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The ECS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze8s9cjdf2cv969****</p>
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * <p>The event creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-07T00:00:00Z</p>
             */
            public Builder eventCreateTime(String eventCreateTime) {
                this.eventCreateTime = eventCreateTime;
                return this;
            }

            /**
             * <p>The event status. Valid values:</p>
             * <ul>
             * <li>FAILED: failed</li>
             * <li>EXECUTED: executed</li>
             * <li>EXECUTING: executing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXECUTED</p>
             */
            public Builder eventCycleStatus(String eventCycleStatus) {
                this.eventCycleStatus = eventCycleStatus;
                return this;
            }

            /**
             * <p>The event execution time.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-07T00:00:00Z</p>
             */
            public Builder eventExecuteTime(String eventExecuteTime) {
                this.eventExecuteTime = eventExecuteTime;
                return this;
            }

            /**
             * <p>The event completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-07T00:00:00Z</p>
             */
            public Builder eventFinashTime(String eventFinashTime) {
                this.eventFinashTime = eventFinashTime;
                return this;
            }

            /**
             * <p>The event level. Valid values:</p>
             * <ul>
             * <li>INFO: information</li>
             * <li>WARN: warning</li>
             * <li>CRITICAL: critical</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>The event type. Valid values:</p>
             * <ul>
             * <li>ECS:AUTO_RESTART: ECS node automatic restart.</li>
             * <li>Instance:InstanceFailure.Reboot:Executed: ECS instance restart completed (ECS instance error).</li>
             * <li>Instance:InstanceFailure.Reboot:Executing: ECS instance restart started (instance error).</li>
             * <li>Instance:SystemFailure.Reboot:Executed: ECS instance restart completed (system error).</li>
             * <li>Instance:SystemFailure.Reboot:Executing: ECS instance restart started (system error).</li>
             * <li>Instance:SystemFailure.Reboot:Failed: ECS instance restart failed (system error).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS:AUTO_RESTART</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-2r42l7a740005****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the node that generated the event.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.xx.xx</p>
             */
            public Builder nodeIP(String nodeIP) {
                this.nodeIP = nodeIP;
                return this;
            }

            /**
             * <p>The region ID where the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
