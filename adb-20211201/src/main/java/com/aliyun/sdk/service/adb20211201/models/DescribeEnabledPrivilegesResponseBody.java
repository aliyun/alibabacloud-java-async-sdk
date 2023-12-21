// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnabledPrivilegesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnabledPrivilegesResponseBody</p>
 */
public class DescribeEnabledPrivilegesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The queried permission level and permissions.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnabledPrivilegesResponseBody build() {
            return new DescribeEnabledPrivilegesResponseBody(this);
        } 

    } 

    public static class Privileges extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Key")
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
             * The description of the permission.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the permission.
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
    public static class Data extends TeaModel {
        @NameInMap("Description")
        @Validation(required = true)
        private String description;

        @NameInMap("Privileges")
        @Validation(required = true)
        private java.util.List < Privileges> privileges;

        @NameInMap("Scope")
        @Validation(required = true)
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
        public java.util.List < Privileges> getPrivileges() {
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
            private java.util.List < Privileges> privileges; 
            private String scope; 

            /**
             * The description of the permission level.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The queried permissions.
             */
            public Builder privileges(java.util.List < Privileges> privileges) {
                this.privileges = privileges;
                return this;
            }

            /**
             * The permission level.
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
