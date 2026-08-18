// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DeleteRoutineEnvironmentVariablesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRoutineEnvironmentVariablesResponseBody</p>
 */
public class DeleteRoutineEnvironmentVariablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeletedKeys")
    private java.util.List<String> deletedKeys;

    @com.aliyun.core.annotation.NameInMap("FailedKeys")
    private java.util.List<String> failedKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteRoutineEnvironmentVariablesResponseBody(Builder builder) {
        this.deletedKeys = builder.deletedKeys;
        this.failedKeys = builder.failedKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoutineEnvironmentVariablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletedKeys
     */
    public java.util.List<String> getDeletedKeys() {
        return this.deletedKeys;
    }

    /**
     * @return failedKeys
     */
    public java.util.List<String> getFailedKeys() {
        return this.failedKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> deletedKeys; 
        private java.util.List<String> failedKeys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteRoutineEnvironmentVariablesResponseBody model) {
            this.deletedKeys = model.deletedKeys;
            this.failedKeys = model.failedKeys;
            this.requestId = model.requestId;
        } 

        /**
         * DeletedKeys.
         */
        public Builder deletedKeys(java.util.List<String> deletedKeys) {
            this.deletedKeys = deletedKeys;
            return this;
        }

        /**
         * FailedKeys.
         */
        public Builder failedKeys(java.util.List<String> failedKeys) {
            this.failedKeys = failedKeys;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteRoutineEnvironmentVariablesResponseBody build() {
            return new DeleteRoutineEnvironmentVariablesResponseBody(this);
        } 

    } 

}
