// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVpnSslServerLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpnSslServerLogsRequest</p>
 */
public class DescribeVpnSslServerLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private Integer from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinutePeriod")
    private Integer minutePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SslVpnClientCertId")
    private String sslVpnClientCertId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    private Integer to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnSslServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpnSslServerId;

    private DescribeVpnSslServerLogsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.minutePeriod = builder.minutePeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sslVpnClientCertId = builder.sslVpnClientCertId;
        this.to = builder.to;
        this.vpnSslServerId = builder.vpnSslServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnSslServerLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return minutePeriod
     */
    public Integer getMinutePeriod() {
        return this.minutePeriod;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sslVpnClientCertId
     */
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    /**
     * @return vpnSslServerId
     */
    public String getVpnSslServerId() {
        return this.vpnSslServerId;
    }

    public static final class Builder extends Request.Builder<DescribeVpnSslServerLogsRequest, Builder> {
        private Integer from; 
        private Integer minutePeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sslVpnClientCertId; 
        private Integer to; 
        private String vpnSslServerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpnSslServerLogsRequest request) {
            super(request);
            this.from = request.from;
            this.minutePeriod = request.minutePeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sslVpnClientCertId = request.sslVpnClientCertId;
            this.to = request.to;
            this.vpnSslServerId = request.vpnSslServerId;
        } 

        /**
         * <p>The beginning of the time range to query. The value must be a unix timestamp. For example, 1600738962 specifies 09:42:42 (UTC+8) on September 22, 2020.</p>
         * <blockquote>
         * <p> If you specify <strong>From</strong>, you must also specify <strong>To</strong> or <strong>MinutePeriod</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1600738962</p>
         */
        public Builder from(Integer from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The interval at which log data is queried. Unit: minutes.</p>
         * <blockquote>
         * <p> If both <strong>From</strong> and <strong>To</strong> are not specified, you must specify <strong>MinutePeriod</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder minutePeriod(Integer minutePeriod) {
            this.putQueryParameter("MinutePeriod", minutePeriod);
            this.minutePeriod = minutePeriod;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region where the SSL server is created. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * <p>The ID of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-m5euof6s5jy8vs5kd****</p>
         */
        public Builder sslVpnClientCertId(String sslVpnClientCertId) {
            this.putQueryParameter("SslVpnClientCertId", sslVpnClientCertId);
            this.sslVpnClientCertId = sslVpnClientCertId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value must be a unix timestamp. For example, 1600738962 specifies 09:42:42 (UTC+8) on September 22, 2020.</p>
         * <blockquote>
         * <p> If you specify <strong>To</strong>, you must also specify <strong>From</strong> or <strong>MinutePeriod</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1600738962</p>
         */
        public Builder to(Integer to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * <p>The ID of the SSL server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vss-bp155e9yclsg1xgq4****</p>
         */
        public Builder vpnSslServerId(String vpnSslServerId) {
            this.putQueryParameter("VpnSslServerId", vpnSslServerId);
            this.vpnSslServerId = vpnSslServerId;
            return this;
        }

        @Override
        public DescribeVpnSslServerLogsRequest build() {
            return new DescribeVpnSslServerLogsRequest(this);
        } 

    } 

}
