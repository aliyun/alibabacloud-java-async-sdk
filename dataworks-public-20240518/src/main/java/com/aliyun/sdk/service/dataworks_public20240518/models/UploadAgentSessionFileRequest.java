// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UploadAgentSessionFileRequest} extends {@link RequestModel}
 *
 * <p>UploadAgentSessionFileRequest</p>
 */
public class UploadAgentSessionFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Jsonrpc")
    private String jsonrpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    @com.aliyun.core.annotation.Validation(required = true)
    private Params params;

    private UploadAgentSessionFileRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.jsonrpc = builder.jsonrpc;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadAgentSessionFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jsonrpc
     */
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<UploadAgentSessionFileRequest, Builder> {
        private String id; 
        private String jsonrpc; 
        private Params params; 

        private Builder() {
            super();
        } 

        private Builder(UploadAgentSessionFileRequest request) {
            super(request);
            this.id = request.id;
            this.jsonrpc = request.jsonrpc;
            this.params = request.params;
        } 

        /**
         * <p>The JSON-RPC correlation identifier for the current request. The Id in the response returns this value as is to correlate the request and response.</p>
         * 
         * <strong>example:</strong>
         * <p>attachment-rpc-001</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The JSON-RPC protocol version. The example uses 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder jsonrpc(String jsonrpc) {
            this.putBodyParameter("Jsonrpc", jsonrpc);
            this.jsonrpc = jsonrpc;
            return this;
        }

        /**
         * <p>The parameter object for the upload stage. The prepare step issues the upload URL, and the complete step confirms that the file has been written to the target session instance.</p>
         * <p>This parameter is required.</p>
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public UploadAgentSessionFileRequest build() {
            return new UploadAgentSessionFileRequest(this);
        } 

    } 

    /**
     * 
     * {@link UploadAgentSessionFileRequest} extends {@link TeaModel}
     *
     * <p>UploadAgentSessionFileRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentMd5")
        @com.aliyun.core.annotation.Validation(required = true)
        private String contentMd5;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Size")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 10485760, minimum = 1)
        private Long size;

        @com.aliyun.core.annotation.NameInMap("UploadId")
        private String uploadId;

        @com.aliyun.core.annotation.NameInMap("UploadMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String uploadMode;

        private Params(Builder builder) {
            this.contentMd5 = builder.contentMd5;
            this.name = builder.name;
            this.sessionId = builder.sessionId;
            this.size = builder.size;
            this.uploadId = builder.uploadId;
            this.uploadMode = builder.uploadMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return contentMd5
         */
        public String getContentMd5() {
            return this.contentMd5;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return uploadId
         */
        public String getUploadId() {
            return this.uploadId;
        }

        /**
         * @return uploadMode
         */
        public String getUploadMode() {
            return this.uploadMode;
        }

        public static final class Builder {
            private String contentMd5; 
            private String name; 
            private String sessionId; 
            private Long size; 
            private String uploadId; 
            private String uploadMode; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.contentMd5 = model.contentMd5;
                this.name = model.name;
                this.sessionId = model.sessionId;
                this.size = model.size;
                this.uploadId = model.uploadId;
                this.uploadMode = model.uploadMode;
            } 

            /**
             * <p>The MD5 hash of the original bytes in 32-character lowercase hexadecimal format. This parameter is required for both prepare and complete, and the values must be consistent.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>b1946ac92492d2347c6235b4d2611184</p>
             */
            public Builder contentMd5(String contentMd5) {
                this.contentMd5 = contentMd5;
                return this;
            }

            /**
             * <p>The original file name. The maximum length is 255 bytes in UTF-8 encoding.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sample.csv</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the target agent session.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>session</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The number of original bytes. Valid values: 1 to 10485760 (10 MiB). This parameter is required for both prepare and complete, and the values must be consistent.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The upload identifier returned by prepare. This parameter is required when UploadMode is set to complete.</p>
             * 
             * <strong>example:</strong>
             * <p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>
             */
            public Builder uploadId(String uploadId) {
                this.uploadId = uploadId;
                return this;
            }

            /**
             * <p>The required upload stage. The prepare step issues a public OSS PUT URL without starting a cold session instance. The complete step resumes the session and allows the runtime to download the file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>prepare</p>
             */
            public Builder uploadMode(String uploadMode) {
                this.uploadMode = uploadMode;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
