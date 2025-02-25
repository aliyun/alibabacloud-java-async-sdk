// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMonitorRequest} extends {@link RequestModel}
 *
 * <p>PushMonitorRequest</p>
 */
public class PushMonitorRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("apiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private PushMonitorRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PushMonitorRequest, Builder> {
        private String apiKey; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(PushMonitorRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.body = request.body;
        } 

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.putPathParameter("apiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PushMonitorRequest build() {
            return new PushMonitorRequest(this);
        } 

    } 

}
