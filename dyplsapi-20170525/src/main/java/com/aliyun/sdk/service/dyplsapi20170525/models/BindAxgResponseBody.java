// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BindAxgResponseBody} extends {@link TeaModel}
 *
 * <p>BindAxgResponseBody</p>
 */
public class BindAxgResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretBindDTO")
    private SecretBindDTO secretBindDTO;

    private BindAxgResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretBindDTO = builder.secretBindDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAxgResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return secretBindDTO
     */
    public SecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SecretBindDTO secretBindDTO; 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
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
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information returned after the phone numbers were bound.</p>
         */
        public Builder secretBindDTO(SecretBindDTO secretBindDTO) {
            this.secretBindDTO = secretBindDTO;
            return this;
        }

        public BindAxgResponseBody build() {
            return new BindAxgResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindAxgResponseBody} extends {@link TeaModel}
     *
     * <p>BindAxgResponseBody</p>
     */
    public static class SecretBindDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("SecretNo")
        private String secretNo;

        @com.aliyun.core.annotation.NameInMap("SubsId")
        private String subsId;

        private SecretBindDTO(Builder builder) {
            this.extension = builder.extension;
            this.secretNo = builder.secretNo;
            this.subsId = builder.subsId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretBindDTO create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return secretNo
         */
        public String getSecretNo() {
            return this.secretNo;
        }

        /**
         * @return subsId
         */
        public String getSubsId() {
            return this.subsId;
        }

        public static final class Builder {
            private String extension; 
            private String secretNo; 
            private String subsId; 

            /**
             * <p>The extension of the phone number.</p>
             * <blockquote>
             * <p> The BindAxg operation does not involve an extension. Ignore this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>139****0000</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The private number, that is, phone number X.</p>
             * 
             * <strong>example:</strong>
             * <p>139****0000</p>
             */
            public Builder secretNo(String secretNo) {
                this.secretNo = secretNo;
                return this;
            }

            /**
             * <p>The binding ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1************3</p>
             */
            public Builder subsId(String subsId) {
                this.subsId = subsId;
                return this;
            }

            public SecretBindDTO build() {
                return new SecretBindDTO(this);
            } 

        } 

    }
}
