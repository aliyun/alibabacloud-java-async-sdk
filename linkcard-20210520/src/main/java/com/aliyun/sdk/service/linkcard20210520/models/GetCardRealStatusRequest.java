// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardRealStatusRequest} extends {@link RequestModel}
 *
 * <p>GetCardRealStatusRequest</p>
 */
public class GetCardRealStatusRequest extends Request {
    @Query
    @NameInMap("Iccid")
    private String iccid;

    @Query
    @NameInMap("Msisdn")
    private String msisdn;

    @Query
    @NameInMap("SerialNo")
    private java.util.List < String > serialNo;

    private GetCardRealStatusRequest(Builder builder) {
        super(builder);
        this.iccid = builder.iccid;
        this.msisdn = builder.msisdn;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardRealStatusRequest create() {
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
     * @return msisdn
     */
    public String getMsisdn() {
        return this.msisdn;
    }

    /**
     * @return serialNo
     */
    public java.util.List < String > getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<GetCardRealStatusRequest, Builder> {
        private String iccid; 
        private String msisdn; 
        private java.util.List < String > serialNo; 

        private Builder() {
            super();
        } 

        private Builder(GetCardRealStatusRequest request) {
            super(request);
            this.iccid = request.iccid;
            this.msisdn = request.msisdn;
            this.serialNo = request.serialNo;
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
         * Msisdn.
         */
        public Builder msisdn(String msisdn) {
            this.putQueryParameter("Msisdn", msisdn);
            this.msisdn = msisdn;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(java.util.List < String > serialNo) {
            String serialNoShrink = shrink(serialNo, "SerialNo", "json");
            this.putQueryParameter("SerialNo", serialNoShrink);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public GetCardRealStatusRequest build() {
            return new GetCardRealStatusRequest(this);
        } 

    } 

}
