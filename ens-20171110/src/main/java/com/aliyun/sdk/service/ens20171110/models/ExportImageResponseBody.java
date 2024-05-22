// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportImageResponseBody} extends {@link TeaModel}
 *
 * <p>ExportImageResponseBody</p>
 */
public class ExportImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportedImageURL")
    private String exportedImageURL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportImageResponseBody(Builder builder) {
        this.exportedImageURL = builder.exportedImageURL;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return exportedImageURL
     */
    public String getExportedImageURL() {
        return this.exportedImageURL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String exportedImageURL; 
        private String requestId; 

        /**
         * The URL that points to the exported image.
         */
        public Builder exportedImageURL(String exportedImageURL) {
            this.exportedImageURL = exportedImageURL;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportImageResponseBody build() {
            return new ExportImageResponseBody(this);
        } 

    } 

}
