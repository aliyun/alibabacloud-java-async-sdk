// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
    @com.aliyun.core.annotation.NameInMap("ContactDisposition")
    private String contactDisposition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactType")
    private String contactType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 5000)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopTime")
    private Long stopTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithRecording")
    private Boolean withRecording;

    private ListCallDetailRecordsRequest(Builder builder) {
        super(builder);
        this.contactDisposition = builder.contactDisposition;
        this.contactId = builder.contactId;
        this.contactType = builder.contactType;
        this.criteria = builder.criteria;
        this.instanceId = builder.instanceId;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.startTime = builder.startTime;
        this.stopTime = builder.stopTime;
        this.withRecording = builder.withRecording;
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
     * @return contactDisposition
     */
    public String getContactDisposition() {
        return this.contactDisposition;
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
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return stopTime
     */
    public Long getStopTime() {
        return this.stopTime;
    }

    /**
     * @return withRecording
     */
    public Boolean getWithRecording() {
        return this.withRecording;
    }

    public static final class Builder extends Request.Builder<ListCallDetailRecordsRequest, Builder> {
        private String contactDisposition; 
        private String contactId; 
        private String contactType; 
        private String criteria; 
        private String instanceId; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String phoneNumber; 
        private Long startTime; 
        private Long stopTime; 
        private Boolean withRecording; 

        private Builder() {
            super();
        } 

        private Builder(ListCallDetailRecordsRequest request) {
            super(request);
            this.contactDisposition = request.contactDisposition;
            this.contactId = request.contactId;
            this.contactType = request.contactType;
            this.criteria = request.criteria;
            this.instanceId = request.instanceId;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.startTime = request.startTime;
            this.stopTime = request.stopTime;
            this.withRecording = request.withRecording;
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
         * Criteria.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
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

        /**
         * StopTime.
         */
        public Builder stopTime(Long stopTime) {
            this.putQueryParameter("StopTime", stopTime);
            this.stopTime = stopTime;
            return this;
        }

        /**
         * WithRecording.
         */
        public Builder withRecording(Boolean withRecording) {
            this.putQueryParameter("WithRecording", withRecording);
            this.withRecording = withRecording;
            return this;
        }

        @Override
        public ListCallDetailRecordsRequest build() {
            return new ListCallDetailRecordsRequest(this);
        } 

    } 

}
