// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeSingleCardRequest} extends {@link RequestModel}
 *
 * <p>ResumeSingleCardRequest</p>
 */
public class ResumeSingleCardRequest extends Request {
    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    @Query
    @NameInMap("OptMsisdns")
    private java.util.Map < String, ? > optMsisdns;

    private ResumeSingleCardRequest(Builder builder) {
        super(builder);
        this.iccid = builder.iccid;
        this.optMsisdns = builder.optMsisdns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeSingleCardRequest create() {
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
    public java.util.Map < String, ? > getOptMsisdns() {
        return this.optMsisdns;
    }

    public static final class Builder extends Request.Builder<ResumeSingleCardRequest, Builder> {
        private String iccid; 
        private java.util.Map < String, ? > optMsisdns; 

        private Builder() {
            super();
        } 

        private Builder(ResumeSingleCardRequest request) {
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
        public Builder optMsisdns(java.util.Map < String, ? > optMsisdns) {
            String optMsisdnsShrink = shrink(optMsisdns, "OptMsisdns", "json");
            this.putQueryParameter("OptMsisdns", optMsisdnsShrink);
            this.optMsisdns = optMsisdns;
            return this;
        }

        @Override
        public ResumeSingleCardRequest build() {
            return new ResumeSingleCardRequest(this);
        } 

    } 

}
