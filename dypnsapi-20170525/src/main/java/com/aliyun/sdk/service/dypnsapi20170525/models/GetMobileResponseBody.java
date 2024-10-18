// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMobileResponseBody} extends {@link TeaModel}
 *
 * <p>GetMobileResponseBody</p>
 */
public class GetMobileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GetMobileResultDTO")
    private GetMobileResultDTO getMobileResultDTO;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder getMobileResultDTO(GetMobileResultDTO getMobileResultDTO) {
            this.getMobileResultDTO = getMobileResultDTO;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8906582E-6722</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMobileResponseBody build() {
            return new GetMobileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMobileResponseBody} extends {@link TeaModel}
     *
     * <p>GetMobileResponseBody</p>
     */
    public static class GetMobileResultDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mobile")
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
             * <p>The phone number,</p>
             * 
             * <strong>example:</strong>
             * <p>13900001234</p>
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
