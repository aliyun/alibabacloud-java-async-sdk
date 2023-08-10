// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindEsInstanceRequest} extends {@link RequestModel}
 *
 * <p>BindEsInstanceRequest</p>
 */
public class BindEsInstanceRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Body
    @NameInMap("body")
    private java.util.Map < String, ? > body;

    private BindEsInstanceRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindEsInstanceRequest create() {
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
     * @return body
     */
    public java.util.Map < String, ? > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<BindEsInstanceRequest, Builder> {
        private String appGroupIdentity; 
        private java.util.Map < String, ? > body; 

        private Builder() {
            super();
        } 

        private Builder(BindEsInstanceRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.body = request.body;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
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
        public BindEsInstanceRequest build() {
            return new BindEsInstanceRequest(this);
        } 

    } 

}
