// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseResponseBody</p>
 */
public class GetDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Database")
    private Database database;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDatabaseResponseBody(Builder builder) {
        this.database = builder.database;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return database
     */
    public Database getDatabase() {
        return this.database;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Database database; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDatabaseResponseBody model) {
            this.database = model.database;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Database.
         */
        public Builder database(Database database) {
            this.database = database;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDatabaseResponseBody build() {
            return new GetDatabaseResponseBody(this);
        } 

    } 

}
