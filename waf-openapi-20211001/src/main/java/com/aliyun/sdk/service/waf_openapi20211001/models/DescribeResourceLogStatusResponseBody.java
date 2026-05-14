// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeResourceLogStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceLogStatusResponseBody</p>
 */
public class DescribeResourceLogStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private DescribeResourceLogStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceLogStatusResponseBody create() {
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

        private Builder(DescribeResourceLogStatusResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0DABF8AB-2321-5F8D-A8D7-922D757FBFFE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public DescribeResourceLogStatusResponseBody build() {
            return new DescribeResourceLogStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceLogStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceLogStatusResponseBody</p>
     */
    public static class TraceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RatePerMille")
        private Integer ratePerMille;

        @com.aliyun.core.annotation.NameInMap("Workspace")
        private String workspace;

        private TraceConfig(Builder builder) {
            this.ratePerMille = builder.ratePerMille;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceConfig create() {
            return builder().build();
        }

        /**
         * @return ratePerMille
         */
        public Integer getRatePerMille() {
            return this.ratePerMille;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private Integer ratePerMille; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(TraceConfig model) {
                this.ratePerMille = model.ratePerMille;
                this.workspace = model.workspace;
            } 

            /**
             * RatePerMille.
             */
            public Builder ratePerMille(Integer ratePerMille) {
                this.ratePerMille = ratePerMille;
                return this;
            }

            /**
             * Workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public TraceConfig build() {
                return new TraceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceLogStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceLogStatusResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        @com.aliyun.core.annotation.NameInMap("TraceConfig")
        private TraceConfig traceConfig;

        @com.aliyun.core.annotation.NameInMap("TraceStatus")
        private Boolean traceStatus;

        private Result(Builder builder) {
            this.resource = builder.resource;
            this.status = builder.status;
            this.traceConfig = builder.traceConfig;
            this.traceStatus = builder.traceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        /**
         * @return traceConfig
         */
        public TraceConfig getTraceConfig() {
            return this.traceConfig;
        }

        /**
         * @return traceStatus
         */
        public Boolean getTraceStatus() {
            return this.traceStatus;
        }

        public static final class Builder {
            private String resource; 
            private Boolean status; 
            private TraceConfig traceConfig; 
            private Boolean traceStatus; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.resource = model.resource;
                this.status = model.status;
                this.traceConfig = model.traceConfig;
                this.traceStatus = model.traceStatus;
            } 

            /**
             * <p>The protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>alb-wewbb23dfsetetcic****</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>Indicates whether the log collection feature is enabled for the protected object. Valid values:</p>
             * <ul>
             * <li><strong>true:</strong> The log collection feature is enabled.</li>
             * <li><strong>false:</strong> The log collection feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * TraceConfig.
             */
            public Builder traceConfig(TraceConfig traceConfig) {
                this.traceConfig = traceConfig;
                return this;
            }

            /**
             * TraceStatus.
             */
            public Builder traceStatus(Boolean traceStatus) {
                this.traceStatus = traceStatus;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
