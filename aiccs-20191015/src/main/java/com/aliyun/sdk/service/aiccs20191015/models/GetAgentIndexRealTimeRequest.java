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
 * {@link GetAgentIndexRealTimeRequest} extends {@link RequestModel}
 *
 * <p>GetAgentIndexRealTimeRequest</p>
 */
public class GetAgentIndexRealTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepIds")
    private java.util.List<Long> depIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<Long> groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer pageSize;

    private GetAgentIndexRealTimeRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.depIds = builder.depIds;
        this.groupIds = builder.groupIds;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentIndexRealTimeRequest create() {
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
     * @return depIds
     */
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    /**
     * @return groupIds
     */
    public java.util.List<Long> getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetAgentIndexRealTimeRequest, Builder> {
        private Integer currentPage; 
        private java.util.List<Long> depIds; 
        private java.util.List<Long> groupIds; 
        private String instanceId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentIndexRealTimeRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.depIds = request.depIds;
            this.groupIds = request.groupIds;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>Current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>List of department IDs.</p>
         */
        public Builder depIds(java.util.List<Long> depIds) {
            this.putQueryParameter("DepIds", depIds);
            this.depIds = depIds;
            return this;
        }

        /**
         * <p>List of skill group IDs.</p>
         */
        public Builder groupIds(java.util.List<Long> groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * <p>AICCS instance ID.  </p>
         * <p>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Page size. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetAgentIndexRealTimeRequest build() {
            return new GetAgentIndexRealTimeRequest(this);
        } 

    } 

}
