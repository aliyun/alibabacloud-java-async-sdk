// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHookConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateHookConfigurationRequest</p>
 */
public class UpdateHookConfigurationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Hooks")
    @Validation(required = true)
    private String hooks;

    private UpdateHookConfigurationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
        this.hooks = builder.hooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHookConfigurationRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return hooks
     */
    public String getHooks() {
        return this.hooks;
    }

    public static final class Builder extends Request.Builder<UpdateHookConfigurationRequest, Builder> {
        private String appId; 
        private String groupId; 
        private String hooks; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHookConfigurationRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
            this.hooks = request.hooks;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the application instance group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The script to mount. Set the value in the JSON format. Example: `[{"ignoreFail":false,"name":"postprepareInstanceEnvironmentOnScaleOut","script":"ls"},{"ignoreFail":true,"name":"postdeleteInstanceDataOnScaleIn","script":""},{"ignoreFail":true,"name":"prestartInstance","script":""},{"ignoreFail":true,"name":"poststartInstance","script":""},{"ignoreFail":true,"name":"prestopInstance","script":""},{"ignoreFail":true,"name":"poststopInstance","script":""}]`
         */
        public Builder hooks(String hooks) {
            this.putQueryParameter("Hooks", hooks);
            this.hooks = hooks;
            return this;
        }

        @Override
        public UpdateHookConfigurationRequest build() {
            return new UpdateHookConfigurationRequest(this);
        } 

    } 

}
