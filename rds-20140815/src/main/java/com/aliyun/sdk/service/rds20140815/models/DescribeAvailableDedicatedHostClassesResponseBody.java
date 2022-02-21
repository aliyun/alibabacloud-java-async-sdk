// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableDedicatedHostClassesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableDedicatedHostClassesResponseBody</p>
 */
public class DescribeAvailableDedicatedHostClassesResponseBody extends TeaModel {
    @NameInMap("HostClasses")
    private HostClasses hostClasses;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableDedicatedHostClassesResponseBody(Builder builder) {
        this.hostClasses = builder.hostClasses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableDedicatedHostClassesResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostClasses
     */
    public HostClasses getHostClasses() {
        return this.hostClasses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HostClasses hostClasses; 
        private String requestId; 

        /**
         * HostClasses.
         */
        public Builder hostClasses(HostClasses hostClasses) {
            this.hostClasses = hostClasses;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableDedicatedHostClassesResponseBody build() {
            return new DescribeAvailableDedicatedHostClassesResponseBody(this);
        } 

    } 

    public static class HostClassesHostClasses extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("HostClassName")
        private String hostClassName;

        private HostClassesHostClasses(Builder builder) {
            this.description = builder.description;
            this.hostClassName = builder.hostClassName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostClassesHostClasses create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hostClassName
         */
        public String getHostClassName() {
            return this.hostClassName;
        }

        public static final class Builder {
            private String description; 
            private String hostClassName; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * HostClassName.
             */
            public Builder hostClassName(String hostClassName) {
                this.hostClassName = hostClassName;
                return this;
            }

            public HostClassesHostClasses build() {
                return new HostClassesHostClasses(this);
            } 

        } 

    }
    public static class HostClasses extends TeaModel {
        @NameInMap("HostClasses")
        private java.util.List < HostClassesHostClasses> hostClasses;

        private HostClasses(Builder builder) {
            this.hostClasses = builder.hostClasses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostClasses create() {
            return builder().build();
        }

        /**
         * @return hostClasses
         */
        public java.util.List < HostClassesHostClasses> getHostClasses() {
            return this.hostClasses;
        }

        public static final class Builder {
            private java.util.List < HostClassesHostClasses> hostClasses; 

            /**
             * HostClasses.
             */
            public Builder hostClasses(java.util.List < HostClassesHostClasses> hostClasses) {
                this.hostClasses = hostClasses;
                return this;
            }

            public HostClasses build() {
                return new HostClasses(this);
            } 

        } 

    }
}
