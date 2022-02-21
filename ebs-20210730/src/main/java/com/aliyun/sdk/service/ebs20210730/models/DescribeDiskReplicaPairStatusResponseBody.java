// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaPairStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaPairStatusResponseBody</p>
 */
public class DescribeDiskReplicaPairStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private java.util.List < String > data;

    private DescribeDiskReplicaPairStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaPairStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public java.util.List < String > getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < String > data) {
            this.data = data;
            return this;
        }

        public DescribeDiskReplicaPairStatusResponseBody build() {
            return new DescribeDiskReplicaPairStatusResponseBody(this);
        } 

    } 

}
