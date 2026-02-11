// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRetcodeAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRetcodeAppsResponseBody</p>
 */
public class ListRetcodeAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetcodeApps")
    private java.util.List<RetcodeApps> retcodeApps;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<RetcodeApps> getRetcodeApps() {
        return this.retcodeApps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RetcodeApps> retcodeApps; 

        private Builder() {
        } 

        private Builder(ListRetcodeAppsResponseBody model) {
            this.requestId = model.requestId;
            this.retcodeApps = model.retcodeApps;
        } 

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
        public Builder retcodeApps(java.util.List<RetcodeApps> retcodeApps) {
            this.retcodeApps = retcodeApps;
            return this;
        }

        public ListRetcodeAppsResponseBody build() {
            return new ListRetcodeAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRetcodeAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRetcodeAppsResponseBody</p>
     */
    public static class RetcodeApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Pid")
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

            private Builder() {
            } 

            private Builder(RetcodeApps model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.pid = model.pid;
            } 

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
