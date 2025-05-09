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
 * {@link ListClientUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientUsersResponseBody</p>
 */
public class ListClientUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClientUsersResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientUsersResponseBody create() {
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

        private Builder(ListClientUsersResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClientUsersResponseBody build() {
            return new ListClientUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClientUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClientUsersResponseBody</p>
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
     * {@link ListClientUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClientUsersResponseBody</p>
     */
    public static class DataList extends TeaModel {
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

        private DataList(Builder builder) {
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

        public static DataList create() {
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

            private Builder(DataList model) {
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
             * Department.
             */
            public Builder department(Department department) {
                this.department = department;
                return this;
            }

            /**
             * DepartmentId.
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdpConfigId.
             */
            public Builder idpConfigId(String idpConfigId) {
                this.idpConfigId = idpConfigId;
                return this;
            }

            /**
             * MobileNumber.
             */
            public Builder mobileNumber(String mobileNumber) {
                this.mobileNumber = mobileNumber;
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClientUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClientUsersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataList")
        private java.util.List<DataList> dataList;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Long totalNum;

        private Data(Builder builder) {
            this.dataList = builder.dataList;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataList
         */
        public java.util.List<DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private java.util.List<DataList> dataList; 
            private Long totalNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataList = model.dataList;
                this.totalNum = model.totalNum;
            } 

            /**
             * DataList.
             */
            public Builder dataList(java.util.List<DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
