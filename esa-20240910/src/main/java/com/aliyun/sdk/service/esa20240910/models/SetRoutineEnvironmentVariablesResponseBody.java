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
 * {@link SetRoutineEnvironmentVariablesResponseBody} extends {@link TeaModel}
 *
 * <p>SetRoutineEnvironmentVariablesResponseBody</p>
 */
public class SetRoutineEnvironmentVariablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SetKeys")
    private java.util.List<String> setKeys;

    private SetRoutineEnvironmentVariablesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.setKeys = builder.setKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRoutineEnvironmentVariablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setKeys
     */
    public java.util.List<String> getSetKeys() {
        return this.setKeys;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> setKeys; 

        private Builder() {
        } 

        private Builder(SetRoutineEnvironmentVariablesResponseBody model) {
            this.requestId = model.requestId;
            this.setKeys = model.setKeys;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SetKeys.
         */
        public Builder setKeys(java.util.List<String> setKeys) {
            this.setKeys = setKeys;
            return this;
        }

        public SetRoutineEnvironmentVariablesResponseBody build() {
            return new SetRoutineEnvironmentVariablesResponseBody(this);
        } 

    } 

}
