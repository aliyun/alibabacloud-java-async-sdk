// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link UploadFileResponseBody} extends {@link TeaModel}
 *
 * <p>UploadFileResponseBody</p>
 */
public class UploadFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileId")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UploadFileResponseBody(Builder builder) {
        this.fileId = builder.fileId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFileResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String fileId; 
        private String requestId; 

        /**
         * FileId.
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

        public UploadFileResponseBody build() {
            return new UploadFileResponseBody(this);
        } 

    } 

}
