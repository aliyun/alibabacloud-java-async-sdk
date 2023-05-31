// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<ModifyOpenLogShipperRequest, Builder> {
        private String from; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOpenLogShipperRequest request) {
            super(request);
            this.from = request.from;
        } 

        /**
         * The ID of the request source. The default value is **aegis**. Valid values:
         * <p>
         * - **aegis**: Server Guard
         * - **sas**: Security Center
         * 
         * > If you use Server Guard, set the value to **aegis**. If you use Security Center, set the value to **sas**.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        @Override
        public ModifyOpenLogShipperRequest build() {
            return new ModifyOpenLogShipperRequest(this);
        } 

    } 

}
