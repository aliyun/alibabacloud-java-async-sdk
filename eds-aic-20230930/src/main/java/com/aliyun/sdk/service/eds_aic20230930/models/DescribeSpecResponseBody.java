// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpecResponseBody</p>
 */
public class DescribeSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpecInfoModel")
    private java.util.List<SpecInfoModel> specInfoModel;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSpecResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.specInfoModel = builder.specInfoModel;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpecResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return specInfoModel
     */
    public java.util.List<SpecInfoModel> getSpecInfoModel() {
        return this.specInfoModel;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<SpecInfoModel> specInfoModel; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSpecResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.specInfoModel = model.specInfoModel;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Indicates the current read position returned by this call. An empty value means that all data has been read.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9888DAD-331E-5FBC-B5A0-F2445115****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The specifications.</p>
         */
        public Builder specInfoModel(java.util.List<SpecInfoModel> specInfoModel) {
            this.specInfoModel = specInfoModel;
            return this;
        }

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSpecResponseBody build() {
            return new DescribeSpecResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSpecResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSpecResponseBody</p>
     */
    public static class SpecInfoModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Core")
        private Integer core;

        @com.aliyun.core.annotation.NameInMap("MaxPhoneCount")
        private String maxPhoneCount;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("MinPhoneCount")
        private String minPhoneCount;

        @com.aliyun.core.annotation.NameInMap("PhoneCount")
        private String phoneCount;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("SpecId")
        private String specId;

        @com.aliyun.core.annotation.NameInMap("SpecStatus")
        private String specStatus;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private SpecInfoModel(Builder builder) {
            this.core = builder.core;
            this.maxPhoneCount = builder.maxPhoneCount;
            this.memory = builder.memory;
            this.minPhoneCount = builder.minPhoneCount;
            this.phoneCount = builder.phoneCount;
            this.resolution = builder.resolution;
            this.specId = builder.specId;
            this.specStatus = builder.specStatus;
            this.specType = builder.specType;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecInfoModel create() {
            return builder().build();
        }

        /**
         * @return core
         */
        public Integer getCore() {
            return this.core;
        }

        /**
         * @return maxPhoneCount
         */
        public String getMaxPhoneCount() {
            return this.maxPhoneCount;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return minPhoneCount
         */
        public String getMinPhoneCount() {
            return this.minPhoneCount;
        }

        /**
         * @return phoneCount
         */
        public String getPhoneCount() {
            return this.phoneCount;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return specId
         */
        public String getSpecId() {
            return this.specId;
        }

        /**
         * @return specStatus
         */
        public String getSpecStatus() {
            return this.specStatus;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private Integer core; 
            private String maxPhoneCount; 
            private Integer memory; 
            private String minPhoneCount; 
            private String phoneCount; 
            private String resolution; 
            private String specId; 
            private String specStatus; 
            private String specType; 
            private Integer systemDiskSize; 

            private Builder() {
            } 

            private Builder(SpecInfoModel model) {
                this.core = model.core;
                this.maxPhoneCount = model.maxPhoneCount;
                this.memory = model.memory;
                this.minPhoneCount = model.minPhoneCount;
                this.phoneCount = model.phoneCount;
                this.resolution = model.resolution;
                this.specId = model.specId;
                this.specStatus = model.specStatus;
                this.specType = model.specType;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>Number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * <p>The maximum number of cloud phone instances.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder maxPhoneCount(String maxPhoneCount) {
                this.maxPhoneCount = maxPhoneCount;
                return this;
            }

            /**
             * <p>Memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The minimum number of cloud phone instances.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder minPhoneCount(String minPhoneCount) {
                this.minPhoneCount = minPhoneCount;
                return this;
            }

            /**
             * PhoneCount.
             */
            public Builder phoneCount(String phoneCount) {
                this.phoneCount = phoneCount;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>Specification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp.basic.small</p>
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            /**
             * <p>Specification status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder specStatus(String specStatus) {
                this.specStatus = specStatus;
                return this;
            }

            /**
             * <p>Specification type.</p>
             * 
             * <strong>example:</strong>
             * <p>ARM</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>System disk size, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public SpecInfoModel build() {
                return new SpecInfoModel(this);
            } 

        } 

    }
}
