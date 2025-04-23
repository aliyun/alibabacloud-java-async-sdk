// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetTaskPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetTaskPolicyRequest</p>
 */
public class GetTaskPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GetTaskPolicyRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskPolicyRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetTaskPolicyRequest, Builder> {
        private String groupId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskPolicyRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.type = request.type;
        } 

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetTaskPolicyRequest build() {
            return new GetTaskPolicyRequest(this);
        } 

    } 

}
