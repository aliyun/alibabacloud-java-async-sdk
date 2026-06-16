// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link UpdatePostPaidBindRelResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePostPaidBindRelResponseBody</p>
 */
public class UpdatePostPaidBindRelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdatePostPaidBindRelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePostPaidBindRelResponseBody create() {
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
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdatePostPaidBindRelResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6E20BFD0-AA91-594F-B5A7-32CED4777DA0</p>
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

        public UpdatePostPaidBindRelResponseBody build() {
            return new UpdatePostPaidBindRelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePostPaidBindRelResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePostPaidBindRelResponseBody</p>
     */
    public static class DataBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindCount")
        private Long bindCount;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private Integer resultCode;

        private DataBody(Builder builder) {
            this.bindCount = builder.bindCount;
            this.requestId = builder.requestId;
            this.resultCode = builder.resultCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBody create() {
            return builder().build();
        }

        /**
         * @return bindCount
         */
        public Long getBindCount() {
            return this.bindCount;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resultCode
         */
        public Integer getResultCode() {
            return this.resultCode;
        }

        public static final class Builder {
            private Long bindCount; 
            private String requestId; 
            private Integer resultCode; 

            private Builder() {
            } 

            private Builder(DataBody model) {
                this.bindCount = model.bindCount;
                this.requestId = model.requestId;
                this.resultCode = model.resultCode;
            } 

            /**
             * BindCount.
             */
            public Builder bindCount(Long bindCount) {
                this.bindCount = bindCount;
                return this;
            }

            /**
             * <p>Id of the request</p>
             * 
             * <strong>example:</strong>
             * <p>62A7DCE2-7D9C-511B-919E-0F46A9D19AE6</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(Integer resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            public DataBody build() {
                return new DataBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePostPaidBindRelResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePostPaidBindRelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private DataBody body;

        private Data(Builder builder) {
            this.body = builder.body;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public DataBody getBody() {
            return this.body;
        }

        public static final class Builder {
            private DataBody body; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
            } 

            /**
             * Body.
             */
            public Builder body(DataBody body) {
                this.body = body;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
