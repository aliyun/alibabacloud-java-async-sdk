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
 * {@link ExportBillDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>ExportBillDetailDataResponseBody</p>
 */
public class ExportBillDetailDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportBillDetailDataResponseBody(Builder builder) {
        this.filePath = builder.filePath;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportBillDetailDataResponseBody create() {
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

        private Builder(ExportBillDetailDataResponseBody model) {
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
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA05990-B90D-594F-8C8E-650AEEB94C5D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportBillDetailDataResponseBody build() {
            return new ExportBillDetailDataResponseBody(this);
        } 

    } 

}
