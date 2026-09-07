// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link LookupWmInfoMappingResponseBody} extends {@link TeaModel}
 *
 * <p>LookupWmInfoMappingResponseBody</p>
 */
public class LookupWmInfoMappingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LookupWmInfoMappingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupWmInfoMappingResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LookupWmInfoMappingResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Query result of the mapping.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LookupWmInfoMappingResponseBody build() {
            return new LookupWmInfoMappingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LookupWmInfoMappingResponseBody} extends {@link TeaModel}
     *
     * <p>LookupWmInfoMappingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WmInfoBytesB64")
        private String wmInfoBytesB64;

        private Data(Builder builder) {
            this.wmInfoBytesB64 = builder.wmInfoBytesB64;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return wmInfoBytesB64
         */
        public String getWmInfoBytesB64() {
            return this.wmInfoBytesB64;
        }

        public static final class Builder {
            private String wmInfoBytesB64; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.wmInfoBytesB64 = model.wmInfoBytesB64;
            } 

            /**
             * <p>String-formatted watermark information obtained from the mapping lookup. Value source:</p>
             * <ul>
             * <li><a href="~~CreateWmInfoMapping~~">CreateWmInfoMapping</a>: The <strong>WmInfoBytesB64</strong> parameter from the CreateWmInfoMapping API.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aGVsbG8gc2F*****</p>
             */
            public Builder wmInfoBytesB64(String wmInfoBytesB64) {
                this.wmInfoBytesB64 = wmInfoBytesB64;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
