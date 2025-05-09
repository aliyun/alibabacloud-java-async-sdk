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
 * {@link ListCallDetailRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListCallDetailRecordsRequest</p>
 */
public class ListCallDetailRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactDisposition")
    private String contactDisposition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactDispositionList")
    private String contactDispositionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactType")
    private String contactType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTypeList")
    private String contactTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EarlyMediaStateList")
    private String earlyMediaStateList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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
    @com.aliyun.core.annotation.NameInMap("SatisfactionList")
    private String satisfactionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SatisfactionSurveyChannel")
    private String satisfactionSurveyChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private String skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(maximum = 4133952000000D)
    private Long startTime;

    private ListCallDetailRecordsRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.contactDisposition = builder.contactDisposition;
        this.contactDispositionList = builder.contactDispositionList;
        this.contactId = builder.contactId;
        this.contactType = builder.contactType;
        this.contactTypeList = builder.contactTypeList;
        this.criteria = builder.criteria;
        this.earlyMediaStateList = builder.earlyMediaStateList;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.orderByField = builder.orderByField;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.satisfactionDescriptionList = builder.satisfactionDescriptionList;
        this.satisfactionList = builder.satisfactionList;
        this.satisfactionSurveyChannel = builder.satisfactionSurveyChannel;
        this.skillGroupId = builder.skillGroupId;
        this.sortOrder = builder.sortOrder;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallDetailRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
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
     * @return contactDisposition
     */
    public String getContactDisposition() {
        return this.contactDisposition;
    }

    /**
     * @return contactDispositionList
     */
    public String getContactDispositionList() {
        return this.contactDispositionList;
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return contactType
     */
    public String getContactType() {
        return this.contactType;
    }

    /**
     * @return contactTypeList
     */
    public String getContactTypeList() {
        return this.contactTypeList;
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return satisfactionList
     */
    public String getSatisfactionList() {
        return this.satisfactionList;
    }

    /**
     * @return satisfactionSurveyChannel
     */
    public String getSatisfactionSurveyChannel() {
        return this.satisfactionSurveyChannel;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
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

    public static final class Builder extends Request.Builder<ListCallDetailRecordsRequest, Builder> {
        private String agentId; 
        private String calledNumber; 
        private String callingNumber; 
        private String contactDisposition; 
        private String contactDispositionList; 
        private String contactId; 
        private String contactType; 
        private String contactTypeList; 
        private String criteria; 
        private String earlyMediaStateList; 
        private Long endTime; 
        private String instanceId; 
        private String orderByField; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String satisfactionDescriptionList; 
        private String satisfactionList; 
        private String satisfactionSurveyChannel; 
        private String skillGroupId; 
        private String sortOrder; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListCallDetailRecordsRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.calledNumber = request.calledNumber;
            this.callingNumber = request.callingNumber;
            this.contactDisposition = request.contactDisposition;
            this.contactDispositionList = request.contactDispositionList;
            this.contactId = request.contactId;
            this.contactType = request.contactType;
            this.contactTypeList = request.contactTypeList;
            this.criteria = request.criteria;
            this.earlyMediaStateList = request.earlyMediaStateList;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.orderByField = request.orderByField;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.satisfactionDescriptionList = request.satisfactionDescriptionList;
            this.satisfactionList = request.satisfactionList;
            this.satisfactionSurveyChannel = request.satisfactionSurveyChannel;
            this.skillGroupId = request.skillGroupId;
            this.sortOrder = request.sortOrder;
            this.startTime = request.startTime;
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
         * ContactDisposition.
         */
        public Builder contactDisposition(String contactDisposition) {
            this.putQueryParameter("ContactDisposition", contactDisposition);
            this.contactDisposition = contactDisposition;
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
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * ContactType.
         */
        public Builder contactType(String contactType) {
            this.putQueryParameter("ContactType", contactType);
            this.contactType = contactType;
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
         * Criteria.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
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
         * OrderByField.
         */
        public Builder orderByField(String orderByField) {
            this.putQueryParameter("OrderByField", orderByField);
            this.orderByField = orderByField;
            return this;
        }

        /**
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
         * SatisfactionDescriptionList.
         */
        public Builder satisfactionDescriptionList(String satisfactionDescriptionList) {
            this.putQueryParameter("SatisfactionDescriptionList", satisfactionDescriptionList);
            this.satisfactionDescriptionList = satisfactionDescriptionList;
            return this;
        }

        /**
         * SatisfactionList.
         */
        public Builder satisfactionList(String satisfactionList) {
            this.putQueryParameter("SatisfactionList", satisfactionList);
            this.satisfactionList = satisfactionList;
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
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
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
        public ListCallDetailRecordsRequest build() {
            return new ListCallDetailRecordsRequest(this);
        } 

    } 

}
