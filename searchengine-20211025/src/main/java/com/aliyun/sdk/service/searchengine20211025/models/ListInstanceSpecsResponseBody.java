// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ListInstanceSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceSpecsResponseBody</p>
 */
public class ListInstanceSpecsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    private ListInstanceSpecsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceSpecsResponseBody create() {
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListInstanceSpecsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10D5E615-69F7-5F49-B850-00169ADE513C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The instance types.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListInstanceSpecsResponseBody build() {
            return new ListInstanceSpecsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceSpecsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("maxDisk")
        private Integer maxDisk;

        @com.aliyun.core.annotation.NameInMap("mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("minDisk")
        private Integer minDisk;

        private Result(Builder builder) {
            this.cpu = builder.cpu;
            this.maxDisk = builder.maxDisk;
            this.mem = builder.mem;
            this.minDisk = builder.minDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return maxDisk
         */
        public Integer getMaxDisk() {
            return this.maxDisk;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return minDisk
         */
        public Integer getMinDisk() {
            return this.minDisk;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer maxDisk; 
            private Integer mem; 
            private Integer minDisk; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cpu = model.cpu;
                this.maxDisk = model.maxDisk;
                this.mem = model.mem;
                this.minDisk = model.minDisk;
            } 

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The maximum storage of a single data node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder maxDisk(Integer maxDisk) {
                this.maxDisk = maxDisk;
                return this;
            }

            /**
             * <p>The memory of the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The minimum storage of a single data node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder minDisk(Integer minDisk) {
                this.minDisk = minDisk;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
