// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelVideoTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelVideoTaskRequest</p>
 */
public class CancelVideoTaskRequest extends Request {
    @Query
    @NameInMap("App")
    @Validation(required = true)
    private App app;

    @Query
    @NameInMap("TaskUuid")
    @Validation(required = true)
    private String taskUuid;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private CancelVideoTaskRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.taskUuid = builder.taskUuid;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelVideoTaskRequest create() {
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
     * @return taskUuid
     */
    public String getTaskUuid() {
        return this.taskUuid;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CancelVideoTaskRequest, Builder> {
        private App app; 
        private String taskUuid; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CancelVideoTaskRequest request) {
            super(request);
            this.app = request.app;
            this.taskUuid = request.taskUuid;
            this.tenantId = request.tenantId;
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
         * TaskUuid.
         */
        public Builder taskUuid(String taskUuid) {
            this.putQueryParameter("TaskUuid", taskUuid);
            this.taskUuid = taskUuid;
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

        @Override
        public CancelVideoTaskRequest build() {
            return new CancelVideoTaskRequest(this);
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
