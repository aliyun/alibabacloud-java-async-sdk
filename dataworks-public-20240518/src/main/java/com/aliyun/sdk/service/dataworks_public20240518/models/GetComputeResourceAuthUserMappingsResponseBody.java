// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetComputeResourceAuthUserMappingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetComputeResourceAuthUserMappingsResponseBody</p>
 */
public class GetComputeResourceAuthUserMappingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetComputeResourceAuthUserMappingsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeResourceAuthUserMappingsResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetComputeResourceAuthUserMappingsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetComputeResourceAuthUserMappingsResponseBody build() {
            return new GetComputeResourceAuthUserMappingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetComputeResourceAuthUserMappingsResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeResourceAuthUserMappingsResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Accounts(Builder builder) {
            this.userId = builder.userId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
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
            private String userId; 
            private String username; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.userId = model.userId;
                this.username = model.username;
            } 

            /**
             * <p>The Alibaba Cloud UID.</p>
             * 
             * <strong>example:</strong>
             * <p>12747300953xxx62</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The username in the target system, such as an LDAP account.</p>
             * 
             * <strong>example:</strong>
             * <p>jsmitxxxx</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetComputeResourceAuthUserMappingsResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeResourceAuthUserMappingsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accounts")
        private java.util.List<Accounts> accounts;

        @com.aliyun.core.annotation.NameInMap("HadoopAuthType")
        private String hadoopAuthType;

        private Data(Builder builder) {
            this.accounts = builder.accounts;
            this.hadoopAuthType = builder.hadoopAuthType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accounts
         */
        public java.util.List<Accounts> getAccounts() {
            return this.accounts;
        }

        /**
         * @return hadoopAuthType
         */
        public String getHadoopAuthType() {
            return this.hadoopAuthType;
        }

        public static final class Builder {
            private java.util.List<Accounts> accounts; 
            private String hadoopAuthType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accounts = model.accounts;
                this.hadoopAuthType = model.hadoopAuthType;
            } 

            /**
             * <p>The list of mapped account information.</p>
             */
            public Builder accounts(java.util.List<Accounts> accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * <p>The authentication type, such as LDAP.</p>
             * 
             * <strong>example:</strong>
             * <p>ldap</p>
             */
            public Builder hadoopAuthType(String hadoopAuthType) {
                this.hadoopAuthType = hadoopAuthType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
