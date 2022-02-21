// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventAlgorithmDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListEventAlgorithmDetailsRequest</p>
 */
public class ListEventAlgorithmDetailsRequest extends Request {
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
    @NameInMap("EventValue")
    private String eventValue;

    @Body
    @NameInMap("ExtendValue")
    private String extendValue;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 99999999, minimum = 1)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 99999, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("RecordId")
    private String recordId;

    @Body
    @NameInMap("SourceId")
    private String sourceId;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private ListEventAlgorithmDetailsRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.dataSourceId = builder.dataSourceId;
        this.endTime = builder.endTime;
        this.eventType = builder.eventType;
        this.eventValue = builder.eventValue;
        this.extendValue = builder.extendValue;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recordId = builder.recordId;
        this.sourceId = builder.sourceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventAlgorithmDetailsRequest create() {
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
     * @return eventValue
     */
    public String getEventValue() {
        return this.eventValue;
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
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListEventAlgorithmDetailsRequest, Builder> {
        private String corpId; 
        private String dataSourceId; 
        private String endTime; 
        private String eventType; 
        private String eventValue; 
        private String extendValue; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String recordId; 
        private String sourceId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListEventAlgorithmDetailsRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.dataSourceId = response.dataSourceId;
            this.endTime = response.endTime;
            this.eventType = response.eventType;
            this.eventValue = response.eventValue;
            this.extendValue = response.extendValue;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.recordId = response.recordId;
            this.sourceId = response.sourceId;
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
         * EventValue.
         */
        public Builder eventValue(String eventValue) {
            this.putBodyParameter("EventValue", eventValue);
            this.eventValue = eventValue;
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
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.putBodyParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
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
        public ListEventAlgorithmDetailsRequest build() {
            return new ListEventAlgorithmDetailsRequest(this);
        } 

    } 

}
