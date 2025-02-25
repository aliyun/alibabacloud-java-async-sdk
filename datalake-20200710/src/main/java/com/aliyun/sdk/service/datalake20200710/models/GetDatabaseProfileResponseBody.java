// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatabaseProfileResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseProfileResponseBody</p>
 */
public class GetDatabaseProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DatabaseProfile")
    private DatabaseProfile databaseProfile;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDatabaseProfileResponseBody(Builder builder) {
        this.code = builder.code;
        this.databaseProfile = builder.databaseProfile;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseProfileResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return databaseProfile
     */
    public DatabaseProfile getDatabaseProfile() {
        return this.databaseProfile;
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
        private DatabaseProfile databaseProfile; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DatabaseProfile.
         */
        public Builder databaseProfile(DatabaseProfile databaseProfile) {
            this.databaseProfile = databaseProfile;
            return this;
        }

        /**
         * Message
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
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDatabaseProfileResponseBody build() {
            return new GetDatabaseProfileResponseBody(this);
        } 

    } 

}
