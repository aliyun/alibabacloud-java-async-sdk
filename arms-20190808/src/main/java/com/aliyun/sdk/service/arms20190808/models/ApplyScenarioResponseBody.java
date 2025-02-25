// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ApplyScenarioResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyScenarioResponseBody</p>
 */
public class ApplyScenarioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    private ApplyScenarioResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyScenarioResponseBody create() {
        return builder().build();
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
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EA24D522-AD35-47B8-8CB2-ADBC38******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The code of the business monitoring job, which is the coloring sign.</p>
         * 
         * <strong>example:</strong>
         * <p>2b97****</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public ApplyScenarioResponseBody build() {
            return new ApplyScenarioResponseBody(this);
        } 

    } 

}
