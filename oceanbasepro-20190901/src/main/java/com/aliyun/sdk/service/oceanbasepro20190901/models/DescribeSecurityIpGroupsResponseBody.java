// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityIpGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityIpGroupsResponseBody</p>
 */
public class DescribeSecurityIpGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIpGroups")
    private java.util.List < SecurityIpGroups> securityIpGroups;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSecurityIpGroupsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpGroups = builder.securityIpGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIpGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityIpGroups
     */
    public java.util.List < SecurityIpGroups> getSecurityIpGroups() {
        return this.securityIpGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SecurityIpGroups> securityIpGroups; 
        private Integer totalCount; 

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * IP白名单分组信息。
         */
        public Builder securityIpGroups(java.util.List < SecurityIpGroups> securityIpGroups) {
            this.securityIpGroups = securityIpGroups;
            return this;
        }

        /**
         * 查询到的白名单分组个数。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecurityIpGroupsResponseBody build() {
            return new DescribeSecurityIpGroupsResponseBody(this);
        } 

    } 

    public static class SecurityIpGroups extends TeaModel {
        @NameInMap("SecurityIpGroupName")
        private String securityIpGroupName;

        @NameInMap("SecurityIps")
        private String securityIps;

        private SecurityIpGroups(Builder builder) {
            this.securityIpGroupName = builder.securityIpGroupName;
            this.securityIps = builder.securityIps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpGroups create() {
            return builder().build();
        }

        /**
         * @return securityIpGroupName
         */
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        /**
         * @return securityIps
         */
        public String getSecurityIps() {
            return this.securityIps;
        }

        public static final class Builder {
            private String securityIpGroupName; 
            private String securityIps; 

            /**
             * 安全组名称。
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * IP安全白名单列表。其为一个Json格式的数组，数组中每个对象为一个IP字符串或者IP段。
             */
            public Builder securityIps(String securityIps) {
                this.securityIps = securityIps;
                return this;
            }

            public SecurityIpGroups build() {
                return new SecurityIpGroups(this);
            } 

        } 

    }
}
