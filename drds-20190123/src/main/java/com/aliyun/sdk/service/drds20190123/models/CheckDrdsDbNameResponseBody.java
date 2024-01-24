// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDrdsDbNameResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDrdsDbNameResponseBody</p>
 */
public class CheckDrdsDbNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    @NameInMap("Success")
    private Boolean success;

    private CheckDrdsDbNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDrdsDbNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the DRDS database name is valid. Valid values: true: The database name is valid. false: the database name is invalid.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        /**
         * Indicates whether the call is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckDrdsDbNameResponseBody build() {
            return new CheckDrdsDbNameResponseBody(this);
        } 

    } 

}
