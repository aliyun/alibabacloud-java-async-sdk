// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallDetailRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListCallDetailRecordsRequest</p>
 */
public class ListCallDetailRecordsRequest extends Request {
    @Query
    @NameInMap("ContactDisposition")
    private String contactDisposition;

    @Query
    @NameInMap("ContactId")
    private String contactId;

    @Query
    @NameInMap("ContactType")
    private String contactType;

    @Query
    @NameInMap("Criteria")
    private String criteria;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 5000)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("StopTime")
    private Long stopTime;

    @Query
    @NameInMap("WithRecording")
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

        private Builder(ListCallDetailRecordsRequest response) {
            super(response);
            this.contactDisposition = response.contactDisposition;
            this.contactId = response.contactId;
            this.contactType = response.contactType;
            this.criteria = response.criteria;
            this.instanceId = response.instanceId;
            this.orderBy = response.orderBy;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.phoneNumber = response.phoneNumber;
            this.startTime = response.startTime;
            this.stopTime = response.stopTime;
            this.withRecording = response.withRecording;
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
         * InstanceId.
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
