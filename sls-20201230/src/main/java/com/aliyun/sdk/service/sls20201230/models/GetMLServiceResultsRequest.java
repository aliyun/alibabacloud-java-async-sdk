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
         * serviceName.
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
         * version.
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
