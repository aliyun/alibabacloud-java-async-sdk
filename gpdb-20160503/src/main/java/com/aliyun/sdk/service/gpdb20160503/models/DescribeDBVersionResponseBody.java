// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDBVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBVersionResponseBody</p>
 */
public class DescribeDBVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VersionSuggestion")
    private String versionSuggestion;

    private DescribeDBVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.versionSuggestion = builder.versionSuggestion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBVersionResponseBody create() {
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
     * @return versionSuggestion
     */
    public String getVersionSuggestion() {
        return this.versionSuggestion;
    }

    public static final class Builder {
        private String requestId; 
        private String versionSuggestion; 

        private Builder() {
        } 

        private Builder(DescribeDBVersionResponseBody model) {
            this.requestId = model.requestId;
            this.versionSuggestion = model.versionSuggestion;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VersionSuggestion.
         */
        public Builder versionSuggestion(String versionSuggestion) {
            this.versionSuggestion = versionSuggestion;
            return this;
        }

        public DescribeDBVersionResponseBody build() {
            return new DescribeDBVersionResponseBody(this);
        } 

    } 

}
