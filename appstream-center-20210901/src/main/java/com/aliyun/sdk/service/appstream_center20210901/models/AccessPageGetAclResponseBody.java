// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccessPageGetAclResponseBody} extends {@link TeaModel}
 *
 * <p>AccessPageGetAclResponseBody</p>
 */
public class AccessPageGetAclResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private AccessPageGetAclResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccessPageGetAclResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
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
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private String success; 

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
        public Builder data(java.util.List < Data> data) {
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
         * Id of the request
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

        public AccessPageGetAclResponseBody build() {
            return new AccessPageGetAclResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessMode")
        private String accessMode;

        @NameInMap("AccessUrl")
        private String accessUrl;

        @NameInMap("EffectTime")
        private Integer effectTime;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("UrlExpireTime")
        private String urlExpireTime;

        private Data(Builder builder) {
            this.accessMode = builder.accessMode;
            this.accessUrl = builder.accessUrl;
            this.effectTime = builder.effectTime;
            this.unit = builder.unit;
            this.urlExpireTime = builder.urlExpireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public String getAccessMode() {
            return this.accessMode;
        }

        /**
         * @return accessUrl
         */
        public String getAccessUrl() {
            return this.accessUrl;
        }

        /**
         * @return effectTime
         */
        public Integer getEffectTime() {
            return this.effectTime;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return urlExpireTime
         */
        public String getUrlExpireTime() {
            return this.urlExpireTime;
        }

        public static final class Builder {
            private String accessMode; 
            private String accessUrl; 
            private Integer effectTime; 
            private String unit; 
            private String urlExpireTime; 

            /**
             * AccessMode.
             */
            public Builder accessMode(String accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            /**
             * AccessUrl.
             */
            public Builder accessUrl(String accessUrl) {
                this.accessUrl = accessUrl;
                return this;
            }

            /**
             * EffectTime.
             */
            public Builder effectTime(Integer effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * UrlExpireTime.
             */
            public Builder urlExpireTime(String urlExpireTime) {
                this.urlExpireTime = urlExpireTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
