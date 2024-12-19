// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The metadata of the SP.</p>
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
