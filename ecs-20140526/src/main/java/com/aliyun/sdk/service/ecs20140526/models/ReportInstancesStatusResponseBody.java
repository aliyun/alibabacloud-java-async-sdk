// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ReportInstancesStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ReportInstancesStatusResponseBody</p>
 */
public class ReportInstancesStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReportInstancesStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportInstancesStatusResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ReportInstancesStatusResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReportInstancesStatusResponseBody build() {
            return new ReportInstancesStatusResponseBody(this);
        } 

    } 

}
