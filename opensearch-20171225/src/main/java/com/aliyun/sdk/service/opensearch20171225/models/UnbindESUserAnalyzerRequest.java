// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindESUserAnalyzerRequest} extends {@link RequestModel}
 *
 * <p>UnbindESUserAnalyzerRequest</p>
 */
public class UnbindESUserAnalyzerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("esInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String esInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Object body;

    private UnbindESUserAnalyzerRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.esInstanceId = builder.esInstanceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindESUserAnalyzerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return esInstanceId
     */
    public String getEsInstanceId() {
        return this.esInstanceId;
    }

    /**
     * @return body
     */
    public Object getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UnbindESUserAnalyzerRequest, Builder> {
        private String appGroupIdentity; 
        private String esInstanceId; 
        private Object body; 

        private Builder() {
            super();
        } 

        private Builder(UnbindESUserAnalyzerRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.esInstanceId = request.esInstanceId;
            this.body = request.body;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder esInstanceId(String esInstanceId) {
            this.putPathParameter("esInstanceId", esInstanceId);
            this.esInstanceId = esInstanceId;
            return this;
        }

        /**
         * The request parameters.
         */
        public Builder body(Object body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UnbindESUserAnalyzerRequest build() {
            return new UnbindESUserAnalyzerRequest(this);
        } 

    } 

}
