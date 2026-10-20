// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link RunClusterCheckResponseBody} extends {@link TeaModel}
 *
 * <p>RunClusterCheckResponseBody</p>
 */
public class RunClusterCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("check_id")
    private String checkId;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    private RunClusterCheckResponseBody(Builder builder) {
        this.checkId = builder.checkId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunClusterCheckResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String checkId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunClusterCheckResponseBody model) {
            this.checkId = model.checkId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The check ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1697100584236******-ce0da5a1d627e4e9e9f96cae8ad******-clustercheck-lboto</p>
         */
        public Builder checkId(String checkId) {
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F04DF81D-5C12-1524-B36A-86E025******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunClusterCheckResponseBody build() {
            return new RunClusterCheckResponseBody(this);
        } 

    } 

}
