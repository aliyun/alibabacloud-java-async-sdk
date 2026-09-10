// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link DeleteDataCheckConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataCheckConfigRequest</p>
 */
public class DeleteDataCheckConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private DeleteDataCheckConfigRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataCheckConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteDataCheckConfigRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataCheckConfigRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The configuration ID. You can obtain this ID by calling the GetDataCheckConfig operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteDataCheckConfigRequest build() {
            return new DeleteDataCheckConfigRequest(this);
        } 

    } 

}
