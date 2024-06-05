// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShareLinkRequest} extends {@link RequestModel}
 *
 * <p>ListShareLinkRequest</p>
 */
public class ListShareLinkRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("include_cancelled")
    private Boolean includeCancelled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_by")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_direction")
    private String orderDirection;

    private ListShareLinkRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.creator = builder.creator;
        this.includeCancelled = builder.includeCancelled;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShareLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return includeCancelled
     */
    public Boolean getIncludeCancelled() {
        return this.includeCancelled;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public static final class Builder extends Request.Builder<ListShareLinkRequest, Builder> {
        private String domainId; 
        private String creator; 
        private Boolean includeCancelled; 
        private Integer limit; 
        private String marker; 
        private String orderBy; 
        private String orderDirection; 

        private Builder() {
            super();
        } 

        private Builder(ListShareLinkRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.creator = request.creator;
            this.includeCancelled = request.includeCancelled;
            this.limit = request.limit;
            this.marker = request.marker;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The creator of the share.
         */
        public Builder creator(String creator) {
            this.putBodyParameter("creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * Specifies whether to return the shares that are canceled.
         */
        public Builder includeCancelled(Boolean includeCancelled) {
            this.putBodyParameter("include_cancelled", includeCancelled);
            this.includeCancelled = includeCancelled;
            return this;
        }

        /**
         * The maximum number of results to return. Valid values: 0 to 100.
         * <p>
         * 
         * The number of returned results must be less than or equal to the specified number.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\
         * <p>
         * By default, this parameter is left empty.
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * The field by which to sort the returned results. Default value: created_at. Valid values:
         * <p>
         * 
         * *   share_name: sorts the results by the name of the share.
         * *   updated_at: sorts the results by the time when the share was modified.
         * *   description: sorts the results by the description of the share.
         * *   created_at: sorts the results by the time when the share was created.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("order_by", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The order in which you want to sort the returned results. By default, order_direction is set to DESC if order_by is set to created_at or updated_at, and is set to ASC if order_by is set to other values. Valid values:
         * <p>
         * 
         * *   ASC: sorts the results in ascending order.
         * *   DESC: sorts the results in descending order.
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("order_direction", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        @Override
        public ListShareLinkRequest build() {
            return new ListShareLinkRequest(this);
        } 

    } 

}
