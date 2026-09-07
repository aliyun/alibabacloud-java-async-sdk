// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeOfficeSiteBridgeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOfficeSiteBridgeInfoResponseBody</p>
 */
public class DescribeOfficeSiteBridgeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bridge")
    private Bridge bridge;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOfficeSiteBridgeInfoResponseBody(Builder builder) {
        this.bridge = builder.bridge;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOfficeSiteBridgeInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bridge
     */
    public Bridge getBridge() {
        return this.bridge;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Bridge bridge; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOfficeSiteBridgeInfoResponseBody model) {
            this.bridge = model.bridge;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The virtual bridge information.</p>
         */
        public Builder bridge(Bridge bridge) {
            this.bridge = bridge;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F7E4322D-D679-5ACB-A909-490D2F0E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOfficeSiteBridgeInfoResponseBody build() {
            return new DescribeOfficeSiteBridgeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOfficeSiteBridgeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOfficeSiteBridgeInfoResponseBody</p>
     */
    public static class Bridge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("BridgeId")
        private String bridgeId;

        @com.aliyun.core.annotation.NameInMap("BridgeLevel")
        private String bridgeLevel;

        @com.aliyun.core.annotation.NameInMap("BridgeStatus")
        private String bridgeStatus;

        @com.aliyun.core.annotation.NameInMap("BridgeType")
        private String bridgeType;

        @com.aliyun.core.annotation.NameInMap("DefaultPassword")
        private String defaultPassword;

        @com.aliyun.core.annotation.NameInMap("DefaultUser")
        private String defaultUser;

        @com.aliyun.core.annotation.NameInMap("DeployTime")
        private String deployTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InternetUrl")
        private String internetUrl;

        @com.aliyun.core.annotation.NameInMap("IntranetUrl")
        private String intranetUrl;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Bridge(Builder builder) {
            this.accessType = builder.accessType;
            this.bridgeId = builder.bridgeId;
            this.bridgeLevel = builder.bridgeLevel;
            this.bridgeStatus = builder.bridgeStatus;
            this.bridgeType = builder.bridgeType;
            this.defaultPassword = builder.defaultPassword;
            this.defaultUser = builder.defaultUser;
            this.deployTime = builder.deployTime;
            this.expireTime = builder.expireTime;
            this.internetUrl = builder.internetUrl;
            this.intranetUrl = builder.intranetUrl;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bridge create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return bridgeId
         */
        public String getBridgeId() {
            return this.bridgeId;
        }

        /**
         * @return bridgeLevel
         */
        public String getBridgeLevel() {
            return this.bridgeLevel;
        }

        /**
         * @return bridgeStatus
         */
        public String getBridgeStatus() {
            return this.bridgeStatus;
        }

        /**
         * @return bridgeType
         */
        public String getBridgeType() {
            return this.bridgeType;
        }

        /**
         * @return defaultPassword
         */
        public String getDefaultPassword() {
            return this.defaultPassword;
        }

        /**
         * @return defaultUser
         */
        public String getDefaultUser() {
            return this.defaultUser;
        }

        /**
         * @return deployTime
         */
        public String getDeployTime() {
            return this.deployTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return internetUrl
         */
        public String getInternetUrl() {
            return this.internetUrl;
        }

        /**
         * @return intranetUrl
         */
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String accessType; 
            private String bridgeId; 
            private String bridgeLevel; 
            private String bridgeStatus; 
            private String bridgeType; 
            private String defaultPassword; 
            private String defaultUser; 
            private String deployTime; 
            private String expireTime; 
            private String internetUrl; 
            private String intranetUrl; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Bridge model) {
                this.accessType = model.accessType;
                this.bridgeId = model.bridgeId;
                this.bridgeLevel = model.bridgeLevel;
                this.bridgeStatus = model.bridgeStatus;
                this.bridgeType = model.bridgeType;
                this.defaultPassword = model.defaultPassword;
                this.defaultUser = model.defaultUser;
                this.deployTime = model.deployTime;
                this.expireTime = model.expireTime;
                this.internetUrl = model.internetUrl;
                this.intranetUrl = model.intranetUrl;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The access type of the management page.</p>
             * 
             * <strong>example:</strong>
             * <p>intranet</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The virtual bridge ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vb-sofiahfish***</p>
             */
            public Builder bridgeId(String bridgeId) {
                this.bridgeId = bridgeId;
                return this;
            }

            /**
             * <p>The virtual bridge specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>vb.pro</p>
             */
            public Builder bridgeLevel(String bridgeLevel) {
                this.bridgeLevel = bridgeLevel;
                return this;
            }

            /**
             * <p>The virtual bridge status.</p>
             * 
             * <strong>example:</strong>
             * <p>inuse</p>
             */
            public Builder bridgeStatus(String bridgeStatus) {
                this.bridgeStatus = bridgeStatus;
                return this;
            }

            /**
             * <p>The third-party plugin type of the virtual bridge.</p>
             * 
             * <strong>example:</strong>
             * <p>unsr</p>
             */
            public Builder bridgeType(String bridgeType) {
                this.bridgeType = bridgeType;
                return this;
            }

            /**
             * <p>The default password for the administrator page.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder defaultPassword(String defaultPassword) {
                this.defaultPassword = defaultPassword;
                return this;
            }

            /**
             * <p>The default account for the administrator page.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder defaultUser(String defaultUser) {
                this.defaultUser = defaultUser;
                return this;
            }

            /**
             * <p>The deployment time of the virtual bridge. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-07T02:02:00Z</p>
             */
            public Builder deployTime(String deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * <p>The expiration time of the virtual bridge. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-18T00:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The public network address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://8.*.*.*:8080">http://8.*.*.*:8080</a></p>
             */
            public Builder internetUrl(String internetUrl) {
                this.internetUrl = internetUrl;
                return this;
            }

            /**
             * <p>The internal network address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://10.0.0.0:8080">http://10.0.0.0:8080</a></p>
             */
            public Builder intranetUrl(String intranetUrl) {
                this.intranetUrl = intranetUrl;
                return this;
            }

            /**
             * <p>The ID of the locked convenience office network.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing+dir-0211574032</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The office network name. The name must be 2 to 255 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>P0801-1</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The start time of the virtual bridge. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-07T02:02:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Bridge build() {
                return new Bridge(this);
            } 

        } 

    }
}
