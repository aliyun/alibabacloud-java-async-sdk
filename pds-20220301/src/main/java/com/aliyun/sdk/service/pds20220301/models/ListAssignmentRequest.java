// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssignmentRequest} extends {@link RequestModel}
 *
 * <p>ListAssignmentRequest</p>
 */
public class ListAssignmentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("manage_resource_id")
    private String manageResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("manage_resource_type")
    private String manageResourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    private ListAssignmentRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.limit = builder.limit;
        this.manageResourceId = builder.manageResourceId;
        this.manageResourceType = builder.manageResourceType;
        this.marker = builder.marker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssignmentRequest create() {
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
     * @return manageResourceId
     */
    public String getManageResourceId() {
        return this.manageResourceId;
    }

    /**
     * @return manageResourceType
     */
    public String getManageResourceType() {
        return this.manageResourceType;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    public static final class Builder extends Request.Builder<ListAssignmentRequest, Builder> {
        private String domainId; 
        private Integer limit; 
        private String manageResourceId; 
        private String manageResourceType; 
        private String marker; 

        private Builder() {
            super();
        } 

        private Builder(ListAssignmentRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.limit = request.limit;
            this.manageResourceId = request.manageResourceId;
            this.manageResourceType = request.manageResourceType;
            this.marker = request.marker;
        } 

        /**
         * A short description of struct
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The maximum number of results to return. Valid values: 1 to 100.
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
         * The ID of the managed resource, such as a group ID.
         */
        public Builder manageResourceId(String manageResourceId) {
            this.putBodyParameter("manage_resource_id", manageResourceId);
            this.manageResourceId = manageResourceId;
            return this;
        }

        /**
         * The type of the managed resource. Set the value to RT_Group, which specifies that the administrators of a group are queried.
         */
        public Builder manageResourceType(String manageResourceType) {
            this.putBodyParameter("manage_resource_type", manageResourceType);
            this.manageResourceType = manageResourceType;
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
        public ListAssignmentRequest build() {
            return new ListAssignmentRequest(this);
        } 

    } 

}
