// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkCreateExtenResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkCreateExtenResponseBody</p>
 */
public class ClinkCreateExtenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkCreateExtenResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkCreateExtenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkCreateExtenResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ClinkCreateExtenResponseBody build() {
            return new ClinkCreateExtenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkCreateExtenResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkCreateExtenResponseBody</p>
     */
    public static class Exten extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Allow")
        private Long allow;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("ExtenNumber")
        private String extenNumber;

        @com.aliyun.core.annotation.NameInMap("IsDirect")
        private Long isDirect;

        @com.aliyun.core.annotation.NameInMap("JittBuffer")
        private Long jittBuffer;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private Exten(Builder builder) {
            this.allow = builder.allow;
            this.areaCode = builder.areaCode;
            this.extenNumber = builder.extenNumber;
            this.isDirect = builder.isDirect;
            this.jittBuffer = builder.jittBuffer;
            this.password = builder.password;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exten create() {
            return builder().build();
        }

        /**
         * @return allow
         */
        public Long getAllow() {
            return this.allow;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return extenNumber
         */
        public String getExtenNumber() {
            return this.extenNumber;
        }

        /**
         * @return isDirect
         */
        public Long getIsDirect() {
            return this.isDirect;
        }

        /**
         * @return jittBuffer
         */
        public Long getJittBuffer() {
            return this.jittBuffer;
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
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private Long allow; 
            private String areaCode; 
            private String extenNumber; 
            private Long isDirect; 
            private Long jittBuffer; 
            private String password; 
            private Long type; 

            private Builder() {
            } 

            private Builder(Exten model) {
                this.allow = model.allow;
                this.areaCode = model.areaCode;
                this.extenNumber = model.extenNumber;
                this.isDirect = model.isDirect;
                this.jittBuffer = model.jittBuffer;
                this.password = model.password;
                this.type = model.type;
            } 

            /**
             * <p>语音编码。 1：g729(已弃用) 2：g729,alaw,ulaw 3：alaw,ulaw,g729 4：myopus,alaw,ulaw,g729 5：alaw,ulaw 6：myopus,alaw,ulaw</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder allow(Long allow) {
                this.allow = allow;
                return this;
            }

            /**
             * <p>话机区号</p>
             * 
             * <strong>example:</strong>
             * <p>010</p>
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * <p>话机号码</p>
             * 
             * <strong>example:</strong>
             * <p>11354</p>
             */
            public Builder extenNumber(String extenNumber) {
                this.extenNumber = extenNumber;
                return this;
            }

            /**
             * <p>是否允许主叫外呼，1：允许；0：不允许。话机类型为IP话机时，可以开启主叫外呼功能，直接通过IP话机进行外呼。若要使用主叫外呼功能，需要开启企业级开关。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDirect(Long isDirect) {
                this.isDirect = isDirect;
                return this;
            }

            /**
             * <p>网络防抖开关，0：关闭；1：开启</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder jittBuffer(Long jittBuffer) {
                this.jittBuffer = jittBuffer;
                return this;
            }

            /**
             * <p>话机密码，密码规则参见企业配置</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>话机类型。1: IP话机， 2: 软电话</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public Exten build() {
                return new Exten(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkCreateExtenResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkCreateExtenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("Exten")
        private Exten exten;

        private Data(Builder builder) {
            this.clinkRequestId = builder.clinkRequestId;
            this.exten = builder.exten;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return exten
         */
        public Exten getExten() {
            return this.exten;
        }

        public static final class Builder {
            private String clinkRequestId; 
            private Exten exten; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clinkRequestId = model.clinkRequestId;
                this.exten = model.exten;
            } 

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * <p>分机</p>
             */
            public Builder exten(Exten exten) {
                this.exten = exten;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
