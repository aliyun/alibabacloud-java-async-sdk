// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListMetricsRequest</p>
 */
public class ListMetricsRequest extends Request {
    @Body
    @NameInMap("AggregateType")
    @Validation(required = true)
    private String aggregateType;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

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

    @Body
    @NameInMap("TagCode")
    @Validation(required = true)
    private String tagCode;

    private ListMetricsRequest(Builder builder) {
        super(builder);
        this.aggregateType = builder.aggregateType;
        this.corpId = builder.corpId;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.tagCode = builder.tagCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetricsRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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

    /**
     * @return tagCode
     */
    public String getTagCode() {
        return this.tagCode;
    }

    public static final class Builder extends Request.Builder<ListMetricsRequest, Builder> {
        private String aggregateType; 
        private String corpId; 
        private String endTime; 
        private String pageNumber; 
        private String pageSize; 
        private String startTime; 
        private String tagCode; 

        private Builder() {
            super();
        } 

        private Builder(ListMetricsRequest response) {
            super(response);
            this.aggregateType = response.aggregateType;
            this.corpId = response.corpId;
            this.endTime = response.endTime;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
            this.tagCode = response.tagCode;
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

        /**
         * TagCode.
         */
        public Builder tagCode(String tagCode) {
            this.putBodyParameter("TagCode", tagCode);
            this.tagCode = tagCode;
            return this;
        }

        @Override
        public ListMetricsRequest build() {
            return new ListMetricsRequest(this);
        } 

    } 

}
