// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PauseClientRequest} extends {@link RequestModel}
 *
 * <p>PauseClientRequest</p>
 */
public class PauseClientRequest extends Request {
    @Query
    @NameInMap("Uuids")
    private String uuids;

    @Query
    @NameInMap("Value")
    private String value;


    private PauseClientRequest(Builder builder) {
        super(builder);
        this.uuids = builder.uuids;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseClientRequest create() {
        return builder().build();
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder {
        private String uuids; 
        private String value; 

        /**
         * <p>Uuids.</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>Value.</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        public PauseClientRequest build() {
            return new PauseClientRequest(this);
        } 

    } 

}
