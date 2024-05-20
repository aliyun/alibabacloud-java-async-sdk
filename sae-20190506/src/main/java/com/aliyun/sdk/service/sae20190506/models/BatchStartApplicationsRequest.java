// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStartApplicationsRequest} extends {@link RequestModel}
 *
 * <p>BatchStartApplicationsRequest</p>
 */
public class BatchStartApplicationsRequest extends Request {
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

    private BatchStartApplicationsRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.namespaceId = builder.namespaceId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchStartApplicationsRequest create() {
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

    public static final class Builder extends Request.Builder<BatchStartApplicationsRequest, Builder> {
        private String appIds; 
        private String namespaceId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(BatchStartApplicationsRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.namespaceId = request.namespaceId;
            this.version = request.version;
        } 

        /**
         * The returned message.
         * <p>
         * 
         * *   **success** is returned when the request succeeds.
         * *   An error code is returned when the request fails.
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public BatchStartApplicationsRequest build() {
            return new BatchStartApplicationsRequest(this);
        } 

    } 

}
