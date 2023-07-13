// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorGroupInstanceAttributeRequest</p>
 */
public class DescribeMonitorGroupInstanceAttributeRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Total")
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
         * The keyword that is used to search for resources.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The ID of the vSwitch to which the instance belongs.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeMonitorGroupInstanceAttribute**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The abbreviation of the Alibaba Cloud service name.
         * <p>
         * 
         * To obtain the abbreviation of an Alibaba Cloud service name, call the [DescribeProjectMeta](~~114916~~) operation. The `metricCategory` tag in the `Labels` response parameter indicates the abbreviation of the Alibaba Cloud service name.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The error message.
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
