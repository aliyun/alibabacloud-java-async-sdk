// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link DeleteCloudAccessRequest} extends {@link RequestModel}
 *
 * <p>DeleteCloudAccessRequest</p>
 */
public class DeleteCloudAccessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessId")
    private String accessId;

    private DeleteCloudAccessRequest(Builder builder) {
        super(builder);
        this.accessId = builder.accessId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloudAccessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    public static final class Builder extends Request.Builder<DeleteCloudAccessRequest, Builder> {
        private String accessId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCloudAccessRequest request) {
            super(request);
            this.accessId = request.accessId;
        } 

        /**
         * AccessId.
         */
        public Builder accessId(String accessId) {
            this.putQueryParameter("AccessId", accessId);
            this.accessId = accessId;
            return this;
        }

        @Override
        public DeleteCloudAccessRequest build() {
            return new DeleteCloudAccessRequest(this);
        } 

    } 

}
