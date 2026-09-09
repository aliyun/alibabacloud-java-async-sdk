// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link PreviewDocumentResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewDocumentResponseBody</p>
 */
public class PreviewDocumentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private PreviewDocumentResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewDocumentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(PreviewDocumentResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * <p>Time consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Data type.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ff551395-1c8a-4f30-8ffd-ef7e87c70b4c</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public PreviewDocumentResponseBody build() {
            return new PreviewDocumentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreviewDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>PreviewDocumentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("previewType")
        private String previewType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("uploadTime")
        private String uploadTime;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Data(Builder builder) {
            this.previewType = builder.previewType;
            this.title = builder.title;
            this.uploadTime = builder.uploadTime;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return previewType
         */
        public String getPreviewType() {
            return this.previewType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String previewType; 
            private String title; 
            private String uploadTime; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.previewType = model.previewType;
                this.title = model.title;
                this.uploadTime = model.uploadTime;
                this.url = model.url;
            } 

            /**
             * <p>Preview type.</p>
             * 
             * <strong>example:</strong>
             * <p>pdf</p>
             */
            public Builder previewType(String previewType) {
                this.previewType = previewType;
                return this;
            }

            /**
             * <p>Document title.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Upload time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 00:00:00</p>
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            /**
             * <p>Document URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://agi.alicdn.com/user/d0o/d3c1f50d-a6c2-49b3-b0c8-3e613c3f20ee_16872_3236784461.png">https://agi.alicdn.com/user/d0o/d3c1f50d-a6c2-49b3-b0c8-3e613c3f20ee_16872_3236784461.png</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
