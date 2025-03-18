// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeOpenApiInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenApiInfoResponseBody</p>
 */
public class DescribeOpenApiInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOpenApiInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenApiInfoResponseBody create() {
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

        private Builder(DescribeOpenApiInfoResponseBody model) {
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

        public DescribeOpenApiInfoResponseBody build() {
            return new DescribeOpenApiInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpenApiInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenApiInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InputParams")
        private String inputParams;

        @com.aliyun.core.annotation.NameInMap("OutputParams")
        private String outputParams;

        @com.aliyun.core.annotation.NameInMap("ResponseDemo")
        private String responseDemo;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.description = builder.description;
            this.inputParams = builder.inputParams;
            this.outputParams = builder.outputParams;
            this.responseDemo = builder.responseDemo;
            this.summary = builder.summary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return inputParams
         */
        public String getInputParams() {
            return this.inputParams;
        }

        /**
         * @return outputParams
         */
        public String getOutputParams() {
            return this.outputParams;
        }

        /**
         * @return responseDemo
         */
        public String getResponseDemo() {
            return this.responseDemo;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String inputParams; 
            private String outputParams; 
            private String responseDemo; 
            private String summary; 
            private String title; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.inputParams = model.inputParams;
                this.outputParams = model.outputParams;
                this.responseDemo = model.responseDemo;
                this.summary = model.summary;
                this.title = model.title;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InputParams.
             */
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * OutputParams.
             */
            public Builder outputParams(String outputParams) {
                this.outputParams = outputParams;
                return this;
            }

            /**
             * ResponseDemo.
             */
            public Builder responseDemo(String responseDemo) {
                this.responseDemo = responseDemo;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
