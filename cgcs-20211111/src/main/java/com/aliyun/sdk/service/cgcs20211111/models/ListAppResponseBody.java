// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppResponseBody</p>
 */
public class ListAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Apps")
    private java.util.List < Apps> apps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListAppResponseBody(Builder builder) {
        this.apps = builder.apps;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return apps
     */
    public java.util.List < Apps> getApps() {
        return this.apps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Apps> apps; 
        private String requestId; 
        private Long total; 

        /**
         * Apps.
         */
        public Builder apps(java.util.List < Apps> apps) {
            this.apps = apps;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAppResponseBody build() {
            return new ListAppResponseBody(this);
        } 

    } 

    public static class Apps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("VersionAdaptNum")
        private Long versionAdaptNum;

        @com.aliyun.core.annotation.NameInMap("VersionTotalNum")
        private Long versionTotalNum;

        private Apps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.versionAdaptNum = builder.versionAdaptNum;
            this.versionTotalNum = builder.versionTotalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apps create() {
            return builder().build();
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
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return versionAdaptNum
         */
        public Long getVersionAdaptNum() {
            return this.versionAdaptNum;
        }

        /**
         * @return versionTotalNum
         */
        public Long getVersionTotalNum() {
            return this.versionTotalNum;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long versionAdaptNum; 
            private Long versionTotalNum; 

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
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * VersionAdaptNum.
             */
            public Builder versionAdaptNum(Long versionAdaptNum) {
                this.versionAdaptNum = versionAdaptNum;
                return this;
            }

            /**
             * VersionTotalNum.
             */
            public Builder versionTotalNum(Long versionTotalNum) {
                this.versionTotalNum = versionTotalNum;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
}
