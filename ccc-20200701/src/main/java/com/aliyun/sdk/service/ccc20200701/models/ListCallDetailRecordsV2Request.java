// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallDetailRecordsV2Request} extends {@link RequestModel}
 *
 * <p>ListCallDetailRecordsV2Request</p>
 */
public class ListCallDetailRecordsV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessChannelTypeList")
    private String accessChannelTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Broker")
    private String broker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactDispositionList")
    private String contactDispositionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactIdList")
    private String contactIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTypeList")
    private String contactTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EarlyMediaStateList")
    private String earlyMediaStateList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirstAgentId")
    private String firstAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    private String number;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByField")
    private String orderByField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SatisfactionDescriptionList")
    private String satisfactionDescriptionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SatisfactionRateList")
    private String satisfactionRateList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SatisfactionSurveyChannel")
    private String satisfactionSurveyChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchPattern")
    private String searchPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupIdList")
    private String skillGroupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long startTime;

    private ListCallDetailRecordsV2Request(Builder builder) {
        super(builder);
        this.accessChannelTypeList = builder.accessChannelTypeList;
        this.agentId = builder.agentId;
        this.broker = builder.broker;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.contactDispositionList = builder.contactDispositionList;
        this.contactIdList = builder.contactIdList;
        this.contactTypeList = builder.contactTypeList;
        this.earlyMediaStateList = builder.earlyMediaStateList;
        this.endTime = builder.endTime;
        this.firstAgentId = builder.firstAgentId;
        this.instanceId = builder.instanceId;
        this.mediaType = builder.mediaType;
        this.number = builder.number;
        this.orderByField = builder.orderByField;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.satisfactionDescriptionList = builder.satisfactionDescriptionList;
        this.satisfactionRateList = builder.satisfactionRateList;
        this.satisfactionSurveyChannel = builder.satisfactionSurveyChannel;
        this.searchPattern = builder.searchPattern;
        this.skillGroupIdList = builder.skillGroupIdList;
        this.sortOrder = builder.sortOrder;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallDetailRecordsV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessChannelTypeList
     */
    public String getAccessChannelTypeList() {
        return this.accessChannelTypeList;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return broker
     */
    public String getBroker() {
        return this.broker;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return contactDispositionList
     */
    public String getContactDispositionList() {
        return this.contactDispositionList;
    }

    /**
     * @return contactIdList
     */
    public String getContactIdList() {
        return this.contactIdList;
    }

    /**
     * @return contactTypeList
     */
    public String getContactTypeList() {
        return this.contactTypeList;
    }

    /**
     * @return earlyMediaStateList
     */
    public String getEarlyMediaStateList() {
        return this.earlyMediaStateList;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return firstAgentId
     */
    public String getFirstAgentId() {
        return this.firstAgentId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return orderByField
     */
    public String getOrderByField() {
        return this.orderByField;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return satisfactionDescriptionList
     */
    public String getSatisfactionDescriptionList() {
        return this.satisfactionDescriptionList;
    }

    /**
     * @return satisfactionRateList
     */
    public String getSatisfactionRateList() {
        return this.satisfactionRateList;
    }

    /**
     * @return satisfactionSurveyChannel
     */
    public String getSatisfactionSurveyChannel() {
        return this.satisfactionSurveyChannel;
    }

    /**
     * @return searchPattern
     */
    public String getSearchPattern() {
        return this.searchPattern;
    }

    /**
     * @return skillGroupIdList
     */
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListCallDetailRecordsV2Request, Builder> {
        private String accessChannelTypeList; 
        private String agentId; 
        private String broker; 
        private String calledNumber; 
        private String callingNumber; 
        private String contactDispositionList; 
        private String contactIdList; 
        private String contactTypeList; 
        private String earlyMediaStateList; 
        private Long endTime; 
        private String firstAgentId; 
        private String instanceId; 
        private String mediaType; 
        private String number; 
        private String orderByField; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String satisfactionDescriptionList; 
        private String satisfactionRateList; 
        private String satisfactionSurveyChannel; 
        private String searchPattern; 
        private String skillGroupIdList; 
        private String sortOrder; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListCallDetailRecordsV2Request request) {
            super(request);
            this.accessChannelTypeList = request.accessChannelTypeList;
            this.agentId = request.agentId;
            this.broker = request.broker;
            this.calledNumber = request.calledNumber;
            this.callingNumber = request.callingNumber;
            this.contactDispositionList = request.contactDispositionList;
            this.contactIdList = request.contactIdList;
            this.contactTypeList = request.contactTypeList;
            this.earlyMediaStateList = request.earlyMediaStateList;
            this.endTime = request.endTime;
            this.firstAgentId = request.firstAgentId;
            this.instanceId = request.instanceId;
            this.mediaType = request.mediaType;
            this.number = request.number;
            this.orderByField = request.orderByField;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.satisfactionDescriptionList = request.satisfactionDescriptionList;
            this.satisfactionRateList = request.satisfactionRateList;
            this.satisfactionSurveyChannel = request.satisfactionSurveyChannel;
            this.searchPattern = request.searchPattern;
            this.skillGroupIdList = request.skillGroupIdList;
            this.sortOrder = request.sortOrder;
            this.startTime = request.startTime;
        } 

        /**
         * AccessChannelTypeList.
         */
        public Builder accessChannelTypeList(String accessChannelTypeList) {
            this.putQueryParameter("AccessChannelTypeList", accessChannelTypeList);
            this.accessChannelTypeList = accessChannelTypeList;
            return this;
        }

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * Broker.
         */
        public Builder broker(String broker) {
            this.putQueryParameter("Broker", broker);
            this.broker = broker;
            return this;
        }

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * ContactDispositionList.
         */
        public Builder contactDispositionList(String contactDispositionList) {
            this.putQueryParameter("ContactDispositionList", contactDispositionList);
            this.contactDispositionList = contactDispositionList;
            return this;
        }

        /**
         * ContactIdList.
         */
        public Builder contactIdList(String contactIdList) {
            this.putQueryParameter("ContactIdList", contactIdList);
            this.contactIdList = contactIdList;
            return this;
        }

        /**
         * ContactTypeList.
         */
        public Builder contactTypeList(String contactTypeList) {
            this.putQueryParameter("ContactTypeList", contactTypeList);
            this.contactTypeList = contactTypeList;
            return this;
        }

        /**
         * EarlyMediaStateList.
         */
        public Builder earlyMediaStateList(String earlyMediaStateList) {
            this.putQueryParameter("EarlyMediaStateList", earlyMediaStateList);
            this.earlyMediaStateList = earlyMediaStateList;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * FirstAgentId.
         */
        public Builder firstAgentId(String firstAgentId) {
            this.putQueryParameter("FirstAgentId", firstAgentId);
            this.firstAgentId = firstAgentId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * OrderByField.
         */
        public Builder orderByField(String orderByField) {
            this.putQueryParameter("OrderByField", orderByField);
            this.orderByField = orderByField;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SatisfactionDescriptionList.
         */
        public Builder satisfactionDescriptionList(String satisfactionDescriptionList) {
            this.putQueryParameter("SatisfactionDescriptionList", satisfactionDescriptionList);
            this.satisfactionDescriptionList = satisfactionDescriptionList;
            return this;
        }

        /**
         * SatisfactionRateList.
         */
        public Builder satisfactionRateList(String satisfactionRateList) {
            this.putQueryParameter("SatisfactionRateList", satisfactionRateList);
            this.satisfactionRateList = satisfactionRateList;
            return this;
        }

        /**
         * SatisfactionSurveyChannel.
         */
        public Builder satisfactionSurveyChannel(String satisfactionSurveyChannel) {
            this.putQueryParameter("SatisfactionSurveyChannel", satisfactionSurveyChannel);
            this.satisfactionSurveyChannel = satisfactionSurveyChannel;
            return this;
        }

        /**
         * SearchPattern.
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        /**
         * SkillGroupIdList.
         */
        public Builder skillGroupIdList(String skillGroupIdList) {
            this.putQueryParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListCallDetailRecordsV2Request build() {
            return new ListCallDetailRecordsV2Request(this);
        } 

    } 

}
