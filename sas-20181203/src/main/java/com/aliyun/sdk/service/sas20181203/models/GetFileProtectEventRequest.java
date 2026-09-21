// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetFileProtectEventRequest} extends {@link RequestModel}
 *
 * <p>GetFileProtectEventRequest</p>
 */
public class GetFileProtectEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private GetFileProtectEventRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectEventRequest create() {
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

    public static final class Builder extends Request.Builder<GetFileProtectEventRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(GetFileProtectEventRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The event ID.</p>
         * <p>This parameter is required. If this parameter is not specified, the API returns HTTP 400 with error code -101. You can call ListFileProtectEvent to obtain valid event IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetFileProtectEventRequest build() {
            return new GetFileProtectEventRequest(this);
        } 

    } 

}
