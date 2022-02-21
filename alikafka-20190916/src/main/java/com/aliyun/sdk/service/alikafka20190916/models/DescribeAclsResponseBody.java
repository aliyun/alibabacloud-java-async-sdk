// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAclsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclsResponseBody</p>
 */
public class DescribeAclsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("KafkaAclList")
    private KafkaAclList kafkaAclList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * KafkaAclList.
         */
        public Builder kafkaAclList(KafkaAclList kafkaAclList) {
            this.kafkaAclList = kafkaAclList;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("AclOperationType")
        private String aclOperationType;

        @NameInMap("AclResourceName")
        private String aclResourceName;

        @NameInMap("AclResourcePatternType")
        private String aclResourcePatternType;

        @NameInMap("AclResourceType")
        private String aclResourceType;

        @NameInMap("Host")
        private String host;

        @NameInMap("Username")
        private String username;

        private KafkaAclVO(Builder builder) {
            this.aclOperationType = builder.aclOperationType;
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
            private String aclResourceName; 
            private String aclResourcePatternType; 
            private String aclResourceType; 
            private String host; 
            private String username; 

            /**
             * AclOperationType.
             */
            public Builder aclOperationType(String aclOperationType) {
                this.aclOperationType = aclOperationType;
                return this;
            }

            /**
             * AclResourceName.
             */
            public Builder aclResourceName(String aclResourceName) {
                this.aclResourceName = aclResourceName;
                return this;
            }

            /**
             * AclResourcePatternType.
             */
            public Builder aclResourcePatternType(String aclResourcePatternType) {
                this.aclResourcePatternType = aclResourcePatternType;
                return this;
            }

            /**
             * AclResourceType.
             */
            public Builder aclResourceType(String aclResourceType) {
                this.aclResourceType = aclResourceType;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Username.
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
        @NameInMap("KafkaAclVO")
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
