// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopSingleCardRequest} extends {@link RequestModel}
 *
 * <p>StopSingleCardRequest</p>
 */
public class StopSingleCardRequest extends Request {
    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    @Query
    @NameInMap("OptMsisdns")
    private java.util.List < String > optMsisdns;

    private StopSingleCardRequest(Builder builder) {
        super(builder);
        this.iccid = builder.iccid;
        this.optMsisdns = builder.optMsisdns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopSingleCardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    /**
     * @return optMsisdns
     */
    public java.util.List < String > getOptMsisdns() {
        return this.optMsisdns;
    }

    public static final class Builder extends Request.Builder<StopSingleCardRequest, Builder> {
        private String iccid; 
        private java.util.List < String > optMsisdns; 

        private Builder() {
            super();
        } 

        private Builder(StopSingleCardRequest request) {
            super(request);
            this.iccid = request.iccid;
            this.optMsisdns = request.optMsisdns;
        } 

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        /**
         * OptMsisdns.
         */
        public Builder optMsisdns(java.util.List < String > optMsisdns) {
            String optMsisdnsShrink = shrink(optMsisdns, "OptMsisdns", "json");
            this.putQueryParameter("OptMsisdns", optMsisdnsShrink);
            this.optMsisdns = optMsisdns;
            return this;
        }

        @Override
        public StopSingleCardRequest build() {
            return new StopSingleCardRequest(this);
        } 

    } 

}
