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
 * {@link ListAegisForLingjunStatusRequest} extends {@link RequestModel}
 *
 * <p>ListAegisForLingjunStatusRequest</p>
 */
public class ListAegisForLingjunStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List<String> uuids;

    private ListAegisForLingjunStatusRequest(Builder builder) {
        super(builder);
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAegisForLingjunStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuids
     */
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ListAegisForLingjunStatusRequest, Builder> {
        private java.util.List<String> uuids; 

        private Builder() {
            super();
        } 

        private Builder(ListAegisForLingjunStatusRequest request) {
            super(request);
            this.uuids = request.uuids;
        } 

        /**
         * <p>List of unique UUIDs for Lingjun bare metal.</p>
         */
        public Builder uuids(java.util.List<String> uuids) {
            String uuidsShrink = shrink(uuids, "Uuids", "json");
            this.putQueryParameter("Uuids", uuidsShrink);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ListAegisForLingjunStatusRequest build() {
            return new ListAegisForLingjunStatusRequest(this);
        } 

    } 

}
