// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChatappBindWabaResponseBody} extends {@link TeaModel}
 *
 * <p>ChatappBindWabaResponseBody</p>
 */
public class ChatappBindWabaResponseBody extends TeaModel {
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

    private ChatappBindWabaResponseBody(Builder builder) {
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

    public static ChatappBindWabaResponseBody create() {
        return builder().build();
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

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * <ul>
         * <li>A value of OK indicates that the call is successful.</li>
         * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ChatappBindWabaResponseBody build() {
            return new ChatappBindWabaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChatappBindWabaResponseBody} extends {@link TeaModel}
     *
     * <p>ChatappBindWabaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustSpaceId")
        private String custSpaceId;

        @com.aliyun.core.annotation.NameInMap("WabaId")
        private String wabaId;

        private Data(Builder builder) {
            this.custSpaceId = builder.custSpaceId;
            this.wabaId = builder.wabaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return custSpaceId
         */
        public String getCustSpaceId() {
            return this.custSpaceId;
        }

        /**
         * @return wabaId
         */
        public String getWabaId() {
            return this.wabaId;
        }

        public static final class Builder {
            private String custSpaceId; 
            private String wabaId; 

            /**
             * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
             * 
             * <strong>example:</strong>
             * <p>C02029392939939</p>
             */
            public Builder custSpaceId(String custSpaceId) {
                this.custSpaceId = custSpaceId;
                return this;
            }

            /**
             * <p>The ID of the WhatsApp Business Account (WABA).</p>
             * 
             * <strong>example:</strong>
             * <p>2939828282</p>
             */
            public Builder wabaId(String wabaId) {
                this.wabaId = wabaId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
