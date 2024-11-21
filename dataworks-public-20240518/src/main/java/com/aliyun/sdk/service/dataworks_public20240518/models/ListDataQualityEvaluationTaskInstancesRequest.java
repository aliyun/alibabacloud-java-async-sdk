// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataQualityEvaluationTaskInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListDataQualityEvaluationTaskInstancesRequest</p>
 */
public class ListDataQualityEvaluationTaskInstancesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    private String tableGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerClient")
    private String triggerClient;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerClientId")
    private String triggerClientId;

    private ListDataQualityEvaluationTaskInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizdateFrom = builder.bizdateFrom;
        this.bizdateTo = builder.bizdateTo;
        this.createTimeFrom = builder.createTimeFrom;
        this.createTimeTo = builder.createTimeTo;
        this.dataQualityEvaluationTaskId = builder.dataQualityEvaluationTaskId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.tableGuid = builder.tableGuid;
        this.triggerClient = builder.triggerClient;
        this.triggerClientId = builder.triggerClientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityEvaluationTaskInstancesRequest create() {
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

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    /**
     * @return triggerClient
     */
    public String getTriggerClient() {
        return this.triggerClient;
    }

    /**
     * @return triggerClientId
     */
    public String getTriggerClientId() {
        return this.triggerClientId;
    }

    public static final class Builder extends Request.Builder<ListDataQualityEvaluationTaskInstancesRequest, Builder> {
        private String regionId; 
        private String bizdateFrom; 
        private String bizdateTo; 
        private Long createTimeFrom; 
        private Long createTimeTo; 
        private Long dataQualityEvaluationTaskId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String tableGuid; 
        private String triggerClient; 
        private String triggerClientId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataQualityEvaluationTaskInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizdateFrom = request.bizdateFrom;
            this.bizdateTo = request.bizdateTo;
            this.createTimeFrom = request.createTimeFrom;
            this.createTimeTo = request.createTimeTo;
            this.dataQualityEvaluationTaskId = request.dataQualityEvaluationTaskId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.tableGuid = request.tableGuid;
            this.triggerClient = request.triggerClient;
            this.triggerClientId = request.triggerClientId;
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
         * <p>The start time of the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-01</p>
         */
        public Builder bizdateFrom(String bizdateFrom) {
            this.putQueryParameter("BizdateFrom", bizdateFrom);
            this.bizdateFrom = bizdateFrom;
            return this;
        }

        /**
         * <p>The end time of the data quality monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-01</p>
         */
        public Builder bizdateTo(String bizdateTo) {
            this.putQueryParameter("BizdateTo", bizdateTo);
            this.bizdateTo = bizdateTo;
            return this;
        }

        /**
         * <p>The earliest start time at which the instances are generated.</p>
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
         * <p>The latest start time at which the instances are generated.</p>
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
         * <p>10000</p>
         */
        public Builder dataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
            this.putQueryParameter("DataQualityEvaluationTaskId", dataQualityEvaluationTaskId);
            this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
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

        /**
         * <p>The ID of the table in Data Map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * <p>The name of the trigger module of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>CWF2</p>
         */
        public Builder triggerClient(String triggerClient) {
            this.putQueryParameter("TriggerClient", triggerClient);
            this.triggerClient = triggerClient;
            return this;
        }

        /**
         * <p>The ID of the instance that is generated by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder triggerClientId(String triggerClientId) {
            this.putQueryParameter("TriggerClientId", triggerClientId);
            this.triggerClientId = triggerClientId;
            return this;
        }

        @Override
        public ListDataQualityEvaluationTaskInstancesRequest build() {
            return new ListDataQualityEvaluationTaskInstancesRequest(this);
        } 

    } 

}
