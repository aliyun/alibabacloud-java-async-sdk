// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListActiveAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListActiveAppsResponseBody</p>
 */
public class ListActiveAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListActiveAppsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActiveAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListActiveAppsResponseBody build() {
            return new ListActiveAppsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AhasAppName")
        private String ahasAppName;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppType")
        private Integer appType;

        @NameInMap("CurrentLevel")
        private Integer currentLevel;

        @NameInMap("DirtyLevel")
        private Integer dirtyLevel;

        @NameInMap("LastHealthPingTime")
        private Long lastHealthPingTime;

        @NameInMap("Namespace")
        private String namespace;

        private Data(Builder builder) {
            this.ahasAppName = builder.ahasAppName;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.currentLevel = builder.currentLevel;
            this.dirtyLevel = builder.dirtyLevel;
            this.lastHealthPingTime = builder.lastHealthPingTime;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ahasAppName
         */
        public String getAhasAppName() {
            return this.ahasAppName;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public Integer getAppType() {
            return this.appType;
        }

        /**
         * @return currentLevel
         */
        public Integer getCurrentLevel() {
            return this.currentLevel;
        }

        /**
         * @return dirtyLevel
         */
        public Integer getDirtyLevel() {
            return this.dirtyLevel;
        }

        /**
         * @return lastHealthPingTime
         */
        public Long getLastHealthPingTime() {
            return this.lastHealthPingTime;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private String ahasAppName; 
            private String appName; 
            private Integer appType; 
            private Integer currentLevel; 
            private Integer dirtyLevel; 
            private Long lastHealthPingTime; 
            private String namespace; 

            /**
             * AhasAppName.
             */
            public Builder ahasAppName(String ahasAppName) {
                this.ahasAppName = ahasAppName;
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
             * AppType.
             */
            public Builder appType(Integer appType) {
                this.appType = appType;
                return this;
            }

            /**
             * CurrentLevel.
             */
            public Builder currentLevel(Integer currentLevel) {
                this.currentLevel = currentLevel;
                return this;
            }

            /**
             * DirtyLevel.
             */
            public Builder dirtyLevel(Integer dirtyLevel) {
                this.dirtyLevel = dirtyLevel;
                return this;
            }

            /**
             * LastHealthPingTime.
             */
            public Builder lastHealthPingTime(Long lastHealthPingTime) {
                this.lastHealthPingTime = lastHealthPingTime;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
