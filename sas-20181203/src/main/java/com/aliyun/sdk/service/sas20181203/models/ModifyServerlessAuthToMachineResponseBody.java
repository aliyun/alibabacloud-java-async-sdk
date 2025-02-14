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
         * Data.
         */
        public Builder data(Data data) {
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

            /**
             * ResultCode.
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
