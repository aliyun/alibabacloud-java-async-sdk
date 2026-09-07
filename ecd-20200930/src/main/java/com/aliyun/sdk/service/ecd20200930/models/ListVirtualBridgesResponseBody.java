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
 * {@link ListVirtualBridgesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirtualBridgesResponseBody</p>
 */
public class ListVirtualBridgesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bridges")
    private java.util.List<Bridges> bridges;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVirtualBridgesResponseBody(Builder builder) {
        this.bridges = builder.bridges;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualBridgesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bridges
     */
    public java.util.List<Bridges> getBridges() {
        return this.bridges;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Bridges> bridges; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListVirtualBridgesResponseBody model) {
            this.bridges = model.bridges;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The virtual bridge information.</p>
         */
        public Builder bridges(java.util.List<Bridges> bridges) {
            this.bridges = bridges;
            return this;
        }

        /**
         * <p>The maximum number of entries returned. Valid values: 1 to 100. If this parameter is not specified, the default value 100 is used. The number of returned entries can be less than but cannot be greater than the specified number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVirtualBridgesResponseBody build() {
            return new ListVirtualBridgesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirtualBridgesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirtualBridgesResponseBody</p>
     */
    public static class Bridges extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("IntranetUrl")
        private String intranetUrl;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        private Bridges(Builder builder) {
            this.accessType = builder.accessType;
            this.bridgeId = builder.bridgeId;
            this.bridgeLevel = builder.bridgeLevel;
            this.bridgeStatus = builder.bridgeStatus;
            this.bridgeType = builder.bridgeType;
            this.expireTime = builder.expireTime;
            this.intranetUrl = builder.intranetUrl;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bridges create() {
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
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
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

        public static final class Builder {
            private String accessType; 
            private String bridgeId; 
            private String bridgeLevel; 
            private String bridgeStatus; 
            private String bridgeType; 
            private String expireTime; 
            private String intranetUrl; 
            private String officeSiteId; 
            private String officeSiteName; 

            private Builder() {
            } 

            private Builder(Bridges model) {
                this.accessType = model.accessType;
                this.bridgeId = model.bridgeId;
                this.bridgeLevel = model.bridgeLevel;
                this.bridgeStatus = model.bridgeStatus;
                this.bridgeType = model.bridgeType;
                this.expireTime = model.expireTime;
                this.intranetUrl = model.intranetUrl;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
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
             * <p>vb-sfijaosifiosjfoij***</p>
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
             * <p>panbit</p>
             */
            public Builder bridgeType(String bridgeType) {
                this.bridgeType = bridgeType;
                return this;
            }

            /**
             * <p>The expiration time. The time is in the ISO 8601 standard in the UTC format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-07T02:02:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
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
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen+dir-8485473914</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The office network name.</p>
             * 
             * <strong>example:</strong>
             * <p>hk11</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            public Bridges build() {
                return new Bridges(this);
            } 

        } 

    }
}
