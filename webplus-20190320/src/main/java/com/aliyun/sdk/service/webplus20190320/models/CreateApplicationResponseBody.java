// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationResponseBody</p>
 */
public class CreateApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    private Application application;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return application
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Application application; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * Application.
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApplicationResponseBody build() {
            return new CreateApplicationResponseBody(this);
        } 

    } 

    public static class Application extends TeaModel {
        @NameInMap("AppDescription")
        private String appDescription;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreateUsername")
        private String createUsername;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UpdateUsername")
        private String updateUsername;

        @NameInMap("UsingSharedStorage")
        private Boolean usingSharedStorage;

        private Application(Builder builder) {
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.categoryName = builder.categoryName;
            this.createTime = builder.createTime;
            this.createUsername = builder.createUsername;
            this.updateTime = builder.updateTime;
            this.updateUsername = builder.updateUsername;
            this.usingSharedStorage = builder.usingSharedStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return appDescription
         */
        public String getAppDescription() {
            return this.appDescription;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUsername
         */
        public String getCreateUsername() {
            return this.createUsername;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUsername
         */
        public String getUpdateUsername() {
            return this.updateUsername;
        }

        /**
         * @return usingSharedStorage
         */
        public Boolean getUsingSharedStorage() {
            return this.usingSharedStorage;
        }

        public static final class Builder {
            private String appDescription; 
            private String appId; 
            private String appName; 
            private String categoryName; 
            private Long createTime; 
            private String createUsername; 
            private Long updateTime; 
            private String updateUsername; 
            private Boolean usingSharedStorage; 

            /**
             * AppDescription.
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUsername.
             */
            public Builder createUsername(String createUsername) {
                this.createUsername = createUsername;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateUsername.
             */
            public Builder updateUsername(String updateUsername) {
                this.updateUsername = updateUsername;
                return this;
            }

            /**
             * UsingSharedStorage.
             */
            public Builder usingSharedStorage(Boolean usingSharedStorage) {
                this.usingSharedStorage = usingSharedStorage;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
