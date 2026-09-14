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
 * {@link ExecCrossProjectPipelineRunResponseBody} extends {@link TeaModel}
 *
 * <p>ExecCrossProjectPipelineRunResponseBody</p>
 */
public class ExecCrossProjectPipelineRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ExecCrossProjectPipelineRunResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecCrossProjectPipelineRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ExecCrossProjectPipelineRunResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExecCrossProjectPipelineRunResponseBody build() {
            return new ExecCrossProjectPipelineRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecCrossProjectPipelineRunResponseBody} extends {@link TeaModel}
     *
     * <p>ExecCrossProjectPipelineRunResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private Data(Builder builder) {
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private String requestId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.requestId = model.requestId;
            } 

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
