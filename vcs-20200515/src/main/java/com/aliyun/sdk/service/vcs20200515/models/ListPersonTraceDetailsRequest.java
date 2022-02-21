// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonTraceDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListPersonTraceDetailsRequest</p>
 */
public class ListPersonTraceDetailsRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("DataSourceId")
    private String dataSourceId;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Long pageSize;

    @Body
    @NameInMap("PersonId")
    private String personId;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("SubId")
    private String subId;

    private ListPersonTraceDetailsRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.dataSourceId = builder.dataSourceId;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.personId = builder.personId;
        this.startTime = builder.startTime;
        this.subId = builder.subId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersonTraceDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return personId
     */
    public String getPersonId() {
        return this.personId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return subId
     */
    public String getSubId() {
        return this.subId;
    }

    public static final class Builder extends Request.Builder<ListPersonTraceDetailsRequest, Builder> {
        private String corpId; 
        private String dataSourceId; 
        private String endTime; 
        private Long pageNumber; 
        private Long pageSize; 
        private String personId; 
        private String startTime; 
        private String subId; 

        private Builder() {
            super();
        } 

        private Builder(ListPersonTraceDetailsRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.dataSourceId = response.dataSourceId;
            this.endTime = response.endTime;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.personId = response.personId;
            this.startTime = response.startTime;
            this.subId = response.subId;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PersonId.
         */
        public Builder personId(String personId) {
            this.putBodyParameter("PersonId", personId);
            this.personId = personId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * SubId.
         */
        public Builder subId(String subId) {
            this.putBodyParameter("SubId", subId);
            this.subId = subId;
            return this;
        }

        @Override
        public ListPersonTraceDetailsRequest build() {
            return new ListPersonTraceDetailsRequest(this);
        } 

    } 

}
