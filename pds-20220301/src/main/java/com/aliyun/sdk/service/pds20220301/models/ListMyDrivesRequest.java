// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMyDrivesRequest} extends {@link RequestModel}
 *
 * <p>ListMyDrivesRequest</p>
 */
public class ListMyDrivesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    private ListMyDrivesRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.limit = builder.limit;
        this.marker = builder.marker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMyDrivesRequest create() {
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

    public static final class Builder extends Request.Builder<ListMyDrivesRequest, Builder> {
        private String domainId; 
        private Integer limit; 
        private String marker; 

        private Builder() {
            super();
        } 

        private Builder(ListMyDrivesRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.limit = request.limit;
            this.marker = request.marker;
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
         * The maximum number of results to return. Default value: 100. Valid values: 1 to 100.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is empty.
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        @Override
        public ListMyDrivesRequest build() {
            return new ListMyDrivesRequest(this);
        } 

    } 

}
