// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOmsOpenAPIProjectStepsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOmsOpenAPIProjectStepsRequest</p>
 */
public class DescribeOmsOpenAPIProjectStepsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("WorkerGradeId")
    private String workerGradeId;

    private DescribeOmsOpenAPIProjectStepsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.workerGradeId = builder.workerGradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOmsOpenAPIProjectStepsRequest create() {
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
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return workerGradeId
     */
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

    public static final class Builder extends Request.Builder<DescribeOmsOpenAPIProjectStepsRequest, Builder> {
        private String regionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String workerGradeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOmsOpenAPIProjectStepsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.workerGradeId = request.workerGradeId;
        } 

        /**
         * 实例所属的地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The read RT baseline of the source data source.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The read/write RPS baseline of the destination data source.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The read/write RT baseline of the destination data source.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The read RT baseline of the source data source.
         */
        public Builder workerGradeId(String workerGradeId) {
            this.putBodyParameter("WorkerGradeId", workerGradeId);
            this.workerGradeId = workerGradeId;
            return this;
        }

        @Override
        public DescribeOmsOpenAPIProjectStepsRequest build() {
            return new DescribeOmsOpenAPIProjectStepsRequest(this);
        } 

    } 

}
