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
        private String namePrefix; 
        private String pageNumber; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventRuleListRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.namePrefix = request.namePrefix;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The operation that you want to perform. Set the value to DescribeEventRuleList.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder namePrefix(String namePrefix) {
            this.putQueryParameter("NamePrefix", namePrefix);
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * The description of the event-triggered alert rule.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The status of the event-triggered alert rule. Valid values:
         * <p>
         * 
         * *   ENABLED: enabled
         * *   DISABLED: disabled
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
