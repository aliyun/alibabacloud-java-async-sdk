// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBodyAlgorithmResultsRequest} extends {@link RequestModel}
 *
 * <p>ListBodyAlgorithmResultsRequest</p>
 */
public class ListBodyAlgorithmResultsRequest extends Request {
    @Body
    @NameInMap("AlgorithmType")
    @Validation(required = true)
    private String algorithmType;

    @Body
    @NameInMap("CapStyle")
    private String capStyle;

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

    private ListBodyAlgorithmResultsRequest(Builder builder) {
        super(builder);
        this.algorithmType = builder.algorithmType;
        this.capStyle = builder.capStyle;
        this.corpId = builder.corpId;
        this.dataSourceId = builder.dataSourceId;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBodyAlgorithmResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return capStyle
     */
    public String getCapStyle() {
        return this.capStyle;
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

    public static final class Builder extends Request.Builder<ListBodyAlgorithmResultsRequest, Builder> {
        private String algorithmType; 
        private String capStyle; 
        private String corpId; 
        private String dataSourceId; 
        private String endTime; 
        private String pageNumber; 
        private String pageSize; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListBodyAlgorithmResultsRequest response) {
            super(response);
            this.algorithmType = response.algorithmType;
            this.capStyle = response.capStyle;
            this.corpId = response.corpId;
            this.dataSourceId = response.dataSourceId;
            this.endTime = response.endTime;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
        } 

        /**
         * AlgorithmType.
         */
        public Builder algorithmType(String algorithmType) {
            this.putBodyParameter("AlgorithmType", algorithmType);
            this.algorithmType = algorithmType;
            return this;
        }

        /**
         * CapStyle.
         */
        public Builder capStyle(String capStyle) {
            this.putBodyParameter("CapStyle", capStyle);
            this.capStyle = capStyle;
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
        public ListBodyAlgorithmResultsRequest build() {
            return new ListBodyAlgorithmResultsRequest(this);
        } 

    } 

}
