// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertContactWithGroupIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertContactWithGroupIdRequest</p>
 */
public class DescribeAlertContactWithGroupIdRequest extends Request {
    @Body
    @NameInMap("GroupId")
    private Long groupId;

    private DescribeAlertContactWithGroupIdRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertContactWithGroupIdRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAlertContactWithGroupIdRequest, Builder> {
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertContactWithGroupIdRequest request) {
            super(request);
            this.groupId = request.groupId;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public DescribeAlertContactWithGroupIdRequest build() {
            return new DescribeAlertContactWithGroupIdRequest(this);
        } 

    } 

}
