// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link DeleteDjbhReportRequest} extends {@link RequestModel}
 *
 * <p>DeleteDjbhReportRequest</p>
 */
public class DeleteDjbhReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private DeleteDjbhReportRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDjbhReportRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDjbhReportRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDjbhReportRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>Primary key ID of the report.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>26579</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteDjbhReportRequest build() {
            return new DeleteDjbhReportRequest(this);
        } 

    } 

}
