// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDataSourceResponseBody</p>
 */
public class DeleteDataSourceResponseBody extends TeaModel {
    @NameInMap("DataSourceId")
    private String dataSourceId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteDataSourceResponseBody(Builder builder) {
        this.dataSourceId = builder.dataSourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataSourceResponseBody create() {
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
         * 数据源Id
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteDataSourceResponseBody build() {
            return new DeleteDataSourceResponseBody(this);
        } 

    } 

}
