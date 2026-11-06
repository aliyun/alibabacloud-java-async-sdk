// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateDataIngestionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataIngestionResponseBody</p>
 */
public class CreateDataIngestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataIngestionId")
    private String dataIngestionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataIngestionResponseBody(Builder builder) {
        this.dataIngestionId = builder.dataIngestionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataIngestionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataIngestionId
     */
    public String getDataIngestionId() {
        return this.dataIngestionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataIngestionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDataIngestionResponseBody model) {
            this.dataIngestionId = model.dataIngestionId;
            this.requestId = model.requestId;
        } 

        /**
         * DataIngestionId.
         */
        public Builder dataIngestionId(String dataIngestionId) {
            this.dataIngestionId = dataIngestionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataIngestionResponseBody build() {
            return new CreateDataIngestionResponseBody(this);
        } 

    } 

}
