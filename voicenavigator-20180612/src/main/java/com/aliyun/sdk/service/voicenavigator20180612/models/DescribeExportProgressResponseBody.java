// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExportProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExportProgressResponseBody</p>
 */
public class DescribeExportProgressResponseBody extends TeaModel {
    @NameInMap("FileHttpUrl")
    private String fileHttpUrl;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeExportProgressResponseBody(Builder builder) {
        this.fileHttpUrl = builder.fileHttpUrl;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExportProgressResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileHttpUrl
     */
    public String getFileHttpUrl() {
        return this.fileHttpUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String fileHttpUrl; 
        private String requestId; 
        private String status; 

        /**
         * FileHttpUrl.
         */
        public Builder fileHttpUrl(String fileHttpUrl) {
            this.fileHttpUrl = fileHttpUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeExportProgressResponseBody build() {
            return new DescribeExportProgressResponseBody(this);
        } 

    } 

}
