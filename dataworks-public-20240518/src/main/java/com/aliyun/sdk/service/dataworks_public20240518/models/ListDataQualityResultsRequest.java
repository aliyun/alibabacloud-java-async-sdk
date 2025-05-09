// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDataQualityResultsRequest} extends {@link RequestModel}
 *
 * <p>ListDataQualityResultsRequest</p>
 */
public class ListDataQualityResultsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizdateFrom")
    private String bizdateFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizdateTo")
    private String bizdateTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeFrom")
    private Long createTimeFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeTo")
    private Long createTimeTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataQualityEvaluationTaskId")
    private Long dataQualityEvaluationTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataQualityEvaluationTaskInstanceId")
    private Long dataQualityEvaluationTaskInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataQualityRuleId")
    private Long dataQualityRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    private ListDataQualityResultsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizdateFrom = builder.bizdateFrom;
        this.bizdateTo = builder.bizdateTo;
        this.createTimeFrom = builder.createTimeFrom;
        this.createTimeTo = builder.createTimeTo;
        this.dataQualityEvaluationTaskId = builder.dataQualityEvaluationTaskId;
        this.dataQualityEvaluationTaskInstanceId = builder.dataQualityEvaluationTaskInstanceId;
        this.dataQualityRuleId = builder.dataQualityRuleId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizdateFrom
     */
    public String getBizdateFrom() {
        return this.bizdateFrom;
    }

    /**
     * @return bizdateTo
     */
    public String getBizdateTo() {
        return this.bizdateTo;
    }

    /**
     * @return createTimeFrom
     */
    public Long getCreateTimeFrom() {
        return this.createTimeFrom;
    }

    /**
     * @return createTimeTo
     */
    public Long getCreateTimeTo() {
        return this.createTimeTo;
    }

    /**
     * @return dataQualityEvaluationTaskId
     */
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    /**
     * @return dataQualityEvaluationTaskInstanceId
     */
    public Long getDataQualityEvaluationTaskInstanceId() {
        return this.dataQualityEvaluationTaskInstanceId;
    }

    /**
     * @return dataQualityRuleId
     */
    public Long getDataQualityRuleId() {
        return this.dataQualityRuleId;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListDataQualityResultsRequest, Builder> {
        private String regionId; 
        private String bizdateFrom; 
        private String bizdateTo; 
        private Long createTimeFrom; 
        private Long createTimeTo; 
        private Long dataQualityEvaluationTaskId; 
        private Long dataQualityEvaluationTaskInstanceId; 
        private Long dataQualityRuleId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataQualityResultsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizdateFrom = request.bizdateFrom;
            this.bizdateTo = request.bizdateTo;
            this.createTimeFrom = request.createTimeFrom;
            this.createTimeTo = request.createTimeTo;
            this.dataQualityEvaluationTaskId = request.dataQualityEvaluationTaskId;
            this.dataQualityEvaluationTaskInstanceId = request.dataQualityEvaluationTaskInstanceId;
            this.dataQualityRuleId = request.dataQualityRuleId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-01</p>
         */
        public Builder bizdateFrom(String bizdateFrom) {
            this.putQueryParameter("BizdateFrom", bizdateFrom);
            this.bizdateFrom = bizdateFrom;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-04</p>
         */
        public Builder bizdateTo(String bizdateTo) {
            this.putQueryParameter("BizdateTo", bizdateTo);
            this.bizdateTo = bizdateTo;
            return this;
        }

        /**
         * <p>The earliest time when the data quality check result was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        public Builder createTimeFrom(Long createTimeFrom) {
            this.putQueryParameter("CreateTimeFrom", createTimeFrom);
            this.createTimeFrom = createTimeFrom;
            return this;
        }

        /**
         * <p>The latest time when the data quality check result was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        public Builder createTimeTo(Long createTimeTo) {
            this.putQueryParameter("CreateTimeTo", createTimeTo);
            this.createTimeTo = createTimeTo;
            return this;
        }

        /**
         * <p>The ID of the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>200001</p>
         */
        public Builder dataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
            this.putQueryParameter("DataQualityEvaluationTaskId", dataQualityEvaluationTaskId);
            this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
            return this;
        }

        /**
         * <p>The ID of the instance generated by the check.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder dataQualityEvaluationTaskInstanceId(Long dataQualityEvaluationTaskInstanceId) {
            this.putQueryParameter("DataQualityEvaluationTaskInstanceId", dataQualityEvaluationTaskInstanceId);
            this.dataQualityEvaluationTaskInstanceId = dataQualityEvaluationTaskInstanceId;
            return this;
        }

        /**
         * <p>The ID of the data quality monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        public Builder dataQualityRuleId(Long dataQualityRuleId) {
            this.putQueryParameter("DataQualityRuleId", dataQualityRuleId);
            this.dataQualityRuleId = dataQualityRuleId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListDataQualityResultsRequest build() {
            return new ListDataQualityResultsRequest(this);
        } 

    } 

}
