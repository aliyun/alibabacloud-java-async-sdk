// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeDBClusterStorageLimitationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterStorageLimitationResponseBody</p>
 */
public class DescribeDBClusterStorageLimitationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterStorageLimitationResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterStorageLimitationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterStorageLimitationResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial. This parameter is returned only when RAM authentication fails.</p>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic code. This parameter is not in use. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic message. This parameter is not in use. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>An error occurred while processing your request.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterStorageLimitationResponseBody build() {
            return new DescribeDBClusterStorageLimitationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterStorageLimitationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterStorageLimitationResponseBody</p>
     */
    public static class ClassCodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private Integer cpuCores;

        @com.aliyun.core.annotation.NameInMap("DefaultStorageInGB")
        private Integer defaultStorageInGB;

        @com.aliyun.core.annotation.NameInMap("MaxStorageInGB")
        private Integer maxStorageInGB;

        @com.aliyun.core.annotation.NameInMap("MemoryInGB")
        private Integer memoryInGB;

        @com.aliyun.core.annotation.NameInMap("MinStorageInGB")
        private Integer minStorageInGB;

        @com.aliyun.core.annotation.NameInMap("StepStorageInGB")
        private Integer stepStorageInGB;

        private ClassCodeList(Builder builder) {
            this.classCode = builder.classCode;
            this.cpuCores = builder.cpuCores;
            this.defaultStorageInGB = builder.defaultStorageInGB;
            this.maxStorageInGB = builder.maxStorageInGB;
            this.memoryInGB = builder.memoryInGB;
            this.minStorageInGB = builder.minStorageInGB;
            this.stepStorageInGB = builder.stepStorageInGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClassCodeList create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return cpuCores
         */
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return defaultStorageInGB
         */
        public Integer getDefaultStorageInGB() {
            return this.defaultStorageInGB;
        }

        /**
         * @return maxStorageInGB
         */
        public Integer getMaxStorageInGB() {
            return this.maxStorageInGB;
        }

        /**
         * @return memoryInGB
         */
        public Integer getMemoryInGB() {
            return this.memoryInGB;
        }

        /**
         * @return minStorageInGB
         */
        public Integer getMinStorageInGB() {
            return this.minStorageInGB;
        }

        /**
         * @return stepStorageInGB
         */
        public Integer getStepStorageInGB() {
            return this.stepStorageInGB;
        }

        public static final class Builder {
            private String classCode; 
            private Integer cpuCores; 
            private Integer defaultStorageInGB; 
            private Integer maxStorageInGB; 
            private Integer memoryInGB; 
            private Integer minStorageInGB; 
            private Integer stepStorageInGB; 

            private Builder() {
            } 

            private Builder(ClassCodeList model) {
                this.classCode = model.classCode;
                this.cpuCores = model.cpuCores;
                this.defaultStorageInGB = model.defaultStorageInGB;
                this.maxStorageInGB = model.maxStorageInGB;
                this.memoryInGB = model.memoryInGB;
                this.minStorageInGB = model.minStorageInGB;
                this.stepStorageInGB = model.stepStorageInGB;
            } 

            /**
             * <p>The specification code.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb.xlarge</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpuCores(Integer cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The default cache size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder defaultStorageInGB(Integer defaultStorageInGB) {
                this.defaultStorageInGB = defaultStorageInGB;
                return this;
            }

            /**
             * <p>The maximum cache size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxStorageInGB(Integer maxStorageInGB) {
                this.maxStorageInGB = maxStorageInGB;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memoryInGB(Integer memoryInGB) {
                this.memoryInGB = memoryInGB;
                return this;
            }

            /**
             * <p>The minimum cache size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minStorageInGB(Integer minStorageInGB) {
                this.minStorageInGB = minStorageInGB;
                return this;
            }

            /**
             * <p>The cache step size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stepStorageInGB(Integer stepStorageInGB) {
                this.stepStorageInGB = stepStorageInGB;
                return this;
            }

            public ClassCodeList build() {
                return new ClassCodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterStorageLimitationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterStorageLimitationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCodeList")
        private java.util.List<ClassCodeList> classCodeList;

        private Data(Builder builder) {
            this.classCodeList = builder.classCodeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return classCodeList
         */
        public java.util.List<ClassCodeList> getClassCodeList() {
            return this.classCodeList;
        }

        public static final class Builder {
            private java.util.List<ClassCodeList> classCodeList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.classCodeList = model.classCodeList;
            } 

            /**
             * <p>The list of cache specifications.</p>
             */
            public Builder classCodeList(java.util.List<ClassCodeList> classCodeList) {
                this.classCodeList = classCodeList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
