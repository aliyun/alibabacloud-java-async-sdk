// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpMetadataResponseBody</p>
 */
public class GetSpMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpMetadata")
    private String spMetadata;

    private GetSpMetadataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spMetadata = builder.spMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpMetadataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spMetadata
     */
    public String getSpMetadata() {
        return this.spMetadata;
    }

    public static final class Builder {
        private String requestId; 
        private String spMetadata; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The metadata of the SP.
         */
        public Builder spMetadata(String spMetadata) {
            this.spMetadata = spMetadata;
            return this;
        }

        public GetSpMetadataResponseBody build() {
            return new GetSpMetadataResponseBody(this);
        } 

    } 

}
