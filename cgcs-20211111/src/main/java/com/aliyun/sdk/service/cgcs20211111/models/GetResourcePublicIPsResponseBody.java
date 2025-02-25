// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourcePublicIPsResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourcePublicIPsResponseBody</p>
 */
public class GetResourcePublicIPsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpList")
    private java.util.List < IpList> ipList;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetResourcePublicIPsResponseBody(Builder builder) {
        this.ipList = builder.ipList;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcePublicIPsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipList
     */
    public java.util.List < IpList> getIpList() {
        return this.ipList;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < IpList> ipList; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * IpList.
         */
        public Builder ipList(java.util.List < IpList> ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetResourcePublicIPsResponseBody build() {
            return new GetResourcePublicIPsResponseBody(this);
        } 

    } 

    public static class IpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        private IpList(Builder builder) {
            this.ip = builder.ip;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String ip; 
            private String projectId; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

        } 

    }
}
