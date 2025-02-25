// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitorGroupInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorGroupInstanceAttributeRequest</p>
 */
public class DescribeMonitorGroupInstanceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Total")
    private Boolean total;

    private DescribeMonitorGroupInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.groupId = builder.groupId;
        this.instanceIds = builder.instanceIds;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupInstanceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return total
     */
    public Boolean getTotal() {
        return this.total;
    }

    public static final class Builder extends Request.Builder<DescribeMonitorGroupInstanceAttributeRequest, Builder> {
        private String category; 
        private Long groupId; 
        private String instanceIds; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean total; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitorGroupInstanceAttributeRequest request) {
            super(request);
            this.category = request.category;
            this.groupId = request.groupId;
            this.instanceIds = request.instanceIds;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.total = request.total;
        } 

        /**
         * <p>The abbreviation of the cloud service name.</p>
         * <p>For more information about how to obtain the abbreviation of a cloud service name, see <code>metricCategory</code> in the response parameter <code>Labels</code> of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The resource ID. Separate multiple resource IDs with commas (,). You can query the details about a maximum of 20 resources at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5e0k0bexac8tykr****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The keyword that is used to search for resources.</p>
         * 
         * <strong>example:</strong>
         * <p>portal</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Valid values: 1 to 1000000000.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Valid values: 1 to 1000000000.</p>
         * <p>Default value: 10.</p>
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
         * <p>Specifies whether to return the total number of resources in the specified application group. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder total(Boolean total) {
            this.putQueryParameter("Total", total);
            this.total = total;
            return this;
        }

        @Override
        public DescribeMonitorGroupInstanceAttributeRequest build() {
            return new DescribeMonitorGroupInstanceAttributeRequest(this);
        } 

    } 

}
