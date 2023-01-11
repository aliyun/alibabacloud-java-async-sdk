// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealNameStatusRequest} extends {@link RequestModel}
 *
 * <p>GetRealNameStatusRequest</p>
 */
public class GetRealNameStatusRequest extends Request {
    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    @Query
    @NameInMap("ListMsisdns")
    private java.util.List < String > listMsisdns;

    private GetRealNameStatusRequest(Builder builder) {
        super(builder);
        this.iccid = builder.iccid;
        this.listMsisdns = builder.listMsisdns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealNameStatusRequest create() {
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
     * @return listMsisdns
     */
    public java.util.List < String > getListMsisdns() {
        return this.listMsisdns;
    }

    public static final class Builder extends Request.Builder<GetRealNameStatusRequest, Builder> {
        private String iccid; 
        private java.util.List < String > listMsisdns; 

        private Builder() {
            super();
        } 

        private Builder(GetRealNameStatusRequest request) {
            super(request);
            this.iccid = request.iccid;
            this.listMsisdns = request.listMsisdns;
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
         * ListMsisdns.
         */
        public Builder listMsisdns(java.util.List < String > listMsisdns) {
            String listMsisdnsShrink = shrink(listMsisdns, "ListMsisdns", "json");
            this.putQueryParameter("ListMsisdns", listMsisdnsShrink);
            this.listMsisdns = listMsisdns;
            return this;
        }

        @Override
        public GetRealNameStatusRequest build() {
            return new GetRealNameStatusRequest(this);
        } 

    } 

}
