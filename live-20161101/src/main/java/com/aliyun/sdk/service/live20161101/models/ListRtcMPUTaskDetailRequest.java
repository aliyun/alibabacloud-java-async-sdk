// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListRtcMPUTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>ListRtcMPUTaskDetailRequest</p>
 */
public class ListRtcMPUTaskDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ListRtcMPUTaskDetailRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRtcMPUTaskDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListRtcMPUTaskDetailRequest, Builder> {
        private String appId; 
        private Long pageNo; 
        private Long pageSize; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListRtcMPUTaskDetailRequest request) {
            super(request);
            this.appId = request.appId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The ID of the application.</p>
         * <blockquote>
         * <p> The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * <blockquote>
         * <p> If you do not specify TaskId, you must specify PageSize and PageNo. Then, the parameters of all stream relay tasks for the specified application are returned in pages.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The ID can be up to 55 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
         * </li>
         * <li><p>If you specify TaskId, the parameters of the specified tasks are returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListRtcMPUTaskDetailRequest build() {
            return new ListRtcMPUTaskDetailRequest(this);
        } 

    } 

}
