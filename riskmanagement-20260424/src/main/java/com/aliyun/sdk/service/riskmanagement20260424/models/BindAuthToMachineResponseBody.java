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
 * {@link BindAuthToMachineResponseBody} extends {@link TeaModel}
 *
 * <p>BindAuthToMachineResponseBody</p>
 */
public class BindAuthToMachineResponseBody extends TeaModel {
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

    private BindAuthToMachineResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAuthToMachineResponseBody create() {
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

        private Builder(BindAuthToMachineResponseBody model) {
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
         * <p>message</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
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

        public BindAuthToMachineResponseBody build() {
            return new BindAuthToMachineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindAuthToMachineResponseBody} extends {@link TeaModel}
     *
     * <p>BindAuthToMachineResponseBody</p>
     */
    public static class DataBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindCount")
        private Integer bindCount;

        @com.aliyun.core.annotation.NameInMap("InsufficientCoreCount")
        private Integer insufficientCoreCount;

        @com.aliyun.core.annotation.NameInMap("InsufficientEcsCount")
        private Integer insufficientEcsCount;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private Integer resultCode;

        @com.aliyun.core.annotation.NameInMap("UnBindCount")
        private Integer unBindCount;

        private DataBody(Builder builder) {
            this.bindCount = builder.bindCount;
            this.insufficientCoreCount = builder.insufficientCoreCount;
            this.insufficientEcsCount = builder.insufficientEcsCount;
            this.requestId = builder.requestId;
            this.resultCode = builder.resultCode;
            this.unBindCount = builder.unBindCount;
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
        public Integer getBindCount() {
            return this.bindCount;
        }

        /**
         * @return insufficientCoreCount
         */
        public Integer getInsufficientCoreCount() {
            return this.insufficientCoreCount;
        }

        /**
         * @return insufficientEcsCount
         */
        public Integer getInsufficientEcsCount() {
            return this.insufficientEcsCount;
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

        /**
         * @return unBindCount
         */
        public Integer getUnBindCount() {
            return this.unBindCount;
        }

        public static final class Builder {
            private Integer bindCount; 
            private Integer insufficientCoreCount; 
            private Integer insufficientEcsCount; 
            private String requestId; 
            private Integer resultCode; 
            private Integer unBindCount; 

            private Builder() {
            } 

            private Builder(DataBody model) {
                this.bindCount = model.bindCount;
                this.insufficientCoreCount = model.insufficientCoreCount;
                this.insufficientEcsCount = model.insufficientEcsCount;
                this.requestId = model.requestId;
                this.resultCode = model.resultCode;
                this.unBindCount = model.unBindCount;
            } 

            /**
             * BindCount.
             */
            public Builder bindCount(Integer bindCount) {
                this.bindCount = bindCount;
                return this;
            }

            /**
             * InsufficientCoreCount.
             */
            public Builder insufficientCoreCount(Integer insufficientCoreCount) {
                this.insufficientCoreCount = insufficientCoreCount;
                return this;
            }

            /**
             * InsufficientEcsCount.
             */
            public Builder insufficientEcsCount(Integer insufficientEcsCount) {
                this.insufficientEcsCount = insufficientEcsCount;
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
             * ResultCode.
             */
            public Builder resultCode(Integer resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * UnBindCount.
             */
            public Builder unBindCount(Integer unBindCount) {
                this.unBindCount = unBindCount;
                return this;
            }

            public DataBody build() {
                return new DataBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link BindAuthToMachineResponseBody} extends {@link TeaModel}
     *
     * <p>BindAuthToMachineResponseBody</p>
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
