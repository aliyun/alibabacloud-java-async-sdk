// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskWorkforceStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetTaskWorkforceStatisticRequest</p>
 */
public class GetTaskWorkforceStatisticRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatType")
    private String statType;

    private GetTaskWorkforceStatisticRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.taskId = builder.taskId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.statType = builder.statType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskWorkforceStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
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
     * @return statType
     */
    public String getStatType() {
        return this.statType;
    }

    public static final class Builder extends Request.Builder<GetTaskWorkforceStatisticRequest, Builder> {
        private String tenantId; 
        private String taskId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String statType; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskWorkforceStatisticRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.taskId = request.taskId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.statType = request.statType;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("TaskId", taskId);
            this.taskId = taskId;
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
         * StatType.
         */
        public Builder statType(String statType) {
            this.putQueryParameter("StatType", statType);
            this.statType = statType;
            return this;
        }

        @Override
        public GetTaskWorkforceStatisticRequest build() {
            return new GetTaskWorkforceStatisticRequest(this);
        } 

    } 

}
