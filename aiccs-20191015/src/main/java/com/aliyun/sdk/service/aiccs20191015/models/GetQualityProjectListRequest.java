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
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
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
         * <p>The current page. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Page size. Default value: <strong>10</strong>.</p>
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
         * <p>Quality inspection job ID (supports fuzzy search).</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Quality inspection job name (supports fuzzy search).</p>
         * 
         * <strong>example:</strong>
         * <p>质检</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Quality inspection job status. Valid values:  </p>
         * <ul>
         * <li><strong>0</strong>: Start  </li>
         * <li><strong>1</strong>: Shutdown</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The check frequency type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Periodic quality inspection</li>
         * <li><strong>4</strong>: Temporary quality inspection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
