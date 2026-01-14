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
 * {@link ApplyTempStorageLeaseResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyTempStorageLeaseResponseBody</p>
 */
public class ApplyTempStorageLeaseResponseBody extends TeaModel {
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

    private ApplyTempStorageLeaseResponseBody(Builder builder) {
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

    public static ApplyTempStorageLeaseResponseBody create() {
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

        private Builder(ApplyTempStorageLeaseResponseBody model) {
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
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ApplyTempStorageLeaseResponseBody build() {
            return new ApplyTempStorageLeaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyTempStorageLeaseResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyTempStorageLeaseResponseBody</p>
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
             * <p>K-V fields to be included in the Header; both Key and Value are strings.</p>
             * 
             * <strong>example:</strong>
             * <p>Content-Type: application/json</p>
             */
            public Builder headers(Object headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>HTTP method for the call. Valid values: PUT POST</p>
             * 
             * <strong>example:</strong>
             * <p>PUT</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>Authorized URL for the file upload.</p>
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
     * {@link ApplyTempStorageLeaseResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyTempStorageLeaseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Param")
        private Param param;

        @com.aliyun.core.annotation.NameInMap("TempStorageLeaseId")
        private String tempStorageLeaseId;

        private Data(Builder builder) {
            this.param = builder.param;
            this.tempStorageLeaseId = builder.tempStorageLeaseId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return param
         */
        public Param getParam() {
            return this.param;
        }

        /**
         * @return tempStorageLeaseId
         */
        public String getTempStorageLeaseId() {
            return this.tempStorageLeaseId;
        }

        public static final class Builder {
            private Param param; 
            private String tempStorageLeaseId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.param = model.param;
                this.tempStorageLeaseId = model.tempStorageLeaseId;
            } 

            /**
             * <p>HTTP parameters used for uploading the file.</p>
             */
            public Builder param(Param param) {
                this.param = param;
                return this;
            }

            /**
             * <p>Unique lease ID. This parameter is required when retrieving the uploaded file within the application later.</p>
             * 
             * <strong>example:</strong>
             * <p>1e6a159107384782be5e45ac4759b247.1719325231035</p>
             */
            public Builder tempStorageLeaseId(String tempStorageLeaseId) {
                this.tempStorageLeaseId = tempStorageLeaseId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
