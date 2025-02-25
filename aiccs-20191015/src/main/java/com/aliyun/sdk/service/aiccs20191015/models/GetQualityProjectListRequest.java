// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetQualityProjectListRequest} extends {@link RequestModel}
 *
 * <p>GetQualityProjectListRequest</p>
 */
public class GetQualityProjectListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation()
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("checkFreqType")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * checkFreqType.
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
