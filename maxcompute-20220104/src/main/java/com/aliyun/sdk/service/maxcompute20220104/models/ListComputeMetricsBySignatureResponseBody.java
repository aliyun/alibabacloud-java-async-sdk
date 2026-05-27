// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListComputeMetricsBySignatureResponseBody} extends {@link TeaModel}
 *
 * <p>ListComputeMetricsBySignatureResponseBody</p>
 */
public class ListComputeMetricsBySignatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListComputeMetricsBySignatureResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeMetricsBySignatureResponseBody create() {
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
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListComputeMetricsBySignatureResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListComputeMetricsBySignatureResponseBody build() {
            return new ListComputeMetricsBySignatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComputeMetricsBySignatureResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeMetricsBySignatureResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        private Instances(Builder builder) {
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private String instanceId; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListComputeMetricsBySignatureResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeMetricsBySignatureResponseBody</p>
     */
    public static class SignatureComputeMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instances")
        private java.util.List<Instances> instances;

        @com.aliyun.core.annotation.NameInMap("projectNames")
        private java.util.List<String> projectNames;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Double usage;

        private SignatureComputeMetrics(Builder builder) {
            this.instances = builder.instances;
            this.projectNames = builder.projectNames;
            this.signature = builder.signature;
            this.unit = builder.unit;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignatureComputeMetrics create() {
            return builder().build();
        }

        /**
         * @return instances
         */
        public java.util.List<Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return projectNames
         */
        public java.util.List<String> getProjectNames() {
            return this.projectNames;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return usage
         */
        public Double getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<Instances> instances; 
            private java.util.List<String> projectNames; 
            private String signature; 
            private String unit; 
            private Double usage; 

            private Builder() {
            } 

            private Builder(SignatureComputeMetrics model) {
                this.instances = model.instances;
                this.projectNames = model.projectNames;
                this.signature = model.signature;
                this.unit = model.unit;
                this.usage = model.usage;
            } 

            /**
             * instances.
             */
            public Builder instances(java.util.List<Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * projectNames.
             */
            public Builder projectNames(java.util.List<String> projectNames) {
                this.projectNames = projectNames;
                return this;
            }

            /**
             * signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(Double usage) {
                this.usage = usage;
                return this;
            }

            public SignatureComputeMetrics build() {
                return new SignatureComputeMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListComputeMetricsBySignatureResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeMetricsBySignatureResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("signatureComputeMetrics")
        private java.util.List<SignatureComputeMetrics> signatureComputeMetrics;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.signatureComputeMetrics = builder.signatureComputeMetrics;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return signatureComputeMetrics
         */
        public java.util.List<SignatureComputeMetrics> getSignatureComputeMetrics() {
            return this.signatureComputeMetrics;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List<SignatureComputeMetrics> signatureComputeMetrics; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.signatureComputeMetrics = model.signatureComputeMetrics;
                this.totalCount = model.totalCount;
            } 

            /**
             * pageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * signatureComputeMetrics.
             */
            public Builder signatureComputeMetrics(java.util.List<SignatureComputeMetrics> signatureComputeMetrics) {
                this.signatureComputeMetrics = signatureComputeMetrics;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
