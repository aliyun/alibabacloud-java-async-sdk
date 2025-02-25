// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDatabaseAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatabaseAccountResponseBody</p>
 */
public class CreateDatabaseAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseAccountId")
    private String databaseAccountId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder databaseAccountId(String databaseAccountId) {
            this.databaseAccountId = databaseAccountId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B07C465D-B09F-54DD-8FEC-90788BEABAFC</p>
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
