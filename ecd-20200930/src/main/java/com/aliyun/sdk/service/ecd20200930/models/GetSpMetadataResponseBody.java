// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpMetadataResponseBody</p>
 */
public class GetSpMetadataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpMetadata")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SpMetadata.
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
