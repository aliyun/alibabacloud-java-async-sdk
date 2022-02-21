// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSaslUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSaslUsersResponseBody</p>
 */
public class DescribeSaslUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SaslUserList")
    private SaslUserList saslUserList;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * SaslUserList.
         */
        public Builder saslUserList(SaslUserList saslUserList) {
            this.saslUserList = saslUserList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSaslUsersResponseBody build() {
            return new DescribeSaslUsersResponseBody(this);
        } 

    } 

    public static class SaslUserVO extends TeaModel {
        @NameInMap("Password")
        private String password;

        @NameInMap("Type")
        private String type;

        @NameInMap("Username")
        private String username;

        private SaslUserVO(Builder builder) {
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
            private String password; 
            private String type; 
            private String username; 

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Username.
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
    public static class SaslUserList extends TeaModel {
        @NameInMap("SaslUserVO")
        private java.util.List < SaslUserVO> saslUserVO;

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
        public java.util.List < SaslUserVO> getSaslUserVO() {
            return this.saslUserVO;
        }

        public static final class Builder {
            private java.util.List < SaslUserVO> saslUserVO; 

            /**
             * SaslUserVO.
             */
            public Builder saslUserVO(java.util.List < SaslUserVO> saslUserVO) {
                this.saslUserVO = saslUserVO;
                return this;
            }

            public SaslUserList build() {
                return new SaslUserList(this);
            } 

        } 

    }
}
