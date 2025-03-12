// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListAccessKeysInRecycleBinRequest} extends {@link RequestModel}
 *
 * <p>ListAccessKeysInRecycleBinRequest</p>
 */
public class ListAccessKeysInRecycleBinRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private ListAccessKeysInRecycleBinRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessKeysInRecycleBinRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListAccessKeysInRecycleBinRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessKeysInRecycleBinRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListAccessKeysInRecycleBinRequest build() {
            return new ListAccessKeysInRecycleBinRequest(this);
        } 

    } 

}
