// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveEditingIndexFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveEditingIndexFileResponseBody</p>
 */
public class GetLiveEditingIndexFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IndexFile")
    private String indexFile;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLiveEditingIndexFileResponseBody(Builder builder) {
        this.indexFile = builder.indexFile;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveEditingIndexFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return indexFile
     */
    public String getIndexFile() {
        return this.indexFile;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String indexFile; 
        private String requestId; 

        /**
         * IndexFile.
         */
        public Builder indexFile(String indexFile) {
            this.indexFile = indexFile;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLiveEditingIndexFileResponseBody build() {
            return new GetLiveEditingIndexFileResponseBody(this);
        } 

    } 

}
