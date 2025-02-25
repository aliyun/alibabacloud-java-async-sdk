// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeEnabledPrivilegesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnabledPrivilegesResponseBody</p>
 */
public class DescribeEnabledPrivilegesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnabledPrivilegesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnabledPrivilegesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        /**
         * <p>The queried permission level and permissions.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>246F42E0-A475-15FF-96D2-8DC47FC2F289</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnabledPrivilegesResponseBody build() {
            return new DescribeEnabledPrivilegesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnabledPrivilegesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnabledPrivilegesResponseBody</p>
     */
    public static class Privileges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Privileges(Builder builder) {
            this.description = builder.description;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Privileges create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String description; 
            private String key; 

            /**
             * <p>The description of the permission.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>select</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Privileges build() {
                return new Privileges(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnabledPrivilegesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnabledPrivilegesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(required = true)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Privileges")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Privileges> privileges;

        @com.aliyun.core.annotation.NameInMap("Scope")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scope;

        private Data(Builder builder) {
            this.description = builder.description;
            this.privileges = builder.privileges;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return privileges
         */
        public java.util.List<Privileges> getPrivileges() {
            return this.privileges;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<Privileges> privileges; 
            private String scope; 

            /**
             * <p>The description of the permission level.</p>
             * <p>This parameter is required.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The queried permissions.</p>
             * <p>This parameter is required.</p>
             */
            public Builder privileges(java.util.List<Privileges> privileges) {
                this.privileges = privileges;
                return this;
            }

            /**
             * <p>The permission level.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Global</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
