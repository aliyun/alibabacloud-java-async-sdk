// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212.models;

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
 * {@link CreateUnionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateUnionTaskRequest</p>
 */
public class CreateUnionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnchorId")
    private String anchorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandUserId")
    private Long brandUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrandUserNick")
    private String brandUserNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargePloy")
    private Long chargePloy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private Long chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentId")
    private Long contentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentUrl")
    private String contentUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomCreativeType")
    private String customCreativeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndustryLabelBagId")
    private Integer industryLabelBagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIdBlackList")
    private java.util.List<String> mediaIdBlackList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIdWhiteList")
    private java.util.List<String> mediaIdWhiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIndustry")
    private String mediaIndustry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OptimizationSwitch")
    private Long optimizationSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    private Long proxyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Long quota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaDay")
    private Long quotaDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskBizType")
    private String taskBizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskRuleType")
    private String taskRuleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private CreateUnionTaskRequest(Builder builder) {
        super(builder);
        this.anchorId = builder.anchorId;
        this.brandUserId = builder.brandUserId;
        this.brandUserNick = builder.brandUserNick;
        this.channel = builder.channel;
        this.channelId = builder.channelId;
        this.chargePloy = builder.chargePloy;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.contentId = builder.contentId;
        this.contentUrl = builder.contentUrl;
        this.customCreativeType = builder.customCreativeType;
        this.endTime = builder.endTime;
        this.industryLabelBagId = builder.industryLabelBagId;
        this.mediaIdBlackList = builder.mediaIdBlackList;
        this.mediaIdWhiteList = builder.mediaIdWhiteList;
        this.mediaIndustry = builder.mediaIndustry;
        this.name = builder.name;
        this.optimizationSwitch = builder.optimizationSwitch;
        this.proxyUserId = builder.proxyUserId;
        this.quota = builder.quota;
        this.quotaDay = builder.quotaDay;
        this.startTime = builder.startTime;
        this.taskBizType = builder.taskBizType;
        this.taskRuleType = builder.taskRuleType;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUnionTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anchorId
     */
    public String getAnchorId() {
        return this.anchorId;
    }

    /**
     * @return brandUserId
     */
    public Long getBrandUserId() {
        return this.brandUserId;
    }

    /**
     * @return brandUserNick
     */
    public String getBrandUserNick() {
        return this.brandUserNick;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return chargePloy
     */
    public Long getChargePloy() {
        return this.chargePloy;
    }

    /**
     * @return chargeType
     */
    public Long getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return contentId
     */
    public Long getContentId() {
        return this.contentId;
    }

    /**
     * @return contentUrl
     */
    public String getContentUrl() {
        return this.contentUrl;
    }

    /**
     * @return customCreativeType
     */
    public String getCustomCreativeType() {
        return this.customCreativeType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return industryLabelBagId
     */
    public Integer getIndustryLabelBagId() {
        return this.industryLabelBagId;
    }

    /**
     * @return mediaIdBlackList
     */
    public java.util.List<String> getMediaIdBlackList() {
        return this.mediaIdBlackList;
    }

    /**
     * @return mediaIdWhiteList
     */
    public java.util.List<String> getMediaIdWhiteList() {
        return this.mediaIdWhiteList;
    }

    /**
     * @return mediaIndustry
     */
    public String getMediaIndustry() {
        return this.mediaIndustry;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return optimizationSwitch
     */
    public Long getOptimizationSwitch() {
        return this.optimizationSwitch;
    }

    /**
     * @return proxyUserId
     */
    public Long getProxyUserId() {
        return this.proxyUserId;
    }

    /**
     * @return quota
     */
    public Long getQuota() {
        return this.quota;
    }

    /**
     * @return quotaDay
     */
    public Long getQuotaDay() {
        return this.quotaDay;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskBizType
     */
    public String getTaskBizType() {
        return this.taskBizType;
    }

    /**
     * @return taskRuleType
     */
    public String getTaskRuleType() {
        return this.taskRuleType;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateUnionTaskRequest, Builder> {
        private String anchorId; 
        private Long brandUserId; 
        private String brandUserNick; 
        private String channel; 
        private String channelId; 
        private Long chargePloy; 
        private Long chargeType; 
        private String clientToken; 
        private Long contentId; 
        private String contentUrl; 
        private String customCreativeType; 
        private String endTime; 
        private Integer industryLabelBagId; 
        private java.util.List<String> mediaIdBlackList; 
        private java.util.List<String> mediaIdWhiteList; 
        private String mediaIndustry; 
        private String name; 
        private Long optimizationSwitch; 
        private Long proxyUserId; 
        private Long quota; 
        private Long quotaDay; 
        private String startTime; 
        private String taskBizType; 
        private String taskRuleType; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateUnionTaskRequest request) {
            super(request);
            this.anchorId = request.anchorId;
            this.brandUserId = request.brandUserId;
            this.brandUserNick = request.brandUserNick;
            this.channel = request.channel;
            this.channelId = request.channelId;
            this.chargePloy = request.chargePloy;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.contentId = request.contentId;
            this.contentUrl = request.contentUrl;
            this.customCreativeType = request.customCreativeType;
            this.endTime = request.endTime;
            this.industryLabelBagId = request.industryLabelBagId;
            this.mediaIdBlackList = request.mediaIdBlackList;
            this.mediaIdWhiteList = request.mediaIdWhiteList;
            this.mediaIndustry = request.mediaIndustry;
            this.name = request.name;
            this.optimizationSwitch = request.optimizationSwitch;
            this.proxyUserId = request.proxyUserId;
            this.quota = request.quota;
            this.quotaDay = request.quotaDay;
            this.startTime = request.startTime;
            this.taskBizType = request.taskBizType;
            this.taskRuleType = request.taskRuleType;
            this.taskType = request.taskType;
        } 

        /**
         * AnchorId.
         */
        public Builder anchorId(String anchorId) {
            this.putQueryParameter("AnchorId", anchorId);
            this.anchorId = anchorId;
            return this;
        }

        /**
         * BrandUserId.
         */
        public Builder brandUserId(Long brandUserId) {
            this.putQueryParameter("BrandUserId", brandUserId);
            this.brandUserId = brandUserId;
            return this;
        }

        /**
         * BrandUserNick.
         */
        public Builder brandUserNick(String brandUserNick) {
            this.putQueryParameter("BrandUserNick", brandUserNick);
            this.brandUserNick = brandUserNick;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * ChargePloy.
         */
        public Builder chargePloy(Long chargePloy) {
            this.putQueryParameter("ChargePloy", chargePloy);
            this.chargePloy = chargePloy;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(Long chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ContentId.
         */
        public Builder contentId(Long contentId) {
            this.putQueryParameter("ContentId", contentId);
            this.contentId = contentId;
            return this;
        }

        /**
         * ContentUrl.
         */
        public Builder contentUrl(String contentUrl) {
            this.putQueryParameter("ContentUrl", contentUrl);
            this.contentUrl = contentUrl;
            return this;
        }

        /**
         * CustomCreativeType.
         */
        public Builder customCreativeType(String customCreativeType) {
            this.putQueryParameter("CustomCreativeType", customCreativeType);
            this.customCreativeType = customCreativeType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IndustryLabelBagId.
         */
        public Builder industryLabelBagId(Integer industryLabelBagId) {
            this.putQueryParameter("IndustryLabelBagId", industryLabelBagId);
            this.industryLabelBagId = industryLabelBagId;
            return this;
        }

        /**
         * MediaIdBlackList.
         */
        public Builder mediaIdBlackList(java.util.List<String> mediaIdBlackList) {
            String mediaIdBlackListShrink = shrink(mediaIdBlackList, "MediaIdBlackList", "json");
            this.putQueryParameter("MediaIdBlackList", mediaIdBlackListShrink);
            this.mediaIdBlackList = mediaIdBlackList;
            return this;
        }

        /**
         * MediaIdWhiteList.
         */
        public Builder mediaIdWhiteList(java.util.List<String> mediaIdWhiteList) {
            String mediaIdWhiteListShrink = shrink(mediaIdWhiteList, "MediaIdWhiteList", "json");
            this.putQueryParameter("MediaIdWhiteList", mediaIdWhiteListShrink);
            this.mediaIdWhiteList = mediaIdWhiteList;
            return this;
        }

        /**
         * MediaIndustry.
         */
        public Builder mediaIndustry(String mediaIndustry) {
            this.putQueryParameter("MediaIndustry", mediaIndustry);
            this.mediaIndustry = mediaIndustry;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OptimizationSwitch.
         */
        public Builder optimizationSwitch(Long optimizationSwitch) {
            this.putQueryParameter("OptimizationSwitch", optimizationSwitch);
            this.optimizationSwitch = optimizationSwitch;
            return this;
        }

        /**
         * ProxyUserId.
         */
        public Builder proxyUserId(Long proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        /**
         * Quota.
         */
        public Builder quota(Long quota) {
            this.putQueryParameter("Quota", quota);
            this.quota = quota;
            return this;
        }

        /**
         * QuotaDay.
         */
        public Builder quotaDay(Long quotaDay) {
            this.putQueryParameter("QuotaDay", quotaDay);
            this.quotaDay = quotaDay;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskBizType.
         */
        public Builder taskBizType(String taskBizType) {
            this.putQueryParameter("TaskBizType", taskBizType);
            this.taskBizType = taskBizType;
            return this;
        }

        /**
         * TaskRuleType.
         */
        public Builder taskRuleType(String taskRuleType) {
            this.putQueryParameter("TaskRuleType", taskRuleType);
            this.taskRuleType = taskRuleType;
            return this;
        }

        /**
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateUnionTaskRequest build() {
            return new CreateUnionTaskRequest(this);
        } 

    } 

}
