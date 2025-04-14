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
 * {@link BindAxnResponseBody} extends {@link TeaModel}
 *
 * <p>BindAxnResponseBody</p>
 */
public class BindAxnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretBindDTO")
    private SecretBindDTO secretBindDTO;

    private BindAxnResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretBindDTO = builder.secretBindDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAxnResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BindAxnResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.secretBindDTO = model.secretBindDTO;
        } 

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

        public BindAxnResponseBody build() {
            return new BindAxnResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindAxnResponseBody} extends {@link TeaModel}
     *
     * <p>BindAxnResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SecretBindDTO model) {
                this.extension = model.extension;
                this.secretNo = model.secretNo;
                this.subsId = model.subsId;
            } 

            /**
             * <p>The extension of the phone number.</p>
             * <blockquote>
             * <p> The BindAxn operation does not involve an extension. Ignore this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>130</p>
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
             * <p>1***************3</p>
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
