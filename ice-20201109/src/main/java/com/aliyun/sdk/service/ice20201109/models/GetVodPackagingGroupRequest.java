// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetVodPackagingGroupRequest} extends {@link RequestModel}
 *
 * <p>GetVodPackagingGroupRequest</p>
 */
public class GetVodPackagingGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private GetVodPackagingGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVodPackagingGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<GetVodPackagingGroupRequest, Builder> {
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(GetVodPackagingGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
        } 

        /**
         * <p>The name of the packaging group. The name must be unique and can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vod_hls</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public GetVodPackagingGroupRequest build() {
            return new GetVodPackagingGroupRequest(this);
        } 

    } 

}
