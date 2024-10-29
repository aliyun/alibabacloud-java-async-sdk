// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUsersInGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersInGroupResponseBody</p>
 */
public class DescribeUsersInGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndUsers")
    private java.util.List < EndUsers> endUsers;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OnlineUsersCount")
    private Integer onlineUsersCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsersCount")
    private Integer usersCount;

    private DescribeUsersInGroupResponseBody(Builder builder) {
        this.endUsers = builder.endUsers;
        this.nextToken = builder.nextToken;
        this.onlineUsersCount = builder.onlineUsersCount;
        this.requestId = builder.requestId;
        this.usersCount = builder.usersCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersInGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return endUsers
     */
    public java.util.List < EndUsers> getEndUsers() {
        return this.endUsers;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return onlineUsersCount
     */
    public Integer getOnlineUsersCount() {
        return this.onlineUsersCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usersCount
     */
    public Integer getUsersCount() {
        return this.usersCount;
    }

    public static final class Builder {
        private java.util.List < EndUsers> endUsers; 
        private String nextToken; 
        private Integer onlineUsersCount; 
        private String requestId; 
        private Integer usersCount; 

        /**
         * <p>The list of authorized users.</p>
         */
        public Builder endUsers(java.util.List < EndUsers> endUsers) {
            this.endUsers = endUsers;
            return this;
        }

        /**
         * <p>The token that is used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The total number of authorized users that is connected to cloud computers in the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder onlineUsersCount(Integer onlineUsersCount) {
            this.onlineUsersCount = onlineUsersCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of authorized users of the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usersCount(Integer usersCount) {
            this.usersCount = usersCount;
            return this;
        }

        public DescribeUsersInGroupResponseBody build() {
            return new DescribeUsersInGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUsersInGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersInGroupResponseBody</p>
     */
    public static class ExternalInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalName")
        private String externalName;

        @com.aliyun.core.annotation.NameInMap("JobNumber")
        private String jobNumber;

        private ExternalInfo(Builder builder) {
            this.externalName = builder.externalName;
            this.jobNumber = builder.jobNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalInfo create() {
            return builder().build();
        }

        /**
         * @return externalName
         */
        public String getExternalName() {
            return this.externalName;
        }

        /**
         * @return jobNumber
         */
        public String getJobNumber() {
            return this.jobNumber;
        }

        public static final class Builder {
            private String externalName; 
            private String jobNumber; 

            /**
             * <p>The external name.</p>
             * 
             * <strong>example:</strong>
             * <p>nameDemo</p>
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * <p>The employee ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            public ExternalInfo build() {
                return new ExternalInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersInGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersInGroupResponseBody</p>
     */
    public static class PropertyValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        @com.aliyun.core.annotation.NameInMap("PropertyValueId")
        private Long propertyValueId;

        private PropertyValues(Builder builder) {
            this.propertyValue = builder.propertyValue;
            this.propertyValueId = builder.propertyValueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValues create() {
            return builder().build();
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        /**
         * @return propertyValueId
         */
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

        public static final class Builder {
            private String propertyValue; 
            private Long propertyValueId; 

            /**
             * <p>The property value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * <p>The ID of the property value.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder propertyValueId(Long propertyValueId) {
                this.propertyValueId = propertyValueId;
                return this;
            }

            public PropertyValues build() {
                return new PropertyValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersInGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersInGroupResponseBody</p>
     */
    public static class UserSetPropertiesModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyId")
        private Long propertyId;

        @com.aliyun.core.annotation.NameInMap("PropertyKey")
        private String propertyKey;

        @com.aliyun.core.annotation.NameInMap("PropertyType")
        private Integer propertyType;

        @com.aliyun.core.annotation.NameInMap("PropertyValues")
        private java.util.List < PropertyValues> propertyValues;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private UserSetPropertiesModels(Builder builder) {
            this.propertyId = builder.propertyId;
            this.propertyKey = builder.propertyKey;
            this.propertyType = builder.propertyType;
            this.propertyValues = builder.propertyValues;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSetPropertiesModels create() {
            return builder().build();
        }

        /**
         * @return propertyId
         */
        public Long getPropertyId() {
            return this.propertyId;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyType
         */
        public Integer getPropertyType() {
            return this.propertyType;
        }

        /**
         * @return propertyValues
         */
        public java.util.List < PropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long propertyId; 
            private String propertyKey; 
            private Integer propertyType; 
            private java.util.List < PropertyValues> propertyValues; 
            private Long userId; 
            private String userName; 

            /**
             * <p>The property ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * <p>The property type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>1: system property</li>
             * <li>2: custom property</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder propertyType(Integer propertyType) {
                this.propertyType = propertyType;
                return this;
            }

            /**
             * <p>Details about property values.</p>
             */
            public Builder propertyValues(java.util.List < PropertyValues> propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>nameDemo</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserSetPropertiesModels build() {
                return new UserSetPropertiesModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersInGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersInGroupResponseBody</p>
     */
    public static class EndUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EndUserEmail")
        private String endUserEmail;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EndUserName")
        private String endUserName;

        @com.aliyun.core.annotation.NameInMap("EndUserPhone")
        private String endUserPhone;

        @com.aliyun.core.annotation.NameInMap("EndUserRemark")
        private String endUserRemark;

        @com.aliyun.core.annotation.NameInMap("EndUserType")
        private String endUserType;

        @com.aliyun.core.annotation.NameInMap("ExternalInfo")
        private ExternalInfo externalInfo;

        @com.aliyun.core.annotation.NameInMap("UserDesktopId")
        private String userDesktopId;

        @com.aliyun.core.annotation.NameInMap("UserSetPropertiesModels")
        private java.util.List < UserSetPropertiesModels> userSetPropertiesModels;

        private EndUsers(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.displayName = builder.displayName;
            this.endUserEmail = builder.endUserEmail;
            this.endUserId = builder.endUserId;
            this.endUserName = builder.endUserName;
            this.endUserPhone = builder.endUserPhone;
            this.endUserRemark = builder.endUserRemark;
            this.endUserType = builder.endUserType;
            this.externalInfo = builder.externalInfo;
            this.userDesktopId = builder.userDesktopId;
            this.userSetPropertiesModels = builder.userSetPropertiesModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndUsers create() {
            return builder().build();
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
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
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return endUserEmail
         */
        public String getEndUserEmail() {
            return this.endUserEmail;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return endUserName
         */
        public String getEndUserName() {
            return this.endUserName;
        }

        /**
         * @return endUserPhone
         */
        public String getEndUserPhone() {
            return this.endUserPhone;
        }

        /**
         * @return endUserRemark
         */
        public String getEndUserRemark() {
            return this.endUserRemark;
        }

        /**
         * @return endUserType
         */
        public String getEndUserType() {
            return this.endUserType;
        }

        /**
         * @return externalInfo
         */
        public ExternalInfo getExternalInfo() {
            return this.externalInfo;
        }

        /**
         * @return userDesktopId
         */
        public String getUserDesktopId() {
            return this.userDesktopId;
        }

        /**
         * @return userSetPropertiesModels
         */
        public java.util.List < UserSetPropertiesModels> getUserSetPropertiesModels() {
            return this.userSetPropertiesModels;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String desktopId; 
            private String desktopName; 
            private String displayName; 
            private String endUserEmail; 
            private String endUserId; 
            private String endUserName; 
            private String endUserPhone; 
            private String endUserRemark; 
            private String endUserType; 
            private ExternalInfo externalInfo; 
            private String userDesktopId; 
            private java.util.List < UserSetPropertiesModels> userSetPropertiesModels; 

            /**
             * <p>The connection status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: disconnected</li>
             * <li>1: connecting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The ID of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-gx2x1dhsmucyy****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The display name of the enterprise AD account.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The email address of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
             */
            public Builder endUserEmail(String endUserEmail) {
                this.endUserEmail = endUserEmail;
                return this;
            }

            /**
             * <p>The ID of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The username of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * <p>The mobile number of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder endUserPhone(String endUserPhone) {
                this.endUserPhone = endUserPhone;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Note</p>
             */
            public Builder endUserRemark(String endUserRemark) {
                this.endUserRemark = endUserRemark;
                return this;
            }

            /**
             * <p>The user account type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SIMPLE: convenience account</li>
             * <li>AD_CONNECTOR: enterprise Active Directory (AD) account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder endUserType(String endUserType) {
                this.endUserType = endUserType;
                return this;
            }

            /**
             * <p>The appended information.</p>
             */
            public Builder externalInfo(ExternalInfo externalInfo) {
                this.externalInfo = externalInfo;
                return this;
            }

            /**
             * <p>The ID of the cloud computer that is used by the user.</p>
             * 
             * <strong>example:</strong>
             * <p>ud-i896ze8hazpvl****</p>
             */
            public Builder userDesktopId(String userDesktopId) {
                this.userDesktopId = userDesktopId;
                return this;
            }

            /**
             * <p>Details about the seats of users.</p>
             */
            public Builder userSetPropertiesModels(java.util.List < UserSetPropertiesModels> userSetPropertiesModels) {
                this.userSetPropertiesModels = userSetPropertiesModels;
                return this;
            }

            public EndUsers build() {
                return new EndUsers(this);
            } 

        } 

    }
}
