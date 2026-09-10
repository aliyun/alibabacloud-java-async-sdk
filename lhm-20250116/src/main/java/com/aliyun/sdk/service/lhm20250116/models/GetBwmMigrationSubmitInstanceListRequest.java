// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetBwmMigrationSubmitInstanceListRequest} extends {@link RequestModel}
 *
 * <p>GetBwmMigrationSubmitInstanceListRequest</p>
 */
public class GetBwmMigrationSubmitInstanceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetBwmMigrationSubmitInstanceListRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBwmMigrationSubmitInstanceListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetBwmMigrationSubmitInstanceListRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private Integer status; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetBwmMigrationSubmitInstanceListRequest request) {
            super(request);
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The conversion task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetBwmMigrationSubmitInstanceListRequest build() {
            return new GetBwmMigrationSubmitInstanceListRequest(this);
        } 

    } 

}
