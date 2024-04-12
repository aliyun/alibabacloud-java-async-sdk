// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
    @NameInMap("DatabaseId")
    private String databaseId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDatabaseResponseBody(Builder builder) {
        this.databaseId = builder.databaseId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String databaseId; 
        private String requestId; 

        /**
         * DatabaseId.
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * RequestId.
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
