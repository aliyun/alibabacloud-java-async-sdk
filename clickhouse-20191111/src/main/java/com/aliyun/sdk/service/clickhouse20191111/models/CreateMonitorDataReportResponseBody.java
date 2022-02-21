// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorDataReportResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMonitorDataReportResponseBody</p>
 */
public class CreateMonitorDataReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateMonitorDataReportResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorDataReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMonitorDataReportResponseBody build() {
            return new CreateMonitorDataReportResponseBody(this);
        } 

    } 

}
