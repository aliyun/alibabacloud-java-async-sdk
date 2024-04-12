// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatabaseAccountResponseBody</p>
 */
public class CreateDatabaseAccountResponseBody extends TeaModel {
    @NameInMap("DatabaseAccountId")
    private String databaseAccountId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDatabaseAccountResponseBody(Builder builder) {
        this.databaseAccountId = builder.databaseAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseAccountId
     */
    public String getDatabaseAccountId() {
        return this.databaseAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String databaseAccountId; 
        private String requestId; 

        /**
         * DatabaseAccountId.
         */
        public Builder databaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDatabaseAccountResponseBody build() {
            return new CreateDatabaseAccountResponseBody(this);
        } 

    } 

}
