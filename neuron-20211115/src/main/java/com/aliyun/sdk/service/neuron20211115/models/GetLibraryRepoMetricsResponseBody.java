// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link GetLibraryRepoMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetLibraryRepoMetricsResponseBody</p>
 */
public class GetLibraryRepoMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private LibraryRepoMetricResult result;

    private GetLibraryRepoMetricsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLibraryRepoMetricsResponseBody create() {
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
     * @return result
     */
    public LibraryRepoMetricResult getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private LibraryRepoMetricResult result; 

        private Builder() {
        } 

        private Builder(GetLibraryRepoMetricsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(LibraryRepoMetricResult result) {
            this.result = result;
            return this;
        }

        public GetLibraryRepoMetricsResponseBody build() {
            return new GetLibraryRepoMetricsResponseBody(this);
        } 

    } 

}
