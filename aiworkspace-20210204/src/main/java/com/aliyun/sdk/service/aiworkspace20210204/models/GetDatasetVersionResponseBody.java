// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDatasetVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetVersionResponseBody</p>
 */
public class GetDatasetVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private DatasetVersion datasetVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDatasetVersionResponseBody(Builder builder) {
        this.datasetVersion = builder.datasetVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetVersion
     */
    public DatasetVersion getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DatasetVersion datasetVersion; 
        private String requestId; 

        /**
         * DatasetVersion.
         */
        public Builder datasetVersion(DatasetVersion datasetVersion) {
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDatasetVersionResponseBody build() {
            return new GetDatasetVersionResponseBody(this);
        } 

    } 

}
