// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQccCertificationDetailByIdRequest} extends {@link RequestModel}
 *
 * <p>GetQccCertificationDetailByIdRequest</p>
 */
public class GetQccCertificationDetailByIdRequest extends Request {
    @Body
    @NameInMap("CertId")
    private String certId;

    private GetQccCertificationDetailByIdRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQccCertificationDetailByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    public static final class Builder extends Request.Builder<GetQccCertificationDetailByIdRequest, Builder> {
        private String certId; 

        private Builder() {
            super();
        } 

        private Builder(GetQccCertificationDetailByIdRequest request) {
            super(request);
            this.certId = request.certId;
        } 

        /**
         * 证书主键
         */
        public Builder certId(String certId) {
            this.putBodyParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        @Override
        public GetQccCertificationDetailByIdRequest build() {
            return new GetQccCertificationDetailByIdRequest(this);
        } 

    } 

}
