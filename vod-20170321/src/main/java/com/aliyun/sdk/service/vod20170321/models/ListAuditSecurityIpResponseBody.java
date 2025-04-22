// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListAuditSecurityIpResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuditSecurityIpResponseBody</p>
 */
public class ListAuditSecurityIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpList")
    private java.util.List<SecurityIpList> securityIpList;

    private ListAuditSecurityIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpList = builder.securityIpList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuditSecurityIpResponseBody create() {
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
     * @return securityIpList
     */
    public java.util.List<SecurityIpList> getSecurityIpList() {
        return this.securityIpList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SecurityIpList> securityIpList; 

        private Builder() {
        } 

        private Builder(ListAuditSecurityIpResponseBody model) {
            this.requestId = model.requestId;
            this.securityIpList = model.securityIpList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>664BBD08-C7DB-4E*****73-9D0958D9A899</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the review security group.</p>
         */
        public Builder securityIpList(java.util.List<SecurityIpList> securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }

        public ListAuditSecurityIpResponseBody build() {
            return new ListAuditSecurityIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuditSecurityIpResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuditSecurityIpResponseBody</p>
     */
    public static class SecurityIpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private String ips;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
        private String securityGroupName;

        private SecurityIpList(Builder builder) {
            this.creationTime = builder.creationTime;
            this.ips = builder.ips;
            this.modificationTime = builder.modificationTime;
            this.securityGroupName = builder.securityGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpList create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ips
         */
        public String getIps() {
            return this.ips;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public static final class Builder {
            private String creationTime; 
            private String ips; 
            private String modificationTime; 
            private String securityGroupName; 

            private Builder() {
            } 

            private Builder(SecurityIpList model) {
                this.creationTime = model.creationTime;
                this.ips = model.ips;
                this.modificationTime = model.modificationTime;
                this.securityGroupName = model.securityGroupName;
            } 

            /**
             * <p>The time when the review security group was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-22T06:54:23Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The IP addresses in the review security group.</p>
             * 
             * <strong>example:</strong>
             * <p>30.27.14.0/24,30.39.127.245</p>
             */
            public Builder ips(String ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The time when the review security group was last modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-22T06:55:14Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The name of the review security group.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            public SecurityIpList build() {
                return new SecurityIpList(this);
            } 

        } 

    }
}
