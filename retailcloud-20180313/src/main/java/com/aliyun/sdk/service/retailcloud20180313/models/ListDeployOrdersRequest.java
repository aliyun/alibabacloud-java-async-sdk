// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListDeployOrdersRequest</p>
 */
public class ListDeployOrdersRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("DeployCategory")
    private String deployCategory;

    @Query
    @NameInMap("DeployType")
    private String deployType;

    @Query
    @NameInMap("EndTimeGreaterThan")
    private String endTimeGreaterThan;

    @Query
    @NameInMap("EndTimeGreaterThanOrEqualTo")
    private String endTimeGreaterThanOrEqualTo;

    @Query
    @NameInMap("EndTimeLessThan")
    private String endTimeLessThan;

    @Query
    @NameInMap("EndTimeLessThanOrEqualTo")
    private String endTimeLessThanOrEqualTo;

    @Query
    @NameInMap("EnvId")
    private Long envId;

    @Query
    @NameInMap("EnvType")
    private String envType;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("PartitionType")
    private String partitionType;

    @Query
    @NameInMap("PauseType")
    private String pauseType;

    @Body
    @NameInMap("ResultList")
    private java.util.List < Integer > resultList;

    @Query
    @NameInMap("StartTimeGreaterThan")
    private String startTimeGreaterThan;

    @Query
    @NameInMap("StartTimeGreaterThanOrEqualTo")
    private String startTimeGreaterThanOrEqualTo;

    @Query
    @NameInMap("StartTimeLessThan")
    private String startTimeLessThan;

    @Query
    @NameInMap("StartTimeLessThanOrEqualTo")
    private String startTimeLessThanOrEqualTo;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Body
    @NameInMap("StatusList")
    private java.util.List < Integer > statusList;

    private ListDeployOrdersRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deployCategory = builder.deployCategory;
        this.deployType = builder.deployType;
        this.endTimeGreaterThan = builder.endTimeGreaterThan;
        this.endTimeGreaterThanOrEqualTo = builder.endTimeGreaterThanOrEqualTo;
        this.endTimeLessThan = builder.endTimeLessThan;
        this.endTimeLessThanOrEqualTo = builder.endTimeLessThanOrEqualTo;
        this.envId = builder.envId;
        this.envType = builder.envType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.partitionType = builder.partitionType;
        this.pauseType = builder.pauseType;
        this.resultList = builder.resultList;
        this.startTimeGreaterThan = builder.startTimeGreaterThan;
        this.startTimeGreaterThanOrEqualTo = builder.startTimeGreaterThanOrEqualTo;
        this.startTimeLessThan = builder.startTimeLessThan;
        this.startTimeLessThanOrEqualTo = builder.startTimeLessThanOrEqualTo;
        this.status = builder.status;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeployOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return deployCategory
     */
    public String getDeployCategory() {
        return this.deployCategory;
    }

    /**
     * @return deployType
     */
    public String getDeployType() {
        return this.deployType;
    }

    /**
     * @return endTimeGreaterThan
     */
    public String getEndTimeGreaterThan() {
        return this.endTimeGreaterThan;
    }

    /**
     * @return endTimeGreaterThanOrEqualTo
     */
    public String getEndTimeGreaterThanOrEqualTo() {
        return this.endTimeGreaterThanOrEqualTo;
    }

    /**
     * @return endTimeLessThan
     */
    public String getEndTimeLessThan() {
        return this.endTimeLessThan;
    }

    /**
     * @return endTimeLessThanOrEqualTo
     */
    public String getEndTimeLessThanOrEqualTo() {
        return this.endTimeLessThanOrEqualTo;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
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
     * @return partitionType
     */
    public String getPartitionType() {
        return this.partitionType;
    }

    /**
     * @return pauseType
     */
    public String getPauseType() {
        return this.pauseType;
    }

    /**
     * @return resultList
     */
    public java.util.List < Integer > getResultList() {
        return this.resultList;
    }

    /**
     * @return startTimeGreaterThan
     */
    public String getStartTimeGreaterThan() {
        return this.startTimeGreaterThan;
    }

    /**
     * @return startTimeGreaterThanOrEqualTo
     */
    public String getStartTimeGreaterThanOrEqualTo() {
        return this.startTimeGreaterThanOrEqualTo;
    }

    /**
     * @return startTimeLessThan
     */
    public String getStartTimeLessThan() {
        return this.startTimeLessThan;
    }

    /**
     * @return startTimeLessThanOrEqualTo
     */
    public String getStartTimeLessThanOrEqualTo() {
        return this.startTimeLessThanOrEqualTo;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return statusList
     */
    public java.util.List < Integer > getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListDeployOrdersRequest, Builder> {
        private Long appId; 
        private String deployCategory; 
        private String deployType; 
        private String endTimeGreaterThan; 
        private String endTimeGreaterThanOrEqualTo; 
        private String endTimeLessThan; 
        private String endTimeLessThanOrEqualTo; 
        private Long envId; 
        private String envType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String partitionType; 
        private String pauseType; 
        private java.util.List < Integer > resultList; 
        private String startTimeGreaterThan; 
        private String startTimeGreaterThanOrEqualTo; 
        private String startTimeLessThan; 
        private String startTimeLessThanOrEqualTo; 
        private Integer status; 
        private java.util.List < Integer > statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListDeployOrdersRequest request) {
            super(request);
            this.appId = request.appId;
            this.deployCategory = request.deployCategory;
            this.deployType = request.deployType;
            this.endTimeGreaterThan = request.endTimeGreaterThan;
            this.endTimeGreaterThanOrEqualTo = request.endTimeGreaterThanOrEqualTo;
            this.endTimeLessThan = request.endTimeLessThan;
            this.endTimeLessThanOrEqualTo = request.endTimeLessThanOrEqualTo;
            this.envId = request.envId;
            this.envType = request.envType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.partitionType = request.partitionType;
            this.pauseType = request.pauseType;
            this.resultList = request.resultList;
            this.startTimeGreaterThan = request.startTimeGreaterThan;
            this.startTimeGreaterThanOrEqualTo = request.startTimeGreaterThanOrEqualTo;
            this.startTimeLessThan = request.startTimeLessThan;
            this.startTimeLessThanOrEqualTo = request.startTimeLessThanOrEqualTo;
            this.status = request.status;
            this.statusList = request.statusList;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DeployCategory.
         */
        public Builder deployCategory(String deployCategory) {
            this.putQueryParameter("DeployCategory", deployCategory);
            this.deployCategory = deployCategory;
            return this;
        }

        /**
         * DeployType.
         */
        public Builder deployType(String deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * EndTimeGreaterThan.
         */
        public Builder endTimeGreaterThan(String endTimeGreaterThan) {
            this.putQueryParameter("EndTimeGreaterThan", endTimeGreaterThan);
            this.endTimeGreaterThan = endTimeGreaterThan;
            return this;
        }

        /**
         * EndTimeGreaterThanOrEqualTo.
         */
        public Builder endTimeGreaterThanOrEqualTo(String endTimeGreaterThanOrEqualTo) {
            this.putQueryParameter("EndTimeGreaterThanOrEqualTo", endTimeGreaterThanOrEqualTo);
            this.endTimeGreaterThanOrEqualTo = endTimeGreaterThanOrEqualTo;
            return this;
        }

        /**
         * EndTimeLessThan.
         */
        public Builder endTimeLessThan(String endTimeLessThan) {
            this.putQueryParameter("EndTimeLessThan", endTimeLessThan);
            this.endTimeLessThan = endTimeLessThan;
            return this;
        }

        /**
         * EndTimeLessThanOrEqualTo.
         */
        public Builder endTimeLessThanOrEqualTo(String endTimeLessThanOrEqualTo) {
            this.putQueryParameter("EndTimeLessThanOrEqualTo", endTimeLessThanOrEqualTo);
            this.endTimeLessThanOrEqualTo = endTimeLessThanOrEqualTo;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * PartitionType.
         */
        public Builder partitionType(String partitionType) {
            this.putQueryParameter("PartitionType", partitionType);
            this.partitionType = partitionType;
            return this;
        }

        /**
         * PauseType.
         */
        public Builder pauseType(String pauseType) {
            this.putQueryParameter("PauseType", pauseType);
            this.pauseType = pauseType;
            return this;
        }

        /**
         * ResultList.
         */
        public Builder resultList(java.util.List < Integer > resultList) {
            this.putBodyParameter("ResultList", resultList);
            this.resultList = resultList;
            return this;
        }

        /**
         * StartTimeGreaterThan.
         */
        public Builder startTimeGreaterThan(String startTimeGreaterThan) {
            this.putQueryParameter("StartTimeGreaterThan", startTimeGreaterThan);
            this.startTimeGreaterThan = startTimeGreaterThan;
            return this;
        }

        /**
         * StartTimeGreaterThanOrEqualTo.
         */
        public Builder startTimeGreaterThanOrEqualTo(String startTimeGreaterThanOrEqualTo) {
            this.putQueryParameter("StartTimeGreaterThanOrEqualTo", startTimeGreaterThanOrEqualTo);
            this.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
            return this;
        }

        /**
         * StartTimeLessThan.
         */
        public Builder startTimeLessThan(String startTimeLessThan) {
            this.putQueryParameter("StartTimeLessThan", startTimeLessThan);
            this.startTimeLessThan = startTimeLessThan;
            return this;
        }

        /**
         * StartTimeLessThanOrEqualTo.
         */
        public Builder startTimeLessThanOrEqualTo(String startTimeLessThanOrEqualTo) {
            this.putQueryParameter("StartTimeLessThanOrEqualTo", startTimeLessThanOrEqualTo);
            this.startTimeLessThanOrEqualTo = startTimeLessThanOrEqualTo;
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
         * StatusList.
         */
        public Builder statusList(java.util.List < Integer > statusList) {
            this.putBodyParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListDeployOrdersRequest build() {
            return new ListDeployOrdersRequest(this);
        } 

    } 

}
