// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeCompactionServiceSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCompactionServiceSwitchResponseBody</p>
 */
public class DescribeCompactionServiceSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCompactionServiceSwitchResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCompactionServiceSwitchResponseBody create() {
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D761DA51-12F8-5457-AAA9-F52B9F436D2D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCompactionServiceSwitchResponseBody build() {
            return new DescribeCompactionServiceSwitchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCompactionServiceSwitchResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCompactionServiceSwitchResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableCompactionService")
        private Boolean enableCompactionService;

        private Data(Builder builder) {
            this.enableCompactionService = builder.enableCompactionService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableCompactionService
         */
        public Boolean getEnableCompactionService() {
            return this.enableCompactionService;
        }

        public static final class Builder {
            private Boolean enableCompactionService; 

            /**
             * <p>Indicates whether the remote build feature is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableCompactionService(Boolean enableCompactionService) {
                this.enableCompactionService = enableCompactionService;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
