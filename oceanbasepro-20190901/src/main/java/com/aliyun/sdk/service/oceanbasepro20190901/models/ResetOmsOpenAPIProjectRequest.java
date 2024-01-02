// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetOmsOpenAPIProjectRequest} extends {@link RequestModel}
 *
 * <p>ResetOmsOpenAPIProjectRequest</p>
 */
public class ResetOmsOpenAPIProjectRequest extends Request {
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

    private ResetOmsOpenAPIProjectRequest(Builder builder) {
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

    public static ResetOmsOpenAPIProjectRequest create() {
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

    public static final class Builder extends Request.Builder<ResetOmsOpenAPIProjectRequest, Builder> {
        private String regionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String workerGradeId; 

        private Builder() {
            super();
        } 

        private Builder(ResetOmsOpenAPIProjectRequest request) {
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
         * The total count, which takes effect in a pagination query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Contact the administrator.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The error level. Valid values: CRITICAL, ERROR, and WARN.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Indicates whether the call is successful.
         */
        public Builder workerGradeId(String workerGradeId) {
            this.putBodyParameter("WorkerGradeId", workerGradeId);
            this.workerGradeId = workerGradeId;
            return this;
        }

        @Override
        public ResetOmsOpenAPIProjectRequest build() {
            return new ResetOmsOpenAPIProjectRequest(this);
        } 

    } 

}
