// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishIndexVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishIndexVersionRequest</p>
 */
public class PublishIndexVersionRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("indexName")
    @Validation(required = true)
    private String indexName;

    @Body
    @NameInMap("body")
    private java.util.Map < String, ? > body;

    private PublishIndexVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexName = builder.indexName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishIndexVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return body
     */
    public java.util.Map < String, ? > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PublishIndexVersionRequest, Builder> {
        private String instanceId; 
        private String indexName; 
        private java.util.Map < String, ? > body; 

        private Builder() {
            super();
        } 

        private Builder(PublishIndexVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.indexName = request.indexName;
            this.body = request.body;
        } 

        /**
         * Publishes a specified index version.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * WB01240825
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.Map < String, ? > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PublishIndexVersionRequest build() {
            return new PublishIndexVersionRequest(this);
        } 

    } 

}
