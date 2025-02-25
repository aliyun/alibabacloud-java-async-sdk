// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportOssResultResponseBody} extends {@link TeaModel}
 *
 * <p>ExportOssResultResponseBody</p>
 */
public class ExportOssResultResponseBody extends TeaModel {
    @NameInMap("FileUrl")
    private String fileUrl;

    @NameInMap("RequestId")
    private String requestId;

    private ExportOssResultResponseBody(Builder builder) {
        this.fileUrl = builder.fileUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportOssResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fileUrl; 
        private String requestId; 

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportOssResultResponseBody build() {
            return new ExportOssResultResponseBody(this);
        } 

    } 

}
