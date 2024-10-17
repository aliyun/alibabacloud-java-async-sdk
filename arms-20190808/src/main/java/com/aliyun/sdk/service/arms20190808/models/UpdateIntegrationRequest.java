// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateIntegrationRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntegrationRequest</p>
 */
public class UpdateIntegrationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRecover")
    private Boolean autoRecover;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DuplicateKey")
    private String duplicateKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendedFieldRedefineRules")
    private String extendedFieldRedefineRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FieldRedefineRules")
    private String fieldRedefineRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InitiativeRecoverField")
    private String initiativeRecoverField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InitiativeRecoverValue")
    private String initiativeRecoverValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegrationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long integrationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegrationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String integrationName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IntegrationProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String integrationProductType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Liveness")
    private String liveness;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecoverTime")
    private Long recoverTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stat")
    private String stat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("State")
    private Boolean state;

    private UpdateIntegrationRequest(Builder builder) {
        super(builder);
        this.autoRecover = builder.autoRecover;
        this.description = builder.description;
        this.duplicateKey = builder.duplicateKey;
        this.extendedFieldRedefineRules = builder.extendedFieldRedefineRules;
        this.fieldRedefineRules = builder.fieldRedefineRules;
        this.initiativeRecoverField = builder.initiativeRecoverField;
        this.initiativeRecoverValue = builder.initiativeRecoverValue;
        this.integrationId = builder.integrationId;
        this.integrationName = builder.integrationName;
        this.integrationProductType = builder.integrationProductType;
        this.liveness = builder.liveness;
        this.recoverTime = builder.recoverTime;
        this.stat = builder.stat;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntegrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRecover
     */
    public Boolean getAutoRecover() {
        return this.autoRecover;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return duplicateKey
     */
    public String getDuplicateKey() {
        return this.duplicateKey;
    }

    /**
     * @return extendedFieldRedefineRules
     */
    public String getExtendedFieldRedefineRules() {
        return this.extendedFieldRedefineRules;
    }

    /**
     * @return fieldRedefineRules
     */
    public String getFieldRedefineRules() {
        return this.fieldRedefineRules;
    }

    /**
     * @return initiativeRecoverField
     */
    public String getInitiativeRecoverField() {
        return this.initiativeRecoverField;
    }

    /**
     * @return initiativeRecoverValue
     */
    public String getInitiativeRecoverValue() {
        return this.initiativeRecoverValue;
    }

    /**
     * @return integrationId
     */
    public Long getIntegrationId() {
        return this.integrationId;
    }

    /**
     * @return integrationName
     */
    public String getIntegrationName() {
        return this.integrationName;
    }

    /**
     * @return integrationProductType
     */
    public String getIntegrationProductType() {
        return this.integrationProductType;
    }

    /**
     * @return liveness
     */
    public String getLiveness() {
        return this.liveness;
    }

    /**
     * @return recoverTime
     */
    public Long getRecoverTime() {
        return this.recoverTime;
    }

    /**
     * @return stat
     */
    public String getStat() {
        return this.stat;
    }

    /**
     * @return state
     */
    public Boolean getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<UpdateIntegrationRequest, Builder> {
        private Boolean autoRecover; 
        private String description; 
        private String duplicateKey; 
        private String extendedFieldRedefineRules; 
        private String fieldRedefineRules; 
        private String initiativeRecoverField; 
        private String initiativeRecoverValue; 
        private Long integrationId; 
        private String integrationName; 
        private String integrationProductType; 
        private String liveness; 
        private Long recoverTime; 
        private String stat; 
        private Boolean state; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntegrationRequest request) {
            super(request);
            this.autoRecover = request.autoRecover;
            this.description = request.description;
            this.duplicateKey = request.duplicateKey;
            this.extendedFieldRedefineRules = request.extendedFieldRedefineRules;
            this.fieldRedefineRules = request.fieldRedefineRules;
            this.initiativeRecoverField = request.initiativeRecoverField;
            this.initiativeRecoverValue = request.initiativeRecoverValue;
            this.integrationId = request.integrationId;
            this.integrationName = request.integrationName;
            this.integrationProductType = request.integrationProductType;
            this.liveness = request.liveness;
            this.recoverTime = request.recoverTime;
            this.stat = request.stat;
            this.state = request.state;
        } 

        /**
         * <p>Specifies whether to automatically clear alert events. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRecover(Boolean autoRecover) {
            this.putBodyParameter("AutoRecover", autoRecover);
            this.autoRecover = autoRecover;
            return this;
        }

        /**
         * <p>The description of the alert integration.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The fields whose values are deduplicated.</p>
         * 
         * <strong>example:</strong>
         * <p>LABEL.dimensions::LABEL.ruleId</p>
         */
        public Builder duplicateKey(String duplicateKey) {
            this.putBodyParameter("DuplicateKey", duplicateKey);
            this.duplicateKey = duplicateKey;
            return this;
        }

        /**
         * <p>The extended mapped fields are mapped to the fields of ARMS alerts. For more information, see the description of the ExtendedFieldRedefineRules parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;redefineType&quot;:&quot;EXTRACT&quot;,
         *         &quot;matchExpression&quot;:null,
         *         &quot;fieldName&quot;:&quot;dimensions&quot;,
         *         &quot;expression&quot;:null,
         *         &quot;mappingRuleList&quot;:[</p>
         * <pre><code>    ],
         *     &quot;name&quot;:&quot;dimensions&quot;,
         *     &quot;integrationId&quot;:1234,
         *     &quot;jsonPath&quot;:&quot;$.dimensions&quot;,
         *     &quot;id&quot;:10013,
         *     &quot;fieldType&quot;:&quot;LABEL&quot;
         * },
         * {
         *     &quot;redefineType&quot;:&quot;EXTRACT&quot;,
         *     &quot;matchExpression&quot;:null,
         *     &quot;fieldName&quot;:&quot;expression&quot;,
         *     &quot;expression&quot;:null,
         *     &quot;mappingRuleList&quot;:[
         * 
         *     ],
         *     &quot;name&quot;:&quot;expression&quot;,
         *     &quot;integrationId&quot;:1234,
         *     &quot;jsonPath&quot;:&quot;$.expression&quot;,
         *     &quot;id&quot;:10014,
         *     &quot;fieldType&quot;:&quot;LABEL&quot;
         * }
         * </code></pre>
         * <p>]</p>
         */
        public Builder extendedFieldRedefineRules(String extendedFieldRedefineRules) {
            this.putBodyParameter("ExtendedFieldRedefineRules", extendedFieldRedefineRules);
            this.extendedFieldRedefineRules = extendedFieldRedefineRules;
            return this;
        }

        /**
         * <p>The predefined mapped fields are mapped to the fields of ARMS alerts. The predefined mapped fields were generated when the alert integration was created. For more information, see the description of the FieldRedefineRules parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;redefineType&quot;:&quot;EXTRACT&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;alertname&quot;, &quot;expression&quot;:null, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Alert name&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:&quot;$.alertName&quot;, &quot;id&quot;:10001, &quot;fieldType&quot;:&quot;LABEL&quot; }, { &quot;redefineType&quot;:&quot;MAP&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;severity&quot;, &quot;expression&quot;:null, &quot;mappingRuleList&quot;:[ { &quot;mappingValue&quot;:&quot;critical&quot;, &quot;mappingName&quot;:&quot;P1&quot;, &quot;mappingType&quot;:&quot;MAP&quot;, &quot;originValue&quot;:&quot;CRITICAL&quot; }, { &quot;mappingValue&quot;:&quot;error&quot;, &quot;mappingName&quot;:&quot;P2&quot;, &quot;mappingType&quot;:&quot;MAP&quot;, &quot;originValue&quot;:&quot;WARN&quot; }, { &quot;mappingValue&quot;:&quot;warning&quot;, &quot;mappingName&quot;:&quot;P3&quot;, &quot;mappingType&quot;:&quot;MAP&quot;, &quot;originValue&quot;:&quot;INFO&quot; } ], &quot;name&quot;:&quot;Alert level&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:&quot;$.triggerLevel&quot;, &quot;id&quot;:10002, &quot;fieldType&quot;:&quot;LABEL&quot; }, { &quot;redefineType&quot;:&quot;EXTRACT&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;message&quot;, &quot;expression&quot;:&quot;{{$labels.namespace}} / {{$labels.dimensions}} Alert content {{ $labels.alertname }}, Current value {{$value}}.&quot;, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Alert description&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:null, &quot;id&quot;:10003, &quot;fieldType&quot;:&quot;ANNOTATION&quot; }, { &quot;redefineType&quot;:&quot;EXTRACT&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;value&quot;, &quot;expression&quot;:null, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Alert sample value&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:&quot;$.curValue&quot;, &quot;id&quot;:10004, &quot;fieldType&quot;:&quot;ANNOTATION&quot; }, { &quot;redefineType&quot;:&quot;EXTRACT&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;source&quot;, &quot;expression&quot;:null, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Source&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:null, &quot;id&quot;:10007, &quot;fieldType&quot;:&quot;LABEL&quot; }, { &quot;redefineType&quot;:&quot;ADD&quot;, &quot;matchExpression&quot;:null, &quot;fieldName&quot;:&quot;generatorUrl&quot;, &quot;expression&quot;:&quot;<a href="https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name=%7B%7B$labels.ruleId%7D%7D%5C&searchValue=%5C&searchType=name%5C&searchProduct=/history/all/searchKey:%7B%7B$labels.ruleId%7D%7D,startTime:%7B%7Bsub">https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name={{$labels.ruleId}}\&amp;searchValue=\&amp;searchType=name\&amp;searchProduct=/history/all/searchKey:{{$labels.ruleId}},startTime:{{sub</a> $startsAt 300000}},endTime:{{$endsAt}}&quot;, &quot;mappingRuleList&quot;:[ ], &quot;name&quot;:&quot;Event URL&quot;, &quot;integrationId&quot;:1234, &quot;jsonPath&quot;:&quot;<a href="https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name=%7B%7B$labels.ruleId%7D%7D%5C&searchValue=%5C&searchType=name%5C&searchProduct=/history/all/searchKey:%7B%7B$labels.ruleId%7D%7D,startTime:%7B%7Bsub">https://cloudmonitor.console.aliyun.com/index.htm#/alarmInfo/name={{$labels.ruleId}}\&amp;searchValue=\&amp;searchType=name\&amp;searchProduct=/history/all/searchKey:{{$labels.ruleId}},startTime:{{sub</a> $startsAt 300000}},endTime:{{$endsAt}}&quot;, &quot;id&quot;:10012, &quot;fieldType&quot;:&quot;GENERATE_URL&quot; } ]</p>
         */
        public Builder fieldRedefineRules(String fieldRedefineRules) {
            this.putBodyParameter("FieldRedefineRules", fieldRedefineRules);
            this.fieldRedefineRules = fieldRedefineRules;
            return this;
        }

        /**
         * <p>The field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
         * <blockquote>
         * <p>Only the Log Service alert integration supports the parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$.status</p>
         */
        public Builder initiativeRecoverField(String initiativeRecoverField) {
            this.putBodyParameter("InitiativeRecoverField", initiativeRecoverField);
            this.initiativeRecoverField = initiativeRecoverField;
            return this;
        }

        /**
         * <p>The value of the field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
         * <blockquote>
         * <p>Only the Log Service alert integration supports the parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder initiativeRecoverValue(String initiativeRecoverValue) {
            this.putBodyParameter("InitiativeRecoverValue", initiativeRecoverValue);
            this.initiativeRecoverValue = initiativeRecoverValue;
            return this;
        }

        /**
         * <p>The ID of the alert integration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder integrationId(Long integrationId) {
            this.putBodyParameter("IntegrationId", integrationId);
            this.integrationId = integrationId;
            return this;
        }

        /**
         * <p>The name of the alert integration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudMonitor integration</p>
         */
        public Builder integrationName(String integrationName) {
            this.putBodyParameter("IntegrationName", integrationName);
            this.integrationName = integrationName;
            return this;
        }

        /**
         * <p>The service of the alert integration. Valid values:</p>
         * <ul>
         * <li>CLOUD_MONITOR: CloudMonitor</li>
         * <li>LOG_SERVICE: Log Service</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_MONITOR</p>
         */
        public Builder integrationProductType(String integrationProductType) {
            this.putBodyParameter("IntegrationProductType", integrationProductType);
            this.integrationProductType = integrationProductType;
            return this;
        }

        /**
         * <p>The activity of the alert integration</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        public Builder liveness(String liveness) {
            this.putBodyParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
         * <p>The period of time within which alert events are automatically cleared. Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder recoverTime(Long recoverTime) {
            this.putBodyParameter("RecoverTime", recoverTime);
            this.recoverTime = recoverTime;
            return this;
        }

        /**
         * <p>The total number of alert events and the number of abnormal alert events in the last hour.</p>
         * 
         * <strong>example:</strong>
         * <p>[0,0]</p>
         */
        public Builder stat(String stat) {
            this.putBodyParameter("Stat", stat);
            this.stat = stat;
            return this;
        }

        /**
         * <p>Indicates whether the alert integration was enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder state(Boolean state) {
            this.putBodyParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public UpdateIntegrationRequest build() {
            return new UpdateIntegrationRequest(this);
        } 

    } 

}
