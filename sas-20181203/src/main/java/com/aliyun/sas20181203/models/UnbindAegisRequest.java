// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UnbindAegisRequest} extends {@link RequestModel}
 *
 * <p>UnbindAegisRequest</p>
 */
public class UnbindAegisRequest extends Request {
    @Query
    @NameInMap("Uuids")
    private String uuids;


    private UnbindAegisRequest(Builder builder) {
        super(builder);
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindAegisRequest create() {
        return builder().build();
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String uuids; 

        /**
         * <p>Uuids.</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        public UnbindAegisRequest build() {
            return new UnbindAegisRequest(this);
        } 

    } 

}
