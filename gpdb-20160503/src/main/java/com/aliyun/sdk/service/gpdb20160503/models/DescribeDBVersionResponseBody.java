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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25C11EE5-B7E8-481A-A07C-BD619971A570</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The recommended upgrade version in the format of &quot;major version,minor version&quot; (separated by a comma). The first value is the target version for major engine version upgrade, and the second value is the target version for minor engine version update.</p>
         * 
         * <strong>example:</strong>
         * <p>mm.v7.4.2.7-202608031659,mm.v7.3.2.12-202608071438</p>
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
