// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForceActivationRequest} extends {@link RequestModel}
 *
 * <p>ForceActivationRequest</p>
 */
public class ForceActivationRequest extends Request {
    @Query
    @NameInMap("DateType")
    private String dateType;

    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    private ForceActivationRequest(Builder builder) {
        super(builder);
        this.dateType = builder.dateType;
        this.iccid = builder.iccid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForceActivationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dateType
     */
    public String getDateType() {
        return this.dateType;
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    public static final class Builder extends Request.Builder<ForceActivationRequest, Builder> {
        private String dateType; 
        private String iccid; 

        private Builder() {
            super();
        } 

        private Builder(ForceActivationRequest request) {
            super(request);
            this.dateType = request.dateType;
            this.iccid = request.iccid;
        } 

        /**
         * DateType.
         */
        public Builder dateType(String dateType) {
            this.putQueryParameter("DateType", dateType);
            this.dateType = dateType;
            return this;
        }

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        @Override
        public ForceActivationRequest build() {
            return new ForceActivationRequest(this);
        } 

    } 

}
