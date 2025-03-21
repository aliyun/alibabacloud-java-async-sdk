// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDiagnosticResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosticResultRequest</p>
 */
public class DescribeDiagnosticResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiagnosticId")
    private String diagnosticId;

    private DescribeDiagnosticResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.diagnosticId = builder.diagnosticId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return diagnosticId
     */
    public String getDiagnosticId() {
        return this.diagnosticId;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosticResultRequest, Builder> {
        private String regionId; 
        private String diagnosticId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosticResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.diagnosticId = request.diagnosticId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DiagnosticId.
         */
        public Builder diagnosticId(String diagnosticId) {
            this.putBodyParameter("DiagnosticId", diagnosticId);
            this.diagnosticId = diagnosticId;
            return this;
        }

        @Override
        public DescribeDiagnosticResultRequest build() {
            return new DescribeDiagnosticResultRequest(this);
        } 

    } 

}
