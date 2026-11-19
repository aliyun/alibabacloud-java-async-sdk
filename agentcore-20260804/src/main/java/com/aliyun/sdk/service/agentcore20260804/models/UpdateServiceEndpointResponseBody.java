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
 * {@link UpdateServiceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateServiceEndpointResponseBody</p>
 */
public class UpdateServiceEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateServiceEndpointResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateServiceEndpointResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code of the request. The value is SUCCESS if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The service endpoint information returned after the update is accepted. This includes the binding target, saved authentication and elasticity configurations, and current status. The endpoint may still be updating.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the request. The value is 200 if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message of the request. The value is success if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5E8F3C2A-1B4D-4F6E-9A7C-0D2B8E6F4A1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. A value of true indicates that the update request is accepted, but does not mean that the deployment or endpoint change is complete. You must check data.status and data.accessUrls to confirm the result.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateServiceEndpointResponseBody build() {
            return new UpdateServiceEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointResponseBody</p>
     */
    public static class AccessUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private AccessUrls(Builder builder) {
            this.accessType = builder.accessType;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessUrls create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String accessType; 
            private String status; 
            private String statusReason; 
            private String url; 

            private Builder() {
            } 

            private Builder(AccessUrls model) {
                this.accessType = model.accessType;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.url = model.url;
            } 

            /**
             * <p>The access URL type. Valid values: INTERNET and VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The access URL status. Valid values: CREATING, READY, and DEGRADED.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason for the access URL status. The specific reason is returned when the status is abnormal.</p>
             * 
             * <strong>example:</strong>
             * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The access URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://endpoint.example.com">https://endpoint.example.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public AccessUrls build() {
                return new AccessUrls(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointResponseBody</p>
     */
    public static class Authentication extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
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
             * <p>The authentication method. Valid values:</p>
             * <ul>
             * <li>NONE: No authentication is required.</li>
             * <li>API_KEY: Authentication is performed by passing the API key in the x-api-key request header.</li>
             * </ul>
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
     * {@link UpdateServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointResponseBody</p>
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
     * {@link UpdateServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointResponseBody</p>
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
     * {@link UpdateServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointResponseBody</p>
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
     * {@link UpdateServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointResponseBody</p>
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
             * <p>The saved dynamic configuration. If the base configuration before the requirement is published lacks the dynamicPolicy parameter, it is supplemented with enabled=false and policies=[].</p>
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
             * <p>The saved or backfilled base maximum number of instances, which is not less than minSandboxCount. The historical value can exceed 100 and is not truncated when read. The base value is used when dynamic scaling is disabled or no candidates are available.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxSandboxCount(Integer maxSandboxCount) {
                this.maxSandboxCount = maxSandboxCount;
                return this;
            }

            /**
             * <p>The saved or backfilled base minimum number of instances, which is a non-negative integer and not greater than maxSandboxCount. The historical value can exceed 100 and is not truncated when read. A newly written complete configuration must still meet the 0 to 100 range.</p>
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
     * {@link UpdateServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointResponseBody</p>
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
             * <p>The target agent ID. This parameter is returned when the target type is AGENT_VERSION.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-123456</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The target agent version. This parameter is returned when the target type is AGENT_VERSION.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The collaboration component type. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
             * 
             * <strong>example:</strong>
             * <p>ELEMENT_WEB</p>
             */
            public Builder collaborationComponent(String collaborationComponent) {
                this.collaborationComponent = collaborationComponent;
                return this;
            }

            /**
             * <p>The workspace resource binding ID associated with the target collaboration component. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
             * 
             * <strong>example:</strong>
             * <p>wrb-123456</p>
             */
            public Builder resourceBindingId(String resourceBindingId) {
                this.resourceBindingId = resourceBindingId;
                return this;
            }

            /**
             * <p>The target type. Valid values: AGENT_VERSION and TEAM_COLLABORATION.</p>
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
     * {@link UpdateServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceEndpointResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessUrls")
        private java.util.List<AccessUrls> accessUrls;

        @com.aliyun.core.annotation.NameInMap("authentication")
        private Authentication authentication;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("currentInstances")
        private Integer currentInstances;

        @com.aliyun.core.annotation.NameInMap("effectivePublicAccessEnabled")
        private Boolean effectivePublicAccessEnabled;

        @com.aliyun.core.annotation.NameInMap("elasticityPolicy")
        private ElasticityPolicy elasticityPolicy;

        @com.aliyun.core.annotation.NameInMap("endpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("publicAccessEnabled")
        private Boolean publicAccessEnabled;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
        private String serviceEndpointId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.accessUrls = builder.accessUrls;
            this.authentication = builder.authentication;
            this.createdAt = builder.createdAt;
            this.currentInstances = builder.currentInstances;
            this.effectivePublicAccessEnabled = builder.effectivePublicAccessEnabled;
            this.elasticityPolicy = builder.elasticityPolicy;
            this.endpointType = builder.endpointType;
            this.name = builder.name;
            this.publicAccessEnabled = builder.publicAccessEnabled;
            this.regionId = builder.regionId;
            this.serviceEndpointId = builder.serviceEndpointId;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.target = builder.target;
            this.updatedAt = builder.updatedAt;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessUrls
         */
        public java.util.List<AccessUrls> getAccessUrls() {
            return this.accessUrls;
        }

        /**
         * @return authentication
         */
        public Authentication getAuthentication() {
            return this.authentication;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return currentInstances
         */
        public Integer getCurrentInstances() {
            return this.currentInstances;
        }

        /**
         * @return effectivePublicAccessEnabled
         */
        public Boolean getEffectivePublicAccessEnabled() {
            return this.effectivePublicAccessEnabled;
        }

        /**
         * @return elasticityPolicy
         */
        public ElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceEndpointId
         */
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private java.util.List<AccessUrls> accessUrls; 
            private Authentication authentication; 
            private String createdAt; 
            private Integer currentInstances; 
            private Boolean effectivePublicAccessEnabled; 
            private ElasticityPolicy elasticityPolicy; 
            private String endpointType; 
            private String name; 
            private Boolean publicAccessEnabled; 
            private String regionId; 
            private String serviceEndpointId; 
            private String status; 
            private String statusReason; 
            private Target target; 
            private String updatedAt; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessUrls = model.accessUrls;
                this.authentication = model.authentication;
                this.createdAt = model.createdAt;
                this.currentInstances = model.currentInstances;
                this.effectivePublicAccessEnabled = model.effectivePublicAccessEnabled;
                this.elasticityPolicy = model.elasticityPolicy;
                this.endpointType = model.endpointType;
                this.name = model.name;
                this.publicAccessEnabled = model.publicAccessEnabled;
                this.regionId = model.regionId;
                this.serviceEndpointId = model.serviceEndpointId;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.target = model.target;
                this.updatedAt = model.updatedAt;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The list of access URLs for the service endpoint.</p>
             */
            public Builder accessUrls(java.util.List<AccessUrls> accessUrls) {
                this.accessUrls = accessUrls;
                return this;
            }

            /**
             * <p>The authentication configuration of the service endpoint.</p>
             */
            public Builder authentication(Authentication authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * <p>The creation time in UTC format compliant with RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Read-only. The Get operation queries RM sandboxPhaseCounts.RUNNING by endpoint runtimeKey. The Create and Update operations return null. The value is a non-negative integer. If the statistics are unavailable, null is returned. The value is not replaced by the base upper and lower limits, target quantity, or READY status. Unavailable statistics do not block submission.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder currentInstances(Integer currentInstances) {
                this.currentInstances = currentInstances;
                return this;
            }

            /**
             * <p>The effective public access setting derived from combining publicAccessEnabled with the workspace-level public access limit. This parameter returns true only when both settings allow public access. This value only indicates the policy target and does not mean that the public endpoint has been fully published. For the actual status, refer to accessUrls and status.</p>
             */
            public Builder effectivePublicAccessEnabled(Boolean effectivePublicAccessEnabled) {
                this.effectivePublicAccessEnabled = effectivePublicAccessEnabled;
                return this;
            }

            /**
             * <p>The elasticity configuration used for edit backfill, which is not the current effective upper and lower limits or the actual number of instances. The Get operation preferentially returns the saved configuration. If no configuration is saved, an endpoint that supports elasticity backfills the base values from the expected runtime frozen configuration or the bound version configuration when the runtime is not established. Successful publication is not required. If the source is temporarily unavailable or no applicable configuration exists, the value is null, but the status and statusReason are still returned. The Create and Update operations return only the saved configuration. If no configuration is saved, the value is null. The historical base capacity can exceed 100 and is not truncated when read.</p>
             */
            public Builder elasticityPolicy(ElasticityPolicy elasticityPolicy) {
                this.elasticityPolicy = elasticityPolicy;
                return this;
            }

            /**
             * <p>The service endpoint type. Valid values:</p>
             * <ul>
             * <li>DEFAULT: The default endpoint created and maintained by the platform.</li>
             * <li>NAMED: The named endpoint explicitly created by the user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NAMED</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The service endpoint name. The name must be unique within the workspace and 1 to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-endpoint</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The expected public access setting configured by the user for the service endpoint. For historical service endpoints that have not been configured, this parameter returns true. This value only indicates the configuration expectation. For the actual availability of the public endpoint, refer to accessUrls and status.</p>
             */
            public Builder publicAccessEnabled(Boolean publicAccessEnabled) {
                this.publicAccessEnabled = publicAccessEnabled;
                return this;
            }

            /**
             * <p>The region ID of the service endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The service endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>se-123456</p>
             */
            public Builder serviceEndpointId(String serviceEndpointId) {
                this.serviceEndpointId = serviceEndpointId;
                return this;
            }

            /**
             * <p>The service endpoint status. Valid values: CREATING, READY, UPDATING, DEGRADED, DISABLED, and DELETING.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason for the service endpoint status. The specific reason is returned when the status is abnormal.</p>
             * 
             * <strong>example:</strong>
             * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The target routing configuration of the service endpoint.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The time of the last modification in UTC format compliant with RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-123456</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
