// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditItemListRequest} extends {@link RequestModel}
 *
 * <p>GetAuditItemListRequest</p>
 */
public class GetAuditItemListRequest extends Request {
    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("CustomResult")
    private String customResult;

    @Query
    @NameInMap("CustomRiskType")
    private String customRiskType;

    @Query
    @NameInMap("DataId")
    private String dataId;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("RcpResult")
    private String rcpResult;

    @Query
    @NameInMap("RcpRiskType")
    private String rcpRiskType;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("Type")
    private String type;

    private GetAuditItemListRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.currentPage = builder.currentPage;
        this.customResult = builder.customResult;
        this.customRiskType = builder.customRiskType;
        this.dataId = builder.dataId;
        this.endDate = builder.endDate;
        this.pageSize = builder.pageSize;
        this.rcpResult = builder.rcpResult;
        this.rcpRiskType = builder.rcpRiskType;
        this.startDate = builder.startDate;
        this.taskId = builder.taskId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditItemListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return customResult
     */
    public String getCustomResult() {
        return this.customResult;
    }

    /**
     * @return customRiskType
     */
    public String getCustomRiskType() {
        return this.customRiskType;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rcpResult
     */
    public String getRcpResult() {
        return this.rcpResult;
    }

    /**
     * @return rcpRiskType
     */
    public String getRcpRiskType() {
        return this.rcpRiskType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetAuditItemListRequest, Builder> {
        private String bizType; 
        private Long currentPage; 
        private String customResult; 
        private String customRiskType; 
        private String dataId; 
        private String endDate; 
        private Long pageSize; 
        private String rcpResult; 
        private String rcpRiskType; 
        private String startDate; 
        private String taskId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetAuditItemListRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.currentPage = request.currentPage;
            this.customResult = request.customResult;
            this.customRiskType = request.customRiskType;
            this.dataId = request.dataId;
            this.endDate = request.endDate;
            this.pageSize = request.pageSize;
            this.rcpResult = request.rcpResult;
            this.rcpRiskType = request.rcpRiskType;
            this.startDate = request.startDate;
            this.taskId = request.taskId;
            this.type = request.type;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * CustomResult.
         */
        public Builder customResult(String customResult) {
            this.putQueryParameter("CustomResult", customResult);
            this.customResult = customResult;
            return this;
        }

        /**
         * CustomRiskType.
         */
        public Builder customRiskType(String customRiskType) {
            this.putQueryParameter("CustomRiskType", customRiskType);
            this.customRiskType = customRiskType;
            return this;
        }

        /**
         * DataId.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RcpResult.
         */
        public Builder rcpResult(String rcpResult) {
            this.putQueryParameter("RcpResult", rcpResult);
            this.rcpResult = rcpResult;
            return this;
        }

        /**
         * RcpRiskType.
         */
        public Builder rcpRiskType(String rcpRiskType) {
            this.putQueryParameter("RcpRiskType", rcpRiskType);
            this.rcpRiskType = rcpRiskType;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetAuditItemListRequest build() {
            return new GetAuditItemListRequest(this);
        } 

    } 

}
