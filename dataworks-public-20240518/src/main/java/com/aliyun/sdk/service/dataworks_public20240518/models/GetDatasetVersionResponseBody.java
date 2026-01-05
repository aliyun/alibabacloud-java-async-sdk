// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDatasetVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetVersionResponseBody</p>
 */
public class GetDatasetVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    private DatasetVersion datasetVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDatasetVersionResponseBody(Builder builder) {
        this.datasetVersion = builder.datasetVersion;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DatasetVersion datasetVersion; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDatasetVersionResponseBody model) {
            this.datasetVersion = model.datasetVersion;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The dataset version.</p>
         */
        public Builder datasetVersion(DatasetVersion datasetVersion) {
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4CDF7B72-020B-542A-8465-21CFFA8XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDatasetVersionResponseBody build() {
            return new GetDatasetVersionResponseBody(this);
        } 

    } 

}
