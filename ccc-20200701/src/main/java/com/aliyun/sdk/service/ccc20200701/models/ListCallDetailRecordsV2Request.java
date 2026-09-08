// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
    @com.aliyun.core.annotation.NameInMap("AnalyticsReportReady")
    private Boolean analyticsReportReady;

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
    @com.aliyun.core.annotation.NameInMap("ReleaseInitiatorList")
    private String releaseInitiatorList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseReasonList")
    private String releaseReasonList;

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
        this.analyticsReportReady = builder.analyticsReportReady;
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
        this.releaseInitiatorList = builder.releaseInitiatorList;
        this.releaseReasonList = builder.releaseReasonList;
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
     * @return analyticsReportReady
     */
    public Boolean getAnalyticsReportReady() {
        return this.analyticsReportReady;
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
     * @return releaseInitiatorList
     */
    public String getReleaseInitiatorList() {
        return this.releaseInitiatorList;
    }

    /**
     * @return releaseReasonList
     */
    public String getReleaseReasonList() {
        return this.releaseReasonList;
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
        private Boolean analyticsReportReady; 
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
        private String releaseInitiatorList; 
        private String releaseReasonList; 
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
            this.analyticsReportReady = request.analyticsReportReady;
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
            this.releaseInitiatorList = request.releaseInitiatorList;
            this.releaseReasonList = request.releaseReasonList;
            this.satisfactionDescriptionList = request.satisfactionDescriptionList;
            this.satisfactionRateList = request.satisfactionRateList;
            this.satisfactionSurveyChannel = request.satisfactionSurveyChannel;
            this.searchPattern = request.searchPattern;
            this.skillGroupIdList = request.skillGroupIdList;
            this.sortOrder = request.sortOrder;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The list of visitor channel types.</p>
         * <p>Valid values:</p>
         * <p>Web: web page.</p>
         * <p>DingTalkServiceWindow: DingTalk service window.</p>
         * <p>AliMe: chatbot.</p>
         * <p>DingTalkRobot: DingTalk chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Web&quot;,&quot;AliMe&quot;]</p>
         */
        public Builder accessChannelTypeList(String accessChannelTypeList) {
            this.putQueryParameter("AccessChannelTypeList", accessChannelTypeList);
            this.accessChannelTypeList = accessChannelTypeList;
            return this;
        }

        /**
         * <p>The ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>Indicates whether the AI post-call analytics report is ready.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder analyticsReportReady(Boolean analyticsReportReady) {
            this.putQueryParameter("AnalyticsReportReady", analyticsReportReady);
            this.analyticsReportReady = analyticsReportReady;
            return this;
        }

        /**
         * <p>The intermediate number. The number must be an available outbound number under the instance. In a back-to-back call, this number is used to call the caller and the callee sequentially.</p>
         * 
         * <strong>example:</strong>
         * <p>021****4972</p>
         */
        public Builder broker(String broker) {
            this.putQueryParameter("Broker", broker);
            this.broker = broker;
            return this;
        }

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>191***9993</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>191***9993</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>Filters results by hangup cause.</p>
         * <p>Valid values:</p>
         * <p>AbandonedInQueue: Abandoned while queuing.</p>
         * <p>NoAnswer: Customer did not answer.</p>
         * <p>QueuingTimeout: Queuing timed out.</p>
         * <p>Voicemail: Transferred to voice mail.</p>
         * <p>QueuingFailed: Transfer to agent failed.</p>
         * <p>QueuingOverflow: Queue overflow.</p>
         * <p>AbandonedInVoiceNavigator: Abandoned during intelligent navigation.</p>
         * <p>Success: Ended normally.</p>
         * <p>IVRException: IVR exception.</p>
         * <p>AbandonedInRing: Abandoned while ringing.</p>
         * <p>AbandonedInIVR: Abandoned in IVR.</p>
         * <p>Reject: Customer rejected the call.</p>
         * <p>ForwardToOutsideNumber: Forwarded to an external number.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Success&quot;,&quot;NoAnswer&quot;]</p>
         */
        public Builder contactDispositionList(String contactDispositionList) {
            this.putQueryParameter("ContactDispositionList", contactDispositionList);
            this.contactDispositionList = contactDispositionList;
            return this;
        }

        /**
         * <p>The list of call IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;job-123456789&quot;,&quot;job-234567891&quot;]</p>
         */
        public Builder contactIdList(String contactIdList) {
            this.putQueryParameter("ContactIdList", contactIdList);
            this.contactIdList = contactIdList;
            return this;
        }

        /**
         * <p>Filters results by call type.</p>
         * <p>Valid values:</p>
         * <p>OUTBOUND: outbound call.</p>
         * <p>BACK2BACK: back-to-back call.</p>
         * <p>PRIVACY_DIAL: encrypted call.</p>
         * <p>INTERNAL: internal call.</p>
         * <p>PREDICTIVE: predictive outbound call.</p>
         * <p>INBOUND: inbound call.</p>
         * <p>CONFERENCE: conference call.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;INBOUND&quot;,&quot;OUTBOUND&quot;]</p>
         */
        public Builder contactTypeList(String contactTypeList) {
            this.putQueryParameter("ContactTypeList", contactTypeList);
            this.contactTypeList = contactTypeList;
            return this;
        }

        /**
         * <p>Filters results by the reason for unanswered calls.</p>
         * <p>Valid values:</p>
         * <p>NoAnswer: No answer.</p>
         * <p>OutOfService: Out of service.</p>
         * <p>NotExist: Number does not exist.</p>
         * <p>Restricted: Call restricted.</p>
         * <p>Busy: Line busy.</p>
         * <p>NotConnected: Cannot be connected.</p>
         * <p>PowerOff: Phone powered off.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;NotConnected&quot;,&quot;NoAnswer&quot;]</p>
         */
        public Builder earlyMediaStateList(String earlyMediaStateList) {
            this.putQueryParameter("EarlyMediaStateList", earlyMediaStateList);
            this.earlyMediaStateList = earlyMediaStateList;
            return this;
        }

        /**
         * <p>The end time of the historical data to retrieve. The default value is the current time. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657879880010</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the first agent who participated in the call.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder firstAgentId(String firstAgentId) {
            this.putQueryParameter("FirstAgentId", firstAgentId);
            this.firstAgentId = firstAgentId;
            return this;
        }

        /**
         * <p>The instance ID of the call center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The media type.</p>
         * <p>Valid values:</p>
         * <p>AUDIO: voice call.</p>
         * <p>VIDEO: video call.</p>
         * <p>CHAT: message.</p>
         * <p>ALL: all types.</p>
         * 
         * <strong>example:</strong>
         * <p>AUDIO</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>191***9993</p>
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * <p>The field by which to sort the results. This parameter is optional. Default value: startTime (call start time).</p>
         * <p>Valid values:</p>
         * <p>startTime: call start time.</p>
         * 
         * <strong>example:</strong>
         * <p>startTime</p>
         */
        public Builder orderByField(String orderByField) {
            this.putQueryParameter("OrderByField", orderByField);
            this.orderByField = orderByField;
            return this;
        }

        /**
         * <p>The page number. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The party that hung up.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;AGENT\&quot;]</p>
         */
        public Builder releaseInitiatorList(String releaseInitiatorList) {
            this.putQueryParameter("ReleaseInitiatorList", releaseInitiatorList);
            this.releaseInitiatorList = releaseInitiatorList;
            return this;
        }

        /**
         * <p>The hangup reason.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;VisitorInitiatedClosure\&quot;,\&quot;AgentInitiatedClosure\&quot;]</p>
         */
        public Builder releaseReasonList(String releaseReasonList) {
            this.putQueryParameter("ReleaseReasonList", releaseReasonList);
            this.releaseReasonList = releaseReasonList;
            return this;
        }

        /**
         * <p>Filters results by satisfaction description. The description content is defined by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Satisfied&quot;,&quot;Average&quot;]</p>
         */
        public Builder satisfactionDescriptionList(String satisfactionDescriptionList) {
            this.putQueryParameter("SatisfactionDescriptionList", satisfactionDescriptionList);
            this.satisfactionDescriptionList = satisfactionDescriptionList;
            return this;
        }

        /**
         * <p>Filters results by satisfaction rating. Separate multiple satisfaction ratings with commas (,).</p>
         * <p>Valid values:</p>
         * <p>-2: Not sent.</p>
         * <p>-1: Not rated.</p>
         * <p>Other positive numbers: custom satisfaction rating values.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;-1&quot;,&quot;3&quot;]
         * [&quot;&gt;2&quot;]
         * [&quot;&lt;3&quot;]</p>
         */
        public Builder satisfactionRateList(String satisfactionRateList) {
            this.putQueryParameter("SatisfactionRateList", satisfactionRateList);
            this.satisfactionRateList = satisfactionRateList;
            return this;
        }

        /**
         * <p>The satisfaction survey channel.</p>
         * <p>Valid values:</p>
         * <p>IVR: voice-based satisfaction survey.</p>
         * <p>SMS: SMS-based satisfaction survey.</p>
         * <p>CHAT: message-based satisfaction survey.</p>
         * 
         * <strong>example:</strong>
         * <p>IVR</p>
         */
        public Builder satisfactionSurveyChannel(String satisfactionSurveyChannel) {
            this.putQueryParameter("SatisfactionSurveyChannel", satisfactionSurveyChannel);
            this.satisfactionSurveyChannel = satisfactionSurveyChannel;
            return this;
        }

        /**
         * <p>The custom query text that follows the Lucene query syntax.</p>
         * <p>The following table describes the supported query fields and query types:</p>
         * <p>accessChannelUserId: the visitor ID. Supports exact match and fuzzy match.</p>
         * <p>accessChannelName: the channel name. Supports exact match and fuzzy match.</p>
         * <p>text: the session text. Supports fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>text:please wait AND accessChannelUserId:af1a0-afaa-5086e2946e0b* AND accessChannelName:dedicated development channel*</p>
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        /**
         * <p>The list of skill group IDs to which the agent belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       &quot;skg1@ccc-test&quot;,
         *       &quot;skg2@ccc-test&quot;
         * ]</p>
         */
        public Builder skillGroupIdList(String skillGroupIdList) {
            this.putQueryParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }

        /**
         * <p>The sort order. Default value: DESC.</p>
         * <p>Valid values:</p>
         * <p>ASC: ascending order.</p>
         * <p>DESC: descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The start time of the historical data to retrieve. The default value is 00:00 of the current day. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657853640015</p>
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
