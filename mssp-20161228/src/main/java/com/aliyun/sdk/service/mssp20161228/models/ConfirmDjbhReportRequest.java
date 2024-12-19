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
 * {@link ConfirmDjbhReportRequest} extends {@link RequestModel}
 *
 * <p>ConfirmDjbhReportRequest</p>
 */
public class ConfirmDjbhReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private ConfirmDjbhReportRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmDjbhReportRequest create() {
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

    public static final class Builder extends Request.Builder<ConfirmDjbhReportRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmDjbhReportRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>Primary key ID of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>24563</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public ConfirmDjbhReportRequest build() {
            return new ConfirmDjbhReportRequest(this);
        } 

    } 

}
