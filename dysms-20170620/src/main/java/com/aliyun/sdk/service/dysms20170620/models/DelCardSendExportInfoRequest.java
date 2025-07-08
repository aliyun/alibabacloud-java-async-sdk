// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link DelCardSendExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DelCardSendExportInfoRequest</p>
 */
public class DelCardSendExportInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List<Long> ids;

    private DelCardSendExportInfoRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelCardSendExportInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<DelCardSendExportInfoRequest, Builder> {
        private java.util.List<Long> ids; 

        private Builder() {
            super();
        } 

        private Builder(DelCardSendExportInfoRequest request) {
            super(request);
            this.ids = request.ids;
        } 

        /**
         * Ids.
         */
        public Builder ids(java.util.List<Long> ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        @Override
        public DelCardSendExportInfoRequest build() {
            return new DelCardSendExportInfoRequest(this);
        } 

    } 

}
