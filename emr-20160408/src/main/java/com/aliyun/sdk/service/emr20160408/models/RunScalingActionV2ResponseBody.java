// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunScalingActionV2ResponseBody} extends {@link TeaModel}
 *
 * <p>RunScalingActionV2ResponseBody</p>
 */
public class RunScalingActionV2ResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
    private String requestId;

    private RunScalingActionV2ResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunScalingActionV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunScalingActionV2ResponseBody build() {
            return new RunScalingActionV2ResponseBody(this);
        } 

    } 

}
