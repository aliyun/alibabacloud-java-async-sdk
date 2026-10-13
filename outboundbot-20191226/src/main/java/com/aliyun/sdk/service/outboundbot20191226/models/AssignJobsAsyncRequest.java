// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link AssignJobsAsyncRequest} extends {@link RequestModel}
 *
 * <p>AssignJobsAsyncRequest</p>
 */
public class AssignJobsAsyncRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobsJson")
    private java.util.List<String> jobsJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyJson")
    private String strategyJson;

    private AssignJobsAsyncRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.jobsJson = builder.jobsJson;
        this.strategyJson = builder.strategyJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignJobsAsyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callingNumber
     */
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return jobsJson
     */
    public java.util.List<String> getJobsJson() {
        return this.jobsJson;
    }

    /**
     * @return strategyJson
     */
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public static final class Builder extends Request.Builder<AssignJobsAsyncRequest, Builder> {
        private java.util.List<String> callingNumber; 
        private String instanceId; 
        private String jobGroupId; 
        private java.util.List<String> jobsJson; 
        private String strategyJson; 

        private Builder() {
            super();
        } 

        private Builder(AssignJobsAsyncRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.jobsJson = request.jobsJson;
            this.strategyJson = request.strategyJson;
        } 

        /**
         * <p>The list of calling numbers to be displayed to callees.</p>
         * <blockquote>
         * <p>If you omit this parameter, the system uses all available calling numbers by default.</p>
         * </blockquote>
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            String callingNumberShrink = shrink(callingNumber, "CallingNumber", "json");
            this.putBodyParameter("CallingNumber", callingNumberShrink);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the job group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putBodyParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>A JSON array containing job data. For the required format, see the example.</p>
         * <p>Each JSON object in the array represents a job for a single contact.</p>
         */
        public Builder jobsJson(java.util.List<String> jobsJson) {
            String jobsJsonShrink = shrink(jobsJson, "JobsJson", "json");
            this.putBodyParameter("JobsJson", jobsJsonShrink);
            this.jobsJson = jobsJson;
            return this;
        }

        /**
         * <p>A JSON string that defines the job group execution strategy. This object has the following properties:</p>
         * <ul>
         * <li><code>repeatBy</code></li>
         * </ul>
         * <p>Specifies the repetition frequency. Valid values include <code>Once</code> (does not repeat), <code>Day</code> (repeats daily), <code>Week</code> (repeats weekly), and <code>Month</code> (repeats monthly).</p>
         * <ul>
         * <li><code>startTime</code></li>
         * </ul>
         * <p>The start time of the execution strategy.</p>
         * <ul>
         * <li><code>endTime</code></li>
         * </ul>
         * <p>The end time of the execution strategy.</p>
         * <ul>
         * <li><code>workingTime</code></li>
         * </ul>
         * <p>The time range during which outbound calls can be made.</p>
         * <ul>
         * <li><code>maxAttemptsPerDay</code></li>
         * </ul>
         * <p>The maximum number of daily call attempts for a single phone number.</p>
         * <ul>
         * <li><code>minAttemptInterval</code></li>
         * </ul>
         * <p>The minimum interval between retry attempts, in minutes.</p>
         * <ul>
         * <li><code>routingStrategy</code></li>
         * </ul>
         * <p>The routing strategy for calling numbers. Valid values: <code>None</code> (not specified), <code>LocalFirst</code> (prioritizes numbers in the same city), and <code>LocalProvinceFirst</code> (prioritizes numbers in the same province).</p>
         * <ul>
         * <li><code>repeatDays</code></li>
         * </ul>
         * <p>The days on which the job repeats. If <code>repeatBy</code> is set to <code>Week</code>, valid values are <code>0</code> for Sunday and <code>1</code> to <code>6</code> for Monday to Saturday. If <code>repeatBy</code> is set to <code>Month</code>, valid values are <code>1</code> to <code>31</code>. If a specified day does not exist in a given month (e.g., February 30), the job is skipped for that month.</p>
         * <ul>
         * <li><code>repeatable</code></li>
         * </ul>
         * <p>Specifies whether to enable recurring jobs. Valid values: <code>true</code> and <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;maxAttemptsPerDay&quot;:&quot;3&quot;,&quot;minAttemptInterval&quot;:&quot;10&quot;,&quot;routingStrategy&quot;:&quot;LocalProvinceFirst&quot;,&quot;repeatDays&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;],&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;10:00:00&quot;,&quot;endTime&quot;:&quot;11:00:00&quot;},{&quot;beginTime&quot;:&quot;14:00:00&quot;,&quot;endTime&quot;:&quot;15:00:00&quot;}],&quot;repeatable&quot;:true,&quot;endTime&quot;:1707494400000,&quot;startTime&quot;:1706976000000,&quot;repeatBy&quot;:&quot;Week&quot;}</p>
         */
        public Builder strategyJson(String strategyJson) {
            this.putBodyParameter("StrategyJson", strategyJson);
            this.strategyJson = strategyJson;
            return this;
        }

        @Override
        public AssignJobsAsyncRequest build() {
            return new AssignJobsAsyncRequest(this);
        } 

    } 

}
