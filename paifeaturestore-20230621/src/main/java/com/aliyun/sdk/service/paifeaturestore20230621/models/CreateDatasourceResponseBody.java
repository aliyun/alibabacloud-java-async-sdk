// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link CreateDatasourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatasourceResponseBody</p>
 */
public class CreateDatasourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    private String datasourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDatasourceResponseBody(Builder builder) {
        this.datasourceId = builder.datasourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasourceId
     */
    public String getDatasourceId() {
        return this.datasourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String datasourceId; 
        private String requestId; 

        /**
         * DatasourceId.
         */
        public Builder datasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDatasourceResponseBody build() {
            return new CreateDatasourceResponseBody(this);
        } 

    } 

}
