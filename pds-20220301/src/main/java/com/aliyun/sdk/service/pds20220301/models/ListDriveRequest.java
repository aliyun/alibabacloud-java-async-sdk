// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ListDriveRequest} extends {@link RequestModel}
 *
 * <p>ListDriveRequest</p>
 */
public class ListDriveRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("owner_type")
    private String ownerType;

    private ListDriveRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.owner = builder.owner;
        this.ownerType = builder.ownerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDriveRequest create() {
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

    public static final class Builder extends Request.Builder<ListDriveRequest, Builder> {
        private String domainId; 
        private Integer limit; 
        private String marker; 
        private String owner; 
        private String ownerType; 

        private Builder() {
            super();
        } 

        private Builder(ListDriveRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.limit = request.limit;
            this.marker = request.marker;
            this.owner = request.owner;
            this.ownerType = request.ownerType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The owner of the drive. If this parameter is not specified, all drives are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The type of the owner. Valid values:</p>
         * <p>user and group.</p>
         * <p>By default, drives of all owner types are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder ownerType(String ownerType) {
            this.putBodyParameter("owner_type", ownerType);
            this.ownerType = ownerType;
            return this;
        }

        @Override
        public ListDriveRequest build() {
            return new ListDriveRequest(this);
        } 

    } 

}
