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
 * {@link CreateJDBCDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJDBCDataSourceResponseBody</p>
 */
public class CreateJDBCDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateJDBCDataSourceResponseBody(Builder builder) {
        this.dataSourceId = builder.dataSourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJDBCDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataSourceId; 
        private String requestId; 

        /**
         * <p>Data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C125605-266F-41CA-8AC5-3A643D4F42C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateJDBCDataSourceResponseBody build() {
            return new CreateJDBCDataSourceResponseBody(this);
        } 

    } 

}
