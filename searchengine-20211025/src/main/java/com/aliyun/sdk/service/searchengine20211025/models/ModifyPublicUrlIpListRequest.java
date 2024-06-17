// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPublicUrlIpListRequest} extends {@link RequestModel}
 *
 * <p>ModifyPublicUrlIpListRequest</p>
 */
public class ModifyPublicUrlIpListRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map < String, String > body;

    private ModifyPublicUrlIpListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPublicUrlIpListRequest create() {
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
     * @return body
     */
    public java.util.Map < String, String > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModifyPublicUrlIpListRequest, Builder> {
        private String instanceId; 
        private java.util.Map < String, String > body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPublicUrlIpListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * body
         */
        public Builder body(java.util.Map < String, String > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModifyPublicUrlIpListRequest build() {
            return new ModifyPublicUrlIpListRequest(this);
        } 

    } 

}
