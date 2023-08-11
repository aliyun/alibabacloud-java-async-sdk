// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserBasicInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserBasicInfosResponseBody</p>
 */
public class ListUserBasicInfosResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("Marker")
    private String marker;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserBasicInfos")
    private UserBasicInfos userBasicInfos;

    private ListUserBasicInfosResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.requestId = builder.requestId;
        this.userBasicInfos = builder.userBasicInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserBasicInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userBasicInfos
     */
    public UserBasicInfos getUserBasicInfos() {
        return this.userBasicInfos;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String marker; 
        private String requestId; 
        private UserBasicInfos userBasicInfos; 

        /**
         * Indicates whether the response is truncated. Valid value:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The `marker`. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the information about the RAM user.
         */
        public Builder userBasicInfos(UserBasicInfos userBasicInfos) {
            this.userBasicInfos = userBasicInfos;
            return this;
        }

        public ListUserBasicInfosResponseBody build() {
            return new ListUserBasicInfosResponseBody(this);
        } 

    } 

    public static class UserBasicInfo extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private UserBasicInfo(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
            this.userPrincipalName = builder.userPrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserBasicInfo create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 
            private String userPrincipalName; 

            /**
             * The display name of the RAM user.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The ID of the RAM user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The logon name of the RAM user.
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            public UserBasicInfo build() {
                return new UserBasicInfo(this);
            } 

        } 

    }
    public static class UserBasicInfos extends TeaModel {
        @NameInMap("UserBasicInfo")
        private java.util.List < UserBasicInfo> userBasicInfo;

        private UserBasicInfos(Builder builder) {
            this.userBasicInfo = builder.userBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserBasicInfos create() {
            return builder().build();
        }

        /**
         * @return userBasicInfo
         */
        public java.util.List < UserBasicInfo> getUserBasicInfo() {
            return this.userBasicInfo;
        }

        public static final class Builder {
            private java.util.List < UserBasicInfo> userBasicInfo; 

            /**
             * UserBasicInfo.
             */
            public Builder userBasicInfo(java.util.List < UserBasicInfo> userBasicInfo) {
                this.userBasicInfo = userBasicInfo;
                return this;
            }

            public UserBasicInfos build() {
                return new UserBasicInfos(this);
            } 

        } 

    }
}
