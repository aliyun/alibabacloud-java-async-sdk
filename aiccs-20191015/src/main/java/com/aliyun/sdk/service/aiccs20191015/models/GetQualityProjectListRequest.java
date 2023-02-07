// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityProjectListRequest} extends {@link RequestModel}
 *
 * <p>GetQualityProjectListRequest</p>
 */
public class GetQualityProjectListRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNo")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation()
    private Long projectId;

    @Query
    @NameInMap("ProjectName")
    private String projectName;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("checkFreqType")
    private Long checkFreqType;

    private GetQualityProjectListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.status = builder.status;
        this.checkFreqType = builder.checkFreqType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityProjectListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return checkFreqType
     */
    public Long getCheckFreqType() {
        return this.checkFreqType;
    }

    public static final class Builder extends Request.Builder<GetQualityProjectListRequest, Builder> {
        private String instanceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long projectId; 
        private String projectName; 
        private Integer status; 
        private Long checkFreqType; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityProjectListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.status = request.status;
            this.checkFreqType = request.checkFreqType;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNo
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 质检项ID
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 质检项名称
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * 质检项状态
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * 质检频率
         */
        public Builder checkFreqType(Long checkFreqType) {
            this.putQueryParameter("checkFreqType", checkFreqType);
            this.checkFreqType = checkFreqType;
            return this;
        }

        @Override
        public GetQualityProjectListRequest build() {
            return new GetQualityProjectListRequest(this);
        } 

    } 

}
