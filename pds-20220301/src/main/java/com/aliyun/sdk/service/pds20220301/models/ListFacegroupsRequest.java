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
 * {@link ListFacegroupsRequest} extends {@link RequestModel}
 *
 * <p>ListFacegroupsRequest</p>
 */
public class ListFacegroupsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remarks")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String remarks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("return_total_count")
    private Boolean returnTotalCount;

    private ListFacegroupsRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.remarks = builder.remarks;
        this.returnTotalCount = builder.returnTotalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFacegroupsRequest create() {
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
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
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
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * @return returnTotalCount
     */
    public Boolean getReturnTotalCount() {
        return this.returnTotalCount;
    }

    public static final class Builder extends Request.Builder<ListFacegroupsRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private Integer limit; 
        private String marker; 
        private String remarks; 
        private Boolean returnTotalCount; 

        private Builder() {
            super();
        } 

        private Builder(ListFacegroupsRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.limit = request.limit;
            this.marker = request.marker;
            this.remarks = request.remarks;
            this.returnTotalCount = request.returnTotalCount;
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
         * <p>The drive ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is left empty.</p>
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
         * <p>The filter condition that is used to query groups. The value can be up to 128 characters in length. An exact match is used.</p>
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        /**
         * return_total_count.
         */
        public Builder returnTotalCount(Boolean returnTotalCount) {
            this.putBodyParameter("return_total_count", returnTotalCount);
            this.returnTotalCount = returnTotalCount;
            return this;
        }

        @Override
        public ListFacegroupsRequest build() {
            return new ListFacegroupsRequest(this);
        } 

    } 

}
