// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RenameSparkTemplateFileResponseBody} extends {@link TeaModel}
 *
 * <p>RenameSparkTemplateFileResponseBody</p>
 */
public class RenameSparkTemplateFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RenameSparkTemplateFileResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameSparkTemplateFileResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16D332C4-ACEB-526A-9B53-2B708FED594A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RenameSparkTemplateFileResponseBody build() {
            return new RenameSparkTemplateFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RenameSparkTemplateFileResponseBody} extends {@link TeaModel}
     *
     * <p>RenameSparkTemplateFileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Succeeded")
        private Boolean succeeded;

        private Data(Builder builder) {
            this.succeeded = builder.succeeded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return succeeded
         */
        public Boolean getSucceeded() {
            return this.succeeded;
        }

        public static final class Builder {
            private Boolean succeeded; 

            /**
             * <p>Indicates whether the request was successful. Valid values:</p>
             * <ul>
             * <li>True</li>
             * <li>False</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder succeeded(Boolean succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
