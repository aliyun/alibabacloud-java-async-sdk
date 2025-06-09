// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetMLServiceResultsRequest} extends {@link RequestModel}
 *
 * <p>GetMLServiceResultsRequest</p>
 */
public class GetMLServiceResultsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("allowBuiltin")
    private Boolean allowBuiltin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private MLServiceAnalysisParam body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private GetMLServiceResultsRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.allowBuiltin = builder.allowBuiltin;
        this.body = builder.body;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMLServiceResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return allowBuiltin
     */
    public Boolean getAllowBuiltin() {
        return this.allowBuiltin;
    }

    /**
     * @return body
     */
    public MLServiceAnalysisParam getBody() {
        return this.body;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetMLServiceResultsRequest, Builder> {
        private String serviceName; 
        private Boolean allowBuiltin; 
        private MLServiceAnalysisParam body; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetMLServiceResultsRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.allowBuiltin = request.allowBuiltin;
            this.body = request.body;
            this.version = request.version;
        } 

        /**
         * <p>The name of the service.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>sls_builtin_service_trace_rca: service name for high-latency trace analysis.</li>
         * <li>sls_builtin_service_log_struct: service name for NER tasks on logs.</li>
         * <li>sls_builtin_service_metric_anomaly: service name for single-dimension anomaly detection on time series.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sls_builtin_service_log_struct</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * allowBuiltin.
         */
        public Builder allowBuiltin(Boolean allowBuiltin) {
            this.putQueryParameter("allowBuiltin", allowBuiltin);
            this.allowBuiltin = allowBuiltin;
            return this;
        }

        /**
         * body.
         */
        public Builder body(MLServiceAnalysisParam body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The version of the algorithm. The algorithm varies based on the version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetMLServiceResultsRequest build() {
            return new GetMLServiceResultsRequest(this);
        } 

    } 

}
