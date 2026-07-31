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
 * {@link GetSemanticJobLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetSemanticJobLogResponseBody</p>
 */
public class GetSemanticJobLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSemanticJobLogResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSemanticJobLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSemanticJobLogResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

        public GetSemanticJobLogResponseBody build() {
            return new GetSemanticJobLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSemanticJobLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetSemanticJobLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogContent")
        private String logContent;

        @com.aliyun.core.annotation.NameInMap("LogEnd")
        private Boolean logEnd;

        private Data(Builder builder) {
            this.logContent = builder.logContent;
            this.logEnd = builder.logEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return logContent
         */
        public String getLogContent() {
            return this.logContent;
        }

        /**
         * @return logEnd
         */
        public Boolean getLogEnd() {
            return this.logEnd;
        }

        public static final class Builder {
            private String logContent; 
            private Boolean logEnd; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.logContent = model.logContent;
                this.logEnd = model.logEnd;
            } 

            /**
             * LogContent.
             */
            public Builder logContent(String logContent) {
                this.logContent = logContent;
                return this;
            }

            /**
             * LogEnd.
             */
            public Builder logEnd(Boolean logEnd) {
                this.logEnd = logEnd;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
