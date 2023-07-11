// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateDingTalkRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateDingTalkRequest</p>
 */
public class CreateOrUpdateDingTalkRequest extends Request {
    @Query
    @NameInMap("ConfigList")
    private String configList;

    @Query
    @NameInMap("DingTalkLang")
    private String dingTalkLang;

    @Query
    @NameInMap("GroupIdList")
    private String groupIdList;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("IntervalTime")
    private Long intervalTime;

    @Query
    @NameInMap("RuleActionName")
    @Validation(required = true)
    private String ruleActionName;

    @Query
    @NameInMap("SendUrl")
    @Validation(required = true)
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
         * The alerts for which you want the chatbot to send notifications. The value is a JSON array that contains the following fields:
         * <p>
         * 
         * *   **type**: the types of alerts. The valid values are listed in the "Additional description of parameters" section in this topic.
         * 
         * *   **configItemList**: the list of check items. The value is a JSON array that contains the following fields:
         * 
         *     *   **key**: the key of the check item.
         *     *   **valueList**: the values of the check item. The value of valueList is a JSON array.
         * 
         * > For more information about the value of this parameter, see the "Addition description of parameters" section in this topic.
         */
        public Builder configList(String configList) {
            this.putQueryParameter("ConfigList", configList);
            this.configList = configList;
            return this;
        }

        /**
         * The language of the notifications. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder dingTalkLang(String dingTalkLang) {
            this.putQueryParameter("DingTalkLang", dingTalkLang);
            this.dingTalkLang = dingTalkLang;
            return this;
        }

        /**
         * The IDs of asset groups for which you want the chatbot to send notifications. The value is a JSON array.
         * <p>
         * 
         * > You can call the [DescribeGroupStruct](~~DescribeGroupStruct~~) operation to query the IDs of asset groups.
         */
        public Builder groupIdList(String groupIdList) {
            this.putQueryParameter("GroupIdList", groupIdList);
            this.groupIdList = groupIdList;
            return this;
        }

        /**
         * The ID of the chatbot.
         * <p>
         * 
         * > You can call the [DescribeDingTalk](~~DescribeDingTalk~~) operation to query the IDs of chatbots.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The time interval at which the chatbot sends notifications.
         * <p>
         * 
         * > The value **0** indicates unlimited.
         */
        public Builder intervalTime(Long intervalTime) {
            this.putQueryParameter("IntervalTime", intervalTime);
            this.intervalTime = intervalTime;
            return this;
        }

        /**
         * The name of the chatbot.
         * <p>
         * 
         * > The name of a chatbot must be 2 to 64 characters in length.
         */
        public Builder ruleActionName(String ruleActionName) {
            this.putQueryParameter("RuleActionName", ruleActionName);
            this.ruleActionName = ruleActionName;
            return this;
        }

        /**
         * The webhook URL.
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
