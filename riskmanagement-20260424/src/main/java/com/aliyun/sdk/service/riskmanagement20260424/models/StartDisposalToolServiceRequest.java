// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link StartDisposalToolServiceRequest} extends {@link RequestModel}
 *
 * <p>StartDisposalToolServiceRequest</p>
 */
public class StartDisposalToolServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    private StartDisposalToolServiceRequest(Builder builder) {
        super(builder);
        this.authType = builder.authType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDisposalToolServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    public static final class Builder extends Request.Builder<StartDisposalToolServiceRequest, Builder> {
        private String authType; 

        private Builder() {
            super();
        } 

        private Builder(StartDisposalToolServiceRequest request) {
            super(request);
            this.authType = request.authType;
        } 

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        @Override
        public StartDisposalToolServiceRequest build() {
            return new StartDisposalToolServiceRequest(this);
        } 

    } 

}
