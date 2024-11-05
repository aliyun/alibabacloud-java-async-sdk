// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRoleZoneInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoleZoneInfoResponseBody</p>
 */
public class DescribeRoleZoneInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneInfos")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728B9A96-E262-4AE5-915E-3A51CCE2FDA9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of nodes in the zone.</p>
         */
        public Builder zoneInfos(ZoneInfos zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }

        public DescribeRoleZoneInfoResponseBody build() {
            return new DescribeRoleZoneInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRoleZoneInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRoleZoneInfoResponseBody</p>
     */
    public static class ZoneInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bpxxxxxxxx</p>
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>configServer</strong></li>
             * <li><strong>shard</strong></li>
             * <li><strong>mongos</strong></li>
             * </ul>
             * <blockquote>
             * <p>Valid value for replica set instances: <strong>normal</strong>. Valid values for sharded cluster instances: <strong>configServer</strong>, <strong>shard</strong>, and <strong>mongos</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The role ID.</p>
             * 
             * <strong>example:</strong>
             * <p>83xxxxx</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>The role of the node. Valid values:</p>
             * <ul>
             * <li><strong>Primary</strong></li>
             * <li><strong>Secondary</strong></li>
             * <li><strong>Hidden</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * <p>The zone ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-e</p>
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
    /**
     * 
     * {@link DescribeRoleZoneInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRoleZoneInfoResponseBody</p>
     */
    public static class ZoneInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneInfo")
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
