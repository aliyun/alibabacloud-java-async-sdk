// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserBasicInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserBasicInfosResponseBody</p>
 */
public class ListUserBasicInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserBasicInfos")
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
         * <p>Indicates whether the response is truncated. Valid value:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The <code>marker</code>. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EF2B25FD-CADE-445B-BE4D-E082E0FF1A0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the information about the RAM user.</p>
         */
        public Builder userBasicInfos(UserBasicInfos userBasicInfos) {
            this.userBasicInfos = userBasicInfos;
            return this;
        }

        public ListUserBasicInfosResponseBody build() {
            return new ListUserBasicInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserBasicInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserBasicInfosResponseBody</p>
     */
    public static class UserBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private UserBasicInfo(Builder builder) {
            this.displayName = builder.displayName;
            this.status = builder.status;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String status; 
            private String userId; 
            private String userPrincipalName; 

            /**
             * <p>The display name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>20732900249392****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The logon name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
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
    /**
     * 
     * {@link ListUserBasicInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserBasicInfosResponseBody</p>
     */
    public static class UserBasicInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserBasicInfo")
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
