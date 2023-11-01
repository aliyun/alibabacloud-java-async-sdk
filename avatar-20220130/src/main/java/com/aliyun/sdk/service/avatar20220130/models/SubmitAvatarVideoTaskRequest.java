// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAvatarVideoTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitAvatarVideoTaskRequest</p>
 */
public class SubmitAvatarVideoTaskRequest extends Request {
    @Query
    @NameInMap("App")
    @Validation(required = true)
    private App app;

    @Query
    @NameInMap("Callback")
    private Boolean callback;

    @Query
    @NameInMap("CallbackParams")
    private String callbackParams;

    @Query
    @NameInMap("ExtParams")
    private String extParams;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Query
    @NameInMap("VideoParams")
    @Validation(required = true)
    private String videoParams;

    private SubmitAvatarVideoTaskRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.callback = builder.callback;
        this.callbackParams = builder.callbackParams;
        this.extParams = builder.extParams;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
        this.videoParams = builder.videoParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAvatarVideoTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public App getApp() {
        return this.app;
    }

    /**
     * @return callback
     */
    public Boolean getCallback() {
        return this.callback;
    }

    /**
     * @return callbackParams
     */
    public String getCallbackParams() {
        return this.callbackParams;
    }

    /**
     * @return extParams
     */
    public String getExtParams() {
        return this.extParams;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return videoParams
     */
    public String getVideoParams() {
        return this.videoParams;
    }

    public static final class Builder extends Request.Builder<SubmitAvatarVideoTaskRequest, Builder> {
        private App app; 
        private Boolean callback; 
        private String callbackParams; 
        private String extParams; 
        private Long tenantId; 
        private String title; 
        private String videoParams; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAvatarVideoTaskRequest request) {
            super(request);
            this.app = request.app;
            this.callback = request.callback;
            this.callbackParams = request.callbackParams;
            this.extParams = request.extParams;
            this.tenantId = request.tenantId;
            this.title = request.title;
            this.videoParams = request.videoParams;
        } 

        /**
         * App.
         */
        public Builder app(App app) {
            String appShrink = shrink(app, "App", "json");
            this.putQueryParameter("App", appShrink);
            this.app = app;
            return this;
        }

        /**
         * Callback.
         */
        public Builder callback(Boolean callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * CallbackParams.
         */
        public Builder callbackParams(String callbackParams) {
            this.putQueryParameter("CallbackParams", callbackParams);
            this.callbackParams = callbackParams;
            return this;
        }

        /**
         * ExtParams.
         */
        public Builder extParams(String extParams) {
            this.putQueryParameter("ExtParams", extParams);
            this.extParams = extParams;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * VideoParams.
         */
        public Builder videoParams(String videoParams) {
            this.putQueryParameter("VideoParams", videoParams);
            this.videoParams = videoParams;
            return this;
        }

        @Override
        public SubmitAvatarVideoTaskRequest build() {
            return new SubmitAvatarVideoTaskRequest(this);
        } 

    } 

    public static class App extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        private String appId;

        private App(Builder builder) {
            this.appId = builder.appId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        public static final class Builder {
            private String appId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
}
