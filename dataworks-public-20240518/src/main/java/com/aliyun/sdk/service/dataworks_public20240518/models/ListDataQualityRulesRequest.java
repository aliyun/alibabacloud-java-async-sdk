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
 * {@link ListDataQualityRulesRequest} extends {@link RequestModel}
 *
 * <p>ListDataQualityRulesRequest</p>
 */
public class ListDataQualityRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataQualityEvaluationTaskId")
    private Long dataQualityEvaluationTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

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

    private ListDataQualityRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataQualityEvaluationTaskId = builder.dataQualityEvaluationTaskId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.tableGuid = builder.tableGuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityRulesRequest create() {
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
     * @return dataQualityEvaluationTaskId
     */
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<ListDataQualityRulesRequest, Builder> {
        private String regionId; 
        private Long dataQualityEvaluationTaskId; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(ListDataQualityRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataQualityEvaluationTaskId = request.dataQualityEvaluationTaskId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.tableGuid = request.tableGuid;
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
         * <p>The ID of the data quality monitoring task that is associated with the rule.</p>
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
         * <p>The name of the rule. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>unit_test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The number of entries per page. Default value: 10. Maximum value: 200.</p>
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
         * <p>10002</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The ID of the table that is limited by the rule in Data Map.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.unit_test.tb_unit_test</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        @Override
        public ListDataQualityRulesRequest build() {
            return new ListDataQualityRulesRequest(this);
        } 

    } 

}
