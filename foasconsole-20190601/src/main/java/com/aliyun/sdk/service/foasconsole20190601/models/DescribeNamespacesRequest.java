// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespacesRequest} extends {@link RequestModel}
 *
 * <p>DescribeNamespacesRequest</p>
 */
public class DescribeNamespacesRequest extends Request {
    @Query
    @NameInMap("DescribeNamespacesRequest")
    @Validation(required = true)
    private DescribeNamespacesRequestDescribeNamespacesRequest describeNamespacesRequest;

    private DescribeNamespacesRequest(Builder builder) {
        super(builder);
        this.describeNamespacesRequest = builder.describeNamespacesRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespacesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return describeNamespacesRequest
     */
    public DescribeNamespacesRequestDescribeNamespacesRequest getDescribeNamespacesRequest() {
        return this.describeNamespacesRequest;
    }

    public static final class Builder extends Request.Builder<DescribeNamespacesRequest, Builder> {
        private DescribeNamespacesRequestDescribeNamespacesRequest describeNamespacesRequest; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNamespacesRequest request) {
            super(request);
            this.describeNamespacesRequest = request.describeNamespacesRequest;
        } 

        /**
         * DescribeNamespacesRequest.
         */
        public Builder describeNamespacesRequest(DescribeNamespacesRequestDescribeNamespacesRequest describeNamespacesRequest) {
            this.putQueryParameter("DescribeNamespacesRequest", describeNamespacesRequest);
            this.describeNamespacesRequest = describeNamespacesRequest;
            return this;
        }

        @Override
        public DescribeNamespacesRequest build() {
            return new DescribeNamespacesRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DescribeNamespacesRequestDescribeNamespacesRequest extends TeaModel {
        @NameInMap("Ha")
        private Boolean ha;

        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("PageIndex")
        private Integer pageIndex;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private DescribeNamespacesRequestDescribeNamespacesRequest(Builder builder) {
            this.ha = builder.ha;
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.region = builder.region;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeNamespacesRequestDescribeNamespacesRequest create() {
            return builder().build();
        }

        /**
         * @return ha
         */
        public Boolean getHa() {
            return this.ha;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean ha; 
            private String instanceId; 
            private String namespace; 
            private Integer pageIndex; 
            private Integer pageSize; 
            private String region; 
            private java.util.List < Tags> tags; 

            /**
             * Ha.
             */
            public Builder ha(Boolean ha) {
                this.ha = ha;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public DescribeNamespacesRequestDescribeNamespacesRequest build() {
                return new DescribeNamespacesRequestDescribeNamespacesRequest(this);
            } 

        } 

    }
}
