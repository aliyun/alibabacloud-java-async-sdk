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
 * {@link CreatePolarClawCronJobRequest} extends {@link RequestModel}
 *
 * <p>CreatePolarClawCronJobRequest</p>
 */
public class CreatePolarClawCronJobRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Payload")
    @com.aliyun.core.annotation.Validation(required = true)
    private Payload payload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunImmediately")
    private Boolean runImmediately;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schedule")
    @com.aliyun.core.annotation.Validation(required = true)
    private Schedule schedule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionKey")
    private String sessionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionTarget")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionTarget;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WakeMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wakeMode;

    private CreatePolarClawCronJobRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.deleteAfterRun = builder.deleteAfterRun;
        this.delivery = builder.delivery;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.failureAlert = builder.failureAlert;
        this.name = builder.name;
        this.payload = builder.payload;
        this.restart = builder.restart;
        this.runImmediately = builder.runImmediately;
        this.schedule = builder.schedule;
        this.sessionKey = builder.sessionKey;
        this.sessionTarget = builder.sessionTarget;
        this.wakeMode = builder.wakeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarClawCronJobRequest create() {
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
     * @return runImmediately
     */
    public Boolean getRunImmediately() {
        return this.runImmediately;
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

    public static final class Builder extends Request.Builder<CreatePolarClawCronJobRequest, Builder> {
        private String agentId; 
        private String applicationId; 
        private Boolean deleteAfterRun; 
        private Delivery delivery; 
        private String description; 
        private Boolean enabled; 
        private FailureAlert failureAlert; 
        private String name; 
        private Payload payload; 
        private Boolean restart; 
        private Boolean runImmediately; 
        private Schedule schedule; 
        private String sessionKey; 
        private String sessionTarget; 
        private String wakeMode; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolarClawCronJobRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.applicationId = request.applicationId;
            this.deleteAfterRun = request.deleteAfterRun;
            this.delivery = request.delivery;
            this.description = request.description;
            this.enabled = request.enabled;
            this.failureAlert = request.failureAlert;
            this.name = request.name;
            this.payload = request.payload;
            this.restart = request.restart;
            this.runImmediately = request.runImmediately;
            this.schedule = request.schedule;
            this.sessionKey = request.sessionKey;
            this.sessionTarget = request.sessionTarget;
            this.wakeMode = request.wakeMode;
        } 

        /**
         * <p>The ID of the agent that executes the task.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically delete the job after its first execution. This is useful for one-time tasks. Default: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteAfterRun(Boolean deleteAfterRun) {
            this.putQueryParameter("DeleteAfterRun", deleteAfterRun);
            this.deleteAfterRun = deleteAfterRun;
            return this;
        }

        /**
         * <p>The configuration for delivering task execution results.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Mode&quot;:&quot;announce&quot;,&quot;Channel&quot;:&quot;telegram&quot;}</p>
         */
        public Builder delivery(Delivery delivery) {
            String deliveryShrink = shrink(delivery, "Delivery", "json");
            this.putQueryParameter("Delivery", deliveryShrink);
            this.delivery = delivery;
            return this;
        }

        /**
         * <p>A description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily report generation</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the cron job is enabled. Default: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The failure alert configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;After&quot;:3,&quot;Channel&quot;:&quot;telegram&quot;}</p>
         */
        public Builder failureAlert(FailureAlert failureAlert) {
            String failureAlertShrink = shrink(failureAlert, "FailureAlert", "json");
            this.putQueryParameter("FailureAlert", failureAlertShrink);
            this.failureAlert = failureAlert;
            return this;
        }

        /**
         * <p>The unique name of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>daily-report</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The execution payload configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Kind&quot;:&quot;agentTurn&quot;,&quot;Message&quot;:&quot;Generate the daily report.&quot;}</p>
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * <p>Specifies whether to restart the gateway upon job creation. Default: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        /**
         * <p>Specifies whether to run the job once immediately upon creation. Default: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder runImmediately(Boolean runImmediately) {
            this.putQueryParameter("RunImmediately", runImmediately);
            this.runImmediately = runImmediately;
            return this;
        }

        /**
         * <p>The schedule configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Kind&quot;:&quot;cron&quot;,&quot;Expr&quot;:&quot;0 9 * * *&quot;,&quot;Tz&quot;:&quot;Asia/Shanghai&quot;}</p>
         */
        public Builder schedule(Schedule schedule) {
            String scheduleShrink = shrink(schedule, "Schedule", "json");
            this.putQueryParameter("Schedule", scheduleShrink);
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>The session routing key, which determines the conversation session for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>agent:main:feishu:direct:***</p>
         */
        public Builder sessionKey(String sessionKey) {
            this.putQueryParameter("SessionKey", sessionKey);
            this.sessionKey = sessionKey;
            return this;
        }

        /**
         * <p>The session target. Valid values are <code>main</code>, <code>isolated</code>, and <code>current</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder sessionTarget(String sessionTarget) {
            this.putQueryParameter("SessionTarget", sessionTarget);
            this.sessionTarget = sessionTarget;
            return this;
        }

        /**
         * <p>The wake mode for the agent. Valid values are <code>now</code> and <code>next-heartbeat</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>now</p>
         */
        public Builder wakeMode(String wakeMode) {
            this.putQueryParameter("WakeMode", wakeMode);
            this.wakeMode = wakeMode;
            return this;
        }

        @Override
        public CreatePolarClawCronJobRequest build() {
            return new CreatePolarClawCronJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolarClawCronJobRequest} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobRequest</p>
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
             * <p>The account ID for the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>Specifies whether to use best-effort delivery. If <code>true</code>, delivery failures are ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder bestEffort(Boolean bestEffort) {
                this.bestEffort = bestEffort;
                return this;
            }

            /**
             * <p>The delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>feishu</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The delivery mode. Valid values are <code>none</code>, <code>announce</code>, and <code>webhook</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>announce</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The recipient for the delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_***</p>
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
     * {@link CreatePolarClawCronJobRequest} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobRequest</p>
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
             * <p>The account ID for the alert channel.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The number of consecutive failures required to trigger an alert.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder after(Integer after) {
                this.after = after;
                return this;
            }

            /**
             * <p>The channel for sending failure alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>feishu</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The cooldown period, in milliseconds, between alerts for the same job.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder cooldownMs(Integer cooldownMs) {
                this.cooldownMs = cooldownMs;
                return this;
            }

            /**
             * <p>The mode for sending alerts. Valid values are <code>announce</code> and <code>webhook</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>announce</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The recipient for the failure alert.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_***</p>
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
     * {@link CreatePolarClawCronJobRequest} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobRequest</p>
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
             * <p>Specifies whether to use best-effort delivery. If <code>true</code>, delivery failures are ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder bestEffortDeliver(Boolean bestEffortDeliver) {
                this.bestEffortDeliver = bestEffortDeliver;
                return this;
            }

            /**
             * <p>The ID of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>feishu</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Specifies whether to deliver the agent\&quot;s output to a channel.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deliver(Boolean deliver) {
                this.deliver = deliver;
                return this;
            }

            /**
             * <p>A list of fallback models to use if the primary model fails.</p>
             */
            public Builder fallbacks(java.util.List<String> fallbacks) {
                this.fallbacks = fallbacks;
                return this;
            }

            /**
             * <p>The payload type. Valid values are <code>agentTurn</code> and <code>systemEvent</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>systemEvent</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>Specifies whether to use a light context for the agent conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder lightContext(Boolean lightContext) {
                this.lightContext = lightContext;
                return this;
            }

            /**
             * <p>The prompt for an agent conversation, used when <code>Kind</code> is <code>agentTurn</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Generate the daily report.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Specifies a model that overrides the agent\&quot;s default model.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian/qwen3.5-plus</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The text for the system event, used when <code>Kind</code> is <code>systemEvent</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Generate the daily report.</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The thinking level for the agent\&quot;s response generation. Valid values are <code>off</code>, <code>minimal</code>, <code>low</code>, <code>medium</code>, <code>high</code>, and <code>xhigh</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>xhigh</p>
             */
            public Builder thinking(String thinking) {
                this.thinking = thinking;
                return this;
            }

            /**
             * <p>The execution timeout, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            /**
             * <p>The specific target or recipient within the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_***</p>
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
     * {@link CreatePolarClawCronJobRequest} extends {@link TeaModel}
     *
     * <p>CreatePolarClawCronJobRequest</p>
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
             * <p>The anchor timestamp for aligning interval-based schedules, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1777370572518</p>
             */
            public Builder anchorMs(Long anchorMs) {
                this.anchorMs = anchorMs;
                return this;
            }

            /**
             * <p>The specific time for a one-time execution, specified as an ISO 8601 timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-10T09:00:00+08:00</p>
             */
            public Builder at(String at) {
                this.at = at;
                return this;
            }

            /**
             * <p>The task execution interval, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder everyMs(Long everyMs) {
                this.everyMs = everyMs;
                return this;
            }

            /**
             * <p>The cron expression that specifies when the task runs.</p>
             * 
             * <strong>example:</strong>
             * <p>0 9 * * *</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>The type of schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>cron</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The deterministic jitter window, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder staggerMs(Integer staggerMs) {
                this.staggerMs = staggerMs;
                return this;
            }

            /**
             * <p>The time zone for the schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
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
