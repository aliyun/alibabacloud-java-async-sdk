// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetRoleAclOnObjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoleAclOnObjectResponseBody</p>
 */
public class GetRoleAclOnObjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRoleAclOnObjectResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleAclOnObjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The returned data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1366d16686529650188023ef87f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRoleAclOnObjectResponseBody build() {
            return new GetRoleAclOnObjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRoleAclOnObjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleAclOnObjectResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

        private Data(Builder builder) {
            this.actions = builder.actions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public static final class Builder {
            private java.util.List<String> actions; 

            /**
             * <p>The operations that were performed on the object.</p>
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
