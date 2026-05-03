// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeUserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserResponseBody</p>
 */
public class DescribeUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("User")
    private User user;

    private DescribeUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserResponseBody create() {
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

        private Builder(DescribeUserResponseBody model) {
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

        public DescribeUserResponseBody build() {
            return new DescribeUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResponseBody</p>
     */
    public static class ExternalInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalId")
        private String externalId;

        @com.aliyun.core.annotation.NameInMap("ExternalName")
        private String externalName;

        @com.aliyun.core.annotation.NameInMap("JobNumber")
        private String jobNumber;

        @com.aliyun.core.annotation.NameInMap("SsoType")
        private String ssoType;

        private ExternalInfo(Builder builder) {
            this.externalId = builder.externalId;
            this.externalName = builder.externalName;
            this.jobNumber = builder.jobNumber;
            this.ssoType = builder.ssoType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalInfo create() {
            return builder().build();
        }

        /**
         * @return externalId
         */
        public String getExternalId() {
            return this.externalId;
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

        /**
         * @return ssoType
         */
        public String getSsoType() {
            return this.ssoType;
        }

        public static final class Builder {
            private String externalId; 
            private String externalName; 
            private String jobNumber; 
            private String ssoType; 

            private Builder() {
            } 

            private Builder(ExternalInfo model) {
                this.externalId = model.externalId;
                this.externalName = model.externalName;
                this.jobNumber = model.jobNumber;
                this.ssoType = model.ssoType;
            } 

            /**
             * ExternalId.
             */
            public Builder externalId(String externalId) {
                this.externalId = externalId;
                return this;
            }

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

            /**
             * SsoType.
             */
            public Builder ssoType(String ssoType) {
                this.ssoType = ssoType;
                return this;
            }

            public ExternalInfo build() {
                return new ExternalInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("ExternalInfo")
        private ExternalInfo externalInfo;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private java.util.Map<String, String> extras;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("OrgIds")
        private java.util.List<String> orgIds;

        @com.aliyun.core.annotation.NameInMap("OrgPaths")
        private java.util.List<String> orgPaths;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<Properties> properties;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("WyId")
        private String wyId;

        private User(Builder builder) {
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.externalInfo = builder.externalInfo;
            this.extras = builder.extras;
            this.gmtCreate = builder.gmtCreate;
            this.nickName = builder.nickName;
            this.orgIds = builder.orgIds;
            this.orgPaths = builder.orgPaths;
            this.phone = builder.phone;
            this.properties = builder.properties;
            this.remark = builder.remark;
            this.status = builder.status;
            this.wyId = builder.wyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return externalInfo
         */
        public ExternalInfo getExternalInfo() {
            return this.externalInfo;
        }

        /**
         * @return extras
         */
        public java.util.Map<String, String> getExtras() {
            return this.extras;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return orgIds
         */
        public java.util.List<String> getOrgIds() {
            return this.orgIds;
        }

        /**
         * @return orgPaths
         */
        public java.util.List<String> getOrgPaths() {
            return this.orgPaths;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return properties
         */
        public java.util.List<Properties> getProperties() {
            return this.properties;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return wyId
         */
        public String getWyId() {
            return this.wyId;
        }

        public static final class Builder {
            private String email; 
            private String endUserId; 
            private ExternalInfo externalInfo; 
            private java.util.Map<String, String> extras; 
            private Long gmtCreate; 
            private String nickName; 
            private java.util.List<String> orgIds; 
            private java.util.List<String> orgPaths; 
            private String phone; 
            private java.util.List<Properties> properties; 
            private String remark; 
            private Integer status; 
            private String wyId; 

            private Builder() {
            } 

            private Builder(User model) {
                this.email = model.email;
                this.endUserId = model.endUserId;
                this.externalInfo = model.externalInfo;
                this.extras = model.extras;
                this.gmtCreate = model.gmtCreate;
                this.nickName = model.nickName;
                this.orgIds = model.orgIds;
                this.orgPaths = model.orgPaths;
                this.phone = model.phone;
                this.properties = model.properties;
                this.remark = model.remark;
                this.status = model.status;
                this.wyId = model.wyId;
            } 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
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
             * ExternalInfo.
             */
            public Builder externalInfo(ExternalInfo externalInfo) {
                this.externalInfo = externalInfo;
                return this;
            }

            /**
             * Extras.
             */
            public Builder extras(java.util.Map<String, String> extras) {
                this.extras = extras;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * OrgIds.
             */
            public Builder orgIds(java.util.List<String> orgIds) {
                this.orgIds = orgIds;
                return this;
            }

            /**
             * OrgPaths.
             */
            public Builder orgPaths(java.util.List<String> orgPaths) {
                this.orgPaths = orgPaths;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.List<Properties> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * WyId.
             */
            public Builder wyId(String wyId) {
                this.wyId = wyId;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
