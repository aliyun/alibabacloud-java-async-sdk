// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUploadInfoResponseBody</p>
 */
public class GetUploadInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessId")
    private String accessId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.NameInMap("Folder")
    private String folder;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetUploadInfoResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.code = builder.code;
        this.expire = builder.expire;
        this.folder = builder.folder;
        this.host = builder.host;
        this.httpStatusCode = builder.httpStatusCode;
        this.key = builder.key;
        this.msg = builder.msg;
        this.name = builder.name;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return folder
     */
    public String getFolder() {
        return this.folder;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessId; 
        private Integer code; 
        private Long expire; 
        private String folder; 
        private String host; 
        private Integer httpStatusCode; 
        private String key; 
        private String msg; 
        private String name; 
        private String policy; 
        private String requestId; 
        private String signature; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetUploadInfoResponseBody model) {
            this.accessId = model.accessId;
            this.code = model.code;
            this.expire = model.expire;
            this.folder = model.folder;
            this.host = model.host;
            this.httpStatusCode = model.httpStatusCode;
            this.key = model.key;
            this.msg = model.msg;
            this.name = model.name;
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.signature = model.signature;
            this.success = model.success;
        } 

        /**
         * <p>Upload authorization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI5t9HM*****EXQmw3DVH</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>Error code, consistent with HTTP status.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>In seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder expire(Long expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>Folder name.</p>
         * 
         * <strong>example:</strong>
         * <p>image/upload/xxx</p>
         */
        public Builder folder(String folder) {
            this.folder = folder;
            return this;
        }

        /**
         * <p>Upload host.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com">https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com</a></p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Key used for uploading files.</p>
         * 
         * <strong>example:</strong>
         * <p>image/upload/xxx</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>Further description of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>Used for front-end image upload.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>OSS upload file Policy.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>ID assigned by the backend to uniquely identify a request. Can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Upload signature information.</p>
         * 
         * <strong>example:</strong>
         * <p>iyu7VHblYj+mEF9p46cdGOlNPAw=</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * <p>Success indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUploadInfoResponseBody build() {
            return new GetUploadInfoResponseBody(this);
        } 

    } 

}
