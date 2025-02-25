// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
         * <p>The information about the ACL feature.</p>
         */
        public Builder acl(Acl acl) {
            this.acl = acl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1098673-1746-505E-A5F1-08527B7EDBDF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNfsAclResponseBody build() {
            return new DescribeNfsAclResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNfsAclResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNfsAclResponseBody</p>
     */
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
             * <p>Indicates whether the NFS ACL feature is enabled.</p>
             * <ul>
             * <li>true: The NFS ACL feature is enabled.</li>
             * <li>false: The NFS ACL feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
