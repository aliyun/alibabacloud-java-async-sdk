// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreatePolarClawCronJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolarClawCronJobResponseBody</p>
 */
public class CreatePolarClawCronJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Ok")
    private Boolean ok;

    @com.aliyun.core.annotation.NameInMap("RanImmediately")
    private Boolean ranImmediately;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePolarClawCronJobResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.job = builder.job;
        this.message = builder.message;
        this.ok = builder.ok;
        this.ranImmediately = builder.ranImmediately;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarClawCronJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ok
     */
    public Boolean getOk() {
        return this.ok;
    }

    /**
     * @return ranImmediately
     */
    public Boolean getRanImmediately() {
        return this.ranImmediately;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private Job job; 
        private String message; 
        private Boolean ok; 
        private Boolean ranImmediately; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePolarClawCronJobResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.job = model.job;
            this.message = model.message;
            this.ok = model.ok;
            this.ranImmediately = model.ranImmediately;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Job.
         */
        public Builder job(Job job) {
            this.job = job;
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
         * Ok.
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
            return this;
        }

        /**
         * RanImmediately.
         */
        public Builder ranImmediately(Boolean ranImmediately) {
            this.ranImmediately = ranImmediately;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePolarClawCronJobResponseBody build() {
            return new CreatePolarClawCronJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolarClawCronJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobResponseBody</p>
     */
    public static class Delivery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("BestEffort")
        private Boolean bestEffort;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        private Delivery(Builder builder) {
            this.accountId = builder.accountId;
            this.bestEffort = builder.bestEffort;
            this.channel = builder.channel;
            this.mode = builder.mode;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delivery create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return bestEffort
         */
        public Boolean getBestEffort() {
            return this.bestEffort;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return to
         */
        public String getTo() {
            return this.to;
        }

        public static final class Builder {
            private String accountId; 
            private Boolean bestEffort; 
            private String channel; 
            private String mode; 
            private String to; 

            private Builder() {
            } 

            private Builder(Delivery model) {
                this.accountId = model.accountId;
                this.bestEffort = model.bestEffort;
                this.channel = model.channel;
                this.mode = model.mode;
                this.to = model.to;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * BestEffort.
             */
            public Builder bestEffort(Boolean bestEffort) {
                this.bestEffort = bestEffort;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * To.
             */
            public Builder to(String to) {
                this.to = to;
                return this;
            }

            public Delivery build() {
                return new Delivery(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolarClawCronJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BestEffortDeliver")
        private Boolean bestEffortDeliver;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("Deliver")
        private Boolean deliver;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("LightContext")
        private Boolean lightContext;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        private Payload(Builder builder) {
            this.bestEffortDeliver = builder.bestEffortDeliver;
            this.channel = builder.channel;
            this.deliver = builder.deliver;
            this.kind = builder.kind;
            this.lightContext = builder.lightContext;
            this.message = builder.message;
            this.model = builder.model;
            this.text = builder.text;
            this.timeoutSeconds = builder.timeoutSeconds;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return bestEffortDeliver
         */
        public Boolean getBestEffortDeliver() {
            return this.bestEffortDeliver;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return deliver
         */
        public Boolean getDeliver() {
            return this.deliver;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return lightContext
         */
        public Boolean getLightContext() {
            return this.lightContext;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return timeoutSeconds
         */
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        /**
         * @return to
         */
        public String getTo() {
            return this.to;
        }

        public static final class Builder {
            private Boolean bestEffortDeliver; 
            private String channel; 
            private Boolean deliver; 
            private String kind; 
            private Boolean lightContext; 
            private String message; 
            private String model; 
            private String text; 
            private Integer timeoutSeconds; 
            private String to; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.bestEffortDeliver = model.bestEffortDeliver;
                this.channel = model.channel;
                this.deliver = model.deliver;
                this.kind = model.kind;
                this.lightContext = model.lightContext;
                this.message = model.message;
                this.model = model.model;
                this.text = model.text;
                this.timeoutSeconds = model.timeoutSeconds;
                this.to = model.to;
            } 

            /**
             * BestEffortDeliver.
             */
            public Builder bestEffortDeliver(Boolean bestEffortDeliver) {
                this.bestEffortDeliver = bestEffortDeliver;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * Deliver.
             */
            public Builder deliver(Boolean deliver) {
                this.deliver = deliver;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * LightContext.
             */
            public Builder lightContext(Boolean lightContext) {
                this.lightContext = lightContext;
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
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * TimeoutSeconds.
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            /**
             * To.
             */
            public Builder to(String to) {
                this.to = to;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolarClawCronJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Integer outputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
        private Integer totalTokens;

        private Usage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Integer inputTokens; 
            private Integer outputTokens; 
            private Integer totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * InputTokens.
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * TotalTokens.
             */
            public Builder totalTokens(Integer totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolarClawCronJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobResponseBody</p>
     */
    public static class Runs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Delivered")
        private Boolean delivered;

        @com.aliyun.core.annotation.NameInMap("DeliveryStatus")
        private String deliveryStatus;

        @com.aliyun.core.annotation.NameInMap("DurationMs")
        private Long durationMs;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("NextRunAtMs")
        private Long nextRunAtMs;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("RunAtMs")
        private Long runAtMs;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private Long ts;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        private Runs(Builder builder) {
            this.action = builder.action;
            this.delivered = builder.delivered;
            this.deliveryStatus = builder.deliveryStatus;
            this.durationMs = builder.durationMs;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.model = builder.model;
            this.nextRunAtMs = builder.nextRunAtMs;
            this.provider = builder.provider;
            this.runAtMs = builder.runAtMs;
            this.sessionId = builder.sessionId;
            this.status = builder.status;
            this.summary = builder.summary;
            this.ts = builder.ts;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runs create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return delivered
         */
        public Boolean getDelivered() {
            return this.delivered;
        }

        /**
         * @return deliveryStatus
         */
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

        /**
         * @return durationMs
         */
        public Long getDurationMs() {
            return this.durationMs;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return nextRunAtMs
         */
        public Long getNextRunAtMs() {
            return this.nextRunAtMs;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return runAtMs
         */
        public Long getRunAtMs() {
            return this.runAtMs;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return ts
         */
        public Long getTs() {
            return this.ts;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String action; 
            private Boolean delivered; 
            private String deliveryStatus; 
            private Long durationMs; 
            private String jobId; 
            private String jobName; 
            private String model; 
            private Long nextRunAtMs; 
            private String provider; 
            private Long runAtMs; 
            private String sessionId; 
            private String status; 
            private String summary; 
            private Long ts; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Runs model) {
                this.action = model.action;
                this.delivered = model.delivered;
                this.deliveryStatus = model.deliveryStatus;
                this.durationMs = model.durationMs;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.model = model.model;
                this.nextRunAtMs = model.nextRunAtMs;
                this.provider = model.provider;
                this.runAtMs = model.runAtMs;
                this.sessionId = model.sessionId;
                this.status = model.status;
                this.summary = model.summary;
                this.ts = model.ts;
                this.usage = model.usage;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Delivered.
             */
            public Builder delivered(Boolean delivered) {
                this.delivered = delivered;
                return this;
            }

            /**
             * DeliveryStatus.
             */
            public Builder deliveryStatus(String deliveryStatus) {
                this.deliveryStatus = deliveryStatus;
                return this;
            }

            /**
             * DurationMs.
             */
            public Builder durationMs(Long durationMs) {
                this.durationMs = durationMs;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * NextRunAtMs.
             */
            public Builder nextRunAtMs(Long nextRunAtMs) {
                this.nextRunAtMs = nextRunAtMs;
                return this;
            }

            /**
             * Provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * RunAtMs.
             */
            public Builder runAtMs(Long runAtMs) {
                this.runAtMs = runAtMs;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Ts.
             */
            public Builder ts(Long ts) {
                this.ts = ts;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Runs build() {
                return new Runs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolarClawCronJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobResponseBody</p>
     */
    public static class Schedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnchorMs")
        private Long anchorMs;

        @com.aliyun.core.annotation.NameInMap("At")
        private String at;

        @com.aliyun.core.annotation.NameInMap("EveryMs")
        private Long everyMs;

        @com.aliyun.core.annotation.NameInMap("Expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("Tz")
        private String tz;

        private Schedule(Builder builder) {
            this.anchorMs = builder.anchorMs;
            this.at = builder.at;
            this.everyMs = builder.everyMs;
            this.expr = builder.expr;
            this.kind = builder.kind;
            this.tz = builder.tz;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedule create() {
            return builder().build();
        }

        /**
         * @return anchorMs
         */
        public Long getAnchorMs() {
            return this.anchorMs;
        }

        /**
         * @return at
         */
        public String getAt() {
            return this.at;
        }

        /**
         * @return everyMs
         */
        public Long getEveryMs() {
            return this.everyMs;
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return tz
         */
        public String getTz() {
            return this.tz;
        }

        public static final class Builder {
            private Long anchorMs; 
            private String at; 
            private Long everyMs; 
            private String expr; 
            private String kind; 
            private String tz; 

            private Builder() {
            } 

            private Builder(Schedule model) {
                this.anchorMs = model.anchorMs;
                this.at = model.at;
                this.everyMs = model.everyMs;
                this.expr = model.expr;
                this.kind = model.kind;
                this.tz = model.tz;
            } 

            /**
             * AnchorMs.
             */
            public Builder anchorMs(Long anchorMs) {
                this.anchorMs = anchorMs;
                return this;
            }

            /**
             * At.
             */
            public Builder at(String at) {
                this.at = at;
                return this;
            }

            /**
             * EveryMs.
             */
            public Builder everyMs(Long everyMs) {
                this.everyMs = everyMs;
                return this;
            }

            /**
             * Expr.
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * Tz.
             */
            public Builder tz(String tz) {
                this.tz = tz;
                return this;
            }

            public Schedule build() {
                return new Schedule(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolarClawCronJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobResponseBody</p>
     */
    public static class State extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsecutiveErrors")
        private Integer consecutiveErrors;

        @com.aliyun.core.annotation.NameInMap("LastRunAtMs")
        private Long lastRunAtMs;

        @com.aliyun.core.annotation.NameInMap("LastRunStatus")
        private String lastRunStatus;

        @com.aliyun.core.annotation.NameInMap("NextRunAtMs")
        private Long nextRunAtMs;

        private State(Builder builder) {
            this.consecutiveErrors = builder.consecutiveErrors;
            this.lastRunAtMs = builder.lastRunAtMs;
            this.lastRunStatus = builder.lastRunStatus;
            this.nextRunAtMs = builder.nextRunAtMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static State create() {
            return builder().build();
        }

        /**
         * @return consecutiveErrors
         */
        public Integer getConsecutiveErrors() {
            return this.consecutiveErrors;
        }

        /**
         * @return lastRunAtMs
         */
        public Long getLastRunAtMs() {
            return this.lastRunAtMs;
        }

        /**
         * @return lastRunStatus
         */
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        /**
         * @return nextRunAtMs
         */
        public Long getNextRunAtMs() {
            return this.nextRunAtMs;
        }

        public static final class Builder {
            private Integer consecutiveErrors; 
            private Long lastRunAtMs; 
            private String lastRunStatus; 
            private Long nextRunAtMs; 

            private Builder() {
            } 

            private Builder(State model) {
                this.consecutiveErrors = model.consecutiveErrors;
                this.lastRunAtMs = model.lastRunAtMs;
                this.lastRunStatus = model.lastRunStatus;
                this.nextRunAtMs = model.nextRunAtMs;
            } 

            /**
             * ConsecutiveErrors.
             */
            public Builder consecutiveErrors(Integer consecutiveErrors) {
                this.consecutiveErrors = consecutiveErrors;
                return this;
            }

            /**
             * LastRunAtMs.
             */
            public Builder lastRunAtMs(Long lastRunAtMs) {
                this.lastRunAtMs = lastRunAtMs;
                return this;
            }

            /**
             * LastRunStatus.
             */
            public Builder lastRunStatus(String lastRunStatus) {
                this.lastRunStatus = lastRunStatus;
                return this;
            }

            /**
             * NextRunAtMs.
             */
            public Builder nextRunAtMs(Long nextRunAtMs) {
                this.nextRunAtMs = nextRunAtMs;
                return this;
            }

            public State build() {
                return new State(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolarClawCronJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("CreatedAtMs")
        private Long createdAtMs;

        @com.aliyun.core.annotation.NameInMap("DeleteAfterRun")
        private Boolean deleteAfterRun;

        @com.aliyun.core.annotation.NameInMap("Delivery")
        private Delivery delivery;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Payload")
        private Payload payload;

        @com.aliyun.core.annotation.NameInMap("Runs")
        private java.util.List<Runs> runs;

        @com.aliyun.core.annotation.NameInMap("Schedule")
        private Schedule schedule;

        @com.aliyun.core.annotation.NameInMap("SessionKey")
        private String sessionKey;

        @com.aliyun.core.annotation.NameInMap("SessionTarget")
        private String sessionTarget;

        @com.aliyun.core.annotation.NameInMap("State")
        private State state;

        @com.aliyun.core.annotation.NameInMap("UpdatedAtMs")
        private Long updatedAtMs;

        @com.aliyun.core.annotation.NameInMap("WakeMode")
        private String wakeMode;

        private Job(Builder builder) {
            this.agentId = builder.agentId;
            this.createdAtMs = builder.createdAtMs;
            this.deleteAfterRun = builder.deleteAfterRun;
            this.delivery = builder.delivery;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.name = builder.name;
            this.payload = builder.payload;
            this.runs = builder.runs;
            this.schedule = builder.schedule;
            this.sessionKey = builder.sessionKey;
            this.sessionTarget = builder.sessionTarget;
            this.state = builder.state;
            this.updatedAtMs = builder.updatedAtMs;
            this.wakeMode = builder.wakeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return createdAtMs
         */
        public Long getCreatedAtMs() {
            return this.createdAtMs;
        }

        /**
         * @return deleteAfterRun
         */
        public Boolean getDeleteAfterRun() {
            return this.deleteAfterRun;
        }

        /**
         * @return delivery
         */
        public Delivery getDelivery() {
            return this.delivery;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return payload
         */
        public Payload getPayload() {
            return this.payload;
        }

        /**
         * @return runs
         */
        public java.util.List<Runs> getRuns() {
            return this.runs;
        }

        /**
         * @return schedule
         */
        public Schedule getSchedule() {
            return this.schedule;
        }

        /**
         * @return sessionKey
         */
        public String getSessionKey() {
            return this.sessionKey;
        }

        /**
         * @return sessionTarget
         */
        public String getSessionTarget() {
            return this.sessionTarget;
        }

        /**
         * @return state
         */
        public State getState() {
            return this.state;
        }

        /**
         * @return updatedAtMs
         */
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        /**
         * @return wakeMode
         */
        public String getWakeMode() {
            return this.wakeMode;
        }

        public static final class Builder {
            private String agentId; 
            private Long createdAtMs; 
            private Boolean deleteAfterRun; 
            private Delivery delivery; 
            private String description; 
            private Boolean enabled; 
            private String id; 
            private String name; 
            private Payload payload; 
            private java.util.List<Runs> runs; 
            private Schedule schedule; 
            private String sessionKey; 
            private String sessionTarget; 
            private State state; 
            private Long updatedAtMs; 
            private String wakeMode; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.agentId = model.agentId;
                this.createdAtMs = model.createdAtMs;
                this.deleteAfterRun = model.deleteAfterRun;
                this.delivery = model.delivery;
                this.description = model.description;
                this.enabled = model.enabled;
                this.id = model.id;
                this.name = model.name;
                this.payload = model.payload;
                this.runs = model.runs;
                this.schedule = model.schedule;
                this.sessionKey = model.sessionKey;
                this.sessionTarget = model.sessionTarget;
                this.state = model.state;
                this.updatedAtMs = model.updatedAtMs;
                this.wakeMode = model.wakeMode;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * CreatedAtMs.
             */
            public Builder createdAtMs(Long createdAtMs) {
                this.createdAtMs = createdAtMs;
                return this;
            }

            /**
             * DeleteAfterRun.
             */
            public Builder deleteAfterRun(Boolean deleteAfterRun) {
                this.deleteAfterRun = deleteAfterRun;
                return this;
            }

            /**
             * Delivery.
             */
            public Builder delivery(Delivery delivery) {
                this.delivery = delivery;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Payload.
             */
            public Builder payload(Payload payload) {
                this.payload = payload;
                return this;
            }

            /**
             * Runs.
             */
            public Builder runs(java.util.List<Runs> runs) {
                this.runs = runs;
                return this;
            }

            /**
             * Schedule.
             */
            public Builder schedule(Schedule schedule) {
                this.schedule = schedule;
                return this;
            }

            /**
             * SessionKey.
             */
            public Builder sessionKey(String sessionKey) {
                this.sessionKey = sessionKey;
                return this;
            }

            /**
             * SessionTarget.
             */
            public Builder sessionTarget(String sessionTarget) {
                this.sessionTarget = sessionTarget;
                return this;
            }

            /**
             * State.
             */
            public Builder state(State state) {
                this.state = state;
                return this;
            }

            /**
             * UpdatedAtMs.
             */
            public Builder updatedAtMs(Long updatedAtMs) {
                this.updatedAtMs = updatedAtMs;
                return this;
            }

            /**
             * WakeMode.
             */
            public Builder wakeMode(String wakeMode) {
                this.wakeMode = wakeMode;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
