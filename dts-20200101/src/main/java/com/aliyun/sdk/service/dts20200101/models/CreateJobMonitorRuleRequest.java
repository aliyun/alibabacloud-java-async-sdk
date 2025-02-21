// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link CreateJobMonitorRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateJobMonitorRuleRequest</p>
 */
public class CreateJobMonitorRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayRuleTime")
    private Long delayRuleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoticeValue")
    private Integer noticeValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Times")
    private Integer times;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateJobMonitorRuleRequest(Builder builder) {
        super(builder);
        this.delayRuleTime = builder.delayRuleTime;
        this.dtsJobId = builder.dtsJobId;
        this.noticeValue = builder.noticeValue;
        this.period = builder.period;
        this.phone = builder.phone;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        private String resourceGroupId; 
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
            this.resourceGroupId = request.resourceGroupId;
            this.state = request.state;
            this.times = request.times;
            this.type = request.type;
        } 

        /**
         * <p>The threshold for triggering an alert.</p>
         * <ul>
         * <li>If <strong>Type</strong> is set to <strong>delay</strong>, the threshold must be an integer in units of seconds. You can specify the threshold based on your business requirements. To prevent jitters caused by network and database overloads, we recommend that you set the threshold to more than 10 seconds.</li>
         * <li>If <strong>Type</strong> is set to <strong>full_timeout</strong>, the threshold must be an integer in units of hours.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required if <strong>Type</strong> is set to <strong>delay</strong> or <strong>full_timeout</strong> and <strong>State</strong> is set to <strong>Y</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder delayRuleTime(Long delayRuleTime) {
            this.putQueryParameter("DelayRuleTime", delayRuleTime);
            this.delayRuleTime = delayRuleTime;
            return this;
        }

        /**
         * <p>The ID of the data migration, data synchronization, or change tracking task. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i03e3zty16i****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder noticeValue(Integer noticeValue) {
            this.putQueryParameter("NoticeValue", noticeValue);
            this.noticeValue = noticeValue;
            return this;
        }

        /**
         * <p>The statistical period of the incremental data verification task. Unit: minutes.</p>
         * <blockquote>
         * <p>Valid values: 1, 3, 5, and 30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The mobile numbers that receive alert notifications. Separate multiple mobile numbers with commas (,).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is available only for users of the China site (aliyun.com). Only mobile numbers in the Chinese mainland are supported. You can specify up to 10 mobile numbers.</p>
         * </li>
         * <li><p>Users of the international site (alibabacloud.com) cannot receive notifications on alerts by using mobile numbers, but can configure alert rules for DTS tasks in the CloudMonitor console. For more information, see <a href="https://help.aliyun.com/document_detail/175876.html">Configure alert rules for DTS tasks in the CloudMonitor console</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the alert rule. Valid values:</p>
         * <ul>
         * <li><strong>Y</strong>: enables the alert rule.</li>
         * <li><strong>N</strong>: disables the alert rule.</li>
         * </ul>
         * <p>Default value: <strong>Y</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>The number of statistical periods of the incremental data verification task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder times(Integer times) {
            this.putQueryParameter("Times", times);
            this.times = times;
            return this;
        }

        /**
         * <p>The metric that is used to monitor the task. Valid values:</p>
         * <ul>
         * <li><strong>delay</strong>: the <strong>Latency</strong> metric.</li>
         * <li><strong>error</strong>: the <strong>Status</strong> metric.</li>
         * <li><strong>full_timeout</strong>: the <strong>Full Timeout</strong> metric.</li>
         * </ul>
         * <p>Default value: <strong>error</strong>. You must manually set this value.</p>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
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
