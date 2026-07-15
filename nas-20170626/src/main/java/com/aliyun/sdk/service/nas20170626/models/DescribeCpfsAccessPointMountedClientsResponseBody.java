// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeCpfsAccessPointMountedClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCpfsAccessPointMountedClientsResponseBody</p>
 */
public class DescribeCpfsAccessPointMountedClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountedClient")
    private java.util.List<MountedClient> mountedClient;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCpfsAccessPointMountedClientsResponseBody(Builder builder) {
        this.mountedClient = builder.mountedClient;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCpfsAccessPointMountedClientsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mountedClient
     */
    public java.util.List<MountedClient> getMountedClient() {
        return this.mountedClient;
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
        private java.util.List<MountedClient> mountedClient; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCpfsAccessPointMountedClientsResponseBody model) {
            this.mountedClient = model.mountedClient;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MountedClient.
         */
        public Builder mountedClient(java.util.List<MountedClient> mountedClient) {
            this.mountedClient = mountedClient;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCpfsAccessPointMountedClientsResponseBody build() {
            return new DescribeCpfsAccessPointMountedClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCpfsAccessPointMountedClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCpfsAccessPointMountedClientsResponseBody</p>
     */
    public static class MountedClient extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        private MountedClient(Builder builder) {
            this.channelType = builder.channelType;
            this.clientId = builder.clientId;
            this.clientIp = builder.clientIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountedClient create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        public static final class Builder {
            private String channelType; 
            private String clientId; 
            private String clientIp; 

            private Builder() {
            } 

            private Builder(MountedClient model) {
                this.channelType = model.channelType;
                this.clientId = model.clientId;
                this.clientIp = model.clientIp;
            } 

            /**
             * ChannelType.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            public MountedClient build() {
                return new MountedClient(this);
            } 

        } 

    }
}
