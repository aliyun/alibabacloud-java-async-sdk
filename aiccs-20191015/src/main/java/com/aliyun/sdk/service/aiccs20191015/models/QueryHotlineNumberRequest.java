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
 * {@link QueryHotlineNumberRequest} extends {@link RequestModel}
 *
 * <p>QueryHotlineNumberRequest</p>
 */
public class QueryHotlineNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentId")
    private Long departmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<Long> groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotlineNumber")
    private String hotlineNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 20, minimum = 1)
    private Integer pageSize;

    private QueryHotlineNumberRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.departmentId = builder.departmentId;
        this.groupIds = builder.groupIds;
        this.hotlineNumber = builder.hotlineNumber;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHotlineNumberRequest create() {
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
     * @return departmentId
     */
    public Long getDepartmentId() {
        return this.departmentId;
    }

    /**
     * @return groupIds
     */
    public java.util.List<Long> getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return hotlineNumber
     */
    public String getHotlineNumber() {
        return this.hotlineNumber;
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

    public static final class Builder extends Request.Builder<QueryHotlineNumberRequest, Builder> {
        private Integer currentPage; 
        private Long departmentId; 
        private java.util.List<Long> groupIds; 
        private String hotlineNumber; 
        private String instanceId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryHotlineNumberRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.departmentId = request.departmentId;
            this.groupIds = request.groupIds;
            this.hotlineNumber = request.hotlineNumber;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
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
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2256****</p>
         */
        public Builder departmentId(Long departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * <p>The list of skill groups.</p>
         */
        public Builder groupIds(java.util.List<Long> groupIds) {
            String groupIdsShrink = shrink(groupIds, "GroupIds", "json");
            this.putQueryParameter("GroupIds", groupIdsShrink);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * <p>The hotline number. Fuzzy query is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0571****2211</p>
         */
        public Builder hotlineNumber(String hotlineNumber) {
            this.putQueryParameter("HotlineNumber", hotlineNumber);
            this.hotlineNumber = hotlineNumber;
            return this;
        }

        /**
         * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.
         * You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
         * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryHotlineNumberRequest build() {
            return new QueryHotlineNumberRequest(this);
        } 

    } 

}
