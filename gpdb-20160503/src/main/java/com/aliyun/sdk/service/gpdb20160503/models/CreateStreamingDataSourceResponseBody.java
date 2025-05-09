// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateStreamingDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStreamingDataSourceResponseBody</p>
 */
public class CreateStreamingDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private Integer dataSourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateStreamingDataSourceResponseBody(Builder builder) {
        this.dataSourceId = builder.dataSourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStreamingDataSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public Integer getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer dataSourceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateStreamingDataSourceResponseBody model) {
            this.dataSourceId = model.dataSourceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataSourceId(Integer dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateStreamingDataSourceResponseBody build() {
            return new CreateStreamingDataSourceResponseBody(this);
        } 

    } 

}
