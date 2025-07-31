// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetOssCheckTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>GetOssCheckTaskInfoRequest</p>
 */
public class GetOssCheckTaskInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentTaskId")
    private String parentTaskId;

    private GetOssCheckTaskInfoRequest(Builder builder) {
        super(builder);
        this.parentTaskId = builder.parentTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssCheckTaskInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentTaskId
     */
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    public static final class Builder extends Request.Builder<GetOssCheckTaskInfoRequest, Builder> {
        private String parentTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetOssCheckTaskInfoRequest request) {
            super(request);
            this.parentTaskId = request.parentTaskId;
        } 

        /**
         * ParentTaskId.
         */
        public Builder parentTaskId(String parentTaskId) {
            this.putQueryParameter("ParentTaskId", parentTaskId);
            this.parentTaskId = parentTaskId;
            return this;
        }

        @Override
        public GetOssCheckTaskInfoRequest build() {
            return new GetOssCheckTaskInfoRequest(this);
        } 

    } 

}
