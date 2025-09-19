// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyServerlessAuthToMachineResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyServerlessAuthToMachineResponseBody</p>
 */
public class ModifyServerlessAuthToMachineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyServerlessAuthToMachineResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyServerlessAuthToMachineResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyServerlessAuthToMachineResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details of the returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>本次调用请求的ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。</p>
         * 
         * <strong>example:</strong>
         * <p>A47F77A1***8CD37050E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyServerlessAuthToMachineResponseBody build() {
            return new ModifyServerlessAuthToMachineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyServerlessAuthToMachineResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyServerlessAuthToMachineResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private Integer resultCode;

        private Data(Builder builder) {
            this.resultCode = builder.resultCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resultCode
         */
        public Integer getResultCode() {
            return this.resultCode;
        }

        public static final class Builder {
            private Integer resultCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.resultCode = model.resultCode;
            } 

            /**
             * <p>Result code. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Success</li>
             * <li><strong>1</strong>: Parameter error</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder resultCode(Integer resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
