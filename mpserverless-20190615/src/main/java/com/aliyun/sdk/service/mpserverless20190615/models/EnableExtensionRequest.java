// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableExtensionRequest} extends {@link RequestModel}
 *
 * <p>EnableExtensionRequest</p>
 */
public class EnableExtensionRequest extends Request {
    @Body
    @NameInMap("ExtensionId")
    @Validation(required = true)
    private String extensionId;

    private EnableExtensionRequest(Builder builder) {
        super(builder);
        this.extensionId = builder.extensionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableExtensionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extensionId
     */
    public String getExtensionId() {
        return this.extensionId;
    }

    public static final class Builder extends Request.Builder<EnableExtensionRequest, Builder> {
        private String extensionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableExtensionRequest request) {
            super(request);
            this.extensionId = request.extensionId;
        } 

        /**
         * ExtensionId.
         */
        public Builder extensionId(String extensionId) {
            this.putBodyParameter("ExtensionId", extensionId);
            this.extensionId = extensionId;
            return this;
        }

        @Override
        public EnableExtensionRequest build() {
            return new EnableExtensionRequest(this);
        } 

    } 

}
