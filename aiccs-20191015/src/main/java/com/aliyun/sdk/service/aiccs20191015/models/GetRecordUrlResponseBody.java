// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetRecordUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecordUrlResponseBody</p>
 */
public class GetRecordUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRecordUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecordUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRecordUrlResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data list.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
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
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRecordUrlResponseBody build() {
            return new GetRecordUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRecordUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecordUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acid")
        private String acid;

        @com.aliyun.core.annotation.NameInMap("OssLink")
        private String ossLink;

        private Data(Builder builder) {
            this.acid = builder.acid;
            this.ossLink = builder.ossLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acid
         */
        public String getAcid() {
            return this.acid;
        }

        /**
         * @return ossLink
         */
        public String getOssLink() {
            return this.ossLink;
        }

        public static final class Builder {
            private String acid; 
            private String ossLink; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acid = model.acid;
                this.ossLink = model.ossLink;
            } 

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001067****</p>
             */
            public Builder acid(String acid) {
                this.acid = acid;
                return this;
            }

            /**
             * <p>The recording link.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://aliccrec-shvpc.oss-cn-shanghai.aliyuncs.com/accrec_tmp/10010679716-12-01-56.wav">http://aliccrec-shvpc.oss-cn-shanghai.aliyuncs.com/accrec_tmp/10010679716-12-01-56.wav</a>?***</p>
             */
            public Builder ossLink(String ossLink) {
                this.ossLink = ossLink;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
