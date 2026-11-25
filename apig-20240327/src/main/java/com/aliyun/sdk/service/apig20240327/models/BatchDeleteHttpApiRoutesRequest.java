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
 * {@link BatchDeleteHttpApiRoutesRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteHttpApiRoutesRequest</p>
 */
public class BatchDeleteHttpApiRoutesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deleteAll")
    private Boolean deleteAll;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeIds")
    private java.util.List<String> routeIds;

    private BatchDeleteHttpApiRoutesRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.deleteAll = builder.deleteAll;
        this.routeIds = builder.routeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteHttpApiRoutesRequest create() {
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
     * @return deleteAll
     */
    public Boolean getDeleteAll() {
        return this.deleteAll;
    }

    /**
     * @return routeIds
     */
    public java.util.List<String> getRouteIds() {
        return this.routeIds;
    }

    public static final class Builder extends Request.Builder<BatchDeleteHttpApiRoutesRequest, Builder> {
        private String httpApiId; 
        private Boolean deleteAll; 
        private java.util.List<String> routeIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteHttpApiRoutesRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.deleteAll = request.deleteAll;
            this.routeIds = request.routeIds;
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
         * deleteAll.
         */
        public Builder deleteAll(Boolean deleteAll) {
            this.putBodyParameter("deleteAll", deleteAll);
            this.deleteAll = deleteAll;
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

        @Override
        public BatchDeleteHttpApiRoutesRequest build() {
            return new BatchDeleteHttpApiRoutesRequest(this);
        } 

    } 

}
