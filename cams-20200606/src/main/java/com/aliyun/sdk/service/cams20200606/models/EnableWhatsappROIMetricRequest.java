// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableWhatsappROIMetricRequest} extends {@link RequestModel}
 *
 * <p>EnableWhatsappROIMetricRequest</p>
 */
public class EnableWhatsappROIMetricRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Query
    @NameInMap("IsvCode")
    private String isvCode;

    private EnableWhatsappROIMetricRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.isvCode = builder.isvCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableWhatsappROIMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    public static final class Builder extends Request.Builder<EnableWhatsappROIMetricRequest, Builder> {
        private String custSpaceId; 
        private String isvCode; 

        private Builder() {
            super();
        } 

        private Builder(EnableWhatsappROIMetricRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.isvCode = request.isvCode;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * IsvCode.
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        @Override
        public EnableWhatsappROIMetricRequest build() {
            return new EnableWhatsappROIMetricRequest(this);
        } 

    } 

}
