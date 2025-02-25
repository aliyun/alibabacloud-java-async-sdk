// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link InvokeAnomalyDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>InvokeAnomalyDiagnosisRequest</p>
 */
public class InvokeAnomalyDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    private InvokeAnomalyDiagnosisRequest(Builder builder) {
        super(builder);
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeAnomalyDiagnosisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<InvokeAnomalyDiagnosisRequest, Builder> {
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(InvokeAnomalyDiagnosisRequest request) {
            super(request);
            this.uuid = request.uuid;
        } 

        /**
         * uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public InvokeAnomalyDiagnosisRequest build() {
            return new InvokeAnomalyDiagnosisRequest(this);
        } 

    } 

}
