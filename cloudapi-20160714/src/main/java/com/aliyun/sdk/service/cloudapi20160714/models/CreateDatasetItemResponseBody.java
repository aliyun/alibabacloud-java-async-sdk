// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreateDatasetItemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatasetItemResponseBody</p>
 */
public class CreateDatasetItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetItemId")
    private String datasetItemId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDatasetItemResponseBody(Builder builder) {
        this.datasetItemId = builder.datasetItemId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetItemId
     */
    public String getDatasetItemId() {
        return this.datasetItemId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String datasetItemId; 
        private String requestId; 

        /**
         * DatasetItemId.
         */
        public Builder datasetItemId(String datasetItemId) {
            this.datasetItemId = datasetItemId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDatasetItemResponseBody build() {
            return new CreateDatasetItemResponseBody(this);
        } 

    } 

}
