// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteAppPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAppPolicyResponseBody</p>
 */
public class DeleteAppPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistPolicyNames")
    private java.util.List<String> nonExistPolicyNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAppPolicyResponseBody(Builder builder) {
        this.nonExistPolicyNames = builder.nonExistPolicyNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nonExistPolicyNames
     */
    public java.util.List<String> getNonExistPolicyNames() {
        return this.nonExistPolicyNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> nonExistPolicyNames; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteAppPolicyResponseBody model) {
            this.nonExistPolicyNames = model.nonExistPolicyNames;
            this.requestId = model.requestId;
        } 

        /**
         * NonExistPolicyNames.
         */
        public Builder nonExistPolicyNames(java.util.List<String> nonExistPolicyNames) {
            this.nonExistPolicyNames = nonExistPolicyNames;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAppPolicyResponseBody build() {
            return new DeleteAppPolicyResponseBody(this);
        } 

    } 

}
