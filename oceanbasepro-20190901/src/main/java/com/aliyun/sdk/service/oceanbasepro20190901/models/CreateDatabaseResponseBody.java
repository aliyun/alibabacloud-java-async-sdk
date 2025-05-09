// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link CreateDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDatabaseResponseBody</p>
 */
public class CreateDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDatabaseResponseBody model) {
            this.databaseName = model.databaseName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>CreateDatabase</p>
         * 
         * <strong>example:</strong>
         * <p>sms_pre</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
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
