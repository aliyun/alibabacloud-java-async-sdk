// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link BatchDeployHttpApiRoutesRequest} extends {@link RequestModel}
 *
 * <p>BatchDeployHttpApiRoutesRequest</p>
 */
public class BatchDeployHttpApiRoutesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("async")
    private Boolean async;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deployAll")
    private Boolean deployAll;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeIds")
    private java.util.List<String> routeIds;

    private BatchDeployHttpApiRoutesRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.async = builder.async;
        this.deployAll = builder.deployAll;
        this.routeIds = builder.routeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeployHttpApiRoutesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return deployAll
     */
    public Boolean getDeployAll() {
        return this.deployAll;
    }

    /**
     * @return routeIds
     */
    public java.util.List<String> getRouteIds() {
        return this.routeIds;
    }

    public static final class Builder extends Request.Builder<BatchDeployHttpApiRoutesRequest, Builder> {
        private String httpApiId; 
        private Boolean async; 
        private Boolean deployAll; 
        private java.util.List<String> routeIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeployHttpApiRoutesRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.async = request.async;
            this.deployAll = request.deployAll;
            this.routeIds = request.routeIds;
        } 

        /**
         * <p>The ID of the HTTP API for which to publish route entries in batches.</p>
         * 
         * <strong>example:</strong>
         * <p>api-example001</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>Specifies whether to publish routes asynchronously. Default value: true. If set to true, the acceptance results of the routes are returned. If set to false, the system waits for the batch processing to complete and returns the final results and statistics for each route.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder async(Boolean async) {
            this.putBodyParameter("async", async);
            this.async = async;
            return this;
        }

        /**
         * <p>Specifies whether to publish all routes visible to the current user under the API. Default value: false. If you set this parameter to true, all visible routes are published and the routeIds parameter is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deployAll(Boolean deployAll) {
            this.putBodyParameter("deployAll", deployAll);
            this.deployAll = deployAll;
            return this;
        }

        /**
         * <p>The list of route IDs to publish. If deployAll is omitted or set to false, at least one route ID must be provided. If any route does not exist or belongs to another API, the entire batch request is rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;hr-example001&quot;,&quot;hr-example002&quot;]</p>
         */
        public Builder routeIds(java.util.List<String> routeIds) {
            this.putBodyParameter("routeIds", routeIds);
            this.routeIds = routeIds;
            return this;
        }

        @Override
        public BatchDeployHttpApiRoutesRequest build() {
            return new BatchDeployHttpApiRoutesRequest(this);
        } 

    } 

}
