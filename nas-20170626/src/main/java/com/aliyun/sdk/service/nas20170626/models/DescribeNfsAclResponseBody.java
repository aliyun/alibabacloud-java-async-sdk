// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNfsAclResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNfsAclResponseBody</p>
 */
public class DescribeNfsAclResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Acl")
    private Acl acl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNfsAclResponseBody(Builder builder) {
        this.acl = builder.acl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNfsAclResponseBody create() {
        return builder().build();
    }

    /**
     * @return acl
     */
    public Acl getAcl() {
        return this.acl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Acl acl; 
        private String requestId; 

        /**
         * The information about the ACL feature.
         */
        public Builder acl(Acl acl) {
            this.acl = acl;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNfsAclResponseBody build() {
            return new DescribeNfsAclResponseBody(this);
        } 

    } 

    public static class Acl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private Acl(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acl create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            /**
             * Indicates whether the NFS ACL feature is enabled.
             * <p>
             * 
             * *   true: The NFS ACL feature is enabled.
             * *   false: The NFS ACL feature is disabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Acl build() {
                return new Acl(this);
            } 

        } 

    }
}
