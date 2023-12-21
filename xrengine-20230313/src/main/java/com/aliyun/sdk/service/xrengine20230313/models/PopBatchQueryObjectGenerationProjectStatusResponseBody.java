// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopBatchQueryObjectGenerationProjectStatusResponseBody} extends {@link TeaModel}
 *
 * <p>PopBatchQueryObjectGenerationProjectStatusResponseBody</p>
 */
public class PopBatchQueryObjectGenerationProjectStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PopBatchQueryObjectGenerationProjectStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopBatchQueryObjectGenerationProjectStatusResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PopBatchQueryObjectGenerationProjectStatusResponseBody build() {
            return new PopBatchQueryObjectGenerationProjectStatusResponseBody(this);
        } 

    } 

    public static class Dataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        private java.util.Map < String, ? > buildResultUrl;

        private Dataset(Builder builder) {
            this.buildResultUrl = builder.buildResultUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dataset create() {
            return builder().build();
        }

        /**
         * @return buildResultUrl
         */
        public java.util.Map < String, ? > getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public static final class Builder {
            private java.util.Map < String, ? > buildResultUrl; 

            /**
             * BuildResultUrl.
             */
            public Builder buildResultUrl(java.util.Map < String, ? > buildResultUrl) {
                this.buildResultUrl = buildResultUrl;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BizUsage")
        private String bizUsage;

        @NameInMap("Dataset")
        private Dataset dataset;

        @NameInMap("Id")
        private String id;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.bizUsage = builder.bizUsage;
            this.dataset = builder.dataset;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizUsage
         */
        public String getBizUsage() {
            return this.bizUsage;
        }

        /**
         * @return dataset
         */
        public Dataset getDataset() {
            return this.dataset;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizUsage; 
            private Dataset dataset; 
            private String id; 
            private String status; 

            /**
             * BizUsage.
             */
            public Builder bizUsage(String bizUsage) {
                this.bizUsage = bizUsage;
                return this;
            }

            /**
             * Dataset.
             */
            public Builder dataset(Dataset dataset) {
                this.dataset = dataset;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
