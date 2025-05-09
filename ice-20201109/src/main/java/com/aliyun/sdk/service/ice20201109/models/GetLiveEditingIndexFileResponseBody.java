// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetLiveEditingIndexFileResponseBody model) {
            this.indexFile = model.indexFile;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The URL of the index file.</p>
         */
        public Builder indexFile(String indexFile) {
            this.indexFile = indexFile;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
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
