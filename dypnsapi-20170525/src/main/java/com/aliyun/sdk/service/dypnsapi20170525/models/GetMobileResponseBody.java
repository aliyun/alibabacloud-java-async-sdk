// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMobileResponseBody} extends {@link TeaModel}
 *
 * <p>GetMobileResponseBody</p>
 */
public class GetMobileResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GetMobileResultDTO")
    private GetMobileResultDTO getMobileResultDTO;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetMobileResponseBody(Builder builder) {
        this.code = builder.code;
        this.getMobileResultDTO = builder.getMobileResultDTO;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMobileResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return getMobileResultDTO
     */
    public GetMobileResultDTO getGetMobileResultDTO() {
        return this.getMobileResultDTO;
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
        private String code; 
        private GetMobileResultDTO getMobileResultDTO; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GetMobileResultDTO.
         */
        public Builder getMobileResultDTO(GetMobileResultDTO getMobileResultDTO) {
            this.getMobileResultDTO = getMobileResultDTO;
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

        public GetMobileResponseBody build() {
            return new GetMobileResponseBody(this);
        } 

    } 

    public static class GetMobileResultDTO extends TeaModel {
        @NameInMap("Mobile")
        private String mobile;

        private GetMobileResultDTO(Builder builder) {
            this.mobile = builder.mobile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetMobileResultDTO create() {
            return builder().build();
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        public static final class Builder {
            private String mobile; 

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            public GetMobileResultDTO build() {
                return new GetMobileResultDTO(this);
            } 

        } 

    }
}
