// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link BindESUserAnalyzerRequest} extends {@link RequestModel}
 *
 * <p>BindESUserAnalyzerRequest</p>
 */
public class BindESUserAnalyzerRequest extends Request {
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

    private BindESUserAnalyzerRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.esInstanceId = builder.esInstanceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindESUserAnalyzerRequest create() {
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

    public static final class Builder extends Request.Builder<BindESUserAnalyzerRequest, Builder> {
        private String appGroupIdentity; 
        private String esInstanceId; 
        private Object body; 

        private Builder() {
            super();
        } 

        private Builder(BindESUserAnalyzerRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.esInstanceId = request.esInstanceId;
            this.body = request.body;
        } 

        /**
         * <p>The name of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130187460</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-zvp2g952l000v5uxp</p>
         */
        public Builder esInstanceId(String esInstanceId) {
            this.putPathParameter("esInstanceId", esInstanceId);
            this.esInstanceId = esInstanceId;
            return this;
        }

        /**
         * <p>The request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;name&quot;: &quot;kevintest-analyzer&quot;
         * }</p>
         */
        public Builder body(Object body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public BindESUserAnalyzerRequest build() {
            return new BindESUserAnalyzerRequest(this);
        } 

    } 

}
