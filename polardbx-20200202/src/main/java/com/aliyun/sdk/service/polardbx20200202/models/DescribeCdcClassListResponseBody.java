// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeCdcClassListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdcClassListResponseBody</p>
 */
public class DescribeCdcClassListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdcClassListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdcClassListResponseBody create() {
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

        private Builder(DescribeCdcClassListResponseBody model) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6BA32080EEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdcClassListResponseBody build() {
            return new DescribeCdcClassListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdcClassListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdcClassListResponseBody</p>
     */
    public static class ClassCodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("CpuCore")
        private String cpuCore;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private String mem;

        private ClassCodeList(Builder builder) {
            this.classCode = builder.classCode;
            this.cpuCore = builder.cpuCore;
            this.mem = builder.mem;
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
         * @return cpuCore
         */
        public String getCpuCore() {
            return this.cpuCore;
        }

        /**
         * @return mem
         */
        public String getMem() {
            return this.mem;
        }

        public static final class Builder {
            private String classCode; 
            private String cpuCore; 
            private String mem; 

            private Builder() {
            } 

            private Builder(ClassCodeList model) {
                this.classCode = model.classCode;
                this.cpuCore = model.cpuCore;
                this.mem = model.mem;
            } 

            /**
             * ClassCode.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * CpuCore.
             */
            public Builder cpuCore(String cpuCore) {
                this.cpuCore = cpuCore;
                return this;
            }

            /**
             * Mem.
             */
            public Builder mem(String mem) {
                this.mem = mem;
                return this;
            }

            public ClassCodeList build() {
                return new ClassCodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdcClassListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdcClassListResponseBody</p>
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
             * <p>array</p>
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
