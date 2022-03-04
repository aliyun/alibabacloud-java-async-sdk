// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAttachmentAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAttachmentAttributesResponseBody</p>
 */
public class DescribeInstanceAttachmentAttributesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Instances")
    private Instances instances;

    private DescribeInstanceAttachmentAttributesResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAttachmentAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private Instances instances; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number of the instance status list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of records that meet the query criteria.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A collection of private pool information that matches the instance.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        public DescribeInstanceAttachmentAttributesResponseBody build() {
            return new DescribeInstanceAttachmentAttributesResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        private String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        private Instance(Builder builder) {
            this.instanceId = builder.instanceId;
            this.privatePoolOptionsMatchCriteria = builder.privatePoolOptionsMatchCriteria;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return privatePoolOptionsMatchCriteria
         */
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        /**
         * @return privatePoolOptionsId
         */
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public static final class Builder {
            private String instanceId; 
            private String privatePoolOptionsMatchCriteria; 
            private String privatePoolOptionsId; 

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The private pool matching mode of the instance. Possible values:
             * <p>
             * 
             * -Open: Open mode. The instance automatically matches the open private pool.
             * -Target: specifies the mode. The instance matches the specified private pool.
             * -None: the mode is not used. The instance does not use a private pool.
             */
            public Builder privatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
                this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
                return this;
            }

            /**
             * The ID of the private pool. When "privatepooloptionsmatchbeautia" returns "Open", the private pool ID is the ID of the private pool allocated when the system automatically matches.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
