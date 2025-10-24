// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link InstanceHealerResponseBody} extends {@link TeaModel}
 *
 * <p>InstanceHealerResponseBody</p>
 */
public class InstanceHealerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceHealerModel")
    private InstanceHealerModel instanceHealerModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InstanceHealerResponseBody(Builder builder) {
        this.instanceHealerModel = builder.instanceHealerModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceHealerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceHealerModel
     */
    public InstanceHealerModel getInstanceHealerModel() {
        return this.instanceHealerModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceHealerModel instanceHealerModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InstanceHealerResponseBody model) {
            this.instanceHealerModel = model.instanceHealerModel;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceHealerModel.
         */
        public Builder instanceHealerModel(InstanceHealerModel instanceHealerModel) {
            this.instanceHealerModel = instanceHealerModel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstanceHealerResponseBody build() {
            return new InstanceHealerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InstanceHealerResponseBody} extends {@link TeaModel}
     *
     * <p>InstanceHealerResponseBody</p>
     */
    public static class InstanceHealerModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private InstanceHealerModel(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceHealerModel create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private String result; 

            private Builder() {
            } 

            private Builder(InstanceHealerModel model) {
                this.result = model.result;
            } 

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public InstanceHealerModel build() {
                return new InstanceHealerModel(this);
            } 

        } 

    }
}
