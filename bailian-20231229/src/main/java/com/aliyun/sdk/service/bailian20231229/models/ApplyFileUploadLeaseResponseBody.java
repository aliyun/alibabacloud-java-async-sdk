// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link ApplyFileUploadLeaseResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyFileUploadLeaseResponseBody</p>
 */
public class ApplyFileUploadLeaseResponseBody extends TeaModel {
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

    private ApplyFileUploadLeaseResponseBody(Builder builder) {
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

    public static ApplyFileUploadLeaseResponseBody create() {
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

        private Builder() {
        } 

        private Builder(ApplyFileUploadLeaseResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>DataCenter.FileTooLarge</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data fields.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>User not authorized to operate on the specified resource</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>778C0B3B-xxxx-5FC1-A947-36EDD13606AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indications whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ApplyFileUploadLeaseResponseBody build() {
            return new ApplyFileUploadLeaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyFileUploadLeaseResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyFileUploadLeaseResponseBody</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Headers")
        private Object headers;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Param(Builder builder) {
            this.headers = builder.headers;
            this.method = builder.method;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public Object getHeaders() {
            return this.headers;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Object headers; 
            private String method; 
            private String url; 

            private Builder() {
            } 

            private Builder(Param model) {
                this.headers = model.headers;
                this.method = model.method;
                this.url = model.url;
            } 

            /**
             * <p>The key-value pair to be placed in the Header. Both the key and the value are strings.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;X-bailian-extra&quot;: &quot;MTAwNTQyNjQ5NTE2OTE3OA==&quot;,
             *         &quot;Content-Type&quot;: &quot;application/pdf&quot;</p>
             */
            public Builder headers(Object headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The HTTP call method. Valid values:</p>
             * <ul>
             * <li>PUT</li>
             * <li>POST</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUT</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The upload URL of the document.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://bailian-datahub-data-origin-prod.oss-cn-hangzhou.aliyuncs.com/1005426495169178/10024405/68abd1dea7b6404d8f7d7b9f7fbd332d.1716698936847.pdf?Expires=1716699536&OSSAccessKeyId=TestID&Signature=HfwPUZo4pR6DatSDym0zFKVh9Wg%3D">https://bailian-datahub-data-origin-prod.oss-cn-hangzhou.aliyuncs.com/1005426495169178/10024405/68abd1dea7b6404d8f7d7b9f7fbd332d.1716698936847.pdf?Expires=1716699536&amp;OSSAccessKeyId=TestID&amp;Signature=HfwPUZo4pR6DatSDym0zFKVh9Wg%3D</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyFileUploadLeaseResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyFileUploadLeaseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUploadLeaseId")
        private String fileUploadLeaseId;

        @com.aliyun.core.annotation.NameInMap("Param")
        private Param param;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.fileUploadLeaseId = builder.fileUploadLeaseId;
            this.param = builder.param;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileUploadLeaseId
         */
        public String getFileUploadLeaseId() {
            return this.fileUploadLeaseId;
        }

        /**
         * @return param
         */
        public Param getParam() {
            return this.param;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String fileUploadLeaseId; 
            private Param param; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileUploadLeaseId = model.fileUploadLeaseId;
                this.param = model.param;
                this.type = model.type;
            } 

            /**
             * <p>The unique ID of the lease.</p>
             * 
             * <strong>example:</strong>
             * <p>1e6a159107384782be5e45ac4759b247.1719325231035</p>
             */
            public Builder fileUploadLeaseId(String fileUploadLeaseId) {
                this.fileUploadLeaseId = fileUploadLeaseId;
                return this;
            }

            /**
             * <p>The HTTP request parameters used to upload the document.</p>
             */
            public Builder param(Param param) {
                this.param = param;
                return this;
            }

            /**
             * <p>The upload method of the document. Valid values:</p>
             * <ul>
             * <li>OSS.PreSignedURL</li>
             * <li>HTTP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
