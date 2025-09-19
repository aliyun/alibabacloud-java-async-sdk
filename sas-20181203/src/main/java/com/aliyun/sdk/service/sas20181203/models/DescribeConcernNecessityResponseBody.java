// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeConcernNecessityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConcernNecessityResponseBody</p>
 */
public class DescribeConcernNecessityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConcernNecessity")
    private java.util.List<String> concernNecessity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeConcernNecessityResponseBody(Builder builder) {
        this.concernNecessity = builder.concernNecessity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConcernNecessityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concernNecessity
     */
    public java.util.List<String> getConcernNecessity() {
        return this.concernNecessity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> concernNecessity; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeConcernNecessityResponseBody model) {
            this.concernNecessity = model.concernNecessity;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The priorities to fix the vulnerabilities. Valid values:</p>
         * <ul>
         * <li>asap: high</li>
         * <li>later: medium</li>
         * <li>nntf: low</li>
         * </ul>
         */
        public Builder concernNecessity(java.util.List<String> concernNecessity) {
            this.concernNecessity = concernNecessity;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>ECC6B3E3-D496-512D-B46D-E6996A6B63EE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConcernNecessityResponseBody build() {
            return new DescribeConcernNecessityResponseBody(this);
        } 

    } 

}
