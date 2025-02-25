// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPatrolInspectionDetailListRequest} extends {@link RequestModel}
 *
 * <p>GetPatrolInspectionDetailListRequest</p>
 */
public class GetPatrolInspectionDetailListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PatrolId")
    @Validation(required = true)
    private Long patrolId;

    @Query
    @NameInMap("Status")
    private Integer status;

    private GetPatrolInspectionDetailListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.patrolId = builder.patrolId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPatrolInspectionDetailListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return patrolId
     */
    public Long getPatrolId() {
        return this.patrolId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetPatrolInspectionDetailListRequest, Builder> {
        private Integer currentPage; 
        private String instanceId; 
        private String instanceName; 
        private String operaUid; 
        private Integer pageSize; 
        private Long patrolId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetPatrolInspectionDetailListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.patrolId = request.patrolId;
            this.status = request.status;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
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
         * PatrolId.
         */
        public Builder patrolId(Long patrolId) {
            this.putQueryParameter("PatrolId", patrolId);
            this.patrolId = patrolId;
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

        @Override
        public GetPatrolInspectionDetailListRequest build() {
            return new GetPatrolInspectionDetailListRequest(this);
        } 

    } 

}
