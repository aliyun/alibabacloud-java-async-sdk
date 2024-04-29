// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllEntityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllEntityResponseBody</p>
 */
public class DescribeAllEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityList")
    private java.util.List < EntityList> entityList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAllEntityResponseBody(Builder builder) {
        this.entityList = builder.entityList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return entityList
     */
    public java.util.List < EntityList> getEntityList() {
        return this.entityList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EntityList> entityList; 
        private String requestId; 

        /**
         * An array that consists of servers.
         */
        public Builder entityList(java.util.List < EntityList> entityList) {
            this.entityList = entityList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAllEntityResponseBody build() {
            return new DescribeAllEntityResponseBody(this);
        } 

    } 

    public static class EntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private EntityList(Builder builder) {
            this.groupId = builder.groupId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.os = builder.os;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityList create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer groupId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String os; 
            private String uuid; 

            /**
             * The ID of the asset group.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The IP address of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The operating system of the server. Valid values:
             * <p>
             * 
             * *   **linux**
             * *   **windows**
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public EntityList build() {
                return new EntityList(this);
            } 

        } 

    }
}
