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

        private Builder(DescribeNamespacesRequest response) {
            super(response);
            this.describeNamespacesRequest = response.describeNamespacesRequest;
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

    public static class DescribeNamespacesRequestDescribeNamespacesRequest extends TeaModel {
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

        private DescribeNamespacesRequestDescribeNamespacesRequest(Builder builder) {
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeNamespacesRequestDescribeNamespacesRequest create() {
            return builder().build();
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

        public static final class Builder {
            private String instanceId; 
            private String namespace; 
            private Integer pageIndex; 
            private Integer pageSize; 
            private String region; 

            /**
             * 实例id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 命名空间名称
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 当前页数
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * 每页大小
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * regionId
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public DescribeNamespacesRequestDescribeNamespacesRequest build() {
                return new DescribeNamespacesRequestDescribeNamespacesRequest(this);
            } 

        } 

    }
}
