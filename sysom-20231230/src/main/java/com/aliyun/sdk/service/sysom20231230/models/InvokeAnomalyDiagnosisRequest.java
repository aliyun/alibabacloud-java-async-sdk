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
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private InvokeAnomalyDiagnosisRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.uuid = builder.uuid;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
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
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<InvokeAnomalyDiagnosisRequest, Builder> {
        private String xDebugId; 
        private String uuid; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(InvokeAnomalyDiagnosisRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.uuid = request.uuid;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public InvokeAnomalyDiagnosisRequest build() {
            return new InvokeAnomalyDiagnosisRequest(this);
        } 

    } 

}
