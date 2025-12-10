// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetAlgorithmTreeResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlgorithmTreeResponseBody</p>
 */
public class GetAlgorithmTreeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.NameInMap("Tree")
    private java.util.List<java.util.Map<String, ?>> tree;

    private GetAlgorithmTreeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timestamp = builder.timestamp;
        this.tree = builder.tree;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmTreeResponseBody create() {
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
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return tree
     */
    public java.util.List<java.util.Map<String, ?>> getTree() {
        return this.tree;
    }

    public static final class Builder {
        private String requestId; 
        private String timestamp; 
        private java.util.List<java.util.Map<String, ?>> tree; 

        private Builder() {
        } 

        private Builder(GetAlgorithmTreeResponseBody model) {
            this.requestId = model.requestId;
            this.timestamp = model.timestamp;
            this.tree = model.tree;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Tree.
         */
        public Builder tree(java.util.List<java.util.Map<String, ?>> tree) {
            this.tree = tree;
            return this;
        }

        public GetAlgorithmTreeResponseBody build() {
            return new GetAlgorithmTreeResponseBody(this);
        } 

    } 

}
