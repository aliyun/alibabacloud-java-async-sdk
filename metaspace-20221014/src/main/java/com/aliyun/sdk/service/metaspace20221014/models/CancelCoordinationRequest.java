// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20221014.models;

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
 * {@link CancelCoordinationRequest} extends {@link RequestModel}
 *
 * <p>CancelCoordinationRequest</p>
 */
public class CancelCoordinationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CoIds")
    private java.util.List<String> coIds;

    private CancelCoordinationRequest(Builder builder) {
        super(builder);
        this.coIds = builder.coIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCoordinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coIds
     */
    public java.util.List<String> getCoIds() {
        return this.coIds;
    }

    public static final class Builder extends Request.Builder<CancelCoordinationRequest, Builder> {
        private java.util.List<String> coIds; 

        private Builder() {
            super();
        } 

        private Builder(CancelCoordinationRequest request) {
            super(request);
            this.coIds = request.coIds;
        } 

        /**
         * CoIds.
         */
        public Builder coIds(java.util.List<String> coIds) {
            this.putBodyParameter("CoIds", coIds);
            this.coIds = coIds;
            return this;
        }

        @Override
        public CancelCoordinationRequest build() {
            return new CancelCoordinationRequest(this);
        } 

    } 

}
