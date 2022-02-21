// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportImageStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExportImageStatusResponseBody</p>
 */
public class DescribeExportImageStatusResponseBody extends TeaModel {
    @NameInMap("ImageExportStatus")
    private String imageExportStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeExportImageStatusResponseBody(Builder builder) {
        this.imageExportStatus = builder.imageExportStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExportImageStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageExportStatus
     */
    public String getImageExportStatus() {
        return this.imageExportStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imageExportStatus; 
        private String requestId; 

        /**
         * ImageExportStatus.
         */
        public Builder imageExportStatus(String imageExportStatus) {
            this.imageExportStatus = imageExportStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExportImageStatusResponseBody build() {
            return new DescribeExportImageStatusResponseBody(this);
        } 

    } 

}
