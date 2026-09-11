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
         * <li><p>If <strong>Type</strong> is set to <strong>delay</strong>, the unit is seconds and the value must be an integer. Set the threshold based on your business requirements. A value of 10 or greater is recommended to avoid alert fluctuations caused by network issues or database loads.</p>
         * </li>
         * <li><p>If <strong>Type</strong> is set to <strong>full_timeout</strong>, the unit is hours and the value must be an integer.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <strong>Type</strong> is set to <strong>delay</strong> or <strong>full_timeout</strong> and <strong>State</strong> is set to <strong>Y</strong>.</p>
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
         * <p>The ID of the data migration, data synchronization, or change tracking task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to obtain the task ID.</p>
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
         * <p>The statistical period of the incremental verification task. Unit: minutes.</p>
         * <blockquote>
         * <p>Valid values: 1, 5, 10, and 30.</p>
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
         * <p>The mobile phone numbers of alert contacts, separated by commas (,).</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is supported only on the China site (aliyun.com) and only for the Chinese mainland mobile phone numbers. A maximum of 10 mobile phone numbers can be specified.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The international site does not support SMS-based alerting. You can only <a href="https://help.aliyun.com/document_detail/175876.html">set alert rules for DTS tasks through the CloudMonitor monitoring platform</a>.</li>
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
         * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
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
         * <p>The resource group ID.</p>
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
         * <li><strong>Y</strong>: Enable the alert rule.</li>
         * <li><strong>N</strong>: Disable the alert rule.</li>
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
         * <p>The number of statistical periods for the incremental verification task.</p>
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
         * <p>The type of the alert metric. Valid values:</p>
         * <ul>
         * <li><strong>delay</strong>: the <strong>Latency</strong> metric.</li>
         * <li><strong>error</strong>: the <strong>Migration Status</strong> metric.</li>
         * <li><strong>full_timeout</strong>: the <strong>Full Migration Duration</strong> metric.</li>
         * </ul>
         * <p>Default value: <strong>error</strong>. This parameter must be manually specified.</p>
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
