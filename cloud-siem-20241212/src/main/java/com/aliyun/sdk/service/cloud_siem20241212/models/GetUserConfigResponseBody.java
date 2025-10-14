// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetUserConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserConfigResponseBody</p>
 */
public class GetUserConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("User")
    private User user;

    private GetUserConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserConfigResponseBody create() {
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
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder {
        private String requestId; 
        private User user; 

        private Builder() {
        } 

        private Builder(GetUserConfigResponseBody model) {
            this.requestId = model.requestId;
            this.user = model.user;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * User.
         */
        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public GetUserConfigResponseBody build() {
            return new GetUserConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserConfigResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CtdrVersion")
        private String ctdrVersion;

        @com.aliyun.core.annotation.NameInMap("DataStorageVersion")
        private String dataStorageVersion;

        @com.aliyun.core.annotation.NameInMap("UpgradeCtdrVersion")
        private String upgradeCtdrVersion;

        @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
        private String upgradeStatus;

        private User(Builder builder) {
            this.ctdrVersion = builder.ctdrVersion;
            this.dataStorageVersion = builder.dataStorageVersion;
            this.upgradeCtdrVersion = builder.upgradeCtdrVersion;
            this.upgradeStatus = builder.upgradeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return ctdrVersion
         */
        public String getCtdrVersion() {
            return this.ctdrVersion;
        }

        /**
         * @return dataStorageVersion
         */
        public String getDataStorageVersion() {
            return this.dataStorageVersion;
        }

        /**
         * @return upgradeCtdrVersion
         */
        public String getUpgradeCtdrVersion() {
            return this.upgradeCtdrVersion;
        }

        /**
         * @return upgradeStatus
         */
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public static final class Builder {
            private String ctdrVersion; 
            private String dataStorageVersion; 
            private String upgradeCtdrVersion; 
            private String upgradeStatus; 

            private Builder() {
            } 

            private Builder(User model) {
                this.ctdrVersion = model.ctdrVersion;
                this.dataStorageVersion = model.dataStorageVersion;
                this.upgradeCtdrVersion = model.upgradeCtdrVersion;
                this.upgradeStatus = model.upgradeStatus;
            } 

            /**
             * CtdrVersion.
             */
            public Builder ctdrVersion(String ctdrVersion) {
                this.ctdrVersion = ctdrVersion;
                return this;
            }

            /**
             * DataStorageVersion.
             */
            public Builder dataStorageVersion(String dataStorageVersion) {
                this.dataStorageVersion = dataStorageVersion;
                return this;
            }

            /**
             * UpgradeCtdrVersion.
             */
            public Builder upgradeCtdrVersion(String upgradeCtdrVersion) {
                this.upgradeCtdrVersion = upgradeCtdrVersion;
                return this;
            }

            /**
             * UpgradeStatus.
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
