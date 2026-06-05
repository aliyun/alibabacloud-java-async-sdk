// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DeleteHiveRequest} extends {@link RequestModel}
 *
 * <p>DeleteHiveRequest</p>
 */
public class DeleteHiveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiveId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hiveId;

    private DeleteHiveRequest(Builder builder) {
        super(builder);
        this.hiveId = builder.hiveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHiveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hiveId
     */
    public String getHiveId() {
        return this.hiveId;
    }

    public static final class Builder extends Request.Builder<DeleteHiveRequest, Builder> {
        private String hiveId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHiveRequest request) {
            super(request);
            this.hiveId = request.hiveId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>g-xxxx</p>
         */
        public Builder hiveId(String hiveId) {
            this.putQueryParameter("HiveId", hiveId);
            this.hiveId = hiveId;
            return this;
        }

        @Override
        public DeleteHiveRequest build() {
            return new DeleteHiveRequest(this);
        } 

    } 

}
