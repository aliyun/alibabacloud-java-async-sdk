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
 * {@link UpdatePolarClawCronJobRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolarClawCronJobRequest</p>
 */
public class UpdatePolarClawCronJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteAfterRun")
    private Boolean deleteAfterRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Delivery")
    private Delivery delivery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailureAlert")
    private FailureAlert failureAlert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schedule")
    private Schedule schedule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionKey")
    private String sessionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionTarget")
    private String sessionTarget;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WakeMode")
    private String wakeMode;

    private UpdatePolarClawCronJobRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.deleteAfterRun = builder.deleteAfterRun;
        this.delivery = builder.delivery;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.failureAlert = builder.failureAlert;
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.payload = builder.payload;
        this.restart = builder.restart;
        this.schedule = builder.schedule;
        this.sessionKey = builder.sessionKey;
        this.sessionTarget = builder.sessionTarget;
        this.wakeMode = builder.wakeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolarClawCronJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
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
     * @return failureAlert
     */
    public FailureAlert getFailureAlert() {
        return this.failureAlert;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
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
     * @return wakeMode
     */
    public String getWakeMode() {
        return this.wakeMode;
    }

    public static final class Builder extends Request.Builder<UpdatePolarClawCronJobRequest, Builder> {
        private String agentId; 
        private String applicationId; 
        private Boolean deleteAfterRun; 
        private Delivery delivery; 
        private String description; 
        private Boolean enabled; 
        private FailureAlert failureAlert; 
        private String jobId; 
        private String name; 
        private Payload payload; 
        private Boolean restart; 
        private Schedule schedule; 
        private String sessionKey; 
        private String sessionTarget; 
        private String wakeMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolarClawCronJobRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.applicationId = request.applicationId;
            this.deleteAfterRun = request.deleteAfterRun;
            this.delivery = request.delivery;
            this.description = request.description;
            this.enabled = request.enabled;
            this.failureAlert = request.failureAlert;
            this.jobId = request.jobId;
            this.name = request.name;
            this.payload = request.payload;
            this.restart = request.restart;
            this.schedule = request.schedule;
            this.sessionKey = request.sessionKey;
            this.sessionTarget = request.sessionTarget;
            this.wakeMode = request.wakeMode;
        } 

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * DeleteAfterRun.
         */
        public Builder deleteAfterRun(Boolean deleteAfterRun) {
            this.putQueryParameter("DeleteAfterRun", deleteAfterRun);
            this.deleteAfterRun = deleteAfterRun;
            return this;
        }

        /**
         * Delivery.
         */
        public Builder delivery(Delivery delivery) {
            String deliveryShrink = shrink(delivery, "Delivery", "json");
            this.putQueryParameter("Delivery", deliveryShrink);
            this.delivery = delivery;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * FailureAlert.
         */
        public Builder failureAlert(FailureAlert failureAlert) {
            String failureAlertShrink = shrink(failureAlert, "FailureAlert", "json");
            this.putQueryParameter("FailureAlert", failureAlertShrink);
            this.failureAlert = failureAlert;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0ee00f56-f467-4d41-858c-ca4ede2c770e</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * Restart.
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        /**
         * Schedule.
         */
        public Builder schedule(Schedule schedule) {
            String scheduleShrink = shrink(schedule, "Schedule", "json");
            this.putQueryParameter("Schedule", scheduleShrink);
            this.schedule = schedule;
            return this;
        }

        /**
         * SessionKey.
         */
        public Builder sessionKey(String sessionKey) {
            this.putQueryParameter("SessionKey", sessionKey);
            this.sessionKey = sessionKey;
            return this;
        }

        /**
         * SessionTarget.
         */
        public Builder sessionTarget(String sessionTarget) {
            this.putQueryParameter("SessionTarget", sessionTarget);
            this.sessionTarget = sessionTarget;
            return this;
        }

        /**
         * WakeMode.
         */
        public Builder wakeMode(String wakeMode) {
            this.putQueryParameter("WakeMode", wakeMode);
            this.wakeMode = wakeMode;
            return this;
        }

        @Override
        public UpdatePolarClawCronJobRequest build() {
            return new UpdatePolarClawCronJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePolarClawCronJobRequest} extends {@link TeaModel}
     *
     * <p>UpdatePolarClawCronJobRequest</p>
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
     * {@link UpdatePolarClawCronJobRequest} extends {@link TeaModel}
     *
     * <p>UpdatePolarClawCronJobRequest</p>
     */
    public static class FailureAlert extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("After")
        private Integer after;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("CooldownMs")
        private Integer cooldownMs;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        private FailureAlert(Builder builder) {
            this.accountId = builder.accountId;
            this.after = builder.after;
            this.channel = builder.channel;
            this.cooldownMs = builder.cooldownMs;
            this.mode = builder.mode;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureAlert create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return after
         */
        public Integer getAfter() {
            return this.after;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return cooldownMs
         */
        public Integer getCooldownMs() {
            return this.cooldownMs;
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
            private Integer after; 
            private String channel; 
            private Integer cooldownMs; 
            private String mode; 
            private String to; 

            private Builder() {
            } 

            private Builder(FailureAlert model) {
                this.accountId = model.accountId;
                this.after = model.after;
                this.channel = model.channel;
                this.cooldownMs = model.cooldownMs;
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
             * After.
             */
            public Builder after(Integer after) {
                this.after = after;
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
             * CooldownMs.
             */
            public Builder cooldownMs(Integer cooldownMs) {
                this.cooldownMs = cooldownMs;
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

            public FailureAlert build() {
                return new FailureAlert(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePolarClawCronJobRequest} extends {@link TeaModel}
     *
     * <p>UpdatePolarClawCronJobRequest</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BestEffortDeliver")
        private Boolean bestEffortDeliver;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("Deliver")
        private Boolean deliver;

        @com.aliyun.core.annotation.NameInMap("Fallbacks")
        private java.util.List<String> fallbacks;

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

        @com.aliyun.core.annotation.NameInMap("Thinking")
        private String thinking;

        @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("To")
        private String to;

        private Payload(Builder builder) {
            this.bestEffortDeliver = builder.bestEffortDeliver;
            this.channel = builder.channel;
            this.deliver = builder.deliver;
            this.fallbacks = builder.fallbacks;
            this.kind = builder.kind;
            this.lightContext = builder.lightContext;
            this.message = builder.message;
            this.model = builder.model;
            this.text = builder.text;
            this.thinking = builder.thinking;
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
         * @return fallbacks
         */
        public java.util.List<String> getFallbacks() {
            return this.fallbacks;
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
         * @return thinking
         */
        public String getThinking() {
            return this.thinking;
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
            private java.util.List<String> fallbacks; 
            private String kind; 
            private Boolean lightContext; 
            private String message; 
            private String model; 
            private String text; 
            private String thinking; 
            private Integer timeoutSeconds; 
            private String to; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.bestEffortDeliver = model.bestEffortDeliver;
                this.channel = model.channel;
                this.deliver = model.deliver;
                this.fallbacks = model.fallbacks;
                this.kind = model.kind;
                this.lightContext = model.lightContext;
                this.message = model.message;
                this.model = model.model;
                this.text = model.text;
                this.thinking = model.thinking;
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
             * Fallbacks.
             */
            public Builder fallbacks(java.util.List<String> fallbacks) {
                this.fallbacks = fallbacks;
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
             * Thinking.
             */
            public Builder thinking(String thinking) {
                this.thinking = thinking;
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
     * {@link UpdatePolarClawCronJobRequest} extends {@link TeaModel}
     *
     * <p>UpdatePolarClawCronJobRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("StaggerMs")
        private Integer staggerMs;

        @com.aliyun.core.annotation.NameInMap("Tz")
        private String tz;

        private Schedule(Builder builder) {
            this.anchorMs = builder.anchorMs;
            this.at = builder.at;
            this.everyMs = builder.everyMs;
            this.expr = builder.expr;
            this.kind = builder.kind;
            this.staggerMs = builder.staggerMs;
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
         * @return staggerMs
         */
        public Integer getStaggerMs() {
            return this.staggerMs;
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
            private Integer staggerMs; 
            private String tz; 

            private Builder() {
            } 

            private Builder(Schedule model) {
                this.anchorMs = model.anchorMs;
                this.at = model.at;
                this.everyMs = model.everyMs;
                this.expr = model.expr;
                this.kind = model.kind;
                this.staggerMs = model.staggerMs;
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
             * StaggerMs.
             */
            public Builder staggerMs(Integer staggerMs) {
                this.staggerMs = staggerMs;
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
}
