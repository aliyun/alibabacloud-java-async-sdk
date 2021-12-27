// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyOpenLogShipperRequest} extends {@link RequestModel}
 *
 * <p>ModifyOpenLogShipperRequest</p>
 */
public class ModifyOpenLogShipperRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;


    private ModifyOpenLogShipperRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOpenLogShipperRequest create() {
        return builder().build();
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String from; 

        /**
         * <p>From.</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        public ModifyOpenLogShipperRequest build() {
            return new ModifyOpenLogShipperRequest(this);
        } 

    } 

}
