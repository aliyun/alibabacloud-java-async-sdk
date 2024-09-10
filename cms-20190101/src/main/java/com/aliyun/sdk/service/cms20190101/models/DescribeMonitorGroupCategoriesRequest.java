// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupCategoriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorGroupCategoriesRequest</p>
 */
public class DescribeMonitorGroupCategoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    private DescribeMonitorGroupCategoriesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupCategoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<DescribeMonitorGroupCategoriesRequest, Builder> {
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitorGroupCategoriesRequest request) {
            super(request);
            this.groupId = request.groupId;
        } 

        /**
         * The ID of the application group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public DescribeMonitorGroupCategoriesRequest build() {
            return new DescribeMonitorGroupCategoriesRequest(this);
        } 

    } 

}
