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
 * {@link GetAgentlessTaskCountBatchResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentlessTaskCountBatchResponseBody</p>
 */
public class GetAgentlessTaskCountBatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map<String, DataValue> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAgentlessTaskCountBatchResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentlessTaskCountBatchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.Map<String, DataValue> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, DataValue> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAgentlessTaskCountBatchResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The statistics grouped by resource UUID. The key of the map is the resource UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;:{&quot;RiskMachine&quot;:1,&quot;ScanMachine&quot;:1}}</p>
         */
        public Builder data(java.util.Map<String, DataValue> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentlessTaskCountBatchResponseBody build() {
            return new GetAgentlessTaskCountBatchResponseBody(this);
        } 

    } 

}
