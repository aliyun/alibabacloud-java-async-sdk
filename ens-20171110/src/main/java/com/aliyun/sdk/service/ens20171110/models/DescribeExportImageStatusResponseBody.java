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
 * {@link DescribeExportImageStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExportImageStatusResponseBody</p>
 */
public class DescribeExportImageStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageExportStatus")
    private String imageExportStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeExportImageStatusResponseBody model) {
            this.imageExportStatus = model.imageExportStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The export status of the image. Valid values:</p>
         * <ul>
         * <li>Exporting</li>
         * <li>Exported</li>
         * <li>ExportError</li>
         * <li>Unexported</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exporting</p>
         */
        public Builder imageExportStatus(String imageExportStatus) {
            this.imageExportStatus = imageExportStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>14BBB3A0-3DBE-54F5-AEC8-01D3F6B1EBE2</p>
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
