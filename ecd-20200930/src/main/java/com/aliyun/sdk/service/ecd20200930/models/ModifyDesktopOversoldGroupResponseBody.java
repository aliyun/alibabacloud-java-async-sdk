// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyDesktopOversoldGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDesktopOversoldGroupResponseBody</p>
 */
public class ModifyDesktopOversoldGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDesktopOversoldGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopOversoldGroupResponseBody create() {
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

        private Builder(ModifyDesktopOversoldGroupResponseBody model) {
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

        public ModifyDesktopOversoldGroupResponseBody build() {
            return new ModifyDesktopOversoldGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDesktopOversoldGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDesktopOversoldGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OversoldGroupId")
        private String oversoldGroupId;

        private Data(Builder builder) {
            this.oversoldGroupId = builder.oversoldGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return oversoldGroupId
         */
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

        public static final class Builder {
            private String oversoldGroupId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.oversoldGroupId = model.oversoldGroupId;
            } 

            /**
             * OversoldGroupId.
             */
            public Builder oversoldGroupId(String oversoldGroupId) {
                this.oversoldGroupId = oversoldGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
