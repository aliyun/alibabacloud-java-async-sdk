// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertRuleRequest</p>
 */
public class UpdateAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long alertId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupIds")
    private String contactGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAutoStart")
    private Boolean isAutoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplageAlertConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templageAlertConfig;

    private UpdateAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.contactGroupIds = builder.contactGroupIds;
        this.isAutoStart = builder.isAutoStart;
        this.regionId = builder.regionId;
        this.templageAlertConfig = builder.templageAlertConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
    }

    /**
     * @return contactGroupIds
     */
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    /**
     * @return isAutoStart
     */
    public Boolean getIsAutoStart() {
        return this.isAutoStart;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templageAlertConfig
     */
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

    public static final class Builder extends Request.Builder<UpdateAlertRuleRequest, Builder> {
        private Long alertId; 
        private String contactGroupIds; 
        private Boolean isAutoStart; 
        private String regionId; 
        private String templageAlertConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertRuleRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.contactGroupIds = request.contactGroupIds;
            this.isAutoStart = request.isAutoStart;
            this.regionId = request.regionId;
            this.templageAlertConfig = request.templageAlertConfig;
        } 

        /**
         * <p>The ID of the alert rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * <p>The IDs of the alert contact groups. The value must be a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[123, 234]</p>
         */
        public Builder contactGroupIds(String contactGroupIds) {
            this.putQueryParameter("ContactGroupIds", contactGroupIds);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable the alert rule after it is created. Default value: <code>false</code>.</p>
         * <ul>
         * <li><code>true</code>: enables the alert rule.</li>
         * <li><code>false</code>: disables the alert rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isAutoStart(Boolean isAutoStart) {
            this.putQueryParameter("IsAutoStart", isAutoStart);
            this.isAutoStart = isAutoStart;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
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
         * <p>The configurations of the alert template based on which you want to create an alert rule. The value must be a JSON string. You must set at least one of the <strong>TemplateAlertId</strong> and <strong>TemplageAlertConfig</strong> parameters. If you set both parameters, the <strong>TemplateAlertId</strong> parameter prevails. For more information about the TemplageAlertConfig parameter, see the following <strong>additional information about the TemplageAlertConfig parameter</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;contactGroupIds&quot;: &quot;381&quot;, &quot;alertType&quot;: 5, &quot;alarmContext&quot;: { &quot;subTitle&quot;: &quot;&quot;, &quot;content&quot;: &quot;Alarm name: $alarm name\nFilter condition: $filter\nAlarm time : $Alarm time\nAlarm content: $Alarm content\nNote: Before the recovery email is received, the alarm is in continuous alarm, and you will be reminded again after 24 hours!&quot; }, &quot;alertLevel&quot;: &quot;WARN&quot;, &quot; metricParam&quot;: { &quot;appId&quot;: &quot;70901&quot;, &quot;pid&quot;: &quot;atc889zkcf@d8deedfa9bf****&quot;, &quot;type&quot;: &quot;TXN&quot;, &quot;dimensions&quot;: [ { &quot;type&quot;: &quot;STATIC&quot;, &quot;value &quot;: &quot;\/hello_test_api_address\/test1&quot;, &quot;key&quot;: &quot;rpc&quot; } ] }, &quot;alertWay&quot;: [ &quot;SMS&quot;, &quot;MAIL&quot;, &quot;DING_ROBOT&quot; ], &quot;alertRule&quot;: { &quot;rules&quot; : [ { &quot;measure&quot;: &quot;appstat.txn.rt&quot;, &quot;alias&quot;: &quot;Entry call response time_ms&quot;, &quot;aggregates&quot;: &quot;AVG&quot;, &quot;nValue&quot;: 1, &quot;value&quot;: 1, &quot;operator &quot;: &quot;CURRENT_GTE&quot; } ], &quot;operator&quot;: &quot;|&quot; }, &quot;title&quot;: &quot;Alarm template alarm name&quot;, &quot;config&quot;: &quot;{&quot;continuous&quot;:false,&quot;dataRevision&quot;:2, &quot;ownerId&quot;:&quot;123412341234&quot;}&quot;, &quot;notice&quot;: { &quot;noticeStartTime&quot;: 1480521600000, &quot;startTime&quot;: 1480521600000, &quot;endTime&quot;: 1480607940000, &quot;noticeEndTime&quot;: 1480607940000 }, &quot;stat us&quot;: &quot;NON &quot; } ]</p>
         */
        public Builder templageAlertConfig(String templageAlertConfig) {
            this.putQueryParameter("TemplageAlertConfig", templageAlertConfig);
            this.templageAlertConfig = templageAlertConfig;
            return this;
        }

        @Override
        public UpdateAlertRuleRequest build() {
            return new UpdateAlertRuleRequest(this);
        } 

    } 

}
