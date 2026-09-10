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
 * {@link GetSqlConversionProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetSqlConversionProgressResponseBody</p>
 */
public class GetSqlConversionProgressResponseBody extends TeaModel {
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

    private GetSqlConversionProgressResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlConversionProgressResponseBody create() {
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

        private Builder(GetSqlConversionProgressResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data body returned by the operation. For the field structure, see the child field descriptions.</p>
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
         * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSqlConversionProgressResponseBody build() {
            return new GetSqlConversionProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSqlConversionProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetSqlConversionProgressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fail")
        private Long fail;

        @com.aliyun.core.annotation.NameInMap("finish")
        private Long finish;

        @com.aliyun.core.annotation.NameInMap("percent")
        private Double percent;

        @com.aliyun.core.annotation.NameInMap("running")
        private Long running;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.fail = builder.fail;
            this.finish = builder.finish;
            this.percent = builder.percent;
            this.running = builder.running;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fail
         */
        public Long getFail() {
            return this.fail;
        }

        /**
         * @return finish
         */
        public Long getFinish() {
            return this.finish;
        }

        /**
         * @return percent
         */
        public Double getPercent() {
            return this.percent;
        }

        /**
         * @return running
         */
        public Long getRunning() {
            return this.running;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long fail; 
            private Long finish; 
            private Double percent; 
            private Long running; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fail = model.fail;
                this.finish = model.finish;
                this.percent = model.percent;
                this.running = model.running;
                this.total = model.total;
            } 

            /**
             * <p>The number of failed scripts.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fail(Long fail) {
                this.fail = fail;
                return this;
            }

            /**
             * <p>The number of completed scripts.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder finish(Long finish) {
                this.finish = finish;
                return this;
            }

            /**
             * <p>The completion percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>66.67</p>
             */
            public Builder percent(Double percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of scripts being converted.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder running(Long running) {
                this.running = running;
                return this;
            }

            /**
             * <p>The total number of scripts.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
