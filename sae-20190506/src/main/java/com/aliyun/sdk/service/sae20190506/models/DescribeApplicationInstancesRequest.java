// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationInstancesRequest</p>
 */
public class DescribeApplicationInstancesRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Reverse")
    private Boolean reverse;

    private DescribeApplicationInstancesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.currentPage = builder.currentPage;
        this.groupId = builder.groupId;
        this.pageSize = builder.pageSize;
        this.reverse = builder.reverse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationInstancesRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationInstancesRequest, Builder> {
        private String appId; 
        private Integer currentPage; 
        private String groupId; 
        private Integer pageSize; 
        private Boolean reverse; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationInstancesRequest request) {
            super(request);
            this.appId = request.appId;
            this.currentPage = request.currentPage;
            this.groupId = request.groupId;
            this.pageSize = request.pageSize;
            this.reverse = request.reverse;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * Reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        @Override
        public DescribeApplicationInstancesRequest build() {
            return new DescribeApplicationInstancesRequest(this);
        } 

    } 

}
