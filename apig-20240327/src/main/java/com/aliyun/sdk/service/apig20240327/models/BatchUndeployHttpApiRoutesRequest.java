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
 * {@link BatchUndeployHttpApiRoutesRequest} extends {@link RequestModel}
 *
 * <p>BatchUndeployHttpApiRoutesRequest</p>
 */
public class BatchUndeployHttpApiRoutesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("async")
    private Boolean async;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeIds")
    private java.util.List<String> routeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("undeployAll")
    private Boolean undeployAll;

    private BatchUndeployHttpApiRoutesRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.async = builder.async;
        this.routeIds = builder.routeIds;
        this.undeployAll = builder.undeployAll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUndeployHttpApiRoutesRequest create() {
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
     * @return routeIds
     */
    public java.util.List<String> getRouteIds() {
        return this.routeIds;
    }

    /**
     * @return undeployAll
     */
    public Boolean getUndeployAll() {
        return this.undeployAll;
    }

    public static final class Builder extends Request.Builder<BatchUndeployHttpApiRoutesRequest, Builder> {
        private String httpApiId; 
        private Boolean async; 
        private java.util.List<String> routeIds; 
        private Boolean undeployAll; 

        private Builder() {
            super();
        } 

        private Builder(BatchUndeployHttpApiRoutesRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.async = request.async;
            this.routeIds = request.routeIds;
            this.undeployAll = request.undeployAll;
        } 

        /**
         * httpApiId.
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * async.
         */
        public Builder async(Boolean async) {
            this.putBodyParameter("async", async);
            this.async = async;
            return this;
        }

        /**
         * routeIds.
         */
        public Builder routeIds(java.util.List<String> routeIds) {
            this.putBodyParameter("routeIds", routeIds);
            this.routeIds = routeIds;
            return this;
        }

        /**
         * undeployAll.
         */
        public Builder undeployAll(Boolean undeployAll) {
            this.putBodyParameter("undeployAll", undeployAll);
            this.undeployAll = undeployAll;
            return this;
        }

        @Override
        public BatchUndeployHttpApiRoutesRequest build() {
            return new BatchUndeployHttpApiRoutesRequest(this);
        } 

    } 

}
