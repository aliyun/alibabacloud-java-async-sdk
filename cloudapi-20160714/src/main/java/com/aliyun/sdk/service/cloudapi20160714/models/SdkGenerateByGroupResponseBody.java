// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link SdkGenerateByGroupResponseBody} extends {@link TeaModel}
 *
 * <p>SdkGenerateByGroupResponseBody</p>
 */
public class SdkGenerateByGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadLink")
    private String downloadLink;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SdkGenerateByGroupResponseBody(Builder builder) {
        this.downloadLink = builder.downloadLink;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdkGenerateByGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadLink
     */
    public String getDownloadLink() {
        return this.downloadLink;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String downloadLink; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SdkGenerateByGroupResponseBody model) {
            this.downloadLink = model.downloadLink;
            this.requestId = model.requestId;
        } 

        /**
         * DownloadLink.
         */
        public Builder downloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SdkGenerateByGroupResponseBody build() {
            return new SdkGenerateByGroupResponseBody(this);
        } 

    } 

}
