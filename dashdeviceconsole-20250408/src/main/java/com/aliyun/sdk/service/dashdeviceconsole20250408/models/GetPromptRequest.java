// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dashdeviceconsole20250408.models;

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
 * {@link GetPromptRequest} extends {@link RequestModel}
 *
 * <p>GetPromptRequest</p>
 */
public class GetPromptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    private GetPromptRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptRequest create() {
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

    public static final class Builder extends Request.Builder<GetPromptRequest, Builder> {
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(GetPromptRequest request) {
            super(request);
            this.groupId = request.groupId;
        } 

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public GetPromptRequest build() {
            return new GetPromptRequest(this);
        } 

    } 

}
