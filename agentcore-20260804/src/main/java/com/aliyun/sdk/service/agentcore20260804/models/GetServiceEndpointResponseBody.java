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
 * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceEndpointResponseBody</p>
 */
public class GetServiceEndpointResponseBody extends TeaModel {
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

    private GetServiceEndpointResponseBody(Builder builder) {
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

    public static GetServiceEndpointResponseBody create() {
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

        private Builder(GetServiceEndpointResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The service endpoint details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message. Returns an error description if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceEndpointResponseBody build() {
            return new GetServiceEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
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
             * <p>The type of the access URL. Valid values: INTERNET and VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The status of the access URL. Valid values: CREATING, READY, and DEGRADED.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason for the access URL status. Returns the specific reason when the status is abnormal.</p>
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
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
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
             * <p>The authentication method. NONE indicates that no authentication is required. API_KEY indicates that authentication is performed by passing an API key in the x-api-key request header.</p>
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
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
     */
    public static class EffectiveCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxSandboxCount")
        private Integer maxSandboxCount;

        @com.aliyun.core.annotation.NameInMap("minSandboxCount")
        private Integer minSandboxCount;

        private EffectiveCapacity(Builder builder) {
            this.maxSandboxCount = builder.maxSandboxCount;
            this.minSandboxCount = builder.minSandboxCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveCapacity create() {
            return builder().build();
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
            private Integer maxSandboxCount; 
            private Integer minSandboxCount; 

            private Builder() {
            } 

            private Builder(EffectiveCapacity model) {
                this.maxSandboxCount = model.maxSandboxCount;
                this.minSandboxCount = model.minSandboxCount;
            } 

            /**
             * <p>Read-only. Maps to autoScalingStatus.effectiveLimits.maxSandboxes in the RM. When effectiveCapacity is not null, this value must be returned in pairs with the minimum value. The value must be non-negative and no less than the minimum value. Zero is a valid value. The read value is not truncated at the upper limit of 100 configured for writing.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxSandboxCount(Integer maxSandboxCount) {
                this.maxSandboxCount = maxSandboxCount;
                return this;
            }

            /**
             * <p>Read-only. Maps to autoScalingStatus.effectiveLimits.minSandboxes in the RM. When effectiveCapacity is not null, this value must be returned in pairs with the maximum value. The value must be non-negative and no greater than the maximum value. The read value is not truncated at the upper limit of 100 configured for writing.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder minSandboxCount(Integer minSandboxCount) {
                this.minSandboxCount = minSandboxCount;
                return this;
            }

            public EffectiveCapacity build() {
                return new EffectiveCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
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
             * <p>Required. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxInstances(Integer maxInstances) {
                this.maxInstances = maxInstances;
                return this;
            }

            /**
             * <p>Required. Valid values: 0 to 100. The value cannot be greater than the maxInstances value in the same item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minInstances(Integer minInstances) {
                this.minInstances = minInstances;
                return this;
            }

            /**
             * <p>Required only for each trigger point of the monthly cycle. The list must be non-empty and contain unique integers from 1 to 31. Each row is selected independently. If a selected day does not exist in a specific month, the trigger does not fire and is not postponed to the end of the month. This field must be omitted for other cycles.</p>
             */
            public Builder monthDays(java.util.List<Integer> monthDays) {
                this.monthDays = monthDays;
                return this;
            }

            /**
             * <p>Required. The format is HH:mm:ss, interpreted in the time zone of the associated policy. The precision is down to the minute, and the seconds are fixed at 00.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00:00</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>Required only for each trigger point of weekly policies. Cannot be empty and must be deduplicated. Valid values are integers from 1 to 7, where 1 represents Monday and 7 represents Sunday. Each row is selected independently. Must be omitted for other cycles.</p>
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
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
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
             * <p>Required only when validity is set to range. The format is the same as startTime, with seconds fixed at 00. The end time must be later than the startTime. The interval does not include the end time. If validity is set to forever, the start and end times must be omitted. Valid dates and cross-field constraints are validated by the console.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-12-01T00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Required. Must be unique and stable within the endpoint. Generated by the frontend when added, and retained during editing and retries.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-weekday</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Required. 5 indicates regular priority, and 10 indicates high priority. New policies default to regular priority. Must be explicitly provided during submission, as the API does not set a default value. When the final dynamicPolicy.enabled is true, the validity periods of high-priority policies must not overlap, except that end-to-end connection is allowed, and long-term high-priority policies can overlap with other high-priority policies. Overlapping drafts can be saved when disabled, but the final configuration is validated when re-enabled. The validity of other fields and trigger conflicts within the policy are always validated. The priority must be explicitly provided.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Required. daily means every day, weekly means every week, and monthly means every month. Only submit fields corresponding to the specified cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>weekly</p>
             */
            public Builder repeat(String repeat) {
                this.repeat = repeat;
                return this;
            }

            /**
             * <p>Required only when validity is set to range. The format is YYYY-MM-DDTHH:mm:ss in the policy time zone, without a time zone offset. The seconds are fixed at 00. The interval includes the start time. When editing, existing past start times are retained, and updates or retries are not rejected even if the start time is earlier than the current time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-01T00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Required and cannot be empty. Each item must be complete. The day of the week or day of the month is configured independently for each item. Within the same policy, daily policies conflict if they have the same time. Weekly and monthly policies conflict only if they have the same time and their date sets intersect. This is validated by the console.</p>
             */
            public Builder timePoints(java.util.List<TimePoints> timePoints) {
                this.timePoints = timePoints;
                return this;
            }

            /**
             * <p>Required. Must be a valid IANA time zone. All dates and times in this policy are interpreted in this time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * <p>Required. Valid values: forever for long-term validity, and range for short-term validity. After expiration, the policy and its trigger results are excluded from the current calculation, and the remaining policies are recalculated. If no candidate policy is available, the baseline value is restored. Saved configurations are not automatically deleted.</p>
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
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
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
             * <p>Required during creation. If omitted during an update, the original value is retained. Disabling this feature retains existing policies and restores the base upper and lower limits. Re-enabling it triggers immediate calculation. When finally enabled, policies must not be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Required during creation. If omitted during an update, the original list is retained. If passed, the entire list is replaced rather than merged by ID. To clear the list, you must also ensure that the final enabled value is false. Each item must be complete. Conditional requirements and cross-field constraints are validated by the server. The display order does not indicate priority.</p>
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
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
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
             * <p>Returns the saved dynamic configuration. If the base configuration before the requirement goes online lacks dynamicPolicy, it is supplemented with enabled=false and policies=[].</p>
             */
            public Builder dynamicPolicy(DynamicPolicy dynamicPolicy) {
                this.dynamicPolicy = dynamicPolicy;
                return this;
            }

            /**
             * <p>Independent of dynamicPolicy.enabled. If omitted during an update, the original value is retained.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The saved or backfilled base maximum instance count. The value must be no less than minSandboxCount. Historical values can exceed 100, and the read value is not truncated. The base value is used when dynamic scaling is disabled or no candidates are available.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxSandboxCount(Integer maxSandboxCount) {
                this.maxSandboxCount = maxSandboxCount;
                return this;
            }

            /**
             * <p>The saved or backfilled base minimum instance count. The value must be non-negative and no greater than maxSandboxCount. Historical values can exceed 100, and the read value is not truncated. A newly written complete configuration must still meet the 0 to 100 range.</p>
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
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
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
             * <p>The ID of the target agent. Returned when the target type is AGENT_VERSION.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-123456</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The version number of the target agent. Returned when the target type is AGENT_VERSION.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The type of the collaboration component. Returned when the target type is TEAM_COLLABORATION.</p>
             * 
             * <strong>example:</strong>
             * <p>ELEMENT_WEB</p>
             */
            public Builder collaborationComponent(String collaborationComponent) {
                this.collaborationComponent = collaborationComponent;
                return this;
            }

            /**
             * <p>The ID of the workspace resource binding associated with the target collaboration component. Returned when the target type is TEAM_COLLABORATION.</p>
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
     * {@link GetServiceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceEndpointResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("effectiveCapacity")
        private EffectiveCapacity effectiveCapacity;

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
            this.effectiveCapacity = builder.effectiveCapacity;
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
         * @return effectiveCapacity
         */
        public EffectiveCapacity getEffectiveCapacity() {
            return this.effectiveCapacity;
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
            private EffectiveCapacity effectiveCapacity; 
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
                this.effectiveCapacity = model.effectiveCapacity;
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
             * <p>The creation time in UTC format based on RFC 3339.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Read-only. For Get operations, it queries RM sandboxPhaseCounts.RUNNING based on the Endpoint runtimeKey. For Create and Update operations, it returns null. The value is a non-negative integer. If the statistics are unavailable, it returns null. It is not replaced by the baseline upper and lower limits, target quantity, or READY status. Unavailable statistics do not block submission.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder currentInstances(Integer currentInstances) {
                this.currentInstances = currentInstances;
                return this;
            }

            /**
             * <p>Read-only and returned only in detail queries. The console reads this from autoScalingStatus.effectiveLimits in the same RM detail request that queries the current instance count. It represents the upper and lower limits currently applied by the resource manager (RM), rather than the saved base configuration or the actual instance count. This value is null if it is not applicable, the running object does not exist, the identity does not match, the query fails, or the RM does not return a valid range. Configuration values are not used as a fallback, and this field is not used for edit backfill or submission.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;minSandboxCount&quot;:8,&quot;maxSandboxCount&quot;:20}</p>
             */
            public Builder effectiveCapacity(EffectiveCapacity effectiveCapacity) {
                this.effectiveCapacity = effectiveCapacity;
                return this;
            }

            /**
             * <p>The result of combining publicAccessEnabled with the public network inbound access limit of the workspace. The value is true only when both allow public access. This only indicates the policy target and does not mean that the public network entry has been published. The actual status is subject to accessUrls and status.</p>
             */
            public Builder effectivePublicAccessEnabled(Boolean effectivePublicAccessEnabled) {
                this.effectivePublicAccessEnabled = effectivePublicAccessEnabled;
                return this;
            }

            /**
             * <p>Used for edit backfill. This is not the currently effective upper and lower limits or the actual instance count. The Get operation preferentially returns the saved configuration. If no configuration is saved, an endpoint that supports elasticity backfills the base values from the frozen configuration of the expected runtime or the bound version configuration when the runtime is not yet established. Successful publication is not required. This value is null when the source is temporarily unavailable or no applicable configuration exists, but the status and statusReason are still returned. The Create and Update operations return only the saved configuration, and return null if no configuration is saved. The historical base capacity can exceed 100, and the read value is not truncated.</p>
             */
            public Builder elasticityPolicy(ElasticityPolicy elasticityPolicy) {
                this.elasticityPolicy = elasticityPolicy;
                return this;
            }

            /**
             * <p>The type of the service endpoint. DEFAULT indicates a default endpoint created and maintained by the platform. NAMED indicates a named endpoint explicitly created by a user.</p>
             * 
             * <strong>example:</strong>
             * <p>NAMED</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The name of the service endpoint. The name must be unique within the workspace and be 1 to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-endpoint</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The expected public network inbound access configured by the user on the service endpoint. For historical service endpoints where this has not been configured, true is returned. This only indicates the configuration expectation. The actual availability of the public IP address is subject to accessUrls and status.</p>
             */
            public Builder publicAccessEnabled(Boolean publicAccessEnabled) {
                this.publicAccessEnabled = publicAccessEnabled;
                return this;
            }

            /**
             * <p>The ID of the region where the service endpoint resides.</p>
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
             * <p>The status of the service endpoint. Valid values: CREATING, READY, UPDATING, DEGRADED, DISABLED, and DELETING.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason for the service endpoint status. Returns the specific reason when the status is abnormal.</p>
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
             * <p>The time of the last modification in UTC format based on RFC 3339.</p>
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
