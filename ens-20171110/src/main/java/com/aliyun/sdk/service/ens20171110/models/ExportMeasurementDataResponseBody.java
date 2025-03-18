// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ExportMeasurementDataResponseBody} extends {@link TeaModel}
 *
 * <p>ExportMeasurementDataResponseBody</p>
 */
public class ExportMeasurementDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ExportMeasurementDataResponseBody model) {
            this.filePath = model.filePath;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The download path of the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test-oss.com/image_01.jpeg">http://test-oss.com/image_01.jpeg</a></p>
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
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
