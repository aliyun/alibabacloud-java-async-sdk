// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSlsLogStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateSlsLogStoreRequest</p>
 */
public class UpdateSlsLogStoreRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Configs")
    @Validation(required = true)
    private String configs;

    private UpdateSlsLogStoreRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.configs = builder.configs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSlsLogStoreRequest create() {
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
     * @return configs
     */
    public String getConfigs() {
        return this.configs;
    }

    public static final class Builder extends Request.Builder<UpdateSlsLogStoreRequest, Builder> {
        private String appId; 
        private String configs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSlsLogStoreRequest request) {
            super(request);
            this.appId = request.appId;
            this.configs = request.configs;
        } 

        /**
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The configurations of the Logstore.
         * <p>
         * 
         * *   The following parameters are included in the configurations:****
         * 
         *     *   **type**: the collection type. Set this parameter to file to specify the file type. Set this parameter to stdout to specify the standard output type.
         * 
         *     *   **logstore**: the name of the Logstore. Make sure that the name of the Logstore is unique in the cluster. The name must comply with the following rules:
         * 
         *         *   The name can contain only lowercase letters, digits, hyphens (-), and underscores (\_).
         *         *   The name must start and end with a lowercase letter or a digit.
         *         *   The name must be 3 to 63 characters in length.
         * 
         *         **
         * 
         *         **Note**If you leave this parameter empty, the system automatically generates a name.
         * 
         *     *   **LogDir**: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (\*) are supported. The collection path must match the following regular expression: `^/(.+)/(.*)^/$`.
         */
        public Builder configs(String configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        @Override
        public UpdateSlsLogStoreRequest build() {
            return new UpdateSlsLogStoreRequest(this);
        } 

    } 

}
