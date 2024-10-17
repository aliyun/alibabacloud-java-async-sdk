// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchIndexJobRerunResponseBody} extends {@link TeaModel}
 *
 * <p>SearchIndexJobRerunResponseBody</p>
 */
public class SearchIndexJobRerunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private SearchIndexJobRerunResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchIndexJobRerunResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
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

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public SearchIndexJobRerunResponseBody build() {
            return new SearchIndexJobRerunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchIndexJobRerunResponseBody} extends {@link TeaModel}
     *
     * <p>SearchIndexJobRerunResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaIdsNoExist")
        private java.util.List < String > mediaIdsNoExist;

        private Data(Builder builder) {
            this.mediaIdsNoExist = builder.mediaIdsNoExist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return mediaIdsNoExist
         */
        public java.util.List < String > getMediaIdsNoExist() {
            return this.mediaIdsNoExist;
        }

        public static final class Builder {
            private java.util.List < String > mediaIdsNoExist; 

            /**
             * MediaIdsNoExist.
             */
            public Builder mediaIdsNoExist(java.util.List < String > mediaIdsNoExist) {
                this.mediaIdsNoExist = mediaIdsNoExist;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
