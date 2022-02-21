// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatabaseResponseBody</p>
 */
public class CreateDatabaseResponseBody extends TeaModel {
    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDatabaseResponseBody(Builder builder) {
        this.databaseName = builder.databaseName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String databaseName; 
        private String requestId; 

        /**
         * 数据库名称。
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDatabaseResponseBody build() {
            return new CreateDatabaseResponseBody(this);
        } 

    } 

}
