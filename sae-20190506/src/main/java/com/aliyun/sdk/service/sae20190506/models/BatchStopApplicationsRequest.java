// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStopApplicationsRequest} extends {@link RequestModel}
 *
 * <p>BatchStopApplicationsRequest</p>
 */
public class BatchStopApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    private String appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private BatchStopApplicationsRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.namespaceId = builder.namespaceId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchStopApplicationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<BatchStopApplicationsRequest, Builder> {
        private String appIds; 
        private String namespaceId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(BatchStopApplicationsRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.namespaceId = request.namespaceId;
            this.version = request.version;
        } 

        /**
         * The ID of the request.
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * ebf491f0-c1a5-45e2-b2c4-710dbe2a\*\*\*\*,ebf491f0-c1a5-45e2-b2c4-71025e2a\*\*\*\*
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The application version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public BatchStopApplicationsRequest build() {
            return new BatchStopApplicationsRequest(this);
        } 

    } 

}
