// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateOrUpdateIMRobotRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateIMRobotRequest</p>
 */
public class CreateOrUpdateIMRobotRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CardTemplate")
    private String cardTemplate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DailyNoc")
    private Boolean dailyNoc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DailyNocTime")
    private String dailyNocTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DingSignKey")
    private String dingSignKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableOutgoing")
    private Boolean enableOutgoing;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RobotAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RobotId")
    private Long robotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RobotName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateOrUpdateIMRobotRequest(Builder builder) {
        super(builder);
        this.cardTemplate = builder.cardTemplate;
        this.dailyNoc = builder.dailyNoc;
        this.dailyNocTime = builder.dailyNocTime;
        this.dingSignKey = builder.dingSignKey;
        this.enableOutgoing = builder.enableOutgoing;
        this.robotAddress = builder.robotAddress;
        this.robotId = builder.robotId;
        this.robotName = builder.robotName;
        this.token = builder.token;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateIMRobotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cardTemplate
     */
    public String getCardTemplate() {
        return this.cardTemplate;
    }

    /**
     * @return dailyNoc
     */
    public Boolean getDailyNoc() {
        return this.dailyNoc;
    }

    /**
     * @return dailyNocTime
     */
    public String getDailyNocTime() {
        return this.dailyNocTime;
    }

    /**
     * @return dingSignKey
     */
    public String getDingSignKey() {
        return this.dingSignKey;
    }

    /**
     * @return enableOutgoing
     */
    public Boolean getEnableOutgoing() {
        return this.enableOutgoing;
    }

    /**
     * @return robotAddress
     */
    public String getRobotAddress() {
        return this.robotAddress;
    }

    /**
     * @return robotId
     */
    public Long getRobotId() {
        return this.robotId;
    }

    /**
     * @return robotName
     */
    public String getRobotName() {
        return this.robotName;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateIMRobotRequest, Builder> {
        private String cardTemplate; 
        private Boolean dailyNoc; 
        private String dailyNocTime; 
        private String dingSignKey; 
        private Boolean enableOutgoing; 
        private String robotAddress; 
        private Long robotId; 
        private String robotName; 
        private String token; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateIMRobotRequest request) {
            super(request);
            this.cardTemplate = request.cardTemplate;
            this.dailyNoc = request.dailyNoc;
            this.dailyNocTime = request.dailyNocTime;
            this.dingSignKey = request.dingSignKey;
            this.enableOutgoing = request.enableOutgoing;
            this.robotAddress = request.robotAddress;
            this.robotId = request.robotId;
            this.robotName = request.robotName;
            this.token = request.token;
            this.type = request.type;
        } 

        /**
         * <p>The configurations of the alert card template. For more information about the parameters in the template, see the following section.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;button&quot;: [         &quot;claim&quot;,         &quot;close&quot;,         &quot;follow&quot;,         &quot;send_itsm&quot;,         &quot;block&quot;,         &quot;unResolvedIncident&quot;     ],     &quot;field&quot;: [         {             &quot;fieldName&quot;: &quot;alarmName&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;notificationPolicy&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;alarmContent&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;alarmTime&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;seriesChart&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;includeEvent&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;assigned&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;similarAlarm&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;operator&quot;,             &quot;visible&quot;: true         }     ] }</p>
         */
        public Builder cardTemplate(String cardTemplate) {
            this.putBodyParameter("CardTemplate", cardTemplate);
            this.cardTemplate = cardTemplate;
            return this;
        }

        /**
         * <p>Specifies whether to send daily statistics. Valid values:</p>
         * <ul>
         * <li><code>false</code> (default): Daily statistics are not sent.</li>
         * <li><code>true</code>: Daily statistics are sent. If you set the value to <code>true</code>, the <strong>DailyNocTime</strong> parameter is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dailyNoc(Boolean dailyNoc) {
            this.putBodyParameter("DailyNoc", dailyNoc);
            this.dailyNoc = dailyNoc;
            return this;
        }

        /**
         * <p>The points in time at which the daily statistics are sent. Separate multiple points in time with commas (,). The points in time are in the HH:SS format. The information that ARMS sends at the specified points in time includes the total number of alerts generated on the current day, the number of cleared alerts, and the number of alerts to be cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>09:30,17:00</p>
         */
        public Builder dailyNocTime(String dailyNocTime) {
            this.putBodyParameter("DailyNocTime", dailyNocTime);
            this.dailyNocTime = dailyNocTime;
            return this;
        }

        /**
         * <p>The signature key of DingTalk. If you specify a signature key, DingTalk authentication is performed by using the signature key. If you do not specify a signature key, a whitelist is used for authentication by default. The keyword of the whitelist is <strong>Alert</strong>.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder dingSignKey(String dingSignKey) {
            this.putBodyParameter("DingSignKey", dingSignKey);
            this.dingSignKey = dingSignKey;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Outgoing feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableOutgoing(Boolean enableOutgoing) {
            this.putBodyParameter("EnableOutgoing", enableOutgoing);
            this.enableOutgoing = enableOutgoing;
            return this;
        }

        /**
         * <p>The webhook URL of the IM chatbot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=e1a049121">https://oapi.dingtalk.com/robot/send?access_token=e1a049121</a>******</p>
         */
        public Builder robotAddress(String robotAddress) {
            this.putBodyParameter("RobotAddress", robotAddress);
            this.robotAddress = robotAddress;
            return this;
        }

        /**
         * <p>The ID of the IM chatbot.</p>
         * <blockquote>
         * <p>If you do not specify the parameter, a new IM chatbot is created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder robotId(Long robotId) {
            this.putBodyParameter("RobotId", robotId);
            this.robotId = robotId;
            return this;
        }

        /**
         * <p>The name of the IM chatbot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Chatbot name</p>
         */
        public Builder robotName(String robotName) {
            this.putBodyParameter("RobotName", robotName);
            this.robotName = robotName;
            return this;
        }

        /**
         * <p>The token required to enable the Outgoing feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1656558719183be1245ab44********</p>
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The type of the IM chatbot. Valid values:</p>
         * <ul>
         * <li><code>dingding</code>: DingTalk chatbot</li>
         * <li><code>wechat</code>: WeCom chatbot</li>
         * <li><code>feishu</code>: Lark chatbot</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dingding</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateOrUpdateIMRobotRequest build() {
            return new CreateOrUpdateIMRobotRequest(this);
        } 

    } 

}
