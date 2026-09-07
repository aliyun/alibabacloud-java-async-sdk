// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetClientUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientUserResponseBody</p>
 */
public class GetClientUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClientUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetClientUserResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>User details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientUserResponseBody build() {
            return new GetClientUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClientUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientUserResponseBody</p>
     */
    public static class Department extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Department(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Department create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Department model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>Department ID.</p>
             * 
             * <strong>example:</strong>
             * <p>107</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Department name.</p>
             * 
             * <strong>example:</strong>
             * <p>示例部门</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Department build() {
                return new Department(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClientUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetClientUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Department")
        private Department department;

        @com.aliyun.core.annotation.NameInMap("DepartmentId")
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdpConfigId")
        private String idpConfigId;

        @com.aliyun.core.annotation.NameInMap("MobileNumber")
        private String mobileNumber;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Data(Builder builder) {
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.description = builder.description;
            this.email = builder.email;
            this.id = builder.id;
            this.idpConfigId = builder.idpConfigId;
            this.mobileNumber = builder.mobileNumber;
            this.status = builder.status;
            this.userId = builder.userId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return department
         */
        public Department getDepartment() {
            return this.department;
        }

        /**
         * @return departmentId
         */
        public String getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idpConfigId
         */
        public String getIdpConfigId() {
            return this.idpConfigId;
        }

        /**
         * @return mobileNumber
         */
        public String getMobileNumber() {
            return this.mobileNumber;
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
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private Department department; 
            private String departmentId; 
            private String description; 
            private String email; 
            private String id; 
            private String idpConfigId; 
            private String mobileNumber; 
            private String status; 
            private String userId; 
            private String username; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.department = model.department;
                this.departmentId = model.departmentId;
                this.description = model.description;
                this.email = model.email;
                this.id = model.id;
                this.idpConfigId = model.idpConfigId;
                this.mobileNumber = model.mobileNumber;
                this.status = model.status;
                this.userId = model.userId;
                this.username = model.username;
            } 

            /**
             * <p>Department to which the user belongs.</p>
             */
            public Builder department(Department department) {
                this.department = department;
                return this;
            }

            /**
             * <p>Department ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10713</p>
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * <p>User description.</p>
             * 
             * <strong>example:</strong>
             * <p>示例用户</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:johndoe@example.com">johndoe@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>83</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>ID of the custom identity source configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>idp-cfg68956d86e********</p>
             */
            public Builder idpConfigId(String idpConfigId) {
                this.idpConfigId = idpConfigId;
                return this;
            }

            /**
             * <p>Mobile phone number without country code.</p>
             * 
             * <strong>example:</strong>
             * <p>1364196****</p>
             */
            public Builder mobileNumber(String mobileNumber) {
                this.mobileNumber = mobileNumber;
                return this;
            }

            /**
             * <p>User status. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Unique identifier of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>su_abcd7215****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Username.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
