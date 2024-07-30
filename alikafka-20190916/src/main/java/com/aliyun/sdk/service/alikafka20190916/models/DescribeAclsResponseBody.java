// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAclsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclsResponseBody</p>
 */
public class DescribeAclsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("KafkaAclList")
    private KafkaAclList kafkaAclList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAclsResponseBody(Builder builder) {
        this.code = builder.code;
        this.kafkaAclList = builder.kafkaAclList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return kafkaAclList
     */
    public KafkaAclList getKafkaAclList() {
        return this.kafkaAclList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private KafkaAclList kafkaAclList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The access control lists (ACLs).
         */
        public Builder kafkaAclList(KafkaAclList kafkaAclList) {
            this.kafkaAclList = kafkaAclList;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAclsResponseBody build() {
            return new DescribeAclsResponseBody(this);
        } 

    } 

    public static class KafkaAclVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclOperationType")
        private String aclOperationType;

        @com.aliyun.core.annotation.NameInMap("AclPermissionType")
        private String aclPermissionType;

        @com.aliyun.core.annotation.NameInMap("AclResourceName")
        private String aclResourceName;

        @com.aliyun.core.annotation.NameInMap("AclResourcePatternType")
        private String aclResourcePatternType;

        @com.aliyun.core.annotation.NameInMap("AclResourceType")
        private String aclResourceType;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private KafkaAclVO(Builder builder) {
            this.aclOperationType = builder.aclOperationType;
            this.aclPermissionType = builder.aclPermissionType;
            this.aclResourceName = builder.aclResourceName;
            this.aclResourcePatternType = builder.aclResourcePatternType;
            this.aclResourceType = builder.aclResourceType;
            this.host = builder.host;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KafkaAclVO create() {
            return builder().build();
        }

        /**
         * @return aclOperationType
         */
        public String getAclOperationType() {
            return this.aclOperationType;
        }

        /**
         * @return aclPermissionType
         */
        public String getAclPermissionType() {
            return this.aclPermissionType;
        }

        /**
         * @return aclResourceName
         */
        public String getAclResourceName() {
            return this.aclResourceName;
        }

        /**
         * @return aclResourcePatternType
         */
        public String getAclResourcePatternType() {
            return this.aclResourcePatternType;
        }

        /**
         * @return aclResourceType
         */
        public String getAclResourceType() {
            return this.aclResourceType;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String aclOperationType; 
            private String aclPermissionType; 
            private String aclResourceName; 
            private String aclResourcePatternType; 
            private String aclResourceType; 
            private String host; 
            private String username; 

            /**
             * The types of operations allowed by the ACL. Separate multiple operation types with commas (,).
             * <p>
             * - Valid values:
             * - Write
             * - Read
             * - Describe: reads of transactional IDs.
             * - IdempotentWrite: idempotent data writes to clusters.
             * - IDEMPOTENT_WRITE: idempotent data writes to clusters. This value is available only for ApsaraMQ for Kafka V3 instances.
             * - DESCRIBE_CONFIGS: queries of configurations. This value is available only for ApsaraMQ for Kafka V3 instances.
             * > This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.
             */
            public Builder aclOperationType(String aclOperationType) {
                this.aclOperationType = aclOperationType;
                return this;
            }

            /**
             * The authorization method. Valid values:
             * <p>
             * - DENY
             * - ALLOW
             * > This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.
             */
            public Builder aclPermissionType(String aclPermissionType) {
                this.aclPermissionType = aclPermissionType;
                return this;
            }

            /**
             * The resource name.
             * <p>
             * 
             * *   The value can be the name of a topic or consumer group.
             * *   You can use the asterisk (\*) wildcard character to specify the names of all topics or consumer groups.
             */
            public Builder aclResourceName(String aclResourceName) {
                this.aclResourceName = aclResourceName;
                return this;
            }

            /**
             * The matching mode. Valid values:
             * <p>
             * 
             * *   **LITERAL:** full-name match
             * *   **PREFIXED**: prefix match
             */
            public Builder aclResourcePatternType(String aclResourcePatternType) {
                this.aclResourcePatternType = aclResourcePatternType;
                return this;
            }

            /**
             * The resource type. Valid values:
             * <p>
             * 
             * *   **Topic**
             * *   **Group**
             */
            public Builder aclResourceType(String aclResourceType) {
                this.aclResourceType = aclResourceType;
                return this;
            }

            /**
             * The host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public KafkaAclVO build() {
                return new KafkaAclVO(this);
            } 

        } 

    }
    public static class KafkaAclList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KafkaAclVO")
        private java.util.List < KafkaAclVO> kafkaAclVO;

        private KafkaAclList(Builder builder) {
            this.kafkaAclVO = builder.kafkaAclVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KafkaAclList create() {
            return builder().build();
        }

        /**
         * @return kafkaAclVO
         */
        public java.util.List < KafkaAclVO> getKafkaAclVO() {
            return this.kafkaAclVO;
        }

        public static final class Builder {
            private java.util.List < KafkaAclVO> kafkaAclVO; 

            /**
             * KafkaAclVO.
             */
            public Builder kafkaAclVO(java.util.List < KafkaAclVO> kafkaAclVO) {
                this.kafkaAclVO = kafkaAclVO;
                return this;
            }

            public KafkaAclList build() {
                return new KafkaAclList(this);
            } 

        } 

    }
}
