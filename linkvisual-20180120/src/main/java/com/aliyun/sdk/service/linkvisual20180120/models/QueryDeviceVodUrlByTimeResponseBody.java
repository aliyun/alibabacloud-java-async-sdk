// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryDeviceVodUrlByTimeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceVodUrlByTimeResponseBody</p>
 */
public class QueryDeviceVodUrlByTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDeviceVodUrlByTimeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceVodUrlByTimeResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDeviceVodUrlByTimeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>200</strong>: The call was successful.</li>
         * <li>Other values: An error occurred. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant auth error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>06DC77A0-4622-42DB-9EE0-25FIOHS82JK1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDeviceVodUrlByTimeResponseBody build() {
            return new QueryDeviceVodUrlByTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceVodUrlByTimeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceVodUrlByTimeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DecryptKey")
        private String decryptKey;

        @com.aliyun.core.annotation.NameInMap("StunInfo")
        private String stunInfo;

        @com.aliyun.core.annotation.NameInMap("VodUrl")
        private String vodUrl;

        private Data(Builder builder) {
            this.decryptKey = builder.decryptKey;
            this.stunInfo = builder.stunInfo;
            this.vodUrl = builder.vodUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return decryptKey
         */
        public String getDecryptKey() {
            return this.decryptKey;
        }

        /**
         * @return stunInfo
         */
        public String getStunInfo() {
            return this.stunInfo;
        }

        /**
         * @return vodUrl
         */
        public String getVodUrl() {
            return this.vodUrl;
        }

        public static final class Builder {
            private String decryptKey; 
            private String stunInfo; 
            private String vodUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.decryptKey = model.decryptKey;
                this.stunInfo = model.stunInfo;
                this.vodUrl = model.vodUrl;
            } 

            /**
             * <p>The decryption key.
             * A decryption key is generated when the <strong>ShouldEncrypt</strong> parameter is set to <strong>true</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;iv&quot;: &quot;MDEy<strong><strong>OTo7PD0+Pw==&quot;,&quot;key&quot;: &quot;eA2r</strong></strong>fHjOmnyBfQ==&quot;}</p>
             */
            public Builder decryptKey(String decryptKey) {
                this.decryptKey = decryptKey;
                return this;
            }

            /**
             * StunInfo.
             */
            public Builder stunInfo(String stunInfo) {
                this.stunInfo = stunInfo;
                return this;
            }

            /**
             * <p>The playback URL of the local recording.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://iotx-vision-vod-vpc-hz-pre.aliyun-inc.com/vod/device/localrecord/flv/play/1****668.flv?token=e9****a9e14482c56be52&session=470e****3d015">https://iotx-vision-vod-vpc-hz-pre.aliyun-inc.com/vod/device/localrecord/flv/play/1****668.flv?token=e9****a9e14482c56be52&amp;session=470e****3d015</a></p>
             */
            public Builder vodUrl(String vodUrl) {
                this.vodUrl = vodUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
