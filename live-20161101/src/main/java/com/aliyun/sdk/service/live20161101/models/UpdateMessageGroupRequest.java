// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateMessageGroupRequest</p>
 */
public class UpdateMessageGroupRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Extension")
    private java.util.Map < String, String > extension;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    private UpdateMessageGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.extension = builder.extension;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMessageGroupRequest create() {
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
     * @return extension
     */
    public java.util.Map < String, String > getExtension() {
        return this.extension;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<UpdateMessageGroupRequest, Builder> {
        private String appId; 
        private java.util.Map < String, String > extension; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMessageGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.extension = request.extension;
            this.groupId = request.groupId;
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
         * Extension.
         */
        public Builder extension(java.util.Map < String, String > extension) {
            String extensionShrink = shrink(extension, "Extension", "json");
            this.putBodyParameter("Extension", extensionShrink);
            this.extension = extension;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public UpdateMessageGroupRequest build() {
            return new UpdateMessageGroupRequest(this);
        } 

    } 

}
