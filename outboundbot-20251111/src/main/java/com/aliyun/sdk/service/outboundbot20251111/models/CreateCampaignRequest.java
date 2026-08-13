// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link CreateCampaignRequest} extends {@link RequestModel}
 *
 * <p>CreateCampaignRequest</p>
 */
public class CreateCampaignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttemptOrder")
    private String attemptOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallableTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callableTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseFileKey")
    private String caseFileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cases")
    private java.util.List<Cases> cases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DialingTimeoutSeconds")
    private Integer dialingTimeoutSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FixedQuota")
    private Integer fixedQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlashSmsParameters")
    private String flashSmsParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HolidayRestricted")
    private Boolean holidayRestricted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxAttemptCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxAttemptCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinAttemptInterval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer minAttemptInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Numbers")
    private java.util.List<String> numbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedialRestrictions")
    private String redialRestrictions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunUntilEndTime")
    private Boolean runUntilEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    private CreateCampaignRequest(Builder builder) {
        super(builder);
        this.attemptOrder = builder.attemptOrder;
        this.callableTime = builder.callableTime;
        this.caseFileKey = builder.caseFileKey;
        this.cases = builder.cases;
        this.dialingTimeoutSeconds = builder.dialingTimeoutSeconds;
        this.endTime = builder.endTime;
        this.fixedQuota = builder.fixedQuota;
        this.flashSmsParameters = builder.flashSmsParameters;
        this.holidayRestricted = builder.holidayRestricted;
        this.instanceId = builder.instanceId;
        this.maxAttemptCount = builder.maxAttemptCount;
        this.minAttemptInterval = builder.minAttemptInterval;
        this.name = builder.name;
        this.numbers = builder.numbers;
        this.redialRestrictions = builder.redialRestrictions;
        this.runUntilEndTime = builder.runUntilEndTime;
        this.scriptId = builder.scriptId;
        this.startTime = builder.startTime;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCampaignRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attemptOrder
     */
    public String getAttemptOrder() {
        return this.attemptOrder;
    }

    /**
     * @return callableTime
     */
    public String getCallableTime() {
        return this.callableTime;
    }

    /**
     * @return caseFileKey
     */
    public String getCaseFileKey() {
        return this.caseFileKey;
    }

    /**
     * @return cases
     */
    public java.util.List<Cases> getCases() {
        return this.cases;
    }

    /**
     * @return dialingTimeoutSeconds
     */
    public Integer getDialingTimeoutSeconds() {
        return this.dialingTimeoutSeconds;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return fixedQuota
     */
    public Integer getFixedQuota() {
        return this.fixedQuota;
    }

    /**
     * @return flashSmsParameters
     */
    public String getFlashSmsParameters() {
        return this.flashSmsParameters;
    }

    /**
     * @return holidayRestricted
     */
    public Boolean getHolidayRestricted() {
        return this.holidayRestricted;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxAttemptCount
     */
    public Integer getMaxAttemptCount() {
        return this.maxAttemptCount;
    }

    /**
     * @return minAttemptInterval
     */
    public Integer getMinAttemptInterval() {
        return this.minAttemptInterval;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return numbers
     */
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

    /**
     * @return redialRestrictions
     */
    public String getRedialRestrictions() {
        return this.redialRestrictions;
    }

    /**
     * @return runUntilEndTime
     */
    public Boolean getRunUntilEndTime() {
        return this.runUntilEndTime;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<CreateCampaignRequest, Builder> {
        private String attemptOrder; 
        private String callableTime; 
        private String caseFileKey; 
        private java.util.List<Cases> cases; 
        private Integer dialingTimeoutSeconds; 
        private Long endTime; 
        private Integer fixedQuota; 
        private String flashSmsParameters; 
        private Boolean holidayRestricted; 
        private String instanceId; 
        private Integer maxAttemptCount; 
        private Integer minAttemptInterval; 
        private String name; 
        private java.util.List<String> numbers; 
        private String redialRestrictions; 
        private Boolean runUntilEndTime; 
        private String scriptId; 
        private Long startTime; 
        private Integer weight; 

        private Builder() {
            super();
        } 

        private Builder(CreateCampaignRequest request) {
            super(request);
            this.attemptOrder = request.attemptOrder;
            this.callableTime = request.callableTime;
            this.caseFileKey = request.caseFileKey;
            this.cases = request.cases;
            this.dialingTimeoutSeconds = request.dialingTimeoutSeconds;
            this.endTime = request.endTime;
            this.fixedQuota = request.fixedQuota;
            this.flashSmsParameters = request.flashSmsParameters;
            this.holidayRestricted = request.holidayRestricted;
            this.instanceId = request.instanceId;
            this.maxAttemptCount = request.maxAttemptCount;
            this.minAttemptInterval = request.minAttemptInterval;
            this.name = request.name;
            this.numbers = request.numbers;
            this.redialRestrictions = request.redialRestrictions;
            this.runUntilEndTime = request.runUntilEndTime;
            this.scriptId = request.scriptId;
            this.startTime = request.startTime;
            this.weight = request.weight;
        } 

        /**
         * <p>呼叫执行顺序，默认MIN_ATTEMPT_FIRST</p>
         * 
         * <strong>example:</strong>
         * <p>MIN_ATTEMPT_FIRST</p>
         */
        public Builder attemptOrder(String attemptOrder) {
            this.putQueryParameter("AttemptOrder", attemptOrder);
            this.attemptOrder = attemptOrder;
            return this;
        }

        /**
         * <p>可执行时间（每日可外呼时间段）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;beginTime&quot;:&quot;09:00:00&quot;,&quot;endTime&quot;:&quot;18:00:00&quot; }]。</p>
         */
        public Builder callableTime(String callableTime) {
            this.putQueryParameter("CallableTime", callableTime);
            this.callableTime = callableTime;
            return this;
        }

        /**
         * <p>case文件的OSS Key，通过文件方式导入名单时使用</p>
         * 
         * <strong>example:</strong>
         * <p>cases/customer.csv</p>
         */
        public Builder caseFileKey(String caseFileKey) {
            this.putQueryParameter("CaseFileKey", caseFileKey);
            this.caseFileKey = caseFileKey;
            return this;
        }

        /**
         * <p>外呼名单（case）列表，与CaseFileKey二选一</p>
         */
        public Builder cases(java.util.List<Cases> cases) {
            String casesShrink = shrink(cases, "Cases", "json");
            this.putBodyParameter("Cases", casesShrink);
            this.cases = cases;
            return this;
        }

        /**
         * <p>外呼超时时间（秒），默认25</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder dialingTimeoutSeconds(Integer dialingTimeoutSeconds) {
            this.putQueryParameter("DialingTimeoutSeconds", dialingTimeoutSeconds);
            this.dialingTimeoutSeconds = dialingTimeoutSeconds;
            return this;
        }

        /**
         * <p>计划结束时间</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1579965079000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>固定并发数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder fixedQuota(Integer fixedQuota) {
            this.putQueryParameter("FixedQuota", fixedQuota);
            this.fixedQuota = fixedQuota;
            return this;
        }

        /**
         * <p>闪信参数（JSON字符串，示例: {&quot;applicationId&quot;:&quot;xxx&quot;,&quot;templateId&quot;:&quot;yyy&quot;}）</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder flashSmsParameters(String flashSmsParameters) {
            this.putQueryParameter("FlashSmsParameters", flashSmsParameters);
            this.flashSmsParameters = flashSmsParameters;
            return this;
        }

        /**
         * <p>节假日禁止外呼</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder holidayRestricted(Boolean holidayRestricted) {
            this.putQueryParameter("HolidayRestricted", holidayRestricted);
            this.holidayRestricted = holidayRestricted;
            return this;
        }

        /**
         * <p>外呼实例ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>最大重试次数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxAttemptCount(Integer maxAttemptCount) {
            this.putQueryParameter("MaxAttemptCount", maxAttemptCount);
            this.maxAttemptCount = maxAttemptCount;
            return this;
        }

        /**
         * <p>最小重试间隔</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder minAttemptInterval(Integer minAttemptInterval) {
            this.putQueryParameter("MinAttemptInterval", minAttemptInterval);
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }

        /**
         * <p>外呼活动名称</p>
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>主叫号码列表</p>
         */
        public Builder numbers(java.util.List<String> numbers) {
            String numbersShrink = shrink(numbers, "Numbers", "json");
            this.putQueryParameter("Numbers", numbersShrink);
            this.numbers = numbers;
            return this;
        }

        /**
         * <p>外呼尝试限制条件列表</p>
         */
        public Builder redialRestrictions(String redialRestrictions) {
            this.putQueryParameter("RedialRestrictions", redialRestrictions);
            this.redialRestrictions = redialRestrictions;
            return this;
        }

        /**
         * <p>联系人均拨打完成时是否持续执行至活动结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder runUntilEndTime(Boolean runUntilEndTime) {
            this.putQueryParameter("RunUntilEndTime", runUntilEndTime);
            this.runUntilEndTime = runUntilEndTime;
            return this;
        }

        /**
         * <p>IVR流程ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aa279896-64a6-4182-864c-4f2b04ec8d17</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>计划开始时间</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1578965079000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>活动权重</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder weight(Integer weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public CreateCampaignRequest build() {
            return new CreateCampaignRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCampaignRequest} extends {@link TeaModel}
     *
     * <p>CreateCampaignRequest</p>
     */
    public static class Cases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomVariables")
        private String customVariables;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("ReferenceId")
        private String referenceId;

        private Cases(Builder builder) {
            this.customVariables = builder.customVariables;
            this.phoneNumber = builder.phoneNumber;
            this.priority = builder.priority;
            this.referenceId = builder.referenceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cases create() {
            return builder().build();
        }

        /**
         * @return customVariables
         */
        public String getCustomVariables() {
            return this.customVariables;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return referenceId
         */
        public String getReferenceId() {
            return this.referenceId;
        }

        public static final class Builder {
            private String customVariables; 
            private String phoneNumber; 
            private String priority; 
            private String referenceId; 

            private Builder() {
            } 

            private Builder(Cases model) {
                this.customVariables = model.customVariables;
                this.phoneNumber = model.phoneNumber;
                this.priority = model.priority;
                this.referenceId = model.referenceId;
            } 

            /**
             * <p>自定义变量，JSON字符串，用于话术中的变量替换</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * <p>被叫号码</p>
             * 
             * <strong>example:</strong>
             * <p>133********</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>名单外呼优先级</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>名单的外部业务关联ID，用于回调时关联业务数据</p>
             * 
             * <strong>example:</strong>
             * <p>bizId-1</p>
             */
            public Builder referenceId(String referenceId) {
                this.referenceId = referenceId;
                return this;
            }

            public Cases build() {
                return new Cases(this);
            } 

        } 

    }
}
