// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceIpWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceIpWhitelistRequest</p>
 */
public class ListInstanceIpWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ipWhitelist")
    private String ipWhitelist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100000000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 10)
    private Integer pageSize;

    private ListInstanceIpWhitelistRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ipWhitelist = builder.ipWhitelist;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceIpWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipWhitelist
     */
    public String getIpWhitelist() {
        return this.ipWhitelist;
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

    public static final class Builder extends Request.Builder<ListInstanceIpWhitelistRequest, Builder> {
        private String instanceId; 
        private String ipWhitelist; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceIpWhitelistRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ipWhitelist = request.ipWhitelist;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ipWhitelist.
         */
        public Builder ipWhitelist(String ipWhitelist) {
            this.putQueryParameter("ipWhitelist", ipWhitelist);
            this.ipWhitelist = ipWhitelist;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListInstanceIpWhitelistRequest build() {
            return new ListInstanceIpWhitelistRequest(this);
        } 

    } 

}
