// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobMonitorRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateJobMonitorRuleRequest</p>
 */
public class CreateJobMonitorRuleRequest extends Request {
    @Query
    @NameInMap("DelayRuleTime")
    private Long delayRuleTime;

    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("NoticeValue")
    private Integer noticeValue;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("Phone")
    private String phone;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("Times")
    private Integer times;

    @Query
    @NameInMap("Type")
    private String type;

    private CreateJobMonitorRuleRequest(Builder builder) {
        super(builder);
        this.delayRuleTime = builder.delayRuleTime;
        this.dtsJobId = builder.dtsJobId;
        this.noticeValue = builder.noticeValue;
        this.period = builder.period;
        this.phone = builder.phone;
        this.regionId = builder.regionId;
        this.state = builder.state;
        this.times = builder.times;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobMonitorRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return delayRuleTime
     */
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return noticeValue
     */
    public Integer getNoticeValue() {
        return this.noticeValue;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return times
     */
    public Integer getTimes() {
        return this.times;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateJobMonitorRuleRequest, Builder> {
        private Long delayRuleTime; 
        private String dtsJobId; 
        private Integer noticeValue; 
        private Integer period; 
        private String phone; 
        private String regionId; 
        private String state; 
        private Integer times; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobMonitorRuleRequest request) {
            super(request);
            this.delayRuleTime = request.delayRuleTime;
            this.dtsJobId = request.dtsJobId;
            this.noticeValue = request.noticeValue;
            this.period = request.period;
            this.phone = request.phone;
            this.regionId = request.regionId;
            this.state = request.state;
            this.times = request.times;
            this.type = request.type;
        } 

        /**
         * The threshold for triggering latency alerts.
         * <p>
         * 
         * *   If the **Type** parameter is set to **delay**, the threshold must be an integer. You can set the threshold based on your requirements. To prevent jitters caused by network and database overloads, we recommend that you set the threshold to more than 10 seconds. Unit: seconds.
         * *   If the **Type** parameter is set to **full_timeout**, the threshold must be an integer. Unit: hours.
         * 
         * >  This parameter is required if the **Type** parameter is set to **delay** or **full_timeout** and the **State** parameter is set to **Y**.
         */
        public Builder delayRuleTime(Long delayRuleTime) {
            this.putQueryParameter("DelayRuleTime", delayRuleTime);
            this.delayRuleTime = delayRuleTime;
            return this;
        }

        /**
         * The ID of the data migration, data synchronization, or change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The alert threshold.
         */
        public Builder noticeValue(Integer noticeValue) {
            this.putQueryParameter("NoticeValue", noticeValue);
            this.noticeValue = noticeValue;
            return this;
        }

        /**
         * The statistical period of the incremental data verification task. Unit: minutes.
         * <p>
         * 
         * >  Valid values: 1, 3, 5, and 30.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The mobile numbers that receive alert notifications. Separate multiple mobile numbers with commas (,).
         * <p>
         * 
         * > 
         * *   This parameter is available only for users of the China site (aliyun.com). Only mobile numbers in the Chinese mainland are supported. You can specify up to 10 mobile numbers.
         * *   Users of the international site (alibabacloud.com) cannot receive alerts by using mobile phones, but can [configure alert rules for DTS tasks in the CloudMonitor console](~~175876~~).
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to enable the alert rule. Valid values:
         * <p>
         * 
         * *   **Y**: enables the alert rule.
         * *   **N**: disables the alert rule.
         * 
         * Default value: **Y**.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * The number of statistical periods of the incremental data verification task.
         */
        public Builder times(Integer times) {
            this.putQueryParameter("Times", times);
            this.times = times;
            return this;
        }

        /**
         * The metric that is used to monitor the task. Valid values:
         * <p>
         * 
         * *   **delay**: the **Latency** metric.
         * *   **error**: the **Status** metric.
         * *   **full_timeout**: the **Full Timeout** metric.
         * 
         * Default value: **error**. You must manually set this value.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateJobMonitorRuleRequest build() {
            return new CreateJobMonitorRuleRequest(this);
        } 

    } 

}
