// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceHistoryEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceHistoryEventsResponseBody</p>
 */
public class ListInstanceHistoryEventsResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
        @NameInMap("X-Total-Count")
        private Long xTotalCount;

        @NameInMap("X-Total-Failed")
        private Long xTotalFailed;

        @NameInMap("X-Total-Success")
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
        @NameInMap("actionList")
        private java.util.List < String > actionList;

        @NameInMap("eventCreateTime")
        private String eventCreateTime;

        @NameInMap("eventCycleStatus")
        private String eventCycleStatus;

        @NameInMap("eventExecuteTime")
        private String eventExecuteTime;

        @NameInMap("eventFinashTime")
        private String eventFinashTime;

        @NameInMap("eventLevel")
        private String eventLevel;

        @NameInMap("eventType")
        private String eventType;

        @NameInMap("id")
        private String id;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("nodeIP")
        private String nodeIP;

        @NameInMap("regionId")
        private String regionId;

        private Result(Builder builder) {
            this.actionList = builder.actionList;
            this.eventCreateTime = builder.eventCreateTime;
            this.eventCycleStatus = builder.eventCycleStatus;
            this.eventExecuteTime = builder.eventExecuteTime;
            this.eventFinashTime = builder.eventFinashTime;
            this.eventLevel = builder.eventLevel;
            this.eventType = builder.eventType;
            this.id = builder.id;
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
         * @return actionList
         */
        public java.util.List < String > getActionList() {
            return this.actionList;
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
         * @return id
         */
        public String getId() {
            return this.id;
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
            private java.util.List < String > actionList; 
            private String eventCreateTime; 
            private String eventCycleStatus; 
            private String eventExecuteTime; 
            private String eventFinashTime; 
            private String eventLevel; 
            private String eventType; 
            private String id; 
            private String instanceId; 
            private String nodeIP; 
            private String regionId; 

            /**
             * actionList.
             */
            public Builder actionList(java.util.List < String > actionList) {
                this.actionList = actionList;
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
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
