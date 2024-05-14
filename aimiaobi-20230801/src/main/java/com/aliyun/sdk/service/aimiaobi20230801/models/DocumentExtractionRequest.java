// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DocumentExtractionRequest} extends {@link RequestModel}
 *
 * <p>DocumentExtractionRequest</p>
 */
public class DocumentExtractionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Urls")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > urls;

    private DocumentExtractionRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.urls = builder.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentExtractionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return urls
     */
    public java.util.List < String > getUrls() {
        return this.urls;
    }

    public static final class Builder extends Request.Builder<DocumentExtractionRequest, Builder> {
        private String agentKey; 
        private java.util.List < String > urls; 

        private Builder() {
            super();
        } 

        private Builder(DocumentExtractionRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.urls = request.urls;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Urls.
         */
        public Builder urls(java.util.List < String > urls) {
            String urlsShrink = shrink(urls, "Urls", "json");
            this.putBodyParameter("Urls", urlsShrink);
            this.urls = urls;
            return this;
        }

        @Override
        public DocumentExtractionRequest build() {
            return new DocumentExtractionRequest(this);
        } 

    } 

}
