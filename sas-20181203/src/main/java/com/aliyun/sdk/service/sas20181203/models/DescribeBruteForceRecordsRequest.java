// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeBruteForceRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBruteForceRecordsRequest</p>
 */
public class DescribeBruteForceRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockIp")
    private String blockIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeBruteForceRecordsRequest(Builder builder) {
        super(builder);
        this.blockIp = builder.blockIp;
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBruteForceRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockIp
     */
    public String getBlockIp() {
        return this.blockIp;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeBruteForceRecordsRequest, Builder> {
        private String blockIp; 
        private Integer currentPage; 
        private String instanceId; 
        private Integer pageSize; 
        private String remark; 
        private Long resourceOwnerId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBruteForceRecordsRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
        } 

        /**
         * <p>The IP address that is blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>175.106.XX.XX</p>
         */
        public Builder blockIp(String blockIp) {
            this.putQueryParameter("BlockIp", blockIp);
            this.blockIp = blockIp;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1g6wxdwps7s9dz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page. We recommend that you do not leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name or IP address of the server to query.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The status of the defense rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: invalid</li>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>2</strong>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeBruteForceRecordsRequest build() {
            return new DescribeBruteForceRecordsRequest(this);
        } 

    } 

}
