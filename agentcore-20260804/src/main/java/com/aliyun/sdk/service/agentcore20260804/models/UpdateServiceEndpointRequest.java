// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link UpdateServiceEndpointRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceEndpointRequest</p>
 */
public class UpdateServiceEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceEndpointId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateServiceEndpointRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateServiceEndpointRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.serviceEndpointId = builder.serviceEndpointId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return serviceEndpointId
     */
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

    /**
     * @return body
     */
    public UpdateServiceEndpointRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateServiceEndpointRequest, Builder> {
        private String workspaceId; 
        private String serviceEndpointId; 
        private UpdateServiceEndpointRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceEndpointRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.serviceEndpointId = request.serviceEndpointId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The ID of the AgentCore workspace to which the service endpoint to be updated belongs. You can obtain the ID by calling the ListWorkspaces operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0123456789abcdef01234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ID of the service endpoint to be updated. You can obtain the ID by calling the ListServiceEndpoints operation. The service endpoint must belong to the workspace specified in the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>se-0123456789abcdef0123456789abcdef</p>
         */
        public Builder serviceEndpointId(String serviceEndpointId) {
            this.putPathParameter("serviceEndpointId", serviceEndpointId);
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }

        /**
         * <p>The service endpoint configurations to be modified in this request. Submit the supported modifiable name, bound version, invocation authentication configuration, elastic policy, or public network inbound switch based on the endpoint type. Router and hybrid ingress endpoints cannot be renamed. DEFAULT endpoints do not accept name or authentication configuration updates. When updating the elastic policy, you must specify both updateElasticity=true and clientToken.</p>
         */
        public Builder body(UpdateServiceEndpointRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The client token. This parameter is required when updateElasticity is set to true and is verified by the server. Reuse the token and the original request for the same retry. Use a new token if the logical content changes. Passing different content with the same token returns InvalidParameter. The token must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), colons (:), and hyphens (-). The scope is the tenant and workspace. The receipt is retained for 7 days from the time of successful acceptance. Replays do not extend the retention period. After expiration, it is verified again as a new submission.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateServiceEndpointRequest build() {
            return new UpdateServiceEndpointRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointRequest</p>
     */
    public static class Authentication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Authentication(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authentication create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(Authentication model) {
                this.type = model.type;
            } 

            /**
             * <p>The saved invocation authentication type. Valid values:</p>
             * <ul>
             * <li>NONE: Configured to not use the endpoint API key.</li>
             * <li>API_KEY: Configured to use the endpoint API key.
             * For AGENT_VERSION endpoints of non-EDGE agents, the actual API key verification is determined by the current inbound authentication configuration of the agent and cannot be determined solely based on this field. You must provide type when passing authentication.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>API_KEY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Authentication build() {
                return new Authentication(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointRequest</p>
     */
    public static class TimePoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxInstances")
        @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
        private Integer maxInstances;

        @com.aliyun.core.annotation.NameInMap("minInstances")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer minInstances;

        @com.aliyun.core.annotation.NameInMap("monthDays")
        private java.util.List<Integer> monthDays;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("weekdays")
        private java.util.List<Integer> weekdays;

        private TimePoints(Builder builder) {
            this.maxInstances = builder.maxInstances;
            this.minInstances = builder.minInstances;
            this.monthDays = builder.monthDays;
            this.time = builder.time;
            this.weekdays = builder.weekdays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimePoints create() {
            return builder().build();
        }

        /**
         * @return maxInstances
         */
        public Integer getMaxInstances() {
            return this.maxInstances;
        }

        /**
         * @return minInstances
         */
        public Integer getMinInstances() {
            return this.minInstances;
        }

        /**
         * @return monthDays
         */
        public java.util.List<Integer> getMonthDays() {
            return this.monthDays;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return weekdays
         */
        public java.util.List<Integer> getWeekdays() {
            return this.weekdays;
        }

        public static final class Builder {
            private Integer maxInstances; 
            private Integer minInstances; 
            private java.util.List<Integer> monthDays; 
            private String time; 
            private java.util.List<Integer> weekdays; 

            private Builder() {
            } 

            private Builder(TimePoints model) {
                this.maxInstances = model.maxInstances;
                this.minInstances = model.minInstances;
                this.monthDays = model.monthDays;
                this.time = model.time;
                this.weekdays = model.weekdays;
            } 

            /**
             * <p>The target maximum number of instances. This parameter is required. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxInstances(Integer maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * <p>The target minimum number of instances. This parameter is required. Valid values: 0 to 100. The value cannot be greater than maxInstances in the same item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minInstances(Integer minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * <p>The days of the month. This parameter is required only for each trigger point of monthly policies. It cannot be empty and must be deduplicated. Valid values are integers from 1 to 31. Each row is selected independently. If a date does not exist in a specific month, the policy is not triggered and is not postponed to the end of the month. This parameter must be omitted for other periods.</p>
             */
            public Builder monthDays(java.util.List<Integer> monthDays) {
                this.monthDays = monthDays;
                return this;
            }

            /**
             * <p>The trigger time. This parameter is required. Format: HH:mm:ss. It is interpreted in the time zone of the associated policy, accurate to the minute, and the seconds are fixed at 00.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00:00</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The days of the week. This parameter is required only for each trigger point of weekly policies. It cannot be empty and must be deduplicated. Valid values are integers from 1 to 7, where 1 represents Monday and 7 represents Sunday. Each row is selected independently. This parameter must be omitted for other periods.</p>
             */
            public Builder weekdays(java.util.List<Integer> weekdays) {
                this.weekdays = weekdays;
                return this;
            }

            public TimePoints build() {
                return new TimePoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointRequest</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("repeat")
        private String repeat;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("timePoints")
        private java.util.List<TimePoints> timePoints;

        @com.aliyun.core.annotation.NameInMap("timeZone")
        private String timeZone;

        @com.aliyun.core.annotation.NameInMap("validity")
        private String validity;

        private Policies(Builder builder) {
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.priority = builder.priority;
            this.repeat = builder.repeat;
            this.startTime = builder.startTime;
            this.timePoints = builder.timePoints;
            this.timeZone = builder.timeZone;
            this.validity = builder.validity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return repeat
         */
        public String getRepeat() {
            return this.repeat;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timePoints
         */
        public java.util.List<TimePoints> getTimePoints() {
            return this.timePoints;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        /**
         * @return validity
         */
        public String getValidity() {
            return this.validity;
        }

        public static final class Builder {
            private String endTime; 
            private String id; 
            private Integer priority; 
            private String repeat; 
            private String startTime; 
            private java.util.List<TimePoints> timePoints; 
            private String timeZone; 
            private String validity; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.endTime = model.endTime;
                this.id = model.id;
                this.priority = model.priority;
                this.repeat = model.repeat;
                this.startTime = model.startTime;
                this.timePoints = model.timePoints;
                this.timeZone = model.timeZone;
                this.validity = model.validity;
            } 

            /**
             * <p>The end time of the validity period. This parameter is required only when validity is set to range. The format is the same as startTime, and the seconds are fixed at 00. It must be later than startTime. The interval does not include the end time. If validity is set to forever, the start and end times must be omitted. Valid dates and cross-field constraints are verified by the console.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-01T00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The policy identifier. This parameter is required and must be unique and stable within the endpoint. It is generated by the frontend when added, and retained during editing and retries.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-weekday</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The policy priority. This parameter is required. Valid values: 5 (regular) and 10 (high priority). The default selection for a new policy is regular. You must explicitly provide this parameter upon submission, and no default value is set for the API. When the final dynamicPolicy.enabled is set to true, the validity periods of high-priority policies cannot overlap, but end-to-end connection is allowed. Long-term high-priority policies can overlap with other high-priority policies. When disabled, overlapping drafts can be saved, and the final configuration is verified when re-enabled. The validity of other fields and trigger conflicts within the policy are always verified. You must explicitly provide priority.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The repeat period. This parameter is required. Valid values: daily (every day), weekly (every week), and monthly (every month). Only submit the fields corresponding to the specified period.</p>
             * 
             * <strong>example:</strong>
             * <p>weekly</p>
             */
            public Builder repeat(String repeat) {
                this.repeat = repeat;
                return this;
            }

            /**
             * <p>The start time of the validity period. This parameter is required only when validity is set to range. Format: YYYY-MM-DDTHH:mm:ss in the policy time zone, without a time zone offset. The seconds are fixed at 00. The interval includes the start time. When editing, existing past start times are retained, and updates or retries are not rejected because the start time is earlier than the current time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-01T00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The periodic trigger time points. This parameter is required and cannot be empty. Each item must be complete. The day of the week or day of the month is configured independently for each item. Within the same policy, daily policies conflict if the time is the same. weekly and monthly policies conflict only when the time is the same and the date sets intersect. This is verified by the console.</p>
             */
            public Builder timePoints(java.util.List<TimePoints> timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            /**
             * <p>The policy time zone. This parameter is required and must be a valid IANA time zone. All dates and times in this policy are interpreted in this time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * <p>The policy validity period type. This parameter is required. Valid values: forever (long-term validity) and range (short-term validity). After expiration, the policy and its trigger results exit the current calculation, and the remaining policies are recalculated. If no candidates are available, the basic values are restored. The saved configuration is not automatically deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>range</p>
             */
            public Builder validity(String validity) {
                this.validity = validity;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointRequest</p>
     */
    public static class DynamicPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("policies")
        private java.util.List<Policies> policies;

        private DynamicPolicy(Builder builder) {
            this.enabled = builder.enabled;
            this.policies = builder.policies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicPolicy create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return policies
         */
        public java.util.List<Policies> getPolicies() {
            return this.policies;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<Policies> policies; 

            private Builder() {
            } 

            private Builder(DynamicPolicy model) {
                this.enabled = model.enabled;
                this.policies = model.policies;
            } 

            /**
             * <p>Specifies whether to enable dynamic policies. This parameter is required during creation. If omitted during an update, the original value is retained. Disabling it retains existing policies and restores the basic upper and lower limits. Re-enabling it triggers immediate calculation. When it is finally enabled, policies cannot be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The complete list of dynamic policies. This parameter is required during creation. If omitted during an update, the original list is retained. If provided, it replaces the entire list and is not merged by ID. To clear the list, you must ensure that the final enabled is set to false. Each item must be complete. Conditional requirements and cross-field constraints are verified by the server. The display order does not indicate priority.</p>
             */
            public Builder policies(java.util.List<Policies> policies) {
                this.policies = policies;
                return this;
            }

            public DynamicPolicy build() {
                return new DynamicPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointRequest</p>
     */
    public static class ElasticityPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dynamicPolicy")
        private DynamicPolicy dynamicPolicy;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("maxSandboxCount")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer maxSandboxCount;

        @com.aliyun.core.annotation.NameInMap("minSandboxCount")
        @com.aliyun.core.annotation.Validation(maximum = 100)
        private Integer minSandboxCount;

        private ElasticityPolicy(Builder builder) {
            this.dynamicPolicy = builder.dynamicPolicy;
            this.enabled = builder.enabled;
            this.maxSandboxCount = builder.maxSandboxCount;
            this.minSandboxCount = builder.minSandboxCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticityPolicy create() {
            return builder().build();
        }

        /**
         * @return dynamicPolicy
         */
        public DynamicPolicy getDynamicPolicy() {
            return this.dynamicPolicy;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return maxSandboxCount
         */
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        /**
         * @return minSandboxCount
         */
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public static final class Builder {
            private DynamicPolicy dynamicPolicy; 
            private Boolean enabled; 
            private Integer maxSandboxCount; 
            private Integer minSandboxCount; 

            private Builder() {
            } 

            private Builder(ElasticityPolicy model) {
                this.dynamicPolicy = model.dynamicPolicy;
                this.enabled = model.enabled;
                this.maxSandboxCount = model.maxSandboxCount;
                this.minSandboxCount = model.minSandboxCount;
            } 

            /**
             * <p>The dynamic policy configuration. It must be fully provided during creation. If omitted during an update, the original configuration is retained. If provided, it is merged by field and does not accept null. The response returns the saved complete configuration. If no historical dynamic configuration exists, it is normalized to enabled=false and policies=[].</p>
             */
            public Builder dynamicPolicy(DynamicPolicy dynamicPolicy) {
                this.dynamicPolicy = dynamicPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to enable the overall automatic elasticity mode. This parameter is independent of dynamicPolicy.enabled. If omitted during an update, the original value is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The saved basic maximum number of instances. Valid values: 0 to 100. The value cannot be less than minSandboxCount. The basic upper and lower limits are used when dynamic elasticity is disabled or no candidates are available.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxSandboxCount(Integer maxSandboxCount) {
                this.maxSandboxCount = maxSandboxCount;
                return this;
            }

            /**
             * <p>The saved basic minimum number of instances. Valid values: 0 to 100. The value cannot be greater than maxSandboxCount. It must be submitted in pairs with maxSandboxCount during an update. If both are omitted, the original values are retained. It does not override dynamic results when dynamic candidates are available.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minSandboxCount(Integer minSandboxCount) {
                this.minSandboxCount = minSandboxCount;
                return this;
            }

            public ElasticityPolicy build() {
                return new ElasticityPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointRequest</p>
     */
    public static class UpdateServiceEndpointRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("authentication")
        private Authentication authentication;

        @com.aliyun.core.annotation.NameInMap("elasticityPolicy")
        private ElasticityPolicy elasticityPolicy;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("publicAccessEnabled")
        private Boolean publicAccessEnabled;

        @com.aliyun.core.annotation.NameInMap("updateElasticity")
        private Boolean updateElasticity;

        private UpdateServiceEndpointRequestBody(Builder builder) {
            this.agentVersion = builder.agentVersion;
            this.authentication = builder.authentication;
            this.elasticityPolicy = builder.elasticityPolicy;
            this.name = builder.name;
            this.publicAccessEnabled = builder.publicAccessEnabled;
            this.updateElasticity = builder.updateElasticity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateServiceEndpointRequestBody create() {
            return builder().build();
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return authentication
         */
        public Authentication getAuthentication() {
            return this.authentication;
        }

        /**
         * @return elasticityPolicy
         */
        public ElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publicAccessEnabled
         */
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        /**
         * @return updateElasticity
         */
        public Boolean getUpdateElasticity() {
            return this.updateElasticity;
        }

        public static final class Builder {
            private String agentVersion; 
            private Authentication authentication; 
            private ElasticityPolicy elasticityPolicy; 
            private String name; 
            private Boolean publicAccessEnabled; 
            private Boolean updateElasticity; 

            private Builder() {
            } 

            private Builder(UpdateServiceEndpointRequestBody model) {
                this.agentVersion = model.agentVersion;
                this.authentication = model.authentication;
                this.elasticityPolicy = model.elasticityPolicy;
                this.name = model.name;
                this.publicAccessEnabled = model.publicAccessEnabled;
                this.updateElasticity = model.updateElasticity;
            } 

            /**
             * <p>If not specified, the original binding is retained. If specified, it must be an exact source version that has been successfully deployed for the agent. Otherwise, ServiceEndpointTargetNotReady is returned. When rebinding a DEFAULT service endpoint of the GATEWAY_API type, ServiceEndpointTargetNotReady is also returned if the original gateway runtime instance is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>Updates the invocation authentication configuration saved for the service endpoint, specified by type. If not specified, the original configuration is retained. This field is prohibited for DEFAULT endpoints. For AGENT_VERSION endpoints of non-EDGE agents, the actual API key verification is determined by the current inbound authentication configuration of the agent. The management API for updating the service endpoint still uses AccessKey (AK) or Security Token Service (STS) authentication and Resource Access Management (RAM) authorization.</p>
             */
            public Builder authentication(Authentication authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * <p>Accepted only when updateElasticity is set to true. Omitting subfields indicates that the original values are retained. The basic minSandboxCount and maxSandboxCount must be submitted in pairs. dynamicPolicy.enabled and policies can be updated separately. If policies is provided, it replaces the entire list. To clear the list, you must ensure that the final dynamicPolicy.enabled is set to false. elasticityPolicy and dynamicPolicy do not accept null, and an empty patch is invalid. Only Router service endpoints and DEFAULT service endpoints of the GATEWAY_API_WITH_VPC_INGRESS or GATEWAY_API_WITH_PUBLIC_INGRESS type support elasticity updates. The server merges, verifies, and saves the complete configuration, and does not backfill basic values with the current capacity. The final basic min and max values must be between 0 and 100. If the historical basic capacity exceeds the limit, you must submit valid basic min and max values even if you only modify the dynamic policy. Silent truncation is not allowed.</p>
             */
            public Builder elasticityPolicy(ElasticityPolicy elasticityPolicy) {
                this.elasticityPolicy = elasticityPolicy;
                return this;
            }

            /**
             * <p>Used to modify existing named endpoints that support renaming. If omitted, the original name is retained. Router and hybrid ingress endpoints do not support renaming. You can only omit this parameter or pass the original name. This field is prohibited for DEFAULT endpoints.</p>
             * 
             * <strong>example:</strong>
             * <p>production</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether to enable public network inbound access for the service endpoint. If not specified, the original value is retained. If set to true or false, the value is replaced. Explicitly passing null or a non-Boolean value returns InvalidParameter, and no restore inheritance semantics are provided. Modifying only this field triggers an ingress revision only and does not redeploy the runtime instance. Whether public network access is actually enabled is also subject to the public network inbound limit of the workspace. For more information, see effectivePublicAccessEnabled in the response.</p>
             */
            public Builder publicAccessEnabled(Boolean publicAccessEnabled) {
                this.publicAccessEnabled = publicAccessEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to explicitly update the elastic configuration in this request. If omitted or set to false, the elasticityPolicy carried in this request is ignored, and the saved configuration is retained. If set to true, a valid and non-empty elasticityPolicy patch and clientToken must be provided. This parameter is not persisted, returned, or passed through to the resource manager (RM), and no default value is set. Omit this parameter during normal editing and version rebinding.</p>
             */
            public Builder updateElasticity(Boolean updateElasticity) {
                this.updateElasticity = updateElasticity;
                return this;
            }

            public UpdateServiceEndpointRequestBody build() {
                return new UpdateServiceEndpointRequestBody(this);
            } 

        } 

    }
}
