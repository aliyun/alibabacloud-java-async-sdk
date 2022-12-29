// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoleZoneInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoleZoneInfoResponseBody</p>
 */
public class DescribeRoleZoneInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ZoneInfos")
    private ZoneInfos zoneInfos;

    private DescribeRoleZoneInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneInfos = builder.zoneInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoleZoneInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zoneInfos
     */
    public ZoneInfos getZoneInfos() {
        return this.zoneInfos;
    }

    public static final class Builder {
        private String requestId; 
        private ZoneInfos zoneInfos; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of information of nodes in the zone.
         */
        public Builder zoneInfos(ZoneInfos zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }

        public DescribeRoleZoneInfoResponseBody build() {
            return new DescribeRoleZoneInfoResponseBody(this);
        } 

    } 

    public static class ZoneInfo extends TeaModel {
        @NameInMap("InsName")
        private String insName;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("RoleId")
        private String roleId;

        @NameInMap("RoleType")
        private String roleType;

        @NameInMap("ZoneId")
        private String zoneId;

        private ZoneInfo(Builder builder) {
            this.insName = builder.insName;
            this.nodeType = builder.nodeType;
            this.roleId = builder.roleId;
            this.roleType = builder.roleType;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneInfo create() {
            return builder().build();
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String insName; 
            private String nodeType; 
            private String roleId; 
            private String roleType; 
            private String zoneId; 

            /**
             * The ID of the node.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * The type of the node. Valid values:
             * <p>
             * 
             * *   **normal**
             * *   **configServer**
             * *   **shard**
             * *   **mongos**
             * 
             * >  Valid value for replica set instances: **normal**. Valid values for replica set instances: **configServer**, **shard**, and **mongos**.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The ID of the role.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * The role of the node. Valid values:
             * <p>
             * 
             * *   **Primary**
             * *   **Secondary**
             * *   **Hidden**
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneInfo build() {
                return new ZoneInfo(this);
            } 

        } 

    }
    public static class ZoneInfos extends TeaModel {
        @NameInMap("ZoneInfo")
        private java.util.List < ZoneInfo> zoneInfo;

        private ZoneInfos(Builder builder) {
            this.zoneInfo = builder.zoneInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneInfos create() {
            return builder().build();
        }

        /**
         * @return zoneInfo
         */
        public java.util.List < ZoneInfo> getZoneInfo() {
            return this.zoneInfo;
        }

        public static final class Builder {
            private java.util.List < ZoneInfo> zoneInfo; 

            /**
             * ZoneInfo.
             */
            public Builder zoneInfo(java.util.List < ZoneInfo> zoneInfo) {
                this.zoneInfo = zoneInfo;
                return this;
            }

            public ZoneInfos build() {
                return new ZoneInfos(this);
            } 

        } 

    }
}
