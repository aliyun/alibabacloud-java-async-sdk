// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListAgenticSecurityPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListAgenticSecurityPoliciesRequest</p>
 */
public class ListAgenticSecurityPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeArchived")
    private Boolean includeArchived;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String policyStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer size;

    private ListAgenticSecurityPoliciesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.includeArchived = builder.includeArchived;
        this.page = builder.page;
        this.policyStatus = builder.policyStatus;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgenticSecurityPoliciesRequest create() {
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
     * @return includeArchived
     */
    public Boolean getIncludeArchived() {
        return this.includeArchived;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return policyStatus
     */
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListAgenticSecurityPoliciesRequest, Builder> {
        private String regionId; 
        private Boolean includeArchived; 
        private Integer page; 
        private String policyStatus; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListAgenticSecurityPoliciesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.includeArchived = request.includeArchived;
            this.page = request.page;
            this.policyStatus = request.policyStatus;
            this.size = request.size;
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
         * <p>Specifies whether to include archived policies in the query scope of user policies. Valid values:</p>
         * <ul>
         * <li>true: Includes archived policies.</li>
         * <li>false: Does not include archived policies.
         * Default value: false. When querying archived policies, do not specify PolicyStatus. If ON or OFF is specified, only user policies in the corresponding state are returned. This parameter does not affect system default policies.</li>
         * </ul>
         */
        public Builder includeArchived(Boolean includeArchived) {
            this.putQueryParameter("IncludeArchived", includeArchived);
            this.includeArchived = includeArchived;
            return this;
        }

        /**
         * <p>The page number of the user policies to query. Pages start from 1. Default value: 1. Only user policies are paginated. System default policies are returned separately in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The filter condition for the user policy status. Valid values: ON (enabled) and OFF (disabled). If this parameter is not specified or contains only whitespace characters, policies are not filtered by status. You cannot specify ARCHIVED. To query archived user policies, do not specify this parameter and set IncludeArchived to true. This parameter does not affect system default policies.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder policyStatus(String policyStatus) {
            this.putQueryParameter("PolicyStatus", policyStatus);
            this.policyStatus = policyStatus;
            return this;
        }

        /**
         * <p>The number of user policies to query on each page. Valid values: 1 to 100. Default value: 20. In addition, each call returns up to Size enabled system default policies. Therefore, the number of items in the returned Data may be greater than Size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListAgenticSecurityPoliciesRequest build() {
            return new ListAgenticSecurityPoliciesRequest(this);
        } 

    } 

}
