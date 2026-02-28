// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDeviceGroupListRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceGroupListRequest</p>
 */
public class QueryDeviceGroupListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupTypes")
    private java.util.List<String> groupTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuperGroupId")
    private String superGroupId;

    private QueryDeviceGroupListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.groupName = builder.groupName;
        this.groupTypes = builder.groupTypes;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.superGroupId = builder.superGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceGroupListRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupTypes
     */
    public java.util.List<String> getGroupTypes() {
        return this.groupTypes;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return superGroupId
     */
    public String getSuperGroupId() {
        return this.superGroupId;
    }

    public static final class Builder extends Request.Builder<QueryDeviceGroupListRequest, Builder> {
        private Integer currentPage; 
        private String groupName; 
        private java.util.List<String> groupTypes; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private String superGroupId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceGroupListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.groupName = request.groupName;
            this.groupTypes = request.groupTypes;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.superGroupId = request.superGroupId;
        } 

        /**
         * <p>The number of the page to return. Default value: 1.</p>
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
         * <p>The name of the group.</p>
         * <ul>
         * <li>If you specify this parameter, the system queries groups by group name. You can perform a fuzzy search by group name.</li>
         * <li>If you do not specify this parameter, the system queries all groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GroupName1</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * GroupTypes.
         */
        public Builder groupTypes(java.util.List<String> groupTypes) {
            this.putQueryParameter("GroupTypes", groupTypes);
            this.groupTypes = groupTypes;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of the entries to return on each page. Maximum value: 200. Default value: 10.</p>
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
         * <p>The ID of the parent group. If you need to query the subgroups of a parent group, specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>8vDubXr4nUvZkNgk9mle010200</p>
         */
        public Builder superGroupId(String superGroupId) {
            this.putQueryParameter("SuperGroupId", superGroupId);
            this.superGroupId = superGroupId;
            return this;
        }

        @Override
        public QueryDeviceGroupListRequest build() {
            return new QueryDeviceGroupListRequest(this);
        } 

    } 

}
