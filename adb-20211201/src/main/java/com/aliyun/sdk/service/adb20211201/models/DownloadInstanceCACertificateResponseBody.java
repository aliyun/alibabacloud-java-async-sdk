// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DownloadInstanceCACertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadInstanceCACertificateResponseBody</p>
 */
public class DownloadInstanceCACertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DownloadInstanceCACertificateResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadInstanceCACertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String downloadUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DownloadInstanceCACertificateResponseBody model) {
            this.downloadUrl = model.downloadUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The OSS URL of the downloaded certificate.</p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9CCFAAB4-97B7-5800-B9F2-685EB596E3EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DownloadInstanceCACertificateResponseBody build() {
            return new DownloadInstanceCACertificateResponseBody(this);
        } 

    } 

}
