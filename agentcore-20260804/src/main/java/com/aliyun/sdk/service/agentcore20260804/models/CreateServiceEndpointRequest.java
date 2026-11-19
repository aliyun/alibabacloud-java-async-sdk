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
 * {@link CreateServiceEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceEndpointRequest</p>
 */
public class CreateServiceEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateServiceEndpointRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateServiceEndpointRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceEndpointRequest create() {
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
     * @return body
     */
    public CreateServiceEndpointRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateServiceEndpointRequest, Builder> {
        private String workspaceId; 
        private CreateServiceEndpointRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceEndpointRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The ID of the AgentCore workspace to which the service endpoint to be created belongs. You can obtain the ID by calling the ListWorkspaces operation.</p>
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
         * <p>The name, routing target, and invocation authentication configuration of the service endpoint to be created, along with the optional initial elasticity configuration and public access switch.</p>
         */
        public Builder body(CreateServiceEndpointRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>Required when elasticity initialization is included. It is verified by the server. The same token and original request are reused for the same retry. If the logical content changes, a new token is used. The same token with different content returns InvalidParameter. The token must be 1 to 128 characters in length and can contain letters, digits, and the following special characters: . _ : -. The scope is the tenant and workspace. The receipt is retained for 7 days from the time of successful acceptance. Replays do not extend the retention period. After expiration, it is verified again as a new submission.</p>
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
        public CreateServiceEndpointRequest build() {
            return new CreateServiceEndpointRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceEndpointRequest</p>
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
             * <p>The saved invocation authentication type. NONE indicates that the endpoint API key is not used. API_KEY indicates that the endpoint API key is used. For AGENT_VERSION endpoints of non-EDGE agents, the actual API key verification is determined by the current inbound authentication configuration of the agent and cannot be determined solely based on this field.</p>
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
     * {@link CreateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceEndpointRequest</p>
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
             * <p>Required. The value ranges from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxInstances(Integer maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * <p>Required. The value ranges from 0 to 100 and must not be greater than maxInstances in the same item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minInstances(Integer minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * <p>Required only for each trigger point of monthly. It must be non-empty and deduplicated. The values are integers from 1 to 31. Each row is selected independently. If a date does not exist in a month, it is not triggered and is not postponed to the end of the month. It must be omitted for other cycles.</p>
             */
            public Builder monthDays(java.util.List<Integer> monthDays) {
                this.monthDays = monthDays;
                return this;
            }

            /**
             * <p>Required. The format is HH:mm:ss. It is interpreted in the time zone of the policy, accurate to the minute, and the seconds are fixed at 00.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00:00</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>Required only for each trigger point of weekly. It must be non-empty and deduplicated. The values are integers from 1 to 7, where 1 indicates Monday and 7 indicates Sunday. Each row is selected independently. It must be omitted for other cycles.</p>
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
     * {@link CreateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceEndpointRequest</p>
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
             * <p>Required only when validity is set to range. The format is the same as startTime, the seconds are fixed at 00, and it must be later than startTime. The interval does not include the end time. For forever, the start and end times must be omitted. Valid dates and cross-field constraints are verified by the console.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-01T00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Required. It must be unique and stable within the endpoint. It is generated by the frontend when added, and retained during editing and retries.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-weekday</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Required. 5 indicates normal, and 10 indicates high priority. New policies default to normal. It must be explicitly provided during submission, and no default value is set for the operation. When the final dynamicPolicy.enabled is true, the validity periods of high-priority policies must not overlap, but end-to-end connection is allowed. Long-term high-priority policies can overlap with other high-priority policies. When disabled, overlapping drafts can be saved, and the final configuration is verified when re-enabled. The validity of other fields and trigger conflicts within the policy are always verified. The priority must be explicitly provided.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Required. daily means every day, weekly means every week, and monthly means every month. Only submit the fields corresponding to the cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>weekly</p>
             */
            public Builder repeat(String repeat) {
                this.repeat = repeat;
                return this;
            }

            /**
             * <p>Required only when validity is set to range. The format is YYYY-MM-DDTHH:mm:ss in the policy time zone, without a time zone offset, and the seconds are fixed at 00. The interval includes the start time. Editing retains the existing past start time and does not reject updates or retries because it is earlier than the current time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-01T00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Required and non-empty. Each item must be complete. The day of the week or day of the month is configured independently for each item. Within the same policy, daily policies conflict if the time is the same. Weekly and monthly policies conflict only if the time is the same and the date sets intersect. This is verified by the console.</p>
             */
            public Builder timePoints(java.util.List<TimePoints> timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            /**
             * <p>Required. A valid IANA time zone. All dates and times in this policy are interpreted in this time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * <p>Required. forever indicates long-term validity, and range indicates short-term validity. After expiration, the policy and its trigger results exit the current calculation, and the remaining policies are recalculated. If there are no candidates, the basic values are restored, and the saved configurations are not automatically deleted.</p>
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
     * {@link CreateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceEndpointRequest</p>
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
             * <p>Specifies whether to enable dynamic policies. Required during creation. If omitted during an update, the original value is retained. Disabling it retains existing policies and restores the basic upper and lower limits. Re-enabling it triggers immediate calculation. When finally enabled, policies must not be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Required during creation. If omitted during an update, the original list is retained. If passed, the entire list is replaced and not merged by ID. To clear the list, you must also ensure that the final enabled value is false. Each item must be complete. Conditional requirements and cross-field constraints are verified by the server. The display order does not indicate priority.</p>
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
     * {@link CreateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceEndpointRequest</p>
     */
    public static class ElasticityPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dynamicPolicy")
        private DynamicPolicy dynamicPolicy;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("maxSandboxCount")
        private Integer maxSandboxCount;

        @com.aliyun.core.annotation.NameInMap("minSandboxCount")
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
             * <p>Required. It must include enabled and policies, and is verified by the server. It is independent of the overall automatic elasticity switch.</p>
             */
            public Builder dynamicPolicy(DynamicPolicy dynamicPolicy) {
                this.dynamicPolicy = dynamicPolicy;
                return this;
            }

            /**
             * <p>Specifies whether to enable the entire automatic elasticity mode. It must be provided when elasticityPolicy is passed and is verified by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Specifies whether to enable the entire automatic elasticity mode. It must be provided when elasticityPolicy is passed and is verified by the server.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxSandboxCount(Integer maxSandboxCount) {
                this.maxSandboxCount = maxSandboxCount;
                return this;
            }

            /**
             * <p>Specifies whether to enable the entire automatic elasticity mode. It must be provided when elasticityPolicy is passed and is verified by the server.</p>
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
     * {@link CreateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceEndpointRequest</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("agentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("collaborationComponent")
        private String collaborationComponent;

        @com.aliyun.core.annotation.NameInMap("resourceBindingId")
        private String resourceBindingId;

        @com.aliyun.core.annotation.NameInMap("targetType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetType;

        private Target(Builder builder) {
            this.agentId = builder.agentId;
            this.agentVersion = builder.agentVersion;
            this.collaborationComponent = builder.collaborationComponent;
            this.resourceBindingId = builder.resourceBindingId;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return collaborationComponent
         */
        public String getCollaborationComponent() {
            return this.collaborationComponent;
        }

        /**
         * @return resourceBindingId
         */
        public String getResourceBindingId() {
            return this.resourceBindingId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String agentId; 
            private String agentVersion; 
            private String collaborationComponent; 
            private String resourceBindingId; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.agentId = model.agentId;
                this.agentVersion = model.agentVersion;
                this.collaborationComponent = model.collaborationComponent;
                this.resourceBindingId = model.resourceBindingId;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The ID of the agent associated with the AGENT_VERSION routing target. The agent is located in the workspace specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-0123456789abcdef0123456789abcdef</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The version of the agent associated with the AGENT_VERSION routing target. Use the agentVersion returned by CreateAgentVersion or ListAgentVersions, which is different from the version name versionName.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The component associated with the TEAM_COLLABORATION routing target. MATRIX_CLIENT indicates the Matrix client ingress, MATRIX_FEDERATION indicates the Matrix federation ingress, and ELEMENT_WEB indicates the Element Web ingress. Service endpoints for collaboration components are created internally by the platform. Do not pass this field when publicly creating an AGENT_VERSION endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>MATRIX_CLIENT</p>
             */
            public Builder collaborationComponent(String collaborationComponent) {
                this.collaborationComponent = collaborationComponent;
                return this;
            }

            /**
             * <p>The ID of the resource binding associated with the TEAM_COLLABORATION routing target. It is maintained internally by the platform and generated in the format of wrb- followed by a 32-character hexadecimal UUID. Do not pass this field when publicly creating an AGENT_VERSION endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>wrb-0123456789abcdef0123456789abcdef</p>
             */
            public Builder resourceBindingId(String resourceBindingId) {
                this.resourceBindingId = resourceBindingId;
                return this;
            }

            /**
             * <p>The public create operation only supports AGENT_VERSION, which indicates routing to a specified agent version. TEAM_COLLABORATION indicates a collaboration component. Service endpoints for collaboration components are created internally by the platform.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT_VERSION</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateServiceEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceEndpointRequest</p>
     */
    public static class CreateServiceEndpointRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authentication")
        @com.aliyun.core.annotation.Validation(required = true)
        private Authentication authentication;

        @com.aliyun.core.annotation.NameInMap("elasticityPolicy")
        private ElasticityPolicy elasticityPolicy;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("publicAccessEnabled")
        private Boolean publicAccessEnabled;

        @com.aliyun.core.annotation.NameInMap("target")
        @com.aliyun.core.annotation.Validation(required = true)
        private Target target;

        private CreateServiceEndpointRequestBody(Builder builder) {
            this.authentication = builder.authentication;
            this.elasticityPolicy = builder.elasticityPolicy;
            this.name = builder.name;
            this.publicAccessEnabled = builder.publicAccessEnabled;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateServiceEndpointRequestBody create() {
            return builder().build();
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
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        public static final class Builder {
            private Authentication authentication; 
            private ElasticityPolicy elasticityPolicy; 
            private String name; 
            private Boolean publicAccessEnabled; 
            private Target target; 

            private Builder() {
            } 

            private Builder(CreateServiceEndpointRequestBody model) {
                this.authentication = model.authentication;
                this.elasticityPolicy = model.elasticityPolicy;
                this.name = model.name;
                this.publicAccessEnabled = model.publicAccessEnabled;
                this.target = model.target;
            } 

            /**
             * <p>Sets the invocation authentication configuration saved for the service endpoint, specified by type. For AGENT_VERSION endpoints of non-EDGE agents, the actual API key verification is determined by the current inbound authentication configuration of the agent. The management operation for creating service endpoints still uses AccessKey or STS authentication and RAM authorization.</p>
             * <p>This parameter is required.</p>
             */
            public Builder authentication(Authentication authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * <p>Explicitly provided when creating a service endpoint with elasticity capabilities. The capability scope follows existing rules. Null or partial patches are not accepted. It must include enabled, the basic minSandboxCount and maxSandboxCount, and the complete dynamicPolicy. The basic upper and lower limits are both 0 to 100, and min must be less than or equal to max. To disable dynamic scaling without policies, pass enabled=false and policies=[]. When elasticity initialization is included, clientToken must be provided, and updateElasticity is not passed. Conditional requirements and cross-field constraints are verified by the server.</p>
             */
            public Builder elasticityPolicy(ElasticityPolicy elasticityPolicy) {
                this.elasticityPolicy = elasticityPolicy;
                return this;
            }

            /**
             * <p>The name of the named service endpoint to be created. For the Router type, the name must be 1 to 128 characters in length and can contain lowercase letters, digits, underscores, and hyphens. It must start with a letter or a digit, cannot use the reserved name default, and must be unique within the same agent. The names of Router and hybrid ingress endpoints cannot be changed after creation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>production</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether to enable public network inbound access for the service endpoint. If omitted, it is initialized to true. If true or false is passed, the passed value is saved. An explicit null or non-boolean value returns InvalidParameter. Whether public network access is actually enabled is also subject to the public network inbound access limit of the workspace. For more information, see effectivePublicAccessEnabled in the response.</p>
             */
            public Builder publicAccessEnabled(Boolean publicAccessEnabled) {
                this.publicAccessEnabled = publicAccessEnabled;
                return this;
            }

            /**
             * <p>Specifies the agent and its version associated with the service endpoint. The routing targets for collaboration components are maintained internally by the platform.</p>
             * <p>This parameter is required.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            public CreateServiceEndpointRequestBody build() {
                return new CreateServiceEndpointRequestBody(this);
            } 

        } 

    }
}
