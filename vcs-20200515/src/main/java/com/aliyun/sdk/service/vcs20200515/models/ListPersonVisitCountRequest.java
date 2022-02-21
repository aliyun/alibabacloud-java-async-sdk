// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonVisitCountRequest} extends {@link RequestModel}
 *
 * <p>ListPersonVisitCountRequest</p>
 */
public class ListPersonVisitCountRequest extends Request {
    @Body
    @NameInMap("AggregateType")
    @Validation(required = true)
    private String aggregateType;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("CountType")
    private String countType;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("MaxVal")
    private Integer maxVal;

    @Body
    @NameInMap("MinVal")
    private Integer minVal;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 999999999)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 9999999999D)
    private Integer pageSize;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TagCode")
    @Validation(required = true)
    private String tagCode;

    @Body
    @NameInMap("TimeAggregateType")
    @Validation(required = true)
    private String timeAggregateType;

    private ListPersonVisitCountRequest(Builder builder) {
        super(builder);
        this.aggregateType = builder.aggregateType;
        this.corpId = builder.corpId;
        this.countType = builder.countType;
        this.endTime = builder.endTime;
        this.maxVal = builder.maxVal;
        this.minVal = builder.minVal;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.tagCode = builder.tagCode;
        this.timeAggregateType = builder.timeAggregateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersonVisitCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregateType
     */
    public String getAggregateType() {
        return this.aggregateType;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return countType
     */
    public String getCountType() {
        return this.countType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxVal
     */
    public Integer getMaxVal() {
        return this.maxVal;
    }

    /**
     * @return minVal
     */
    public Integer getMinVal() {
        return this.minVal;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagCode
     */
    public String getTagCode() {
        return this.tagCode;
    }

    /**
     * @return timeAggregateType
     */
    public String getTimeAggregateType() {
        return this.timeAggregateType;
    }

    public static final class Builder extends Request.Builder<ListPersonVisitCountRequest, Builder> {
        private String aggregateType; 
        private String corpId; 
        private String countType; 
        private String endTime; 
        private Integer maxVal; 
        private Integer minVal; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 
        private String tagCode; 
        private String timeAggregateType; 

        private Builder() {
            super();
        } 

        private Builder(ListPersonVisitCountRequest response) {
            super(response);
            this.aggregateType = response.aggregateType;
            this.corpId = response.corpId;
            this.countType = response.countType;
            this.endTime = response.endTime;
            this.maxVal = response.maxVal;
            this.minVal = response.minVal;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
            this.tagCode = response.tagCode;
            this.timeAggregateType = response.timeAggregateType;
        } 

        /**
         * AggregateType.
         */
        public Builder aggregateType(String aggregateType) {
            this.putBodyParameter("AggregateType", aggregateType);
            this.aggregateType = aggregateType;
            return this;
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
         * CountType.
         */
        public Builder countType(String countType) {
            this.putBodyParameter("CountType", countType);
            this.countType = countType;
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
         * MaxVal.
         */
        public Builder maxVal(Integer maxVal) {
            this.putBodyParameter("MaxVal", maxVal);
            this.maxVal = maxVal;
            return this;
        }

        /**
         * MinVal.
         */
        public Builder minVal(Integer minVal) {
            this.putBodyParameter("MinVal", minVal);
            this.minVal = minVal;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TagCode.
         */
        public Builder tagCode(String tagCode) {
            this.putBodyParameter("TagCode", tagCode);
            this.tagCode = tagCode;
            return this;
        }

        /**
         * TimeAggregateType.
         */
        public Builder timeAggregateType(String timeAggregateType) {
            this.putBodyParameter("TimeAggregateType", timeAggregateType);
            this.timeAggregateType = timeAggregateType;
            return this;
        }

        @Override
        public ListPersonVisitCountRequest build() {
            return new ListPersonVisitCountRequest(this);
        } 

    } 

}
