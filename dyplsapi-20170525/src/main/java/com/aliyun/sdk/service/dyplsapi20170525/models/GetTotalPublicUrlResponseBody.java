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
 * {@link GetTotalPublicUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetTotalPublicUrlResponseBody</p>
 */
public class GetTotalPublicUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTotalPublicUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTotalPublicUrlResponseBody create() {
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
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTotalPublicUrlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
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
         * <p>The download URLs of the recording files.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>1AB3CEF7-DCBE-488C-9C33-D180982CE031</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTotalPublicUrlResponseBody build() {
            return new GetTotalPublicUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTotalPublicUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetTotalPublicUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhonePublicUrl")
        private String phonePublicUrl;

        @com.aliyun.core.annotation.NameInMap("RingPublicUrl")
        private String ringPublicUrl;

        private Data(Builder builder) {
            this.phonePublicUrl = builder.phonePublicUrl;
            this.ringPublicUrl = builder.ringPublicUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return phonePublicUrl
         */
        public String getPhonePublicUrl() {
            return this.phonePublicUrl;
        }

        /**
         * @return ringPublicUrl
         */
        public String getRingPublicUrl() {
            return this.ringPublicUrl;
        }

        public static final class Builder {
            private String phonePublicUrl; 
            private String ringPublicUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.phonePublicUrl = model.phonePublicUrl;
                this.ringPublicUrl = model.ringPublicUrl;
            } 

            /**
             * <p>The download URL of the recorded call.</p>
             * <blockquote>
             * <p> The download URL of the recorded call is valid for 30 days.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://secret-axb-reco****cn-shanghai.aliyuncs.com/1000000820257625_66647243838006067251551752068865.mp3?Expires=1551****07&OSSAccessKeyId=LTAIP00vvvv****v&Signature=tK6Yq9KusU4n%2BZQWX****4/WmEA%3D">http://secret-axb-reco****cn-shanghai.aliyuncs.com/1000000820257625_66647243838006067251551752068865.mp3?Expires=1551****07&amp;OSSAccessKeyId=LTAIP00vvvv****v&amp;Signature=tK6Yq9KusU4n%2BZQWX****4/WmEA%3D</a></p>
             */
            public Builder phonePublicUrl(String phonePublicUrl) {
                this.phonePublicUrl = phonePublicUrl;
                return this;
            }

            /**
             * <p>The download URL of the recorded ringing tone.</p>
             * <blockquote>
             * <p> The download URL of the recorded ringing tone is valid for 30 days.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://secret-ab-reco****cn-shanghai.aliyuncs.com/1000000820257625_66647243838006067251551752068865.mp3?Expires=155175****&OSSAccessKeyId=LTAIP00vvv****vv&Signature=tK6Yq9KusU4n%2BZQW****g4/WmEA%3D">http://secret-ab-reco****cn-shanghai.aliyuncs.com/1000000820257625_66647243838006067251551752068865.mp3?Expires=155175****&amp;OSSAccessKeyId=LTAIP00vvv****vv&amp;Signature=tK6Yq9KusU4n%2BZQW****g4/WmEA%3D</a></p>
             */
            public Builder ringPublicUrl(String ringPublicUrl) {
                this.ringPublicUrl = ringPublicUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
