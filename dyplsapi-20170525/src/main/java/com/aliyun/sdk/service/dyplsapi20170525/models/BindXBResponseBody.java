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
 * {@link BindXBResponseBody} extends {@link TeaModel}
 *
 * <p>BindXBResponseBody</p>
 */
public class BindXBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BindXBResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindXBResponseBody create() {
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
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BindXBResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
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
         * <p>返回状态码 0000表示成功 其他表示失败</p>
         * 
         * <strong>example:</strong>
         * <p>0000</p>
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
         * <p>返回信息</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>返回是否成功 true  表示成功 false表示失败</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BindXBResponseBody build() {
            return new BindXBResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindXBResponseBody} extends {@link TeaModel}
     *
     * <p>BindXBResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthId")
        private String authId;

        @com.aliyun.core.annotation.NameInMap("TelX")
        private String telX;

        private Data(Builder builder) {
            this.authId = builder.authId;
            this.telX = builder.telX;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authId
         */
        public String getAuthId() {
            return this.authId;
        }

        /**
         * @return telX
         */
        public String getTelX() {
            return this.telX;
        }

        public static final class Builder {
            private String authId; 
            private String telX; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authId = model.authId;
                this.telX = model.telX;
            } 

            /**
             * <p>工作号关系绑定的唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>4353453456</p>
             */
            public Builder authId(String authId) {
                this.authId = authId;
                return this;
            }

            /**
             * <p>X号码</p>
             * 
             * <strong>example:</strong>
             * <p>18640577897</p>
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
