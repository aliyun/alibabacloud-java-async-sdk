// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateOrUpdateDingTalkRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateDingTalkRequest</p>
 */
public class CreateOrUpdateDingTalkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private String configList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DingTalkLang")
    private String dingTalkLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIdList")
    private String groupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalTime")
    private Long intervalTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleActionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleActionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sendUrl;

    private CreateOrUpdateDingTalkRequest(Builder builder) {
        super(builder);
        this.configList = builder.configList;
        this.dingTalkLang = builder.dingTalkLang;
        this.groupIdList = builder.groupIdList;
        this.id = builder.id;
        this.intervalTime = builder.intervalTime;
        this.ruleActionName = builder.ruleActionName;
        this.sendUrl = builder.sendUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateDingTalkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configList
     */
    public String getConfigList() {
        return this.configList;
    }

    /**
     * @return dingTalkLang
     */
    public String getDingTalkLang() {
        return this.dingTalkLang;
    }

    /**
     * @return groupIdList
     */
    public String getGroupIdList() {
        return this.groupIdList;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return intervalTime
     */
    public Long getIntervalTime() {
        return this.intervalTime;
    }

    /**
     * @return ruleActionName
     */
    public String getRuleActionName() {
        return this.ruleActionName;
    }

    /**
     * @return sendUrl
     */
    public String getSendUrl() {
        return this.sendUrl;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateDingTalkRequest, Builder> {
        private String configList; 
        private String dingTalkLang; 
        private String groupIdList; 
        private Long id; 
        private Long intervalTime; 
        private String ruleActionName; 
        private String sendUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateDingTalkRequest request) {
            super(request);
            this.configList = request.configList;
            this.dingTalkLang = request.dingTalkLang;
            this.groupIdList = request.groupIdList;
            this.id = request.id;
            this.intervalTime = request.intervalTime;
            this.ruleActionName = request.ruleActionName;
            this.sendUrl = request.sendUrl;
        } 

        /**
         * <p>The alerts for which you want the chatbot to send notifications. The value is a JSON array that contains the following fields:</p>
         * <ul>
         * <li><p><strong>type</strong>: the types of alerts. The valid values are listed in the &quot;Additional description of parameters&quot; section in this topic.</p>
         * </li>
         * <li><p><strong>configItemList</strong>: the list of check items. The value is a JSON array that contains the following fields:</p>
         * <ul>
         * <li><strong>key</strong>: the key of the check item.</li>
         * <li><strong>valueList</strong>: the values of the check item. The value of valueList is a JSON array.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information about the value of this parameter, see the &quot;Addition description of parameters&quot; section in this topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;sas_analysis_online-sas-operation-log-sas-event-suspicious&quot;,&quot;configItemList&quot;:[{&quot;key&quot;:&quot;item_level&quot;,&quot;valueList&quot;:[&quot;all&quot;]},{&quot;key&quot;:&quot;event_type&quot;,&quot;valueList&quot;:[&quot;all&quot;]}]}]</p>
         */
        public Builder configList(String configList) {
            this.putQueryParameter("ConfigList", configList);
            this.configList = configList;
            return this;
        }

        /**
         * <p>The language of the notifications. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder dingTalkLang(String dingTalkLang) {
            this.putQueryParameter("DingTalkLang", dingTalkLang);
            this.dingTalkLang = dingTalkLang;
            return this;
        }

        /**
         * <p>The IDs of asset groups for which you want the chatbot to send notifications. The value is a JSON array.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupStruct~~">DescribeGroupStruct</a> operation to query the IDs of asset groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10417151&quot;]</p>
         */
        public Builder groupIdList(String groupIdList) {
            this.putQueryParameter("GroupIdList", groupIdList);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * <p>The ID of the chatbot.</p>
         * <blockquote>
         * <p>You can call the <a href="https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-describedingtalk/?spm=a2c63.p38356.0.0.681e4360Qd1eb1">DescribeDingTalk</a> operation to query the IDs of chatbots.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1589</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The time interval at which the chatbot sends notifications.</p>
         * <blockquote>
         * <p>The value <strong>0</strong> indicates unlimited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder intervalTime(Long intervalTime) {
            this.putQueryParameter("IntervalTime", intervalTime);
            this.intervalTime = intervalTime;
            return this;
        }

        /**
         * <p>The name of the chatbot.</p>
         * <blockquote>
         * <p>The name of a chatbot must be 2 to 64 characters in length.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testNotify</p>
         */
        public Builder ruleActionName(String ruleActionName) {
            this.putQueryParameter("RuleActionName", ruleActionName);
            this.ruleActionName = ruleActionName;
            return this;
        }

        /**
         * <p>The webhook URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=XXX">https://oapi.dingtalk.com/robot/send?access_token=XXX</a></p>
         */
        public Builder sendUrl(String sendUrl) {
            this.putQueryParameter("SendUrl", sendUrl);
            this.sendUrl = sendUrl;
            return this;
        }

        @Override
        public CreateOrUpdateDingTalkRequest build() {
            return new CreateOrUpdateDingTalkRequest(this);
        } 

    } 

}
