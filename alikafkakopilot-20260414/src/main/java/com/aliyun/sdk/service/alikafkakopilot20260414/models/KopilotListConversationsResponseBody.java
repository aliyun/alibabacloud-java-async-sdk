// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

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
 * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
 *
 * <p>KopilotListConversationsResponseBody</p>
 */
public class KopilotListConversationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private KopilotListConversationsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KopilotListConversationsResponseBody create() {
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
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(KopilotListConversationsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned when the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2DF166F2-F581-5254-AAB6-B482083FA7B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public KopilotListConversationsResponseBody build() {
            return new KopilotListConversationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class DestinationQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Remaining")
        private Long remaining;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private DestinationQuota(Builder builder) {
            this.limit = builder.limit;
            this.remaining = builder.remaining;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationQuota create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return remaining
         */
        public Long getRemaining() {
            return this.remaining;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Integer limit; 
            private Long remaining; 
            private Long used; 

            private Builder() {
            } 

            private Builder(DestinationQuota model) {
                this.limit = model.limit;
                this.remaining = model.remaining;
                this.used = model.used;
            } 

            /**
             * <p>The maximum number of tasks or channels allowed, subject to the actual configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The remaining quota, calculated as the limit minus the used quantity. The minimum value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder remaining(Long remaining) {
                this.remaining = remaining;
                return this;
            }

            /**
             * <p>The number of non-deleted notification channels. Disabled channels still consume quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public DestinationQuota build() {
                return new DestinationQuota(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class LastDelivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptedAt")
        private String acceptedAt;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("DeliveryId")
        private String deliveryId;

        @com.aliyun.core.annotation.NameInMap("LastAttemptAt")
        private String lastAttemptAt;

        @com.aliyun.core.annotation.NameInMap("SendKind")
        private String sendKind;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private LastDelivery(Builder builder) {
            this.acceptedAt = builder.acceptedAt;
            this.createdAt = builder.createdAt;
            this.deliveryId = builder.deliveryId;
            this.lastAttemptAt = builder.lastAttemptAt;
            this.sendKind = builder.sendKind;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastDelivery create() {
            return builder().build();
        }

        /**
         * @return acceptedAt
         */
        public String getAcceptedAt() {
            return this.acceptedAt;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deliveryId
         */
        public String getDeliveryId() {
            return this.deliveryId;
        }

        /**
         * @return lastAttemptAt
         */
        public String getLastAttemptAt() {
            return this.lastAttemptAt;
        }

        /**
         * @return sendKind
         */
        public String getSendKind() {
            return this.sendKind;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String acceptedAt; 
            private String createdAt; 
            private String deliveryId; 
            private String lastAttemptAt; 
            private String sendKind; 
            private String status; 

            private Builder() {
            } 

            private Builder(LastDelivery model) {
                this.acceptedAt = model.acceptedAt;
                this.createdAt = model.createdAt;
                this.deliveryId = model.deliveryId;
                this.lastAttemptAt = model.lastAttemptAt;
                this.sendKind = model.sendKind;
                this.status = model.status;
            } 

            /**
             * <p>The time when the notification service accepted the delivery, in UTC ISO 8601 format. This field is empty if the delivery has not been accepted.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:01:00Z</p>
             */
            public Builder acceptedAt(String acceptedAt) {
                this.acceptedAt = acceptedAt;
                return this;
            }

            /**
             * <p>The time when the record was created, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The unique identifier of the delivery record.</p>
             * 
             * <strong>example:</strong>
             * <p>dlv_0123456789abcdef0123456789abcdef</p>
             */
            public Builder deliveryId(String deliveryId) {
                this.deliveryId = deliveryId;
                return this;
            }

            /**
             * <p>The time of the most recent delivery attempt, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:01:00Z</p>
             */
            public Builder lastAttemptAt(String lastAttemptAt) {
                this.lastAttemptAt = lastAttemptAt;
                return this;
            }

            /**
             * <p>The delivery type. Valid values:</p>
             * <ul>
             * <li>AUTO: automatic delivery.</li>
             * <li>MANUAL: manual delivery.</li>
             * <li>TEST: connectivity test.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
             */
            public Builder sendKind(String sendKind) {
                this.sendKind = sendKind;
                return this;
            }

            /**
             * <p>The most recent delivery status. ACCEPTED indicates that the notification service has accepted the delivery, but does not mean the recipient has read it.</p>
             * 
             * <strong>example:</strong>
             * <p>ACCEPTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LastDelivery build() {
                return new LastDelivery(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("DestinationId")
        private String destinationId;

        @com.aliyun.core.annotation.NameInMap("LastDelivery")
        private LastDelivery lastDelivery;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Items(Builder builder) {
            this.createdAt = builder.createdAt;
            this.destinationId = builder.destinationId;
            this.lastDelivery = builder.lastDelivery;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
            this.updatedAt = builder.updatedAt;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return destinationId
         */
        public String getDestinationId() {
            return this.destinationId;
        }

        /**
         * @return lastDelivery
         */
        public LastDelivery getLastDelivery() {
            return this.lastDelivery;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createdAt; 
            private String destinationId; 
            private LastDelivery lastDelivery; 
            private String name; 
            private String status; 
            private String type; 
            private String updatedAt; 
            private Long version; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createdAt = model.createdAt;
                this.destinationId = model.destinationId;
                this.lastDelivery = model.lastDelivery;
                this.name = model.name;
                this.status = model.status;
                this.type = model.type;
                this.updatedAt = model.updatedAt;
                this.version = model.version;
            } 

            /**
             * <p>The time when the record was created, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The unique identifier of the notification channel.</p>
             * 
             * <strong>example:</strong>
             * <p>dst_0123456789abcdef0123456789abcdef</p>
             */
            public Builder destinationId(String destinationId) {
                this.destinationId = destinationId;
                return this;
            }

            /**
             * <p>The most recent delivery record. This field is empty if no delivery has been made.</p>
             */
            public Builder lastDelivery(LastDelivery lastDelivery) {
                this.lastDelivery = lastDelivery;
                return this;
            }

            /**
             * <p>The name of the notification channel.</p>
             * 
             * <strong>example:</strong>
             * <p>Inspection Notification Group</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The configuration status of the channel. Valid values:</p>
             * <ul>
             * <li>ACTIVE: enabled.</li>
             * <li>DISABLED: disabled.
             * Being enabled does not indicate that a delivery has been successfully sent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the notification channel. DINGTALK_WEBHOOK indicates a DingTalk custom chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>DINGTALK_WEBHOOK</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the record was last updated, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:00:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The version number used for concurrent update verification of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class Destinations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("NextCursor")
        private String nextCursor;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Destinations(Builder builder) {
            this.hasMore = builder.hasMore;
            this.items = builder.items;
            this.nextCursor = builder.nextCursor;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destinations create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return nextCursor
         */
        public String getNextCursor() {
            return this.nextCursor;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List<Items> items; 
            private String nextCursor; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Destinations model) {
                this.hasMore = model.hasMore;
                this.items = model.items;
                this.nextCursor = model.nextCursor;
                this.total = model.total;
            } 

            /**
             * <p>Indicates whether more pages are available.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The list of tasks or notification channels on the current page.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The cursor for the next page. This field is empty if no more pages are available.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder nextCursor(String nextCursor) {
                this.nextCursor = nextCursor;
                return this;
            }

            /**
             * <p>The total number of non-deleted records in the list.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Destinations build() {
                return new Destinations(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Remaining")
        private Long remaining;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private Quota(Builder builder) {
            this.limit = builder.limit;
            this.remaining = builder.remaining;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return remaining
         */
        public Long getRemaining() {
            return this.remaining;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Integer limit; 
            private Long remaining; 
            private Long used; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.limit = model.limit;
                this.remaining = model.remaining;
                this.used = model.used;
            } 

            /**
             * <p>The maximum number of tasks or channels allowed, subject to the actual configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The remaining quota, calculated as the limit minus the used quantity. The minimum value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder remaining(Long remaining) {
                this.remaining = remaining;
                return this;
            }

            /**
             * <p>The number of task quota slots consumed. Tasks in DRAFT, ENABLED, PAUSED, or NEEDS_AUTH status are counted. Completed and deleted tasks do not consume quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class ActiveRun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ActiveRun(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.finishedAt = builder.finishedAt;
            this.runId = builder.runId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActiveRun create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String finishedAt; 
            private String runId; 
            private String status; 

            private Builder() {
            } 

            private Builder(ActiveRun model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.finishedAt = model.finishedAt;
                this.runId = model.runId;
                this.status = model.status;
            } 

            /**
             * <p>The error code of a failed run. This field is empty if no error occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>UPSTREAM_TIMEOUT</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The user-facing failure reason. This field is empty if no error occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>Model or tool calling invoke timed out. Try again later</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The time when the run finished, in UTC ISO 8601 format. This field is typically empty for queued or running executions.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:01:00Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The unique identifier of a single run.</p>
             * 
             * <strong>example:</strong>
             * <p>run_0123456789abcdef0123456789abcdef</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The status of a single run. Valid values:</p>
             * <ul>
             * <li>QUEUED: queued.</li>
             * <li>RUNNING: running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ActiveRun build() {
                return new ActiveRun(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("DestinationIds")
        private java.util.List<String> destinationIds;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("Instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("IntervalSeconds")
        private Integer intervalSeconds;

        @com.aliyun.core.annotation.NameInMap("MaxRunSeconds")
        private Integer maxRunSeconds;

        @com.aliyun.core.annotation.NameInMap("MaxTokens")
        private Long maxTokens;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceMode")
        private String resourceMode;

        @com.aliyun.core.annotation.NameInMap("RunAt")
        private String runAt;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("SessionMode")
        private String sessionMode;

        @com.aliyun.core.annotation.NameInMap("TargetSessionId")
        private String targetSessionId;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        private Configuration(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.destinationIds = builder.destinationIds;
            this.instanceIds = builder.instanceIds;
            this.instruction = builder.instruction;
            this.intervalSeconds = builder.intervalSeconds;
            this.maxRunSeconds = builder.maxRunSeconds;
            this.maxTokens = builder.maxTokens;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.resourceMode = builder.resourceMode;
            this.runAt = builder.runAt;
            this.scheduleType = builder.scheduleType;
            this.sessionMode = builder.sessionMode;
            this.targetSessionId = builder.targetSessionId;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return destinationIds
         */
        public java.util.List<String> getDestinationIds() {
            return this.destinationIds;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return intervalSeconds
         */
        public Integer getIntervalSeconds() {
            return this.intervalSeconds;
        }

        /**
         * @return maxRunSeconds
         */
        public Integer getMaxRunSeconds() {
            return this.maxRunSeconds;
        }

        /**
         * @return maxTokens
         */
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceMode
         */
        public String getResourceMode() {
            return this.resourceMode;
        }

        /**
         * @return runAt
         */
        public String getRunAt() {
            return this.runAt;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return sessionMode
         */
        public String getSessionMode() {
            return this.sessionMode;
        }

        /**
         * @return targetSessionId
         */
        public String getTargetSessionId() {
            return this.targetSessionId;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String cronExpression; 
            private java.util.List<String> destinationIds; 
            private java.util.List<String> instanceIds; 
            private String instruction; 
            private Integer intervalSeconds; 
            private Integer maxRunSeconds; 
            private Long maxTokens; 
            private String name; 
            private String regionId; 
            private String resourceMode; 
            private String runAt; 
            private String scheduleType; 
            private String sessionMode; 
            private String targetSessionId; 
            private String timezone; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.cronExpression = model.cronExpression;
                this.destinationIds = model.destinationIds;
                this.instanceIds = model.instanceIds;
                this.instruction = model.instruction;
                this.intervalSeconds = model.intervalSeconds;
                this.maxRunSeconds = model.maxRunSeconds;
                this.maxTokens = model.maxTokens;
                this.name = model.name;
                this.regionId = model.regionId;
                this.resourceMode = model.resourceMode;
                this.runAt = model.runAt;
                this.scheduleType = model.scheduleType;
                this.sessionMode = model.sessionMode;
                this.targetSessionId = model.targetSessionId;
                this.timezone = model.timezone;
            } 

            /**
             * <p>The six-field cron expression with the seconds field fixed to 0. This field is used only for the CRON schedule type.</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The list of notification channel IDs that receive task results. A maximum of 3 IDs are supported.</p>
             */
            public Builder destinationIds(java.util.List<String> destinationIds) {
                this.destinationIds = destinationIds;
                return this;
            }

            /**
             * <p>The list of instance IDs within the query scope.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The instruction for the scheduled task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>Query the current risks of the specified instances and summarize the results</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>The fixed interval in seconds. Valid values: 900 to 31536000. This field is used only for the FIXED_INTERVAL schedule type.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder intervalSeconds(Integer intervalSeconds) {
                this.intervalSeconds = intervalSeconds;
                return this;
            }

            /**
             * <p>The time budget for a single task run, in seconds. Default value: 600. Valid values: 30 to 1800.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder maxRunSeconds(Integer maxRunSeconds) {
                this.maxRunSeconds = maxRunSeconds;
                return this;
            }

            /**
             * <p>The token budget for a single task run. Default value: 3000000. Valid values: 1000 to 10000000.</p>
             * 
             * <strong>example:</strong>
             * <p>3000000</p>
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>The name of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Kafka Resource Inspection</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region where the queried resources reside.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource scope mode. Valid values:</p>
             * <ul>
             * <li>ACCOUNT: account-level query.</li>
             * <li>NONE: no resource task.</li>
             * <li>EXPLICIT: specified instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACCOUNT</p>
             */
            public Builder resourceMode(String resourceMode) {
                this.resourceMode = resourceMode;
                return this;
            }

            /**
             * <p>The one-time execution time in ISO 8601 format with time zone. This field is used only for the ONCE schedule type.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-18T12:00:00Z</p>
             */
            public Builder runAt(String runAt) {
                this.runAt = runAt;
                return this;
            }

            /**
             * <p>The schedule type. Valid values:</p>
             * <ul>
             * <li>ONCE: one-time execution.</li>
             * <li>CRON: cron expression.</li>
             * <li>FIXED_INTERVAL: fixed interval.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FIXED_INTERVAL</p>
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * <p>The session mode for displaying results. Valid values:</p>
             * <ul>
             * <li>SHARED: shared session.</li>
             * <li>PER_RUN: independent session for each run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SHARED</p>
             */
            public Builder sessionMode(String sessionMode) {
                this.sessionMode = sessionMode;
                return this;
            }

            /**
             * <p>The ID of the target session that stores run results in shared mode.</p>
             * 
             * <strong>example:</strong>
             * <p>00000000-0000-4000-8000-000000000001</p>
             */
            public Builder targetSessionId(String targetSessionId) {
                this.targetSessionId = targetSessionId;
                return this;
            }

            /**
             * <p>The scheduling time zone. Default value: Asia/Shanghai.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class LastCompletedRun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private LastCompletedRun(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.finishedAt = builder.finishedAt;
            this.runId = builder.runId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastCompletedRun create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String finishedAt; 
            private String runId; 
            private String status; 

            private Builder() {
            } 

            private Builder(LastCompletedRun model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.finishedAt = model.finishedAt;
                this.runId = model.runId;
                this.status = model.status;
            } 

            /**
             * <p>The error code of a failed run. This field is empty if no error occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>UPSTREAM_TIMEOUT</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The user-facing failure reason. This field is empty if no error occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>Model or tool calling invoke timed out. Try again later</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The time when the run finished, in UTC ISO 8601 format. This field is empty if the run has not finished.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:01:00Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The unique identifier of a single run.</p>
             * 
             * <strong>example:</strong>
             * <p>run_0123456789abcdef0123456789abcdef</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The status of the most recent completed run. For example, SUCCEEDED indicates success and FAILED indicates failure.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LastCompletedRun build() {
                return new LastCompletedRun(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class TasksItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveRun")
        private ActiveRun activeRun;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        private Configuration configuration;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("LastCompletedRun")
        private LastCompletedRun lastCompletedRun;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextRunAt")
        private String nextRunAt;

        @com.aliyun.core.annotation.NameInMap("ScheduleDescription")
        private String scheduleDescription;

        @com.aliyun.core.annotation.NameInMap("SessionMode")
        private String sessionMode;

        @com.aliyun.core.annotation.NameInMap("SourceSessionId")
        private String sourceSessionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetSessionId")
        private String targetSessionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private TasksItems(Builder builder) {
            this.activeRun = builder.activeRun;
            this.configuration = builder.configuration;
            this.createdAt = builder.createdAt;
            this.lastCompletedRun = builder.lastCompletedRun;
            this.name = builder.name;
            this.nextRunAt = builder.nextRunAt;
            this.scheduleDescription = builder.scheduleDescription;
            this.sessionMode = builder.sessionMode;
            this.sourceSessionId = builder.sourceSessionId;
            this.status = builder.status;
            this.targetSessionId = builder.targetSessionId;
            this.taskId = builder.taskId;
            this.updatedAt = builder.updatedAt;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TasksItems create() {
            return builder().build();
        }

        /**
         * @return activeRun
         */
        public ActiveRun getActiveRun() {
            return this.activeRun;
        }

        /**
         * @return configuration
         */
        public Configuration getConfiguration() {
            return this.configuration;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return lastCompletedRun
         */
        public LastCompletedRun getLastCompletedRun() {
            return this.lastCompletedRun;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextRunAt
         */
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        /**
         * @return scheduleDescription
         */
        public String getScheduleDescription() {
            return this.scheduleDescription;
        }

        /**
         * @return sessionMode
         */
        public String getSessionMode() {
            return this.sessionMode;
        }

        /**
         * @return sourceSessionId
         */
        public String getSourceSessionId() {
            return this.sourceSessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetSessionId
         */
        public String getTargetSessionId() {
            return this.targetSessionId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private ActiveRun activeRun; 
            private Configuration configuration; 
            private String createdAt; 
            private LastCompletedRun lastCompletedRun; 
            private String name; 
            private String nextRunAt; 
            private String scheduleDescription; 
            private String sessionMode; 
            private String sourceSessionId; 
            private String status; 
            private String targetSessionId; 
            private String taskId; 
            private String updatedAt; 
            private Long version; 

            private Builder() {
            } 

            private Builder(TasksItems model) {
                this.activeRun = model.activeRun;
                this.configuration = model.configuration;
                this.createdAt = model.createdAt;
                this.lastCompletedRun = model.lastCompletedRun;
                this.name = model.name;
                this.nextRunAt = model.nextRunAt;
                this.scheduleDescription = model.scheduleDescription;
                this.sessionMode = model.sessionMode;
                this.sourceSessionId = model.sourceSessionId;
                this.status = model.status;
                this.targetSessionId = model.targetSessionId;
                this.taskId = model.taskId;
                this.updatedAt = model.updatedAt;
                this.version = model.version;
            } 

            /**
             * <p>The currently queued or running execution record. This field is empty if no active run exists.</p>
             */
            public Builder activeRun(ActiveRun activeRun) {
                this.activeRun = activeRun;
                return this;
            }

            /**
             * <p>The task execution configuration.</p>
             */
            public Builder configuration(Configuration configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The time when the record was created, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The most recent completed run record, including failed runs. This field is empty if no record exists.</p>
             */
            public Builder lastCompletedRun(LastCompletedRun lastCompletedRun) {
                this.lastCompletedRun = lastCompletedRun;
                return this;
            }

            /**
             * <p>The name of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Kafka Resource Inspection</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The next scheduled execution time, in UTC ISO 8601 format. This field is empty if no next run is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:15:00Z</p>
             */
            public Builder nextRunAt(String nextRunAt) {
                this.nextRunAt = nextRunAt;
                return this;
            }

            /**
             * <p>The human-readable description of the execution schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>Every 900 seconds</p>
             */
            public Builder scheduleDescription(String scheduleDescription) {
                this.scheduleDescription = scheduleDescription;
                return this;
            }

            /**
             * <p>The session mode for displaying results. Valid values:</p>
             * <ul>
             * <li>SHARED: shared session.</li>
             * <li>PER_RUN: independent session for each run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SHARED</p>
             */
            public Builder sessionMode(String sessionMode) {
                this.sessionMode = sessionMode;
                return this;
            }

            /**
             * <p>The ID of the source session from which the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>00000000-0000-4000-8000-000000000001</p>
             */
            public Builder sourceSessionId(String sourceSessionId) {
                this.sourceSessionId = sourceSessionId;
                return this;
            }

            /**
             * <p>The status of the scheduled task. Valid values:</p>
             * <ul>
             * <li>DRAFT: Draft.</li>
             * <li>ENABLED: Enabled.</li>
             * <li>PAUSED: Paused.</li>
             * <li>NEEDS_AUTH: Pending authorization.</li>
             * <li>COMPLETED: Completed.</li>
             * </ul>
             * <p>This status is independent of the running status.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the target session that stores run results in shared mode.</p>
             * 
             * <strong>example:</strong>
             * <p>00000000-0000-4000-8000-000000000001</p>
             */
            public Builder targetSessionId(String targetSessionId) {
                this.targetSessionId = targetSessionId;
                return this;
            }

            /**
             * <p>The unique identifier of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>task_0123456789abcdef0123456789abcdef</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The time when the record was last updated, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:00:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The version number used for concurrent update verification of the current record.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public TasksItems build() {
                return new TasksItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<TasksItems> items;

        @com.aliyun.core.annotation.NameInMap("NextCursor")
        private String nextCursor;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Tasks(Builder builder) {
            this.hasMore = builder.hasMore;
            this.items = builder.items;
            this.nextCursor = builder.nextCursor;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return items
         */
        public java.util.List<TasksItems> getItems() {
            return this.items;
        }

        /**
         * @return nextCursor
         */
        public String getNextCursor() {
            return this.nextCursor;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Boolean hasMore; 
            private java.util.List<TasksItems> items; 
            private String nextCursor; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.hasMore = model.hasMore;
                this.items = model.items;
                this.nextCursor = model.nextCursor;
                this.total = model.total;
            } 

            /**
             * <p>Indicates whether more pages are available.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The list of tasks or notification channels on the current page.</p>
             */
            public Builder items(java.util.List<TasksItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The cursor for the next page. This field is empty if no more pages are available.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder nextCursor(String nextCursor) {
                this.nextCursor = nextCursor;
                return this;
            }

            /**
             * <p>The total number of non-deleted records in the list.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class AutomationOverview extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsOf")
        private String asOf;

        @com.aliyun.core.annotation.NameInMap("DestinationQuota")
        private DestinationQuota destinationQuota;

        @com.aliyun.core.annotation.NameInMap("Destinations")
        private Destinations destinations;

        @com.aliyun.core.annotation.NameInMap("HomeRegion")
        private String homeRegion;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Quota quota;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private Tasks tasks;

        private AutomationOverview(Builder builder) {
            this.asOf = builder.asOf;
            this.destinationQuota = builder.destinationQuota;
            this.destinations = builder.destinations;
            this.homeRegion = builder.homeRegion;
            this.quota = builder.quota;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutomationOverview create() {
            return builder().build();
        }

        /**
         * @return asOf
         */
        public String getAsOf() {
            return this.asOf;
        }

        /**
         * @return destinationQuota
         */
        public DestinationQuota getDestinationQuota() {
            return this.destinationQuota;
        }

        /**
         * @return destinations
         */
        public Destinations getDestinations() {
            return this.destinations;
        }

        /**
         * @return homeRegion
         */
        public String getHomeRegion() {
            return this.homeRegion;
        }

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        /**
         * @return tasks
         */
        public Tasks getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private String asOf; 
            private DestinationQuota destinationQuota; 
            private Destinations destinations; 
            private String homeRegion; 
            private Quota quota; 
            private Tasks tasks; 

            private Builder() {
            } 

            private Builder(AutomationOverview model) {
                this.asOf = model.asOf;
                this.destinationQuota = model.destinationQuota;
                this.destinations = model.destinations;
                this.homeRegion = model.homeRegion;
                this.quota = model.quota;
                this.tasks = model.tasks;
            } 

            /**
             * <p>The time when the overview was generated, in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-17T12:00:00Z</p>
             */
            public Builder asOf(String asOf) {
                this.asOf = asOf;
                return this;
            }

            /**
             * <p>The quota for the number of notification channels of the current primary account in this environment, counted across regions.</p>
             */
            public Builder destinationQuota(DestinationQuota destinationQuota) {
                this.destinationQuota = destinationQuota;
                return this;
            }

            /**
             * <p>The paginated results of notification channels. Webhook URLs and signing keys are not returned.</p>
             */
            public Builder destinations(Destinations destinations) {
                this.destinations = destinations;
                return this;
            }

            /**
             * <p>The home region for tasks and notification channels.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder homeRegion(String homeRegion) {
                this.homeRegion = homeRegion;
                return this;
            }

            /**
             * <p>The quota for the number of scheduled tasks of the current primary account in this environment, counted across regions.</p>
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * <p>The paginated results of scheduled tasks for the account.</p>
             */
            public Builder tasks(Tasks tasks) {
                this.tasks = tasks;
                return this;
            }

            public AutomationOverview build() {
                return new AutomationOverview(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class ScheduledTaskQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Remaining")
        private Long remaining;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private ScheduledTaskQuota(Builder builder) {
            this.limit = builder.limit;
            this.remaining = builder.remaining;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledTaskQuota create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return remaining
         */
        public Long getRemaining() {
            return this.remaining;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private Integer limit; 
            private Long remaining; 
            private Long used; 

            private Builder() {
            } 

            private Builder(ScheduledTaskQuota model) {
                this.limit = model.limit;
                this.remaining = model.remaining;
                this.used = model.used;
            } 

            /**
             * <p>The maximum number of tasks or channels allowed, subject to the actual configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The remaining quota, calculated as the limit minus the used quantity. The minimum value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder remaining(Long remaining) {
                this.remaining = remaining;
                return this;
            }

            /**
             * <p>The number of task quota slots consumed. Tasks in DRAFT, ENABLED, PAUSED, or NEEDS_AUTH status are counted. Completed and deleted tasks do not consume quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public ScheduledTaskQuota build() {
                return new ScheduledTaskQuota(this);
            } 

        } 

    }
    /**
     * 
     * {@link KopilotListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>KopilotListConversationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutomationOverview")
        private AutomationOverview automationOverview;

        @com.aliyun.core.annotation.NameInMap("ConversationIds")
        private java.util.List<String> conversationIds;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("ScheduledTaskInfoBySessionId")
        private java.util.Map<String, DataScheduledTaskInfoBySessionIdValue> scheduledTaskInfoBySessionId;

        @com.aliyun.core.annotation.NameInMap("ScheduledTaskQuota")
        private ScheduledTaskQuota scheduledTaskQuota;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.automationOverview = builder.automationOverview;
            this.conversationIds = builder.conversationIds;
            this.count = builder.count;
            this.page = builder.page;
            this.scheduledTaskInfoBySessionId = builder.scheduledTaskInfoBySessionId;
            this.scheduledTaskQuota = builder.scheduledTaskQuota;
            this.size = builder.size;
            this.total = builder.total;
            this.totalPages = builder.totalPages;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return automationOverview
         */
        public AutomationOverview getAutomationOverview() {
            return this.automationOverview;
        }

        /**
         * @return conversationIds
         */
        public java.util.List<String> getConversationIds() {
            return this.conversationIds;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return scheduledTaskInfoBySessionId
         */
        public java.util.Map<String, DataScheduledTaskInfoBySessionIdValue> getScheduledTaskInfoBySessionId() {
            return this.scheduledTaskInfoBySessionId;
        }

        /**
         * @return scheduledTaskQuota
         */
        public ScheduledTaskQuota getScheduledTaskQuota() {
            return this.scheduledTaskQuota;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private AutomationOverview automationOverview; 
            private java.util.List<String> conversationIds; 
            private Integer count; 
            private Integer page; 
            private java.util.Map<String, DataScheduledTaskInfoBySessionIdValue> scheduledTaskInfoBySessionId; 
            private ScheduledTaskQuota scheduledTaskQuota; 
            private Integer size; 
            private Long total; 
            private Integer totalPages; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.automationOverview = model.automationOverview;
                this.conversationIds = model.conversationIds;
                this.count = model.count;
                this.page = model.page;
                this.scheduledTaskInfoBySessionId = model.scheduledTaskInfoBySessionId;
                this.scheduledTaskQuota = model.scheduledTaskQuota;
                this.size = model.size;
                this.total = model.total;
                this.totalPages = model.totalPages;
                this.userId = model.userId;
            } 

            /**
             * <p>The overview of tasks, notification channels, and quotas for the current account. Returned only when the request includes the overview and the feature is available.</p>
             */
            public Builder automationOverview(AutomationOverview automationOverview) {
                this.automationOverview = automationOverview;
                return this;
            }

            /**
             * <p>The list of session IDs.</p>
             */
            public Builder conversationIds(java.util.List<String> conversationIds) {
                this.conversationIds = conversationIds;
                return this;
            }

            /**
             * <p>The number of entries returned on the current page in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>A mapping that uses session IDs as keys and associated task summaries as values.</p>
             */
            public Builder scheduledTaskInfoBySessionId(java.util.Map<String, DataScheduledTaskInfoBySessionIdValue> scheduledTaskInfoBySessionId) {
                this.scheduledTaskInfoBySessionId = scheduledTaskInfoBySessionId;
                return this;
            }

            /**
             * <p>The quota for the number of scheduled tasks of the current primary account in this environment, counted across regions.</p>
             */
            public Builder scheduledTaskQuota(ScheduledTaskQuota scheduledTaskQuota) {
                this.scheduledTaskQuota = scheduledTaskQuota;
                return this;
            }

            /**
             * <p>The number of entries on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            /**
             * <p>The user UID.</p>
             * 
             * <strong>example:</strong>
             * <p>1734455674565</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
