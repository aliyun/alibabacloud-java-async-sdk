// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersInGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersInGroupResponseBody</p>
 */
public class DescribeUsersInGroupResponseBody extends TeaModel {
    @NameInMap("EndUsers")
    private java.util.List < EndUsers> endUsers;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("OnlineUsersCount")
    private Integer onlineUsersCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UsersCount")
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
         * EndUsers.
         */
        public Builder endUsers(java.util.List < EndUsers> endUsers) {
            this.endUsers = endUsers;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OnlineUsersCount.
         */
        public Builder onlineUsersCount(Integer onlineUsersCount) {
            this.onlineUsersCount = onlineUsersCount;
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
         * UsersCount.
         */
        public Builder usersCount(Integer usersCount) {
            this.usersCount = usersCount;
            return this;
        }

        public DescribeUsersInGroupResponseBody build() {
            return new DescribeUsersInGroupResponseBody(this);
        } 

    } 

    public static class ExternalInfo extends TeaModel {
        @NameInMap("ExternalName")
        private String externalName;

        @NameInMap("JobNumber")
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
             * ExternalName.
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * JobNumber.
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
    public static class PropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        private String propertyValue;

        @NameInMap("PropertyValueId")
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
             * PropertyValue.
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * PropertyValueId.
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
    public static class UserSetPropertiesModels extends TeaModel {
        @NameInMap("PropertyId")
        private Long propertyId;

        @NameInMap("PropertyKey")
        private String propertyKey;

        @NameInMap("PropertyType")
        private Integer propertyType;

        @NameInMap("PropertyValues")
        private java.util.List < PropertyValues> propertyValues;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserName")
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
             * PropertyId.
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * PropertyKey.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * PropertyType.
             */
            public Builder propertyType(Integer propertyType) {
                this.propertyType = propertyType;
                return this;
            }

            /**
             * PropertyValues.
             */
            public Builder propertyValues(java.util.List < PropertyValues> propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
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
    public static class EndUsers extends TeaModel {
        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("EndUserEmail")
        private String endUserEmail;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("EndUserName")
        private String endUserName;

        @NameInMap("EndUserPhone")
        private String endUserPhone;

        @NameInMap("EndUserType")
        private String endUserType;

        @NameInMap("ExternalInfo")
        private ExternalInfo externalInfo;

        @NameInMap("UserSetPropertiesModels")
        private java.util.List < UserSetPropertiesModels> userSetPropertiesModels;

        private EndUsers(Builder builder) {
            this.connectionStatus = builder.connectionStatus;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.endUserEmail = builder.endUserEmail;
            this.endUserId = builder.endUserId;
            this.endUserName = builder.endUserName;
            this.endUserPhone = builder.endUserPhone;
            this.endUserType = builder.endUserType;
            this.externalInfo = builder.externalInfo;
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
         * @return userSetPropertiesModels
         */
        public java.util.List < UserSetPropertiesModels> getUserSetPropertiesModels() {
            return this.userSetPropertiesModels;
        }

        public static final class Builder {
            private String connectionStatus; 
            private String desktopId; 
            private String desktopName; 
            private String endUserEmail; 
            private String endUserId; 
            private String endUserName; 
            private String endUserPhone; 
            private String endUserType; 
            private ExternalInfo externalInfo; 
            private java.util.List < UserSetPropertiesModels> userSetPropertiesModels; 

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * EndUserEmail.
             */
            public Builder endUserEmail(String endUserEmail) {
                this.endUserEmail = endUserEmail;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * EndUserName.
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * EndUserPhone.
             */
            public Builder endUserPhone(String endUserPhone) {
                this.endUserPhone = endUserPhone;
                return this;
            }

            /**
             * EndUserType.
             */
            public Builder endUserType(String endUserType) {
                this.endUserType = endUserType;
                return this;
            }

            /**
             * ExternalInfo.
             */
            public Builder externalInfo(ExternalInfo externalInfo) {
                this.externalInfo = externalInfo;
                return this;
            }

            /**
             * UserSetPropertiesModels.
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
