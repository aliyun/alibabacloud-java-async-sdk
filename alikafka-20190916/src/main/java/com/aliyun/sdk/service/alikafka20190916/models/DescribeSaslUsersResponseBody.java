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
 * {@link DescribeSaslUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSaslUsersResponseBody</p>
 */
public class DescribeSaslUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SaslUserList")
    private SaslUserList saslUserList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSaslUsersResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.saslUserList = builder.saslUserList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSaslUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return saslUserList
     */
    public SaslUserList getSaslUserList() {
        return this.saslUserList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private SaslUserList saslUserList; 
        private Boolean success; 

        /**
         * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9E3B3592-5994-4F65-A61E-E62A77A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Simple Authentication and Security Layer (SASL) users.</p>
         */
        public Builder saslUserList(SaslUserList saslUserList) {
            this.saslUserList = saslUserList;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSaslUsersResponseBody build() {
            return new DescribeSaslUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSaslUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSaslUsersResponseBody</p>
     */
    public static class SaslUserVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mechanism")
        private String mechanism;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private SaslUserVO(Builder builder) {
            this.mechanism = builder.mechanism;
            this.password = builder.password;
            this.type = builder.type;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaslUserVO create() {
            return builder().build();
        }

        /**
         * @return mechanism
         */
        public String getMechanism() {
            return this.mechanism;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String mechanism; 
            private String password; 
            private String type; 
            private String username; 

            /**
             * <p>The encryption method.</p>
             * <blockquote>
             * <p> This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SCRAM-SHA-256</p>
             */
            public Builder mechanism(String mechanism) {
                this.mechanism = mechanism;
                return this;
            }

            /**
             * <p>The password.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The type of the SASL user. Valid values:</p>
             * <ul>
             * <li><strong>plain</strong>: a simple mechanism that uses usernames and passwords to verify user identities. ApsaraMQ for Kafka provides an improved PLAIN mechanism that allows you to dynamically add SASL users without the need to restart an instance.</li>
             * <li><strong>SCRAM</strong>: a mechanism that uses usernames and passwords to verify user identities. Compared with the PLAIN mechanism, this mechanism provides better security protection. ApsaraMQ for Kafka uses the SCRAM-SHA-256 algorithm.</li>
             * <li><strong>LDAP</strong>: This value is available only for the SASL users of ApsaraMQ for Confluent instances.</li>
             * </ul>
             * <p>Default value: <strong>plain</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>scram</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>test12***</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public SaslUserVO build() {
                return new SaslUserVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSaslUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSaslUsersResponseBody</p>
     */
    public static class SaslUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SaslUserVO")
        private java.util.List<SaslUserVO> saslUserVO;

        private SaslUserList(Builder builder) {
            this.saslUserVO = builder.saslUserVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaslUserList create() {
            return builder().build();
        }

        /**
         * @return saslUserVO
         */
        public java.util.List<SaslUserVO> getSaslUserVO() {
            return this.saslUserVO;
        }

        public static final class Builder {
            private java.util.List<SaslUserVO> saslUserVO; 

            /**
             * SaslUserVO.
             */
            public Builder saslUserVO(java.util.List<SaslUserVO> saslUserVO) {
                this.saslUserVO = saslUserVO;
                return this;
            }

            public SaslUserList build() {
                return new SaslUserList(this);
            } 

        } 

    }
}
