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
 * {@link CloudGetExtenResponseBody} extends {@link TeaModel}
 *
 * <p>CloudGetExtenResponseBody</p>
 */
public class CloudGetExtenResponseBody extends TeaModel {
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

    private CloudGetExtenResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetExtenResponseBody create() {
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

        private Builder(CloudGetExtenResponseBody model) {
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

        public CloudGetExtenResponseBody build() {
            return new CloudGetExtenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudGetExtenResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetExtenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Allow")
        private String allow;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("BindGatewayId")
        private Long bindGatewayId;

        @com.aliyun.core.annotation.NameInMap("CallPower")
        private String callPower;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Denoise")
        private Long denoise;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Exten")
        private String exten;

        @com.aliyun.core.annotation.NameInMap("IbRecord")
        private Long ibRecord;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsDirect")
        private String isDirect;

        @com.aliyun.core.annotation.NameInMap("IsOb")
        private String isOb;

        @com.aliyun.core.annotation.NameInMap("JitterBuffer")
        private Long jitterBuffer;

        @com.aliyun.core.annotation.NameInMap("ObRecord")
        private Long obRecord;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private Data(Builder builder) {
            this.allow = builder.allow;
            this.areaCode = builder.areaCode;
            this.bindGatewayId = builder.bindGatewayId;
            this.callPower = builder.callPower;
            this.createTime = builder.createTime;
            this.denoise = builder.denoise;
            this.enterpriseId = builder.enterpriseId;
            this.exten = builder.exten;
            this.ibRecord = builder.ibRecord;
            this.id = builder.id;
            this.isDirect = builder.isDirect;
            this.isOb = builder.isOb;
            this.jitterBuffer = builder.jitterBuffer;
            this.obRecord = builder.obRecord;
            this.password = builder.password;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allow
         */
        public String getAllow() {
            return this.allow;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return bindGatewayId
         */
        public Long getBindGatewayId() {
            return this.bindGatewayId;
        }

        /**
         * @return callPower
         */
        public String getCallPower() {
            return this.callPower;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return denoise
         */
        public Long getDenoise() {
            return this.denoise;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return exten
         */
        public String getExten() {
            return this.exten;
        }

        /**
         * @return ibRecord
         */
        public Long getIbRecord() {
            return this.ibRecord;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isDirect
         */
        public String getIsDirect() {
            return this.isDirect;
        }

        /**
         * @return isOb
         */
        public String getIsOb() {
            return this.isOb;
        }

        /**
         * @return jitterBuffer
         */
        public Long getJitterBuffer() {
            return this.jitterBuffer;
        }

        /**
         * @return obRecord
         */
        public Long getObRecord() {
            return this.obRecord;
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
            private String allow; 
            private String areaCode; 
            private Long bindGatewayId; 
            private String callPower; 
            private String createTime; 
            private Long denoise; 
            private String enterpriseId; 
            private String exten; 
            private Long ibRecord; 
            private Long id; 
            private String isDirect; 
            private String isOb; 
            private Long jitterBuffer; 
            private Long obRecord; 
            private String password; 
            private Long type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allow = model.allow;
                this.areaCode = model.areaCode;
                this.bindGatewayId = model.bindGatewayId;
                this.callPower = model.callPower;
                this.createTime = model.createTime;
                this.denoise = model.denoise;
                this.enterpriseId = model.enterpriseId;
                this.exten = model.exten;
                this.ibRecord = model.ibRecord;
                this.id = model.id;
                this.isDirect = model.isDirect;
                this.isOb = model.isOb;
                this.jitterBuffer = model.jitterBuffer;
                this.obRecord = model.obRecord;
                this.password = model.password;
                this.type = model.type;
            } 

            /**
             * <p>语音编码</p>
             * 
             * <strong>example:</strong>
             * <p>alaw,ulaw</p>
             */
            public Builder allow(String allow) {
                this.allow = allow;
                return this;
            }

            /**
             * <p>区号</p>
             * 
             * <strong>example:</strong>
             * <p>010</p>
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * <p>绑定的agent-gateway</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder bindGatewayId(Long bindGatewayId) {
                this.bindGatewayId = bindGatewayId;
                return this;
            }

            /**
             * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callPower(String callPower) {
                this.callPower = callPower;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-30 06:09:04</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>降噪开关 0:关闭 1:开启 默认关闭(该参数只有在类型为注册到webrtc才有效)</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder denoise(Long denoise) {
                this.denoise = denoise;
                return this;
            }

            /**
             * <p>企业编号</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>分机号，3-11位</p>
             * 
             * <strong>example:</strong>
             * <p>9000</p>
             */
            public Builder exten(String exten) {
                this.exten = exten;
                return this;
            }

            /**
             * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ibRecord(Long ibRecord) {
                this.ibRecord = ibRecord;
                return this;
            }

            /**
             * <p>分机号id</p>
             * 
             * <strong>example:</strong>
             * <p>336450</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>是否允许摘机外呼，0：不允许，1：可以，默认允许</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDirect(String isDirect) {
                this.isDirect = isDirect;
                return this;
            }

            /**
             * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isOb(String isOb) {
                this.isOb = isOb;
                return this;
            }

            /**
             * <p>网络防抖</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder jitterBuffer(Long jitterBuffer) {
                this.jitterBuffer = jitterBuffer;
                return this;
            }

            /**
             * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder obRecord(Long obRecord) {
                this.obRecord = obRecord;
                return this;
            }

            /**
             * <p>密码</p>
             * 
             * <strong>example:</strong>
             * <p>Aa248236</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>类型，1. 注册到IAD分机 2.注册到webrtc 3.注册到远程话机</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
