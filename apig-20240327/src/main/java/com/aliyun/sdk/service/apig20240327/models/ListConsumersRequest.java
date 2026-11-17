// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListConsumersRequest} extends {@link RequestModel}
 *
 * <p>ListConsumersRequest</p>
 */
public class ListConsumersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expireStatus")
    private String expireStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("includeExpirationSummary")
    private Boolean includeExpirationSummary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameLike")
    private String nameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListConsumersRequest(Builder builder) {
        super(builder);
        this.expireStatus = builder.expireStatus;
        this.gatewayType = builder.gatewayType;
        this.includeExpirationSummary = builder.includeExpirationSummary;
        this.nameLike = builder.nameLike;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireStatus
     */
    public String getExpireStatus() {
        return this.expireStatus;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return includeExpirationSummary
     */
    public Boolean getIncludeExpirationSummary() {
        return this.includeExpirationSummary;
    }

    /**
     * @return nameLike
     */
    public String getNameLike() {
        return this.nameLike;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListConsumersRequest, Builder> {
        private String expireStatus; 
        private String gatewayType; 
        private Boolean includeExpirationSummary; 
        private String nameLike; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListConsumersRequest request) {
            super(request);
            this.expireStatus = request.expireStatus;
            this.gatewayType = request.gatewayType;
            this.includeExpirationSummary = request.includeExpirationSummary;
            this.nameLike = request.nameLike;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>The validity status filter. Valid values: Permanent, InEffect, AboutToExpire, and Expired. You can specify multiple values separated by commas to form a union. If this parameter is not specified, all statuses are included and intersected with the name and display status filters.</p>
         * 
         * <strong>example:</strong>
         * <p>Expired,AboutToExpire</p>
         */
        public Builder expireStatus(String expireStatus) {
            this.putQueryParameter("expireStatus", expireStatus);
            this.expireStatus = expireStatus;
            return this;
        }

        /**
         * <p>The gateway type used for filtering. Currently, <strong>AI</strong> and <strong>API</strong> gateway types are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putQueryParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>Specifies whether to return the full expiration reminder count. Default value: false. The statistical scope is limited only by the current account and gatewayType.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeExpirationSummary(Boolean includeExpirationSummary) {
            this.putQueryParameter("includeExpirationSummary", includeExpirationSummary);
            this.includeExpirationSummary = includeExpirationSummary;
            return this;
        }

        /**
         * <p>The keyword used for fuzzy search by API name.</p>
         * 
         * <strong>example:</strong>
         * <p>UI-test</p>
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The display status filter. Valid values: Enabled (enabled and not expired), Disabled (disabled regardless of expiration), and Expired (enabled and expired). If this parameter is not specified, all statuses are included and intersected with other filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListConsumersRequest build() {
            return new ListConsumersRequest(this);
        } 

    } 

}
