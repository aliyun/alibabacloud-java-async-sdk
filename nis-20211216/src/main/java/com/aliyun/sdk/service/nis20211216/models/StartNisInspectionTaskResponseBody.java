// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartNisInspectionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>StartNisInspectionTaskResponseBody</p>
 */
public class StartNisInspectionTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InspectionReportId")
    private String inspectionReportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartNisInspectionTaskResponseBody(Builder builder) {
        this.inspectionReportId = builder.inspectionReportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartNisInspectionTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return inspectionReportId
     */
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String inspectionReportId; 
        private String requestId; 

        /**
         * InspectionReportId.
         */
        public Builder inspectionReportId(String inspectionReportId) {
            this.inspectionReportId = inspectionReportId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartNisInspectionTaskResponseBody build() {
            return new StartNisInspectionTaskResponseBody(this);
        } 

    } 

}
