// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link QueryAxnExtensionBindFixedLineResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAxnExtensionBindFixedLineResponseBody</p>
 */
public class QueryAxnExtensionBindFixedLineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAxnExtensionBindFixedLineResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAxnExtensionBindFixedLineResponseBody create() {
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
    public java.util.List<Data> getData() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAxnExtensionBindFixedLineResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>响应码</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>查询绑定对象集合，具体对象字段见绑定请求</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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

        public QueryAxnExtensionBindFixedLineResponseBody build() {
            return new QueryAxnExtensionBindFixedLineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAxnExtensionBindFixedLineResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAxnExtensionBindFixedLineResponseBody</p>
     */
    public static class Extraaxx extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callback")
        private String callback;

        @com.aliyun.core.annotation.NameInMap("Callrecording")
        private String callrecording;

        private Extraaxx(Builder builder) {
            this.callback = builder.callback;
            this.callrecording = builder.callrecording;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extraaxx create() {
            return builder().build();
        }

        /**
         * @return callback
         */
        public String getCallback() {
            return this.callback;
        }

        /**
         * @return callrecording
         */
        public String getCallrecording() {
            return this.callrecording;
        }

        public static final class Builder {
            private String callback; 
            private String callrecording; 

            private Builder() {
            } 

            private Builder(Extraaxx model) {
                this.callback = model.callback;
                this.callrecording = model.callrecording;
            } 

            /**
             * <p>回拨控制</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder callback(String callback) {
                this.callback = callback;
                return this;
            }

            /**
             * <p>录音控制</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder callrecording(String callrecording) {
                this.callrecording = callrecording;
                return this;
            }

            public Extraaxx build() {
                return new Extraaxx(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAxnExtensionBindFixedLineResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAxnExtensionBindFixedLineResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anucode")
        private String anucode;

        @com.aliyun.core.annotation.NameInMap("Anucodecalled")
        private String anucodecalled;

        @com.aliyun.core.annotation.NameInMap("Areacode")
        private String areacode;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("Extraaxx")
        private Extraaxx extraaxx;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Subid")
        private String subid;

        @com.aliyun.core.annotation.NameInMap("Subts")
        private String subts;

        @com.aliyun.core.annotation.NameInMap("TAnucodeConnect")
        private String tAnucodeConnect;

        @com.aliyun.core.annotation.NameInMap("TelA")
        private String telA;

        @com.aliyun.core.annotation.NameInMap("TelX")
        private String telX;

        @com.aliyun.core.annotation.NameInMap("TelXext")
        private String telXext;

        private Data(Builder builder) {
            this.anucode = builder.anucode;
            this.anucodecalled = builder.anucodecalled;
            this.areacode = builder.areacode;
            this.expiration = builder.expiration;
            this.extraaxx = builder.extraaxx;
            this.remark = builder.remark;
            this.subid = builder.subid;
            this.subts = builder.subts;
            this.tAnucodeConnect = builder.tAnucodeConnect;
            this.telA = builder.telA;
            this.telX = builder.telX;
            this.telXext = builder.telXext;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return anucode
         */
        public String getAnucode() {
            return this.anucode;
        }

        /**
         * @return anucodecalled
         */
        public String getAnucodecalled() {
            return this.anucodecalled;
        }

        /**
         * @return areacode
         */
        public String getAreacode() {
            return this.areacode;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return extraaxx
         */
        public Extraaxx getExtraaxx() {
            return this.extraaxx;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return subid
         */
        public String getSubid() {
            return this.subid;
        }

        /**
         * @return subts
         */
        public String getSubts() {
            return this.subts;
        }

        /**
         * @return tAnucodeConnect
         */
        public String getTAnucodeConnect() {
            return this.tAnucodeConnect;
        }

        /**
         * @return telA
         */
        public String getTelA() {
            return this.telA;
        }

        /**
         * @return telX
         */
        public String getTelX() {
            return this.telX;
        }

        /**
         * @return telXext
         */
        public String getTelXext() {
            return this.telXext;
        }

        public static final class Builder {
            private String anucode; 
            private String anucodecalled; 
            private String areacode; 
            private String expiration; 
            private Extraaxx extraaxx; 
            private String remark; 
            private String subid; 
            private String subts; 
            private String tAnucodeConnect; 
            private String telA; 
            private String telX; 
            private String telXext; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.anucode = model.anucode;
                this.anucodecalled = model.anucodecalled;
                this.areacode = model.areacode;
                this.expiration = model.expiration;
                this.extraaxx = model.extraaxx;
                this.remark = model.remark;
                this.subid = model.subid;
                this.subts = model.subts;
                this.tAnucodeConnect = model.tAnucodeConnect;
                this.telA = model.telA;
                this.telX = model.telX;
                this.telXext = model.telXext;
            } 

            /**
             * <p>放音编码</p>
             * 
             * <strong>example:</strong>
             * <p>10001,10002,10003</p>
             */
            public Builder anucode(String anucode) {
                this.anucode = anucode;
                return this;
            }

            /**
             * <p>被叫侧放音</p>
             * 
             * <strong>example:</strong>
             * <p>10001,10002</p>
             */
            public Builder anucodecalled(String anucodecalled) {
                this.anucodecalled = anucodecalled;
                return this;
            }

            /**
             * <p>隐私号码区号</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder areacode(String areacode) {
                this.areacode = areacode;
                return this;
            }

            /**
             * <p>过期时间</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>额外字段</p>
             */
            public Builder extraaxx(Extraaxx extraaxx) {
                this.extraaxx = extraaxx;
                return this;
            }

            /**
             * <p>接入商自有字段</p>
             * 
             * <strong>example:</strong>
             * <p>12444</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>绑定ID</p>
             * 
             * <strong>example:</strong>
             * <p>可参考绑定响应</p>
             */
            public Builder subid(String subid) {
                this.subid = subid;
                return this;
            }

            /**
             * <p>绑定时间</p>
             * 
             * <strong>example:</strong>
             * <p>20250421141723</p>
             */
            public Builder subts(String subts) {
                this.subts = subts;
                return this;
            }

            /**
             * <p>接通后主叫侧放音编码</p>
             * 
             * <strong>example:</strong>
             * <p>10001,10002</p>
             */
            public Builder tAnucodeConnect(String tAnucodeConnect) {
                this.tAnucodeConnect = tAnucodeConnect;
                return this;
            }

            /**
             * <p>A号码</p>
             * 
             * <strong>example:</strong>
             * <p>15500001111</p>
             */
            public Builder telA(String telA) {
                this.telA = telA;
                return this;
            }

            /**
             * <p>小号号码</p>
             * 
             * <strong>example:</strong>
             * <p>19700002222</p>
             */
            public Builder telX(String telX) {
                this.telX = telX;
                return this;
            }

            /**
             * <p>分机号</p>
             * 
             * <strong>example:</strong>
             * <p>1009</p>
             */
            public Builder telXext(String telXext) {
                this.telXext = telXext;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
