// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
         * <p>The returned message.</p>
         * <ul>
         * <li><strong>success</strong> is returned when the request succeeds.</li>
         * <li>An error code is returned when the request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ebf491f0-c1a5-45e2-b2c4-710dbe2a****</p>
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
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
