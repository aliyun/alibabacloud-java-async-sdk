// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMessageGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMessageGroupRequest</p>
 */
public class CreateMessageGroupRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("CreatorId")
    @Validation(required = true)
    private String creatorId;

    @Body
    @NameInMap("Extension")
    private java.util.Map < String, String > extension;

    private CreateMessageGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.creatorId = builder.creatorId;
        this.extension = builder.extension;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMessageGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return extension
     */
    public java.util.Map < String, String > getExtension() {
        return this.extension;
    }

    public static final class Builder extends Request.Builder<CreateMessageGroupRequest, Builder> {
        private String appId; 
        private String creatorId; 
        private java.util.Map < String, String > extension; 

        private Builder() {
            super();
        } 

        private Builder(CreateMessageGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.creatorId = request.creatorId;
            this.extension = request.extension;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CreatorId.
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * Extension.
         */
        public Builder extension(java.util.Map < String, String > extension) {
            String extensionShrink = shrink(extension, "Extension", "json");
            this.putBodyParameter("Extension", extensionShrink);
            this.extension = extension;
            return this;
        }

        @Override
        public CreateMessageGroupRequest build() {
            return new CreateMessageGroupRequest(this);
        } 

    } 

}
