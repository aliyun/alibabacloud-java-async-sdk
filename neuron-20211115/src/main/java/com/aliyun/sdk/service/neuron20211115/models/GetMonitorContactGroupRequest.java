// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link GetMonitorContactGroupRequest} extends {@link RequestModel}
 *
 * <p>GetMonitorContactGroupRequest</p>
 */
public class GetMonitorContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    private GetMonitorContactGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitorContactGroupRequest create() {
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

    public static final class Builder extends Request.Builder<GetMonitorContactGroupRequest, Builder> {
        private Long groupId; 

        private Builder() {
            super();
        } 

        private Builder(GetMonitorContactGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder groupId(Long groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public GetMonitorContactGroupRequest build() {
            return new GetMonitorContactGroupRequest(this);
        } 

    } 

}
