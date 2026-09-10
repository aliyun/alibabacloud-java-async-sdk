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
         * <p>The ID of the Agent that runs the task.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
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
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>Specifies whether to delete the task after its first execution.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteAfterRun(Boolean deleteAfterRun) {
            this.putQueryParameter("DeleteAfterRun", deleteAfterRun);
            this.deleteAfterRun = deleteAfterRun;
            return this;
        }

        /**
         * <p>The result delivery configuration.</p>
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
         * <p>The new description for the task.</p>
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
         * <p>Specifies whether the task is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The configuration for failure alerts. Set this to <code>false</code> to disable alerts.</p>
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
         * <p>The ID of the scheduled task to update.</p>
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
         * <p>The new name for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>afternoon-report</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The new payload configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Kind&quot;:&quot;agentTurn&quot;,&quot;Message&quot;:&quot;Updated: Generate afternoon report.&quot;}</p>
         */
        public Builder payload(Payload payload) {
            String payloadShrink = shrink(payload, "Payload", "json");
            this.putQueryParameter("Payload", payloadShrink);
            this.payload = payload;
            return this;
        }

        /**
         * <p>Specifies whether to restart the gateway after the update. Default value: <code>true</code>.</p>
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
         * <p>The scheduling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Kind&quot;:&quot;cron&quot;,&quot;Expr&quot;:&quot;0 12 * * *&quot;,&quot;Tz&quot;:&quot;America/New_York&quot;}</p>
         */
        public Builder schedule(Schedule schedule) {
            String scheduleShrink = shrink(schedule, "Schedule", "json");
            this.putQueryParameter("Schedule", scheduleShrink);
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>The session routing key.</p>
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
         * <p>The new session target.</p>
         * 
         * <strong>example:</strong>
         * <p>isolated</p>
         */
        public Builder sessionTarget(String sessionTarget) {
            this.putQueryParameter("SessionTarget", sessionTarget);
            this.sessionTarget = sessionTarget;
            return this;
        }

        /**
         * <p>The new wake mode.</p>
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
             * <p>The account ID for the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>accountId123</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>Specifies whether to ignore delivery failures.</p>
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
             * <p>telegram</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The delivery mode. Valid values: <code>none</code>, <code>announce</code>, and <code>webhook</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>announce</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The delivery target. This parameter is required and must be a URL if <code>Delivery.Mode</code> is <code>webhook</code>.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/webhook">https://example.com/webhook</a></p>
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
             * <p>The account ID for the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>accountId123</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The number of consecutive failures after which to send an alert.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder after(Integer after) {
                this.after = after;
                return this;
            }

            /**
             * <p>The alert channel.</p>
             * 
             * <strong>example:</strong>
             * <p>email</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The minimum interval between two alerts, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder cooldownMs(Integer cooldownMs) {
                this.cooldownMs = cooldownMs;
                return this;
            }

            /**
             * <p>The alert mode. Valid values: <code>announce</code> and <code>webhook</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>announce</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The alert target.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:user@example.com">user@example.com</a></p>
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
             * <p>Specifies whether to ignore delivery failures.</p>
             */
            public Builder bestEffortDeliver(Boolean bestEffortDeliver) {
                this.bestEffortDeliver = bestEffortDeliver;
                return this;
            }

            /**
             * <p>The ID of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>telegram</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Specifies whether to deliver the output to a channel.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deliver(Boolean deliver) {
                this.deliver = deliver;
                return this;
            }

            /**
             * <p>A list of fallback models.</p>
             */
            public Builder fallbacks(java.util.List<String> fallbacks) {
                this.fallbacks = fallbacks;
                return this;
            }

            /**
             * <p>The payload type. Valid values are <code>agentTurn</code> (for an Agent conversation) or <code>systemEvent</code> (for a system event).</p>
             * 
             * <strong>example:</strong>
             * <p>agentTurn</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>Specifies whether to use a lightweight context.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder lightContext(Boolean lightContext) {
                this.lightContext = lightContext;
                return this;
            }

            /**
             * <p>The prompt for the Agent conversation. This parameter is required if <code>Payload.Kind</code> is <code>agentTurn</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Generate the daily report and send it to the team.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The model override.</p>
             * 
             * <strong>example:</strong>
             * <p>anthropic/sonnet-4.6</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The text for the system event. This parameter is required if <code>Payload.Kind</code> is <code>systemEvent</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Send a reminder to the user.</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The thinking level. Valid values: <code>off</code>, <code>minimal</code>, <code>low</code>, <code>medium</code>, <code>high</code>, and <code>xhigh</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder thinking(String thinking) {
                this.thinking = thinking;
                return this;
            }

            /**
             * <p>The execution timeout in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            /**
             * <p>The delivery target.</p>
             * 
             * <strong>example:</strong>
             * <p>team</p>
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
             * <p>The anchor timestamp for interval alignment, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1777370572518</p>
             */
            public Builder anchorMs(Long anchorMs) {
                this.anchorMs = anchorMs;
                return this;
            }

            /**
             * <p>An ISO 8601 timestamp. This parameter is required if <code>Schedule.Kind</code> is <code>at</code>. For example: <code>2026-04-10T09:00:00+08:00</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-10T09:00:00+08:00</p>
             */
            public Builder at(String at) {
                this.at = at;
                return this;
            }

            /**
             * <p>The interval in milliseconds. This parameter is required if <code>Schedule.Kind</code> is <code>every</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder everyMs(Long everyMs) {
                this.everyMs = everyMs;
                return this;
            }

            /**
             * <p>The cron expression.</p>
             * 
             * <strong>example:</strong>
             * <p>0 9 * * *</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>The schedule type.</p>
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
             * <p>The time zone.</p>
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
