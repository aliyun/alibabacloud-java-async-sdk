// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDataTrackResultDownloadStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryDataTrackResultDownloadStatusRequest</p>
 */
public class QueryDataTrackResultDownloadStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String downloadKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private QueryDataTrackResultDownloadStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.downloadKeyId = builder.downloadKeyId;
        this.orderId = builder.orderId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataTrackResultDownloadStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return downloadKeyId
     */
    public String getDownloadKeyId() {
        return this.downloadKeyId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<QueryDataTrackResultDownloadStatusRequest, Builder> {
        private String regionId; 
        private String downloadKeyId; 
        private Long orderId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(QueryDataTrackResultDownloadStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.downloadKeyId = request.downloadKeyId;
            this.orderId = request.orderId;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the download key, which is used to identify the parsing progress of data tracking logs. You can call the DownloadDataTrackResult operation to query the ID of the key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e23dd7ec-a19f-4a69-8eb3-8ffd26e6****</p>
         */
        public Builder downloadKeyId(String downloadKeyId) {
            this.putQueryParameter("DownloadKeyId", downloadKeyId);
            this.downloadKeyId = downloadKeyId;
            return this;
        }

        /**
         * <p>The ID of the ticket. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to query the ID of the ticket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11****</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public QueryDataTrackResultDownloadStatusRequest build() {
            return new QueryDataTrackResultDownloadStatusRequest(this);
        } 

    } 

}
