// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAclsResponseBody model) {
            this.code = model.code;
            this.kafkaAclList = model.kafkaAclList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A 200 status code indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46496E38-881E-4719-A2F3-F3DA6AE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAclsResponseBody build() {
            return new DescribeAclsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAclsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(KafkaAclVO model) {
                this.aclOperationType = model.aclOperationType;
                this.aclPermissionType = model.aclPermissionType;
                this.aclResourceName = model.aclResourceName;
                this.aclResourcePatternType = model.aclResourcePatternType;
                this.aclResourceType = model.aclResourceType;
                this.host = model.host;
                this.username = model.username;
            } 

            /**
             * AclOperationType.
             */
            public Builder aclOperationType(String aclOperationType) {
                this.aclOperationType = aclOperationType;
                return this;
            }

            /**
             * AclPermissionType.
             */
            public Builder aclPermissionType(String aclPermissionType) {
                this.aclPermissionType = aclPermissionType;
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
    /**
     * 
     * {@link DescribeAclsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclsResponseBody</p>
     */
    public static class KafkaAclList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KafkaAclVO")
        private java.util.List<KafkaAclVO> kafkaAclVO;

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
        public java.util.List<KafkaAclVO> getKafkaAclVO() {
            return this.kafkaAclVO;
        }

        public static final class Builder {
            private java.util.List<KafkaAclVO> kafkaAclVO; 

            private Builder() {
            } 

            private Builder(KafkaAclList model) {
                this.kafkaAclVO = model.kafkaAclVO;
            } 

            /**
             * KafkaAclVO.
             */
            public Builder kafkaAclVO(java.util.List<KafkaAclVO> kafkaAclVO) {
                this.kafkaAclVO = kafkaAclVO;
                return this;
            }

            public KafkaAclList build() {
                return new KafkaAclList(this);
            } 

        } 

    }
}
