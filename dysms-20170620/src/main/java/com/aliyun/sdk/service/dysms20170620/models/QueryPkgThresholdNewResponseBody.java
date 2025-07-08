// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryPkgThresholdNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPkgThresholdNewResponseBody</p>
 */
public class QueryPkgThresholdNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PackageWarningLimit")
    private Long packageWarningLimit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryPkgThresholdNewResponseBody(Builder builder) {
        this.packageWarningLimit = builder.packageWarningLimit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPkgThresholdNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return packageWarningLimit
     */
    public Long getPackageWarningLimit() {
        return this.packageWarningLimit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long packageWarningLimit; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryPkgThresholdNewResponseBody model) {
            this.packageWarningLimit = model.packageWarningLimit;
            this.requestId = model.requestId;
        } 

        /**
         * PackageWarningLimit.
         */
        public Builder packageWarningLimit(Long packageWarningLimit) {
            this.packageWarningLimit = packageWarningLimit;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPkgThresholdNewResponseBody build() {
            return new QueryPkgThresholdNewResponseBody(this);
        } 

    } 

}
