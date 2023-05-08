// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllEntityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllEntityResponseBody</p>
 */
public class DescribeAllEntityResponseBody extends TeaModel {
    @NameInMap("EntityList")
    private java.util.List < EntityList> entityList;

    @NameInMap("RequestId")
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
         * Queries the information about all assets. The information includes asset group IDs and asset names.
         */
        public Builder entityList(java.util.List < EntityList> entityList) {
            this.entityList = entityList;
            return this;
        }

        /**
         * The IP address of the server.
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
        @NameInMap("GroupId")
        private Integer groupId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Os")
        private String os;

        @NameInMap("Uuid")
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
             * GroupId.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * DescribeAllEntity
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
