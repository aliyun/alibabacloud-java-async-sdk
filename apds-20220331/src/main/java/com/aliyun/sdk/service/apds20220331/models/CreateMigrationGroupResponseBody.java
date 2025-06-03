// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link CreateMigrationGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMigrationGroupResponseBody</p>
 */
public class CreateMigrationGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateMigrationGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.error = builder.error;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrationGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Object data; 
        private String error; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateMigrationGroupResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.error = model.error;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * Error.
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateMigrationGroupResponseBody build() {
            return new CreateMigrationGroupResponseBody(this);
        } 

    } 

}
