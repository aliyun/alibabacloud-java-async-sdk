// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
        private java.util.List<String> mediaIdsNoExist;

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
        public java.util.List<String> getMediaIdsNoExist() {
            return this.mediaIdsNoExist;
        }

        public static final class Builder {
            private java.util.List<String> mediaIdsNoExist; 

            /**
             * <p>The media asset IDs that do not exist.</p>
             */
            public Builder mediaIdsNoExist(java.util.List<String> mediaIdsNoExist) {
                this.mediaIdsNoExist = mediaIdsNoExist;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
