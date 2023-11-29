// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetMLServiceResultsRequest} extends {@link RequestModel}
 *
 * <p>GetMLServiceResultsRequest</p>
 */
public class GetMLServiceResultsRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Query
    @NameInMap("allowBuiltin")
    private Boolean allowBuiltin;

    @Body
    @NameInMap("body")
    private MLServiceAnalysisParam body;

    private GetMLServiceResultsRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.allowBuiltin = builder.allowBuiltin;
        this.body = builder.body;
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

    public static final class Builder extends Request.Builder<GetMLServiceResultsRequest, Builder> {
        private String serviceName; 
        private Boolean allowBuiltin; 
        private MLServiceAnalysisParam body; 

        private Builder() {
            super();
        } 

        private Builder(GetMLServiceResultsRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.allowBuiltin = request.allowBuiltin;
            this.body = request.body;
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

        @Override
        public GetMLServiceResultsRequest build() {
            return new GetMLServiceResultsRequest(this);
        } 

    } 

}
