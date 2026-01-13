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
 * {@link DownloadMeteringDailyDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadMeteringDailyDetailResponseBody</p>
 */
public class DownloadMeteringDailyDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("downloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DownloadMeteringDailyDetailResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadMeteringDailyDetailResponseBody create() {
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

        private Builder(DownloadMeteringDailyDetailResponseBody model) {
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
         * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DownloadMeteringDailyDetailResponseBody build() {
            return new DownloadMeteringDailyDetailResponseBody(this);
        } 

    } 

}
