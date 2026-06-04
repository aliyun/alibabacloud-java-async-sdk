// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link BatchDeleteMetaEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeleteMetaEntitiesResponseBody</p>
 */
public class BatchDeleteMetaEntitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<MetaEntityWriteResult> results;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchDeleteMetaEntitiesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteMetaEntitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<MetaEntityWriteResult> getResults() {
        return this.results;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<MetaEntityWriteResult> results; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchDeleteMetaEntitiesResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
            this.success = model.success;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1FC02D76-4A94-5D97-B52C-00A031B95359</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List<MetaEntityWriteResult> results) {
            this.results = results;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchDeleteMetaEntitiesResponseBody build() {
            return new BatchDeleteMetaEntitiesResponseBody(this);
        } 

    } 

}
