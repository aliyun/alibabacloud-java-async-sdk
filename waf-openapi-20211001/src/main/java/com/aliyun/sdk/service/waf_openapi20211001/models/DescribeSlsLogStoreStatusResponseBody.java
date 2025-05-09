// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeSlsLogStoreStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsLogStoreStatusResponseBody</p>
 */
public class DescribeSlsLogStoreStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExistStatus")
    private Boolean existStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSlsLogStoreStatusResponseBody(Builder builder) {
        this.existStatus = builder.existStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsLogStoreStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return existStatus
     */
    public Boolean getExistStatus() {
        return this.existStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean existStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSlsLogStoreStatusResponseBody model) {
            this.existStatus = model.existStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether a Logstore is created for WAF. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder existStatus(Boolean existStatus) {
            this.existStatus = existStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>184F538F-C115-5C89-A4EF-C79CD2E29AC7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSlsLogStoreStatusResponseBody build() {
            return new DescribeSlsLogStoreStatusResponseBody(this);
        } 

    } 

}
