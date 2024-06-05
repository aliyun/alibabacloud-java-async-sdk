// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchDriveRequest} extends {@link RequestModel}
 *
 * <p>SearchDriveRequest</p>
 */
public class SearchDriveRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_name")
    private String driveName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("owner_type")
    private String ownerType;

    private SearchDriveRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveName = builder.driveName;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.owner = builder.owner;
        this.ownerType = builder.ownerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDriveRequest create() {
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
     * @return driveName
     */
    public String getDriveName() {
        return this.driveName;
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    public static final class Builder extends Request.Builder<SearchDriveRequest, Builder> {
        private String domainId; 
        private String driveName; 
        private Integer limit; 
        private String marker; 
        private String owner; 
        private String ownerType; 

        private Builder() {
            super();
        } 

        private Builder(SearchDriveRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveName = request.driveName;
            this.limit = request.limit;
            this.marker = request.marker;
            this.owner = request.owner;
            this.ownerType = request.ownerType;
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
         * The drive name.
         */
        public Builder driveName(String driveName) {
            this.putBodyParameter("drive_name", driveName);
            this.driveName = driveName;
            return this;
        }

        /**
         * The maximum number of asynchronous tasks to return. Valid values: 1 to 100. Default value: 100.
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
         * The owner of the drive.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The type of the owner. Valid values:
         * <p>
         * 
         * user group
         */
        public Builder ownerType(String ownerType) {
            this.putBodyParameter("owner_type", ownerType);
            this.ownerType = ownerType;
            return this;
        }

        @Override
        public SearchDriveRequest build() {
            return new SearchDriveRequest(this);
        } 

    } 

}
