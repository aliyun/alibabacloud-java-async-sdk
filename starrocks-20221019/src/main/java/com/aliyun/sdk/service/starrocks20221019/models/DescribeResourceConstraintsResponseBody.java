// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceConstraintsResponseBody</p>
 */
public class DescribeResourceConstraintsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeResourceConstraintsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errMessage = builder.errMessage;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceConstraintsResponseBody create() {
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
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Data data; 
        private String errMessage; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeResourceConstraintsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errMessage = model.errMessage;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>AccessDeniedDetail</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeResourceConstraintsResponseBody build() {
            return new DescribeResourceConstraintsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class BeNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Default")
        private Integer _default;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        private BeNumber(Builder builder) {
            this._default = builder._default;
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BeNumber create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public Integer get_default() {
            return this._default;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer _default; 
            private Integer max; 
            private Integer min; 
            private Integer step; 

            private Builder() {
            } 

            private Builder(BeNumber model) {
                this._default = model._default;
                this.max = model.max;
                this.min = model.min;
                this.step = model.step;
            } 

            /**
             * Default.
             */
            public Builder _default(Integer _default) {
                this._default = _default;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public BeNumber build() {
                return new BeNumber(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class DiskNumberConstraint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Default")
        private Integer _default;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        private DiskNumberConstraint(Builder builder) {
            this._default = builder._default;
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskNumberConstraint create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public Integer get_default() {
            return this._default;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer _default; 
            private Integer max; 
            private Integer min; 
            private Integer step; 

            private Builder() {
            } 

            private Builder(DiskNumberConstraint model) {
                this._default = model._default;
                this.max = model.max;
                this.min = model.min;
                this.step = model.step;
            } 

            /**
             * Default.
             */
            public Builder _default(Integer _default) {
                this._default = _default;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public DiskNumberConstraint build() {
                return new DiskNumberConstraint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class ValueConstraint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Default")
        private Integer _default;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        private ValueConstraint(Builder builder) {
            this._default = builder._default;
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueConstraint create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public Integer get_default() {
            return this._default;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer _default; 
            private Integer max; 
            private Integer min; 
            private Integer step; 

            private Builder() {
            } 

            private Builder(ValueConstraint model) {
                this._default = model._default;
                this.max = model.max;
                this.min = model.min;
                this.step = model.step;
            } 

            /**
             * Default.
             */
            public Builder _default(Integer _default) {
                this._default = _default;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public ValueConstraint build() {
                return new ValueConstraint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class BeStorageConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("DiskNumberConstraint")
        private DiskNumberConstraint diskNumberConstraint;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("ValueConstraint")
        private ValueConstraint valueConstraint;

        private BeStorageConstraints(Builder builder) {
            this.desc = builder.desc;
            this.diskNumberConstraint = builder.diskNumberConstraint;
            this.isDefault = builder.isDefault;
            this.level = builder.level;
            this.valueConstraint = builder.valueConstraint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BeStorageConstraints create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return diskNumberConstraint
         */
        public DiskNumberConstraint getDiskNumberConstraint() {
            return this.diskNumberConstraint;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return valueConstraint
         */
        public ValueConstraint getValueConstraint() {
            return this.valueConstraint;
        }

        public static final class Builder {
            private String desc; 
            private DiskNumberConstraint diskNumberConstraint; 
            private Boolean isDefault; 
            private String level; 
            private ValueConstraint valueConstraint; 

            private Builder() {
            } 

            private Builder(BeStorageConstraints model) {
                this.desc = model.desc;
                this.diskNumberConstraint = model.diskNumberConstraint;
                this.isDefault = model.isDefault;
                this.level = model.level;
                this.valueConstraint = model.valueConstraint;
            } 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * DiskNumberConstraint.
             */
            public Builder diskNumberConstraint(DiskNumberConstraint diskNumberConstraint) {
                this.diskNumberConstraint = diskNumberConstraint;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * ValueConstraint.
             */
            public Builder valueConstraint(ValueConstraint valueConstraint) {
                this.valueConstraint = valueConstraint;
                return this;
            }

            public BeStorageConstraints build() {
                return new BeStorageConstraints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class BigDataInstanceTypeConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("DiskNumber")
        private String diskNumber;

        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceType")
        private String ecsInstanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private String storageSize;

        private BigDataInstanceTypeConstraints(Builder builder) {
            this.cpu = builder.cpu;
            this.diskNumber = builder.diskNumber;
            this.display = builder.display;
            this.ecsInstanceType = builder.ecsInstanceType;
            this.instanceType = builder.instanceType;
            this.isDefault = builder.isDefault;
            this.memory = builder.memory;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BigDataInstanceTypeConstraints create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return diskNumber
         */
        public String getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return ecsInstanceType
         */
        public String getEcsInstanceType() {
            return this.ecsInstanceType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return storageSize
         */
        public String getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private Integer cpu; 
            private String diskNumber; 
            private String display; 
            private String ecsInstanceType; 
            private String instanceType; 
            private String isDefault; 
            private Integer memory; 
            private String storageSize; 

            private Builder() {
            } 

            private Builder(BigDataInstanceTypeConstraints model) {
                this.cpu = model.cpu;
                this.diskNumber = model.diskNumber;
                this.display = model.display;
                this.ecsInstanceType = model.ecsInstanceType;
                this.instanceType = model.instanceType;
                this.isDefault = model.isDefault;
                this.memory = model.memory;
                this.storageSize = model.storageSize;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DiskNumber.
             */
            public Builder diskNumber(String diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * Display.
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * EcsInstanceType.
             */
            public Builder ecsInstanceType(String ecsInstanceType) {
                this.ecsInstanceType = ecsInstanceType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(String storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public BigDataInstanceTypeConstraints build() {
                return new BigDataInstanceTypeConstraints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class FeNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Default")
        private Integer _default;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        private FeNumber(Builder builder) {
            this._default = builder._default;
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeNumber create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public Integer get_default() {
            return this._default;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer _default; 
            private Integer max; 
            private Integer min; 
            private Integer step; 

            private Builder() {
            } 

            private Builder(FeNumber model) {
                this._default = model._default;
                this.max = model.max;
                this.min = model.min;
                this.step = model.step;
            } 

            /**
             * Default.
             */
            public Builder _default(Integer _default) {
                this._default = _default;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public FeNumber build() {
                return new FeNumber(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class FeSpecType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private FeSpecType(Builder builder) {
            this.display = builder.display;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeSpecType create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String display; 
            private String name; 

            private Builder() {
            } 

            private Builder(FeSpecType model) {
                this.display = model.display;
                this.name = model.name;
            } 

            /**
             * Display.
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FeSpecType build() {
                return new FeSpecType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class FeStorage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Default")
        private Integer _default;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        private FeStorage(Builder builder) {
            this._default = builder._default;
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeStorage create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public Integer get_default() {
            return this._default;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer _default; 
            private Integer max; 
            private Integer min; 
            private Integer step; 

            private Builder() {
            } 

            private Builder(FeStorage model) {
                this._default = model._default;
                this.max = model.max;
                this.min = model.min;
                this.step = model.step;
            } 

            /**
             * Default.
             */
            public Builder _default(Integer _default) {
                this._default = _default;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public FeStorage build() {
                return new FeStorage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class HaFeResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("NodeNumber")
        private Integer nodeNumber;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        private HaFeResourceSpec(Builder builder) {
            this.cu = builder.cu;
            this.nodeNumber = builder.nodeNumber;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaFeResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return nodeNumber
         */
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private Integer cu; 
            private Integer nodeNumber; 
            private Integer storageSize; 

            private Builder() {
            } 

            private Builder(HaFeResourceSpec model) {
                this.cu = model.cu;
                this.nodeNumber = model.nodeNumber;
                this.storageSize = model.storageSize;
            } 

            /**
             * Cu.
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * NodeNumber.
             */
            public Builder nodeNumber(Integer nodeNumber) {
                this.nodeNumber = nodeNumber;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public HaFeResourceSpec build() {
                return new HaFeResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class LocalSSDInstanceTypeConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("DiskNumber")
        private String diskNumber;

        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("EcsInstanceType")
        private String ecsInstanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private String storageSize;

        private LocalSSDInstanceTypeConstraints(Builder builder) {
            this.cpu = builder.cpu;
            this.diskNumber = builder.diskNumber;
            this.display = builder.display;
            this.ecsInstanceType = builder.ecsInstanceType;
            this.instanceType = builder.instanceType;
            this.isDefault = builder.isDefault;
            this.memory = builder.memory;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalSSDInstanceTypeConstraints create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return diskNumber
         */
        public String getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return ecsInstanceType
         */
        public String getEcsInstanceType() {
            return this.ecsInstanceType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return storageSize
         */
        public String getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private Integer cpu; 
            private String diskNumber; 
            private String display; 
            private String ecsInstanceType; 
            private String instanceType; 
            private String isDefault; 
            private Integer memory; 
            private String storageSize; 

            private Builder() {
            } 

            private Builder(LocalSSDInstanceTypeConstraints model) {
                this.cpu = model.cpu;
                this.diskNumber = model.diskNumber;
                this.display = model.display;
                this.ecsInstanceType = model.ecsInstanceType;
                this.instanceType = model.instanceType;
                this.isDefault = model.isDefault;
                this.memory = model.memory;
                this.storageSize = model.storageSize;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DiskNumber.
             */
            public Builder diskNumber(String diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * Display.
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * EcsInstanceType.
             */
            public Builder ecsInstanceType(String ecsInstanceType) {
                this.ecsInstanceType = ecsInstanceType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(String storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public LocalSSDInstanceTypeConstraints build() {
                return new LocalSSDInstanceTypeConstraints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class NormalFeResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("NodeNumber")
        private Integer nodeNumber;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        private NormalFeResourceSpec(Builder builder) {
            this.cu = builder.cu;
            this.nodeNumber = builder.nodeNumber;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalFeResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return nodeNumber
         */
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private Integer cu; 
            private Integer nodeNumber; 
            private Integer storageSize; 

            private Builder() {
            } 

            private Builder(NormalFeResourceSpec model) {
                this.cu = model.cu;
                this.nodeNumber = model.nodeNumber;
                this.storageSize = model.storageSize;
            } 

            /**
             * Cu.
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * NodeNumber.
             */
            public Builder nodeNumber(Integer nodeNumber) {
                this.nodeNumber = nodeNumber;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public NormalFeResourceSpec build() {
                return new NormalFeResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class SpecType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private String display;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SpecType(Builder builder) {
            this.display = builder.display;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecType create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public String getDisplay() {
            return this.display;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String display; 
            private String name; 

            private Builder() {
            } 

            private Builder(SpecType model) {
                this.display = model.display;
                this.name = model.name;
            } 

            /**
             * Display.
             */
            public Builder display(String display) {
                this.display = display;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SpecType build() {
                return new SpecType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class VersionConstraint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BetaVersions")
        private java.util.List<String> betaVersions;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private String defaultVersion;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List<String> versions;

        private VersionConstraint(Builder builder) {
            this.betaVersions = builder.betaVersions;
            this.defaultVersion = builder.defaultVersion;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionConstraint create() {
            return builder().build();
        }

        /**
         * @return betaVersions
         */
        public java.util.List<String> getBetaVersions() {
            return this.betaVersions;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return versions
         */
        public java.util.List<String> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private java.util.List<String> betaVersions; 
            private String defaultVersion; 
            private java.util.List<String> versions; 

            private Builder() {
            } 

            private Builder(VersionConstraint model) {
                this.betaVersions = model.betaVersions;
                this.defaultVersion = model.defaultVersion;
                this.versions = model.versions;
            } 

            /**
             * BetaVersions.
             */
            public Builder betaVersions(java.util.List<String> betaVersions) {
                this.betaVersions = betaVersions;
                return this;
            }

            /**
             * DefaultVersion.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * Versions.
             */
            public Builder versions(java.util.List<String> versions) {
                this.versions = versions;
                return this;
            }

            public VersionConstraint build() {
                return new VersionConstraint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class CompactionServiceCuConstraint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("def")
        private Integer def;

        @com.aliyun.core.annotation.NameInMap("max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("step")
        private Integer step;

        private CompactionServiceCuConstraint(Builder builder) {
            this.def = builder.def;
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompactionServiceCuConstraint create() {
            return builder().build();
        }

        /**
         * @return def
         */
        public Integer getDef() {
            return this.def;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer def; 
            private Integer max; 
            private Integer min; 
            private Integer step; 

            private Builder() {
            } 

            private Builder(CompactionServiceCuConstraint model) {
                this.def = model.def;
                this.max = model.max;
                this.min = model.min;
                this.step = model.step;
            } 

            /**
             * def.
             */
            public Builder def(Integer def) {
                this.def = def;
                return this;
            }

            /**
             * max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * step.
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public CompactionServiceCuConstraint build() {
                return new CompactionServiceCuConstraint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceConstraintsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentCu")
        private java.util.List<Integer> agentCu;

        @com.aliyun.core.annotation.NameInMap("BeCu")
        private java.util.List<Integer> beCu;

        @com.aliyun.core.annotation.NameInMap("BeCuOnEcs")
        private java.util.List<Integer> beCuOnEcs;

        @com.aliyun.core.annotation.NameInMap("BeNumber")
        private BeNumber beNumber;

        @com.aliyun.core.annotation.NameInMap("BeStorageConstraints")
        private java.util.List<BeStorageConstraints> beStorageConstraints;

        @com.aliyun.core.annotation.NameInMap("BigDataInstanceTypeConstraints")
        private java.util.List<BigDataInstanceTypeConstraints> bigDataInstanceTypeConstraints;

        @com.aliyun.core.annotation.NameInMap("FeCu")
        private java.util.List<Integer> feCu;

        @com.aliyun.core.annotation.NameInMap("FeCuOnEcs")
        private java.util.List<Integer> feCuOnEcs;

        @com.aliyun.core.annotation.NameInMap("FeNumber")
        private FeNumber feNumber;

        @com.aliyun.core.annotation.NameInMap("FeSpecType")
        private java.util.List<FeSpecType> feSpecType;

        @com.aliyun.core.annotation.NameInMap("FeStorage")
        private FeStorage feStorage;

        @com.aliyun.core.annotation.NameInMap("HaFeResourceSpec")
        private HaFeResourceSpec haFeResourceSpec;

        @com.aliyun.core.annotation.NameInMap("LocalSSDInstanceTypeConstraints")
        private java.util.List<LocalSSDInstanceTypeConstraints> localSSDInstanceTypeConstraints;

        @com.aliyun.core.annotation.NameInMap("NormalFeResourceSpec")
        private NormalFeResourceSpec normalFeResourceSpec;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private java.util.List<SpecType> specType;

        @com.aliyun.core.annotation.NameInMap("SplitDiskThresholdMap")
        private java.util.Map<String, java.util.Map<String, ?>> splitDiskThresholdMap;

        @com.aliyun.core.annotation.NameInMap("VersionConstraint")
        private VersionConstraint versionConstraint;

        @com.aliyun.core.annotation.NameInMap("ZoneSupportedEedTypes")
        private java.util.Map<String, java.util.List<String>> zoneSupportedEedTypes;

        @com.aliyun.core.annotation.NameInMap("ZoneSupportedSpecTypes")
        private java.util.Map<String, java.util.List<String>> zoneSupportedSpecTypes;

        @com.aliyun.core.annotation.NameInMap("compactionServiceCuConstraint")
        private CompactionServiceCuConstraint compactionServiceCuConstraint;

        private Data(Builder builder) {
            this.agentCu = builder.agentCu;
            this.beCu = builder.beCu;
            this.beCuOnEcs = builder.beCuOnEcs;
            this.beNumber = builder.beNumber;
            this.beStorageConstraints = builder.beStorageConstraints;
            this.bigDataInstanceTypeConstraints = builder.bigDataInstanceTypeConstraints;
            this.feCu = builder.feCu;
            this.feCuOnEcs = builder.feCuOnEcs;
            this.feNumber = builder.feNumber;
            this.feSpecType = builder.feSpecType;
            this.feStorage = builder.feStorage;
            this.haFeResourceSpec = builder.haFeResourceSpec;
            this.localSSDInstanceTypeConstraints = builder.localSSDInstanceTypeConstraints;
            this.normalFeResourceSpec = builder.normalFeResourceSpec;
            this.specType = builder.specType;
            this.splitDiskThresholdMap = builder.splitDiskThresholdMap;
            this.versionConstraint = builder.versionConstraint;
            this.zoneSupportedEedTypes = builder.zoneSupportedEedTypes;
            this.zoneSupportedSpecTypes = builder.zoneSupportedSpecTypes;
            this.compactionServiceCuConstraint = builder.compactionServiceCuConstraint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentCu
         */
        public java.util.List<Integer> getAgentCu() {
            return this.agentCu;
        }

        /**
         * @return beCu
         */
        public java.util.List<Integer> getBeCu() {
            return this.beCu;
        }

        /**
         * @return beCuOnEcs
         */
        public java.util.List<Integer> getBeCuOnEcs() {
            return this.beCuOnEcs;
        }

        /**
         * @return beNumber
         */
        public BeNumber getBeNumber() {
            return this.beNumber;
        }

        /**
         * @return beStorageConstraints
         */
        public java.util.List<BeStorageConstraints> getBeStorageConstraints() {
            return this.beStorageConstraints;
        }

        /**
         * @return bigDataInstanceTypeConstraints
         */
        public java.util.List<BigDataInstanceTypeConstraints> getBigDataInstanceTypeConstraints() {
            return this.bigDataInstanceTypeConstraints;
        }

        /**
         * @return feCu
         */
        public java.util.List<Integer> getFeCu() {
            return this.feCu;
        }

        /**
         * @return feCuOnEcs
         */
        public java.util.List<Integer> getFeCuOnEcs() {
            return this.feCuOnEcs;
        }

        /**
         * @return feNumber
         */
        public FeNumber getFeNumber() {
            return this.feNumber;
        }

        /**
         * @return feSpecType
         */
        public java.util.List<FeSpecType> getFeSpecType() {
            return this.feSpecType;
        }

        /**
         * @return feStorage
         */
        public FeStorage getFeStorage() {
            return this.feStorage;
        }

        /**
         * @return haFeResourceSpec
         */
        public HaFeResourceSpec getHaFeResourceSpec() {
            return this.haFeResourceSpec;
        }

        /**
         * @return localSSDInstanceTypeConstraints
         */
        public java.util.List<LocalSSDInstanceTypeConstraints> getLocalSSDInstanceTypeConstraints() {
            return this.localSSDInstanceTypeConstraints;
        }

        /**
         * @return normalFeResourceSpec
         */
        public NormalFeResourceSpec getNormalFeResourceSpec() {
            return this.normalFeResourceSpec;
        }

        /**
         * @return specType
         */
        public java.util.List<SpecType> getSpecType() {
            return this.specType;
        }

        /**
         * @return splitDiskThresholdMap
         */
        public java.util.Map<String, java.util.Map<String, ?>> getSplitDiskThresholdMap() {
            return this.splitDiskThresholdMap;
        }

        /**
         * @return versionConstraint
         */
        public VersionConstraint getVersionConstraint() {
            return this.versionConstraint;
        }

        /**
         * @return zoneSupportedEedTypes
         */
        public java.util.Map<String, java.util.List<String>> getZoneSupportedEedTypes() {
            return this.zoneSupportedEedTypes;
        }

        /**
         * @return zoneSupportedSpecTypes
         */
        public java.util.Map<String, java.util.List<String>> getZoneSupportedSpecTypes() {
            return this.zoneSupportedSpecTypes;
        }

        /**
         * @return compactionServiceCuConstraint
         */
        public CompactionServiceCuConstraint getCompactionServiceCuConstraint() {
            return this.compactionServiceCuConstraint;
        }

        public static final class Builder {
            private java.util.List<Integer> agentCu; 
            private java.util.List<Integer> beCu; 
            private java.util.List<Integer> beCuOnEcs; 
            private BeNumber beNumber; 
            private java.util.List<BeStorageConstraints> beStorageConstraints; 
            private java.util.List<BigDataInstanceTypeConstraints> bigDataInstanceTypeConstraints; 
            private java.util.List<Integer> feCu; 
            private java.util.List<Integer> feCuOnEcs; 
            private FeNumber feNumber; 
            private java.util.List<FeSpecType> feSpecType; 
            private FeStorage feStorage; 
            private HaFeResourceSpec haFeResourceSpec; 
            private java.util.List<LocalSSDInstanceTypeConstraints> localSSDInstanceTypeConstraints; 
            private NormalFeResourceSpec normalFeResourceSpec; 
            private java.util.List<SpecType> specType; 
            private java.util.Map<String, java.util.Map<String, ?>> splitDiskThresholdMap; 
            private VersionConstraint versionConstraint; 
            private java.util.Map<String, java.util.List<String>> zoneSupportedEedTypes; 
            private java.util.Map<String, java.util.List<String>> zoneSupportedSpecTypes; 
            private CompactionServiceCuConstraint compactionServiceCuConstraint; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentCu = model.agentCu;
                this.beCu = model.beCu;
                this.beCuOnEcs = model.beCuOnEcs;
                this.beNumber = model.beNumber;
                this.beStorageConstraints = model.beStorageConstraints;
                this.bigDataInstanceTypeConstraints = model.bigDataInstanceTypeConstraints;
                this.feCu = model.feCu;
                this.feCuOnEcs = model.feCuOnEcs;
                this.feNumber = model.feNumber;
                this.feSpecType = model.feSpecType;
                this.feStorage = model.feStorage;
                this.haFeResourceSpec = model.haFeResourceSpec;
                this.localSSDInstanceTypeConstraints = model.localSSDInstanceTypeConstraints;
                this.normalFeResourceSpec = model.normalFeResourceSpec;
                this.specType = model.specType;
                this.splitDiskThresholdMap = model.splitDiskThresholdMap;
                this.versionConstraint = model.versionConstraint;
                this.zoneSupportedEedTypes = model.zoneSupportedEedTypes;
                this.zoneSupportedSpecTypes = model.zoneSupportedSpecTypes;
                this.compactionServiceCuConstraint = model.compactionServiceCuConstraint;
            } 

            /**
             * AgentCu.
             */
            public Builder agentCu(java.util.List<Integer> agentCu) {
                this.agentCu = agentCu;
                return this;
            }

            /**
             * BeCu.
             */
            public Builder beCu(java.util.List<Integer> beCu) {
                this.beCu = beCu;
                return this;
            }

            /**
             * BeCuOnEcs.
             */
            public Builder beCuOnEcs(java.util.List<Integer> beCuOnEcs) {
                this.beCuOnEcs = beCuOnEcs;
                return this;
            }

            /**
             * BeNumber.
             */
            public Builder beNumber(BeNumber beNumber) {
                this.beNumber = beNumber;
                return this;
            }

            /**
             * BeStorageConstraints.
             */
            public Builder beStorageConstraints(java.util.List<BeStorageConstraints> beStorageConstraints) {
                this.beStorageConstraints = beStorageConstraints;
                return this;
            }

            /**
             * BigDataInstanceTypeConstraints.
             */
            public Builder bigDataInstanceTypeConstraints(java.util.List<BigDataInstanceTypeConstraints> bigDataInstanceTypeConstraints) {
                this.bigDataInstanceTypeConstraints = bigDataInstanceTypeConstraints;
                return this;
            }

            /**
             * FeCu.
             */
            public Builder feCu(java.util.List<Integer> feCu) {
                this.feCu = feCu;
                return this;
            }

            /**
             * FeCuOnEcs.
             */
            public Builder feCuOnEcs(java.util.List<Integer> feCuOnEcs) {
                this.feCuOnEcs = feCuOnEcs;
                return this;
            }

            /**
             * FeNumber.
             */
            public Builder feNumber(FeNumber feNumber) {
                this.feNumber = feNumber;
                return this;
            }

            /**
             * FeSpecType.
             */
            public Builder feSpecType(java.util.List<FeSpecType> feSpecType) {
                this.feSpecType = feSpecType;
                return this;
            }

            /**
             * FeStorage.
             */
            public Builder feStorage(FeStorage feStorage) {
                this.feStorage = feStorage;
                return this;
            }

            /**
             * HaFeResourceSpec.
             */
            public Builder haFeResourceSpec(HaFeResourceSpec haFeResourceSpec) {
                this.haFeResourceSpec = haFeResourceSpec;
                return this;
            }

            /**
             * LocalSSDInstanceTypeConstraints.
             */
            public Builder localSSDInstanceTypeConstraints(java.util.List<LocalSSDInstanceTypeConstraints> localSSDInstanceTypeConstraints) {
                this.localSSDInstanceTypeConstraints = localSSDInstanceTypeConstraints;
                return this;
            }

            /**
             * NormalFeResourceSpec.
             */
            public Builder normalFeResourceSpec(NormalFeResourceSpec normalFeResourceSpec) {
                this.normalFeResourceSpec = normalFeResourceSpec;
                return this;
            }

            /**
             * SpecType.
             */
            public Builder specType(java.util.List<SpecType> specType) {
                this.specType = specType;
                return this;
            }

            /**
             * SplitDiskThresholdMap.
             */
            public Builder splitDiskThresholdMap(java.util.Map<String, java.util.Map<String, ?>> splitDiskThresholdMap) {
                this.splitDiskThresholdMap = splitDiskThresholdMap;
                return this;
            }

            /**
             * VersionConstraint.
             */
            public Builder versionConstraint(VersionConstraint versionConstraint) {
                this.versionConstraint = versionConstraint;
                return this;
            }

            /**
             * ZoneSupportedEedTypes.
             */
            public Builder zoneSupportedEedTypes(java.util.Map<String, java.util.List<String>> zoneSupportedEedTypes) {
                this.zoneSupportedEedTypes = zoneSupportedEedTypes;
                return this;
            }

            /**
             * ZoneSupportedSpecTypes.
             */
            public Builder zoneSupportedSpecTypes(java.util.Map<String, java.util.List<String>> zoneSupportedSpecTypes) {
                this.zoneSupportedSpecTypes = zoneSupportedSpecTypes;
                return this;
            }

            /**
             * compactionServiceCuConstraint.
             */
            public Builder compactionServiceCuConstraint(CompactionServiceCuConstraint compactionServiceCuConstraint) {
                this.compactionServiceCuConstraint = compactionServiceCuConstraint;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
