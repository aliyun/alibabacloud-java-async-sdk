// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitIndexJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitIndexJobResponseBody</p>
 */
public class SubmitIndexJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SubmitIndexJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitIndexJobResponseBody create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indications whether the API call is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SubmitIndexJobResponseBody build() {
            return new SubmitIndexJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitIndexJobResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitIndexJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IndexId")
        private String indexId;

        private Data(Builder builder) {
            this.id = builder.id;
            this.indexId = builder.indexId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return indexId
         */
        public String getIndexId() {
            return this.indexId;
        }

        public static final class Builder {
            private String id; 
            private String indexId; 

            /**
             * <p>The primary key ID of the job, which is the <code>JobId</code> parameter of the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getindexjobstatus">GetIndexJobStatus</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>eFDr2fGRzP9gdDZWAdo3YQ==</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The primary key ID of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>khdyak1uuj</p>
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
