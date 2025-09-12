// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link GetCrowdDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>GetCrowdDatasetResponseBody</p>
 */
public class GetCrowdDatasetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCrowdDatasetResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdDatasetResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCrowdDatasetResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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

        public GetCrowdDatasetResponseBody build() {
            return new GetCrowdDatasetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCrowdDatasetResponseBody} extends {@link TeaModel}
     *
     * <p>GetCrowdDatasetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("crowdDatasetId")
        private String crowdDatasetId;

        @com.aliyun.core.annotation.NameInMap("datasetIds")
        private String datasetIds;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("uploadStatus")
        private String uploadStatus;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.crowdDatasetId = builder.crowdDatasetId;
            this.datasetIds = builder.datasetIds;
            this.description = builder.description;
            this.name = builder.name;
            this.uploadStatus = builder.uploadStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return crowdDatasetId
         */
        public String getCrowdDatasetId() {
            return this.crowdDatasetId;
        }

        /**
         * @return datasetIds
         */
        public String getDatasetIds() {
            return this.datasetIds;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uploadStatus
         */
        public String getUploadStatus() {
            return this.uploadStatus;
        }

        public static final class Builder {
            private String appId; 
            private String crowdDatasetId; 
            private String datasetIds; 
            private String description; 
            private String name; 
            private String uploadStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.crowdDatasetId = model.crowdDatasetId;
                this.datasetIds = model.datasetIds;
                this.description = model.description;
                this.name = model.name;
                this.uploadStatus = model.uploadStatus;
            } 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * crowdDatasetId.
             */
            public Builder crowdDatasetId(String crowdDatasetId) {
                this.crowdDatasetId = crowdDatasetId;
                return this;
            }

            /**
             * datasetIds.
             */
            public Builder datasetIds(String datasetIds) {
                this.datasetIds = datasetIds;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * uploadStatus.
             */
            public Builder uploadStatus(String uploadStatus) {
                this.uploadStatus = uploadStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
