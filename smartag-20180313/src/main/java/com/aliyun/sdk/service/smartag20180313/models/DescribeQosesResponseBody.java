// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeQosesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQosesResponseBody</p>
 */
public class DescribeQosesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Qoses")
    private Qoses qoses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeQosesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.qoses = builder.qoses;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQosesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return qoses
     */
    public Qoses getQoses() {
        return this.qoses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private Qoses qoses; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeQosesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.qoses = model.qoses;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of QoS policies.</p>
         */
        public Builder qoses(Qoses qoses) {
            this.qoses = qoses;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2B5F35DD-0D66-41FC-AA99-BAE473E1A7A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of QoS polices.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeQosesResponseBody build() {
            return new DescribeQosesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeQosesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQosesResponseBody</p>
     */
    public static class Qos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QosDescription")
        private String qosDescription;

        @com.aliyun.core.annotation.NameInMap("QosId")
        private String qosId;

        @com.aliyun.core.annotation.NameInMap("QosName")
        private String qosName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SagCount")
        private String sagCount;

        @com.aliyun.core.annotation.NameInMap("SmartAGIds")
        private String smartAGIds;

        private Qos(Builder builder) {
            this.qosDescription = builder.qosDescription;
            this.qosId = builder.qosId;
            this.qosName = builder.qosName;
            this.resourceGroupId = builder.resourceGroupId;
            this.sagCount = builder.sagCount;
            this.smartAGIds = builder.smartAGIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Qos create() {
            return builder().build();
        }

        /**
         * @return qosDescription
         */
        public String getQosDescription() {
            return this.qosDescription;
        }

        /**
         * @return qosId
         */
        public String getQosId() {
            return this.qosId;
        }

        /**
         * @return qosName
         */
        public String getQosName() {
            return this.qosName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sagCount
         */
        public String getSagCount() {
            return this.sagCount;
        }

        /**
         * @return smartAGIds
         */
        public String getSmartAGIds() {
            return this.smartAGIds;
        }

        public static final class Builder {
            private String qosDescription; 
            private String qosId; 
            private String qosName; 
            private String resourceGroupId; 
            private String sagCount; 
            private String smartAGIds; 

            private Builder() {
            } 

            private Builder(Qos model) {
                this.qosDescription = model.qosDescription;
                this.qosId = model.qosId;
                this.qosName = model.qosName;
                this.resourceGroupId = model.resourceGroupId;
                this.sagCount = model.sagCount;
                this.smartAGIds = model.smartAGIds;
            } 

            /**
             * <p>The description of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder qosDescription(String qosDescription) {
                this.qosDescription = qosDescription;
                return this;
            }

            /**
             * <p>The ID of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-oek3r2cmvk7m8q****</p>
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            /**
             * <p>The name of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>zxtest</p>
             */
            public Builder qosName(String qosName) {
                this.qosName = qosName;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the QoS policy belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm2iu4fnc****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The number of the SAG instances to which the QoS policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sagCount(String sagCount) {
                this.sagCount = sagCount;
                return this;
            }

            /**
             * <p>The IDs of the SAG instances to which the QoS policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-x34wj76fe0vhw*****,sag-jp04l844chg16*****</p>
             */
            public Builder smartAGIds(String smartAGIds) {
                this.smartAGIds = smartAGIds;
                return this;
            }

            public Qos build() {
                return new Qos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeQosesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQosesResponseBody</p>
     */
    public static class Qoses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Qos")
        private java.util.List<Qos> qos;

        private Qoses(Builder builder) {
            this.qos = builder.qos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Qoses create() {
            return builder().build();
        }

        /**
         * @return qos
         */
        public java.util.List<Qos> getQos() {
            return this.qos;
        }

        public static final class Builder {
            private java.util.List<Qos> qos; 

            private Builder() {
            } 

            private Builder(Qoses model) {
                this.qos = model.qos;
            } 

            /**
             * Qos.
             */
            public Builder qos(java.util.List<Qos> qos) {
                this.qos = qos;
                return this;
            }

            public Qoses build() {
                return new Qoses(this);
            } 

        } 

    }
}
