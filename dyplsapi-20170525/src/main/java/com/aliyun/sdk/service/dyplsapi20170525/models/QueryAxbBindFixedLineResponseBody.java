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
 * {@link QueryAxbBindFixedLineResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAxbBindFixedLineResponseBody</p>
 */
public class QueryAxbBindFixedLineResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAxbBindFixedLineResponseBody(Builder builder) {
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

    public static QueryAxbBindFixedLineResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAxbBindFixedLineResponseBody model) {
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
         * <p>绑定信息</p>
         */
        public Builder data(Data data) {
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
         * <p>处理是否成功 true-成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAxbBindFixedLineResponseBody build() {
            return new QueryAxbBindFixedLineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAxbBindFixedLineResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAxbBindFixedLineResponseBody</p>
     */
    public static class Extra extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callrecording")
        private String callrecording;

        private Extra(Builder builder) {
            this.callrecording = builder.callrecording;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extra create() {
            return builder().build();
        }

        /**
         * @return callrecording
         */
        public String getCallrecording() {
            return this.callrecording;
        }

        public static final class Builder {
            private String callrecording; 

            private Builder() {
            } 

            private Builder(Extra model) {
                this.callrecording = model.callrecording;
            } 

            /**
             * <p>录音控制，仅下列值有效。默认是0（不开通录音功能）。 0：不录音 1：录音</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callrecording(String callrecording) {
                this.callrecording = callrecording;
                return this;
            }

            public Extra build() {
                return new Extra(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAxbBindFixedLineResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAxbBindFixedLineResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Extra")
        private Extra extra;

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

        @com.aliyun.core.annotation.NameInMap("TelB")
        private String telB;

        @com.aliyun.core.annotation.NameInMap("TelX")
        private String telX;

        private Data(Builder builder) {
            this.anucode = builder.anucode;
            this.anucodecalled = builder.anucodecalled;
            this.areacode = builder.areacode;
            this.expiration = builder.expiration;
            this.extra = builder.extra;
            this.remark = builder.remark;
            this.subid = builder.subid;
            this.subts = builder.subts;
            this.tAnucodeConnect = builder.tAnucodeConnect;
            this.telA = builder.telA;
            this.telB = builder.telB;
            this.telX = builder.telX;
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
         * @return extra
         */
        public Extra getExtra() {
            return this.extra;
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
         * @return telB
         */
        public String getTelB() {
            return this.telB;
        }

        /**
         * @return telX
         */
        public String getTelX() {
            return this.telX;
        }

        public static final class Builder {
            private String anucode; 
            private String anucodecalled; 
            private String areacode; 
            private String expiration; 
            private Extra extra; 
            private String remark; 
            private String subid; 
            private String subts; 
            private String tAnucodeConnect; 
            private String telA; 
            private String telB; 
            private String telX; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.anucode = model.anucode;
                this.anucodecalled = model.anucodecalled;
                this.areacode = model.areacode;
                this.expiration = model.expiration;
                this.extra = model.extra;
                this.remark = model.remark;
                this.subid = model.subid;
                this.subts = model.subts;
                this.tAnucodeConnect = model.tAnucodeConnect;
                this.telA = model.telA;
                this.telB = model.telB;
                this.telX = model.telX;
            } 

            /**
             * <p>接通前放音编码，放音编码必须包含3个场景的编码。按照“B-&gt;X,A-&gt;X,其他号码-&gt;X”的顺序填写编码，编码之间以逗号分隔。  比如：“1,2,3”表示B-&gt;X放音编号为1，A-&gt;X放音编号为2， 其他号码-&gt;X放音编号为3</p>
             * 
             * <strong>example:</strong>
             * <p>10001,10002,10003</p>
             */
            public Builder anucode(String anucode) {
                this.anucode = anucode;
                return this;
            }

            /**
             * <p>接通后被叫侧放音编码</p>
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
             * <p>010</p>
             */
            public Builder areacode(String areacode) {
                this.areacode = areacode;
                return this;
            }

            /**
             * <p>绑定过期时间</p>
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
            public Builder extra(Extra extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>接入商自有字段，最大100字符长度</p>
             * 
             * <strong>example:</strong>
             * <p>19394</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>绑定id</p>
             * 
             * <strong>example:</strong>
             * <p>GHX0534X202504221531579290029-2-1-aliaxb</p>
             */
            public Builder subid(String subid) {
                this.subid = subid;
                return this;
            }

            /**
             * <p>绑定时间，格式为yyyyMMddHHmmss。时间采用北京时间，24小时制。</p>
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
             * <p>示例值示例值</p>
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
             * <p>B号码</p>
             * 
             * <strong>example:</strong>
             * <p>15500002222</p>
             */
            public Builder telB(String telB) {
                this.telB = telB;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
