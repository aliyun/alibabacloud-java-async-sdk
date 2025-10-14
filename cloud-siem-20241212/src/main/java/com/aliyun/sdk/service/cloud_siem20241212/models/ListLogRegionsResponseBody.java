// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListLogRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogRegionsResponseBody</p>
 */
public class ListLogRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogRegions")
    private java.util.List<String> logRegions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLogRegionsResponseBody(Builder builder) {
        this.logRegions = builder.logRegions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogRegionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logRegions
     */
    public java.util.List<String> getLogRegions() {
        return this.logRegions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> logRegions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLogRegionsResponseBody model) {
            this.logRegions = model.logRegions;
            this.requestId = model.requestId;
        } 

        /**
         * LogRegions.
         */
        public Builder logRegions(java.util.List<String> logRegions) {
            this.logRegions = logRegions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLogRegionsResponseBody build() {
            return new ListLogRegionsResponseBody(this);
        } 

    } 

}
