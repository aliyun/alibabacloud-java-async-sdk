// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportMeasurementDataResponseBody} extends {@link TeaModel}
 *
 * <p>ExportMeasurementDataResponseBody</p>
 */
public class ExportMeasurementDataResponseBody extends TeaModel {
    @NameInMap("FilePath")
    private String filePath;

    @NameInMap("RequestId")
    private String requestId;

    private ExportMeasurementDataResponseBody(Builder builder) {
        this.filePath = builder.filePath;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportMeasurementDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String filePath; 
        private String requestId; 

        /**
         * The download path of the exported file.
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportMeasurementDataResponseBody build() {
            return new ExportMeasurementDataResponseBody(this);
        } 

    } 

}
