// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeStandbyCreateModeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStandbyCreateModeResponseBody</p>
 */
public class DescribeStandbyCreateModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeStandbyCreateModeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStandbyCreateModeResponseBody create() {
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

        private Builder(DescribeStandbyCreateModeResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

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

        public DescribeStandbyCreateModeResponseBody build() {
            return new DescribeStandbyCreateModeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStandbyCreateModeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStandbyCreateModeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateMode")
        private String createMode;

        private Data(Builder builder) {
            this.createMode = builder.createMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createMode
         */
        public String getCreateMode() {
            return this.createMode;
        }

        public static final class Builder {
            private String createMode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createMode = model.createMode;
            } 

            /**
             * CreateMode.
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
