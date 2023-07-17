// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRetcodeAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRetcodeAppsResponseBody</p>
 */
public class ListRetcodeAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetcodeApps")
    private java.util.List < RetcodeApps> retcodeApps;

    private ListRetcodeAppsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.retcodeApps = builder.retcodeApps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRetcodeAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retcodeApps
     */
    public java.util.List < RetcodeApps> getRetcodeApps() {
        return this.retcodeApps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RetcodeApps> retcodeApps; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RetcodeApps.
         */
        public Builder retcodeApps(java.util.List < RetcodeApps> retcodeApps) {
            this.retcodeApps = retcodeApps;
            return this;
        }

        public ListRetcodeAppsResponseBody build() {
            return new ListRetcodeAppsResponseBody(this);
        } 

    } 

    public static class RetcodeApps extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Pid")
        private String pid;

        private RetcodeApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.pid = builder.pid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetcodeApps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private String pid; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
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
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            public RetcodeApps build() {
                return new RetcodeApps(this);
            } 

        } 

    }
}
