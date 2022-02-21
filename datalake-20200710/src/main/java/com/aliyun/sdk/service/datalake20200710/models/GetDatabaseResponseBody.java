// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseResponseBody</p>
 */
public class GetDatabaseResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Database")
    private Database database;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDatabaseResponseBody(Builder builder) {
        this.code = builder.code;
        this.database = builder.database;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return database
     */
    public Database getDatabase() {
        return this.database;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Database database; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Response Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Database.
         */
        public Builder database(Database database) {
            this.database = database;
            return this;
        }

        /**
         * Response Message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * API is success or not
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
