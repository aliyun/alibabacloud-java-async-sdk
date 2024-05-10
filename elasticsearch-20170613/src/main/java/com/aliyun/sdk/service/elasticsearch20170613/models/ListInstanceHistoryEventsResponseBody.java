// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Result> result;

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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Headers.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListInstanceHistoryEventsResponseBody build() {
            return new ListInstanceHistoryEventsResponseBody(this);
        } 

    } 

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

            /**
             * X-Total-Count.
             */
            public Builder xTotalCount(Long xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            /**
             * X-Total-Failed.
             */
            public Builder xTotalFailed(Long xTotalFailed) {
                this.xTotalFailed = xTotalFailed;
                return this;
            }

            /**
             * X-Total-Success.
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

            /**
             * ecsId.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * eventCreateTime.
             */
            public Builder eventCreateTime(String eventCreateTime) {
                this.eventCreateTime = eventCreateTime;
                return this;
            }

            /**
             * eventCycleStatus.
             */
            public Builder eventCycleStatus(String eventCycleStatus) {
                this.eventCycleStatus = eventCycleStatus;
                return this;
            }

            /**
             * eventExecuteTime.
             */
            public Builder eventExecuteTime(String eventExecuteTime) {
                this.eventExecuteTime = eventExecuteTime;
                return this;
            }

            /**
             * eventFinashTime.
             */
            public Builder eventFinashTime(String eventFinashTime) {
                this.eventFinashTime = eventFinashTime;
                return this;
            }

            /**
             * eventLevel.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * eventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * nodeIP.
             */
            public Builder nodeIP(String nodeIP) {
                this.nodeIP = nodeIP;
                return this;
            }

            /**
             * regionId.
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
