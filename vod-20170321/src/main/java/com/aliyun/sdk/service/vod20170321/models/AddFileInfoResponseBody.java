// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFileInfoResponseBody} extends {@link TeaModel}
 *
 * <p>AddFileInfoResponseBody</p>
 */
public class AddFileInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FileId")
    private String fileId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private AddFileInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.fileId = builder.fileId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFileInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
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
        private String fileId; 
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
         * 文件Id
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
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

        public AddFileInfoResponseBody build() {
            return new AddFileInfoResponseBody(this);
        } 

    } 

}
