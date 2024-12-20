// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ImportAppAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>ImportAppAlertRulesRequest</p>
 */
public class ImportAppAlertRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupIds")
    private String contactGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAutoStart")
    private Boolean isAutoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplageAlertConfig")
    private String templageAlertConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateAlertId")
    private String templateAlertId;

    private ImportAppAlertRulesRequest(Builder builder) {
        super(builder);
        this.contactGroupIds = builder.contactGroupIds;
        this.isAutoStart = builder.isAutoStart;
        this.pids = builder.pids;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
        this.templageAlertConfig = builder.templageAlertConfig;
        this.templateAlertId = builder.templateAlertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportAppAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pids
     */
    public String getPids() {
        return this.pids;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templageAlertConfig
     */
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

    /**
     * @return templateAlertId
     */
    public String getTemplateAlertId() {
        return this.templateAlertId;
    }

    public static final class Builder extends Request.Builder<ImportAppAlertRulesRequest, Builder> {
        private String contactGroupIds; 
        private Boolean isAutoStart; 
        private String pids; 
        private String regionId; 
        private java.util.List<Tags> tags; 
        private String templageAlertConfig; 
        private String templateAlertId; 

        private Builder() {
            super();
        } 

        private Builder(ImportAppAlertRulesRequest request) {
            super(request);
            this.contactGroupIds = request.contactGroupIds;
            this.isAutoStart = request.isAutoStart;
            this.pids = request.pids;
            this.regionId = request.regionId;
            this.tags = request.tags;
            this.templageAlertConfig = request.templageAlertConfig;
            this.templateAlertId = request.templateAlertId;
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
         * <p>The process identifiers (PIDs) of the applications associated with the alert rule. The value must be a JSON array. For more information about how to obtain the PID, see <a href="~~186100#section-bkl-3j6-ezg~~">Obtain the PID of an application</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;atc889zkcf@d8deedfa9bfxxxx&quot;, &quot;acd129bfcf@d5daebfa6cdxxxx&quot;]</p>
         */
        public Builder pids(String pids) {
            this.putQueryParameter("Pids", pids);
            this.pids = pids;
            return this;
        }

        /**
         * <p>The ID of the region where the associated applications reside.</p>
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
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The configurations of the alert template based on which you want to create an alert rule. The value must be a JSON string. You must set at least one of the <strong>TemplateAlertId</strong> and <strong>TemplageAlertConfig</strong> parameters. If you set both parameters, the <strong>TemplateAlertId</strong> parameter prevails. For more information about the TemplageAlertConfig parameter, see the following <strong>additional information about the TemplageAlertConfig parameter</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;contactGroupIds&quot;: &quot;381&quot;, &quot;alertType&quot;: 5, &quot;alarmContext&quot;: { &quot;subTitle&quot;: &quot;&quot;, &quot;content&quot;: &quot;Alarm name: $alarm name\nFilter condition: $filter\nAlarm time : $Alarm time\nAlarm content: $Alarm content\nNote: Before the recovery email is received, the alarm is in continuous alarm, and you will be reminded again after 24 hours!&quot; }, &quot;alertLevel&quot;: &quot;WARN&quot;, &quot; metricParam&quot;: { &quot;appId&quot;: &quot;70901&quot;, &quot;pid&quot;: &quot;atc889zkcf@d8deedfa9bf****&quot;, &quot;type&quot;: &quot;TXN&quot;, &quot;dimensions&quot;: [ { &quot;type&quot;: &quot;STATIC&quot;, &quot;value &quot;: &quot;\/hello_test_api_address\/test1&quot;, &quot;key&quot;: &quot;rpc&quot; } ] }, &quot;alertWay&quot;: [ &quot;SMS&quot;, &quot;MAIL&quot;, &quot;DING_ROBOT&quot; ], &quot;alertRule&quot;: { &quot;rules&quot; : [ { &quot;measure&quot;: &quot;appstat.txn.rt&quot;, &quot;alias&quot;: &quot;Entry call response time_ms&quot;, &quot;aggregates&quot;: &quot;AVG&quot;, &quot;nValue&quot;: 1, &quot;value&quot;: 1, &quot;operator &quot;: &quot;CURRENT_GTE&quot; } ], &quot;operator&quot;: &quot;|&quot; }, &quot;title&quot;: &quot;Alarm template alarm name&quot;, &quot;config&quot;: &quot;{&quot;continuous&quot;:false,&quot;dataRevision&quot;:2, &quot;ownerId&quot;:&quot;123412341234&quot;}&quot;, &quot;notice&quot;: { &quot;noticeStartTime&quot;: 1480521600000, &quot;startTime&quot;: 1480521600000, &quot;endTime&quot;: 1480607940000, &quot;noticeEndTime&quot;: 1480607940000 }, &quot;stat us&quot;: &quot;NON &quot; } ]</p>
         */
        public Builder templageAlertConfig(String templageAlertConfig) {
            this.putQueryParameter("TemplageAlertConfig", templageAlertConfig);
            this.templageAlertConfig = templageAlertConfig;
            return this;
        }

        /**
         * <p>The ID of the alert template. You must set at least one of the <strong>TemplateAlertId</strong> and <strong>TemplageAlertConfig</strong> parameters. If you set both parameters, the <strong>TemplateAlertId</strong> parameter prevails.</p>
         * 
         * <strong>example:</strong>
         * <p>324324234</p>
         */
        public Builder templateAlertId(String templateAlertId) {
            this.putQueryParameter("TemplateAlertId", templateAlertId);
            this.templateAlertId = templateAlertId;
            return this;
        }

        @Override
        public ImportAppAlertRulesRequest build() {
            return new ImportAppAlertRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ImportAppAlertRulesRequest} extends {@link TeaModel}
     *
     * <p>ImportAppAlertRulesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
