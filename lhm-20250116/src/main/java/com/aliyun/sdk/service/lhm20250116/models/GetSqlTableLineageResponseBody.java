// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetSqlTableLineageResponseBody} extends {@link TeaModel}
 *
 * <p>GetSqlTableLineageResponseBody</p>
 */
public class GetSqlTableLineageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetSqlTableLineageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlTableLineageResponseBody create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSqlTableLineageResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data body returned by the operation. For the field structure, see the child parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues with the current call.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed. Use errCode and errMessage to troubleshoot the issue.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSqlTableLineageResponseBody build() {
            return new GetSqlTableLineageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSqlTableLineageResponseBody} extends {@link TeaModel}
     *
     * <p>GetSqlTableLineageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("downstreamTables")
        private java.util.List<String> downstreamTables;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("upstreamTables")
        private java.util.List<String> upstreamTables;

        private Data(Builder builder) {
            this.downstreamTables = builder.downstreamTables;
            this.errorMsg = builder.errorMsg;
            this.success = builder.success;
            this.upstreamTables = builder.upstreamTables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return downstreamTables
         */
        public java.util.List<String> getDownstreamTables() {
            return this.downstreamTables;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return upstreamTables
         */
        public java.util.List<String> getUpstreamTables() {
            return this.upstreamTables;
        }

        public static final class Builder {
            private java.util.List<String> downstreamTables; 
            private String errorMsg; 
            private Boolean success; 
            private java.util.List<String> upstreamTables; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.downstreamTables = model.downstreamTables;
                this.errorMsg = model.errorMsg;
                this.success = model.success;
                this.upstreamTables = model.upstreamTables;
            } 

            /**
             * <p>The list of downstream tables.</p>
             */
            public Builder downstreamTables(java.util.List<String> downstreamTables) {
                this.downstreamTables = downstreamTables;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>connection timeout</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Indicates whether the call was successful. Valid values:</p>
             * <ul>
             * <li>true: Successful.</li>
             * <li>false: Failed. Use errCode and errMessage to troubleshoot the issue.</li>
             * </ul>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The list of upstream tables.</p>
             */
            public Builder upstreamTables(java.util.List<String> upstreamTables) {
                this.upstreamTables = upstreamTables;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
