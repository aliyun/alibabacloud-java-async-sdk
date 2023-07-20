// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportBillDetailDataResponseBody} extends {@link TeaModel}
 *
 * <p>ExportBillDetailDataResponseBody</p>
 */
public class ExportBillDetailDataResponseBody extends TeaModel {
    @NameInMap("FilePath")
    private String filePath;

    @NameInMap("RequestId")
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
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
         * RequestId.
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
