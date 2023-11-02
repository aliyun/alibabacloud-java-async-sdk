// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageResponseBody</p>
 */
public class GetStorageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DyCode")
    private String dyCode;

    @NameInMap("DyMessage")
    private String dyMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetStorageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dyCode = builder.dyCode;
        this.dyMessage = builder.dyMessage;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dyCode
     */
    public String getDyCode() {
        return this.dyCode;
    }

    /**
     * @return dyMessage
     */
    public String getDyMessage() {
        return this.dyMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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
        private Data data; 
        private String dyCode; 
        private String dyMessage; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * DyCode.
         */
        public Builder dyCode(String dyCode) {
            this.dyCode = dyCode;
            return this;
        }

        /**
         * DyMessage.
         */
        public Builder dyMessage(String dyMessage) {
            this.dyMessage = dyMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStorageResponseBody build() {
            return new GetStorageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CanOperate")
        private Boolean canOperate;

        @NameInMap("DisplayRegion")
        private Boolean displayRegion;

        @NameInMap("Region")
        private String region;

        @NameInMap("Ttl")
        private Integer ttl;

        private Data(Builder builder) {
            this.canOperate = builder.canOperate;
            this.displayRegion = builder.displayRegion;
            this.region = builder.region;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canOperate
         */
        public Boolean getCanOperate() {
            return this.canOperate;
        }

        /**
         * @return displayRegion
         */
        public Boolean getDisplayRegion() {
            return this.displayRegion;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private Boolean canOperate; 
            private Boolean displayRegion; 
            private String region; 
            private Integer ttl; 

            /**
             * CanOperate.
             */
            public Builder canOperate(Boolean canOperate) {
                this.canOperate = canOperate;
                return this;
            }

            /**
             * DisplayRegion.
             */
            public Builder displayRegion(Boolean displayRegion) {
                this.displayRegion = displayRegion;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
