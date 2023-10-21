// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventRuleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventRuleListRequest</p>
 */
public class DescribeEventRuleListRequest extends Request {
    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("IsEnable")
    private Boolean isEnable;

    @Query
    @NameInMap("NamePrefix")
    private String namePrefix;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    private DescribeEventRuleListRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.isEnable = builder.isEnable;
        this.namePrefix = builder.namePrefix;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventRuleListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    /**
     * @return namePrefix
     */
    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeEventRuleListRequest, Builder> {
        private String groupId; 
        private Boolean isEnable; 
        private String namePrefix; 
        private String pageNumber; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventRuleListRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.isEnable = request.isEnable;
            this.namePrefix = request.namePrefix;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IsEnable.
         */
        public Builder isEnable(Boolean isEnable) {
            this.putQueryParameter("IsEnable", isEnable);
            this.isEnable = isEnable;
            return this;
        }

        /**
         * The prefix in the name of the event-triggered alert rule.
         */
        public Builder namePrefix(String namePrefix) {
            this.putQueryParameter("NamePrefix", namePrefix);
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * A minimum of one entry can be returned on each page. Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeEventRuleListRequest build() {
            return new DescribeEventRuleListRequest(this);
        } 

    } 

}
