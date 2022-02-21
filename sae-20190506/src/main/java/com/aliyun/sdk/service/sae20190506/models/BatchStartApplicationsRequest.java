// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStartApplicationsRequest} extends {@link RequestModel}
 *
 * <p>BatchStartApplicationsRequest</p>
 */
public class BatchStartApplicationsRequest extends Request {
    @Query
    @NameInMap("AppIds")
    private String appIds;

    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    private BatchStartApplicationsRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.namespaceId = builder.namespaceId;
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

    public static final class Builder extends Request.Builder<BatchStartApplicationsRequest, Builder> {
        private String appIds; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchStartApplicationsRequest response) {
            super(response);
            this.appIds = response.appIds;
            this.namespaceId = response.namespaceId;
        } 

        /**
         * AppIds.
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public BatchStartApplicationsRequest build() {
            return new BatchStartApplicationsRequest(this);
        } 

    } 

}
