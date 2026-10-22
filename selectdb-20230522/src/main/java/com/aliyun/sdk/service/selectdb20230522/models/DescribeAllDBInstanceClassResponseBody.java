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
 * {@link DescribeAllDBInstanceClassResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllDBInstanceClassResponseBody</p>
 */
public class DescribeAllDBInstanceClassResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClassCodeList")
    private java.util.List<ClassCodeList> classCodeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAllDBInstanceClassResponseBody(Builder builder) {
        this.classCodeList = builder.classCodeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllDBInstanceClassResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classCodeList
     */
    public java.util.List<ClassCodeList> getClassCodeList() {
        return this.classCodeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ClassCodeList> classCodeList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAllDBInstanceClassResponseBody model) {
            this.classCodeList = model.classCodeList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of instance types.</p>
         */
        public Builder classCodeList(java.util.List<ClassCodeList> classCodeList) {
            this.classCodeList = classCodeList;
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

        public DescribeAllDBInstanceClassResponseBody build() {
            return new DescribeAllDBInstanceClassResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAllDBInstanceClassResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllDBInstanceClassResponseBody</p>
     */
    public static class ClassCodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private Long cpuCores;

        @com.aliyun.core.annotation.NameInMap("DefaultStorageInGB")
        private Long defaultStorageInGB;

        @com.aliyun.core.annotation.NameInMap("MaxStorageInGB")
        private Long maxStorageInGB;

        @com.aliyun.core.annotation.NameInMap("MemoryInGB")
        private Long memoryInGB;

        @com.aliyun.core.annotation.NameInMap("MinStorageInGB")
        private Long minStorageInGB;

        @com.aliyun.core.annotation.NameInMap("StepStorageInGB")
        private Long stepStorageInGB;

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
        public Long getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return defaultStorageInGB
         */
        public Long getDefaultStorageInGB() {
            return this.defaultStorageInGB;
        }

        /**
         * @return maxStorageInGB
         */
        public Long getMaxStorageInGB() {
            return this.maxStorageInGB;
        }

        /**
         * @return memoryInGB
         */
        public Long getMemoryInGB() {
            return this.memoryInGB;
        }

        /**
         * @return minStorageInGB
         */
        public Long getMinStorageInGB() {
            return this.minStorageInGB;
        }

        /**
         * @return stepStorageInGB
         */
        public Long getStepStorageInGB() {
            return this.stepStorageInGB;
        }

        public static final class Builder {
            private String classCode; 
            private Long cpuCores; 
            private Long defaultStorageInGB; 
            private Long maxStorageInGB; 
            private Long memoryInGB; 
            private Long minStorageInGB; 
            private Long stepStorageInGB; 

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
             * <p>The instance type code.</p>
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
            public Builder cpuCores(Long cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The default cache size.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder defaultStorageInGB(Long defaultStorageInGB) {
                this.defaultStorageInGB = defaultStorageInGB;
                return this;
            }

            /**
             * <p>The maximum cache size.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder maxStorageInGB(Long maxStorageInGB) {
                this.maxStorageInGB = maxStorageInGB;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memoryInGB(Long memoryInGB) {
                this.memoryInGB = memoryInGB;
                return this;
            }

            /**
             * <p>The minimum cache size.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder minStorageInGB(Long minStorageInGB) {
                this.minStorageInGB = minStorageInGB;
                return this;
            }

            /**
             * <p>The cache step size.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder stepStorageInGB(Long stepStorageInGB) {
                this.stepStorageInGB = stepStorageInGB;
                return this;
            }

            public ClassCodeList build() {
                return new ClassCodeList(this);
            } 

        } 

    }
}
