// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link CreateServiceInstanceTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceInstanceTokenResponseBody</p>
 */
public class CreateServiceInstanceTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamlogUrl")
    private String streamlogUrl;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("WorkbenchUrl")
    private String workbenchUrl;

    private CreateServiceInstanceTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.streamlogUrl = builder.streamlogUrl;
        this.token = builder.token;
        this.url = builder.url;
        this.workbenchUrl = builder.workbenchUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceInstanceTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamlogUrl
     */
    public String getStreamlogUrl() {
        return this.streamlogUrl;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return workbenchUrl
     */
    public String getWorkbenchUrl() {
        return this.workbenchUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String streamlogUrl; 
        private String token; 
        private String url; 
        private String workbenchUrl; 

        private Builder() {
        } 

        private Builder(CreateServiceInstanceTokenResponseBody model) {
            this.requestId = model.requestId;
            this.streamlogUrl = model.streamlogUrl;
            this.token = model.token;
            this.url = model.url;
            this.workbenchUrl = model.workbenchUrl;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamlogUrl.
         */
        public Builder streamlogUrl(String streamlogUrl) {
            this.streamlogUrl = streamlogUrl;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * WorkbenchUrl.
         */
        public Builder workbenchUrl(String workbenchUrl) {
            this.workbenchUrl = workbenchUrl;
            return this;
        }

        public CreateServiceInstanceTokenResponseBody build() {
            return new CreateServiceInstanceTokenResponseBody(this);
        } 

    } 

}
