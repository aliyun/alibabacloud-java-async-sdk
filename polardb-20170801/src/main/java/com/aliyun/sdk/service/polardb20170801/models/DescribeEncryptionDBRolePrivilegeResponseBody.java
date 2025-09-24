// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeEncryptionDBRolePrivilegeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEncryptionDBRolePrivilegeResponseBody</p>
 */
public class DescribeEncryptionDBRolePrivilegeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEncryptionDBRolePrivilegeResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEncryptionDBRolePrivilegeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String DBClusterId; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeEncryptionDBRolePrivilegeResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D0CEC6AC-7760-409A-A0D5-E6CD86******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEncryptionDBRolePrivilegeResponseBody build() {
            return new DescribeEncryptionDBRolePrivilegeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEncryptionDBRolePrivilegeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEncryptionDBRolePrivilegeResponseBody</p>
     */
    public static class RolePrivilegeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Encryption")
        private String encryption;

        @com.aliyun.core.annotation.NameInMap("Negation")
        private String negation;

        @com.aliyun.core.annotation.NameInMap("NotEncryption")
        private String notEncryption;

        @com.aliyun.core.annotation.NameInMap("RolePrivilegeName")
        private String rolePrivilegeName;

        private RolePrivilegeList(Builder builder) {
            this.encryption = builder.encryption;
            this.negation = builder.negation;
            this.notEncryption = builder.notEncryption;
            this.rolePrivilegeName = builder.rolePrivilegeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RolePrivilegeList create() {
            return builder().build();
        }

        /**
         * @return encryption
         */
        public String getEncryption() {
            return this.encryption;
        }

        /**
         * @return negation
         */
        public String getNegation() {
            return this.negation;
        }

        /**
         * @return notEncryption
         */
        public String getNotEncryption() {
            return this.notEncryption;
        }

        /**
         * @return rolePrivilegeName
         */
        public String getRolePrivilegeName() {
            return this.rolePrivilegeName;
        }

        public static final class Builder {
            private String encryption; 
            private String negation; 
            private String notEncryption; 
            private String rolePrivilegeName; 

            private Builder() {
            } 

            private Builder(RolePrivilegeList model) {
                this.encryption = model.encryption;
                this.negation = model.negation;
                this.notEncryption = model.notEncryption;
                this.rolePrivilegeName = model.rolePrivilegeName;
            } 

            /**
             * Encryption.
             */
            public Builder encryption(String encryption) {
                this.encryption = encryption;
                return this;
            }

            /**
             * Negation.
             */
            public Builder negation(String negation) {
                this.negation = negation;
                return this;
            }

            /**
             * NotEncryption.
             */
            public Builder notEncryption(String notEncryption) {
                this.notEncryption = notEncryption;
                return this;
            }

            /**
             * RolePrivilegeName.
             */
            public Builder rolePrivilegeName(String rolePrivilegeName) {
                this.rolePrivilegeName = rolePrivilegeName;
                return this;
            }

            public RolePrivilegeList build() {
                return new RolePrivilegeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEncryptionDBRolePrivilegeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEncryptionDBRolePrivilegeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RolePrivilegeList")
        private java.util.List<RolePrivilegeList> rolePrivilegeList;

        private Data(Builder builder) {
            this.rolePrivilegeList = builder.rolePrivilegeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return rolePrivilegeList
         */
        public java.util.List<RolePrivilegeList> getRolePrivilegeList() {
            return this.rolePrivilegeList;
        }

        public static final class Builder {
            private java.util.List<RolePrivilegeList> rolePrivilegeList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.rolePrivilegeList = model.rolePrivilegeList;
            } 

            /**
             * RolePrivilegeList.
             */
            public Builder rolePrivilegeList(java.util.List<RolePrivilegeList> rolePrivilegeList) {
                this.rolePrivilegeList = rolePrivilegeList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
