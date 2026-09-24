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
 * {@link QueryAuthUserConnectDurationListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuthUserConnectDurationListResponseBody</p>
 */
public class QueryAuthUserConnectDurationListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthUserConnectDurationList")
    private java.util.List<AuthUserConnectDurationList> authUserConnectDurationList;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryAuthUserConnectDurationListResponseBody(Builder builder) {
        this.authUserConnectDurationList = builder.authUserConnectDurationList;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthUserConnectDurationListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authUserConnectDurationList
     */
    public java.util.List<AuthUserConnectDurationList> getAuthUserConnectDurationList() {
        return this.authUserConnectDurationList;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AuthUserConnectDurationList> authUserConnectDurationList; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(QueryAuthUserConnectDurationListResponseBody model) {
            this.authUserConnectDurationList = model.authUserConnectDurationList;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The connection duration list of authorized users.</p>
         */
        public Builder authUserConnectDurationList(java.util.List<AuthUserConnectDurationList> authUserConnectDurationList) {
            this.authUserConnectDurationList = authUserConnectDurationList;
            return this;
        }

        /**
         * <p>The pagination token for the next page. This parameter is returned when the results span multiple pages. Pass this value as the NextToken in the next request to retrieve the next page. This parameter is returned only when statistics are collected by individual session details.</p>
         * 
         * <strong>example:</strong>
         * <p>d129c6c0e8c04c8a9f0e2b7c1a3f5e6d</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F0F0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records that match the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryAuthUserConnectDurationListResponseBody build() {
            return new QueryAuthUserConnectDurationListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAuthUserConnectDurationListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAuthUserConnectDurationListResponseBody</p>
     */
    public static class AuthUserConnectDurationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectDuration")
        private Long connectDuration;

        @com.aliyun.core.annotation.NameInMap("ConnectEndTime")
        private String connectEndTime;

        @com.aliyun.core.annotation.NameInMap("ConnectStartTime")
        private String connectStartTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DirectoryType")
        private Integer directoryType;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("DisplayNameNew")
        private String displayNameNew;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private AuthUserConnectDurationList(Builder builder) {
            this.connectDuration = builder.connectDuration;
            this.connectEndTime = builder.connectEndTime;
            this.connectStartTime = builder.connectStartTime;
            this.description = builder.description;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.directoryType = builder.directoryType;
            this.displayName = builder.displayName;
            this.displayNameNew = builder.displayNameNew;
            this.domainName = builder.domainName;
            this.endUserId = builder.endUserId;
            this.nickName = builder.nickName;
            this.regionId = builder.regionId;
            this.userPrincipalName = builder.userPrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthUserConnectDurationList create() {
            return builder().build();
        }

        /**
         * @return connectDuration
         */
        public Long getConnectDuration() {
            return this.connectDuration;
        }

        /**
         * @return connectEndTime
         */
        public String getConnectEndTime() {
            return this.connectEndTime;
        }

        /**
         * @return connectStartTime
         */
        public String getConnectStartTime() {
            return this.connectStartTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return directoryType
         */
        public Integer getDirectoryType() {
            return this.directoryType;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return displayNameNew
         */
        public String getDisplayNameNew() {
            return this.displayNameNew;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public static final class Builder {
            private Long connectDuration; 
            private String connectEndTime; 
            private String connectStartTime; 
            private String description; 
            private String desktopId; 
            private String desktopName; 
            private Integer directoryType; 
            private String displayName; 
            private String displayNameNew; 
            private String domainName; 
            private String endUserId; 
            private String nickName; 
            private String regionId; 
            private String userPrincipalName; 

            private Builder() {
            } 

            private Builder(AuthUserConnectDurationList model) {
                this.connectDuration = model.connectDuration;
                this.connectEndTime = model.connectEndTime;
                this.connectStartTime = model.connectStartTime;
                this.description = model.description;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.directoryType = model.directoryType;
                this.displayName = model.displayName;
                this.displayNameNew = model.displayNameNew;
                this.domainName = model.domainName;
                this.endUserId = model.endUserId;
                this.nickName = model.nickName;
                this.regionId = model.regionId;
                this.userPrincipalName = model.userPrincipalName;
            } 

            /**
             * <p>The connection duration of the user, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder connectDuration(Long connectDuration) {
                this.connectDuration = connectDuration;
                return this;
            }

            /**
             * <p>The end time of the connection, as a UNIX timestamp in milliseconds. This parameter is returned only when statistics are collected by individual session details (StatisticType=SingleSession).</p>
             * 
             * <strong>example:</strong>
             * <p>1719208800000</p>
             */
            public Builder connectEndTime(String connectEndTime) {
                this.connectEndTime = connectEndTime;
                return this;
            }

            /**
             * <p>The start time of the connection, as a UNIX timestamp in milliseconds. This parameter is returned only when statistics are collected by individual session details (StatisticType=SingleSession).</p>
             * 
             * <strong>example:</strong>
             * <p>1719205200000</p>
             */
            public Builder connectStartTime(String connectStartTime) {
                this.connectStartTime = connectStartTime;
                return this;
            }

            /**
             * <p>The remarks of the user. This parameter is returned only for convenience users when WithDetail is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D department employee</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The cloud desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-gx2x1dhsmusr2****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud desktop name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-desktop</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The type of the directory to which the user belongs. Valid values:</p>
             * <ul>
             * <li>1: convenience account.</li>
             * <li>2: RAM account.</li>
             * <li>3: AD account.</li>
             * <li>4: personal edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder directoryType(Integer directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * <p>The display name of the user. This parameter is returned only for AD users when WithDetail is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The new display name of the user. This parameter is returned only for AD users when WithDetail is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder displayNameNew(String displayNameNew) {
                this.displayNameNew = displayNameNew;
                return this;
            }

            /**
             * <p>The AD domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The nickname of the user. This parameter is returned only for convenience users when WithDetail is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>Xiao Zhang</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The user principal name (UPN). This parameter is returned only for AD users when WithDetail is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            public AuthUserConnectDurationList build() {
                return new AuthUserConnectDurationList(this);
            } 

        } 

    }
}
