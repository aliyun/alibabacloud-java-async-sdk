// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetChatFolderListRequest} extends {@link RequestModel}
 *
 * <p>GetChatFolderListRequest</p>
 */
public class GetChatFolderListRequest extends Request {
    private GetChatFolderListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatFolderListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetChatFolderListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetChatFolderListRequest request) {
            super(request);
        } 

        @Override
        public GetChatFolderListRequest build() {
            return new GetChatFolderListRequest(this);
        } 

    } 

}
