// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupSetDownloadLinkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackupSetDownloadLinkResponseBody</p>
 */
public class CreateBackupSetDownloadLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadTaskId")
    private Long downloadTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBackupSetDownloadLinkResponseBody(Builder builder) {
        this.downloadTaskId = builder.downloadTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupSetDownloadLinkResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadTaskId
     */
    public Long getDownloadTaskId() {
        return this.downloadTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long downloadTaskId; 
        private String requestId; 

        /**
         * DownloadTaskId.
         */
        public Builder downloadTaskId(Long downloadTaskId) {
            this.downloadTaskId = downloadTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBackupSetDownloadLinkResponseBody build() {
            return new CreateBackupSetDownloadLinkResponseBody(this);
        } 

    } 

}
