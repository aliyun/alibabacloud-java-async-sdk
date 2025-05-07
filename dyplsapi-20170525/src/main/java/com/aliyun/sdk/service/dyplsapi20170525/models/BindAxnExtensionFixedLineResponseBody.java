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
 * {@link BindAxnExtensionFixedLineResponseBody} extends {@link TeaModel}
 *
 * <p>BindAxnExtensionFixedLineResponseBody</p>
 */
public class BindAxnExtensionFixedLineResponseBody extends TeaModel {
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
    private String success;

    private BindAxnExtensionFixedLineResponseBody(Builder builder) {
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

    public static BindAxnExtensionFixedLineResponseBody create() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(BindAxnExtensionFixedLineResponseBody model) {
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
         * <p>响应码 0：成功，其它失败，具体见文档</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>响应信息</p>
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public BindAxnExtensionFixedLineResponseBody build() {
            return new BindAxnExtensionFixedLineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindAxnExtensionFixedLineResponseBody} extends {@link TeaModel}
     *
     * <p>BindAxnExtensionFixedLineResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Subid")
        private String subid;

        @com.aliyun.core.annotation.NameInMap("TelX")
        private String telX;

        @com.aliyun.core.annotation.NameInMap("TelXext")
        private String telXext;

        private Data(Builder builder) {
            this.subid = builder.subid;
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
         * @return subid
         */
        public String getSubid() {
            return this.subid;
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
            private String subid; 
            private String telX; 
            private String telXext; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.subid = model.subid;
                this.telX = model.telX;
                this.telXext = model.telXext;
            } 

            /**
             * <p>绑定id</p>
             * 
             * <strong>example:</strong>
             * <p>GHX0534X202504221531579290029</p>
             */
            public Builder subid(String subid) {
                this.subid = subid;
                return this;
            }

            /**
             * <p>隐私号码</p>
             * 
             * <strong>example:</strong>
             * <p>0571409312</p>
             */
            public Builder telX(String telX) {
                this.telX = telX;
                return this;
            }

            /**
             * <p>分机号，只有4位</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
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
