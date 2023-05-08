// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SasInstallCodeRequest} extends {@link RequestModel}
 *
 * <p>SasInstallCodeRequest</p>
 */
public class SasInstallCodeRequest extends Request {
    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private SasInstallCodeRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SasInstallCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<SasInstallCodeRequest, Builder> {
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(SasInstallCodeRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
        } 

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public SasInstallCodeRequest build() {
            return new SasInstallCodeRequest(this);
        } 

    } 

}
