// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetMiniAppAuthUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetMiniAppAuthUrlResponseBody</p>
 */
public class GetMiniAppAuthUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMiniAppAuthUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMiniAppAuthUrlResponseBody create() {
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

        private Builder(GetMiniAppAuthUrlResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMiniAppAuthUrlResponseBody build() {
            return new GetMiniAppAuthUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMiniAppAuthUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetMiniAppAuthUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthUrl")
        private String authUrl;

        private Data(Builder builder) {
            this.authUrl = builder.authUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authUrl
         */
        public String getAuthUrl() {
            return this.authUrl;
        }

        public static final class Builder {
            private String authUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authUrl = model.authUrl;
            } 

            /**
             * AuthUrl.
             */
            public Builder authUrl(String authUrl) {
                this.authUrl = authUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
