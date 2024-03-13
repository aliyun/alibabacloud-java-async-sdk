// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupDynamicRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorGroupDynamicRulesRequest</p>
 */
public class DescribeMonitorGroupDynamicRulesRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    private DescribeMonitorGroupDynamicRulesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupDynamicRulesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeMonitorGroupDynamicRulesRequest, Builder> {
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitorGroupDynamicRulesRequest request) {
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
        public DescribeMonitorGroupDynamicRulesRequest build() {
            return new DescribeMonitorGroupDynamicRulesRequest(this);
        } 

    } 

}
