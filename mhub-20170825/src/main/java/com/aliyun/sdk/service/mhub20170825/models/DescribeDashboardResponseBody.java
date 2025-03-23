// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mhub20170825.models;

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
 * {@link DescribeDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDashboardResponseBody</p>
 */
public class DescribeDashboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDashboardResponseBody(Builder builder) {
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDashboardResponseBody create() {
        return builder().build();
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String model; 
        private String requestId; 

        /**
         * Model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDashboardResponseBody build() {
            return new DescribeDashboardResponseBody(this);
        } 

    } 

}
