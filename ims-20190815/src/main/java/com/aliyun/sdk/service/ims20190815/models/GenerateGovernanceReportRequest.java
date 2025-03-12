// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GenerateGovernanceReportRequest} extends {@link RequestModel}
 *
 * <p>GenerateGovernanceReportRequest</p>
 */
public class GenerateGovernanceReportRequest extends Request {
    private GenerateGovernanceReportRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateGovernanceReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GenerateGovernanceReportRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GenerateGovernanceReportRequest request) {
            super(request);
        } 

        @Override
        public GenerateGovernanceReportRequest build() {
            return new GenerateGovernanceReportRequest(this);
        } 

    } 

}
