// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventAlgorithmResultsRequest} extends {@link RequestModel}
 *
 * <p>ListEventAlgorithmResultsRequest</p>
 */
public class ListEventAlgorithmResultsRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DataSourceId")
    private String dataSourceId;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("EventType")
    @Validation(required = true)
    private String eventType;

    @Body
    @NameInMap("ExtendValue")
    private String extendValue;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private String pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private ListEventAlgorithmResultsRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.dataSourceId = builder.dataSourceId;
        this.endTime = builder.endTime;
        this.eventType = builder.eventType;
        this.extendValue = builder.extendValue;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventAlgorithmResultsRequest create() {
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
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return extendValue
     */
    public String getExtendValue() {
        return this.extendValue;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListEventAlgorithmResultsRequest, Builder> {
        private String corpId; 
        private String dataSourceId; 
        private String endTime; 
        private String eventType; 
        private String extendValue; 
        private String pageNumber; 
        private String pageSize; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListEventAlgorithmResultsRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.dataSourceId = response.dataSourceId;
            this.endTime = response.endTime;
            this.eventType = response.eventType;
            this.extendValue = response.extendValue;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
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
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putBodyParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * ExtendValue.
         */
        public Builder extendValue(String extendValue) {
            this.putBodyParameter("ExtendValue", extendValue);
            this.extendValue = extendValue;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public ListEventAlgorithmResultsRequest build() {
            return new ListEventAlgorithmResultsRequest(this);
        } 

    } 

}
