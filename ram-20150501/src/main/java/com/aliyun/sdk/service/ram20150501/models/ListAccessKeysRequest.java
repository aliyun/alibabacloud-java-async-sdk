// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link ListAccessKeysRequest} extends {@link RequestModel}
 *
 * <p>ListAccessKeysRequest</p>
 */
public class ListAccessKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ListAccessKeysRequest(Builder builder) {
        super(builder);
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessKeysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListAccessKeysRequest, Builder> {
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessKeysRequest request) {
            super(request);
            this.userName = request.userName;
        } 

        /**
         * <p>The name of the RAM user. If a RAM user calls this operation and does not specify this parameter, the AccessKey pairs of the RAM user are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangq****</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListAccessKeysRequest build() {
            return new ListAccessKeysRequest(this);
        } 

    } 

}
