// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link DownloadApiCallDailyDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadApiCallDailyDetailResponseBody</p>
 */
public class DownloadApiCallDailyDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DownloadApiCallDailyDetailResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadApiCallDailyDetailResponseBody create() {
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

        private Builder(DownloadApiCallDailyDetailResponseBody model) {
            this.downloadUrl = model.downloadUrl;
            this.requestId = model.requestId;
        } 

        /**
         * downloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>37A6ED15-DB44-50B5-B0DF-9449EED8FDF4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DownloadApiCallDailyDetailResponseBody build() {
            return new DownloadApiCallDailyDetailResponseBody(this);
        } 

    } 

}
