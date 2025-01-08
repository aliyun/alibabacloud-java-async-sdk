// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link ListPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListPoliciesRequest</p>
 */
public class ListPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxItems")
    private Integer maxItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    private ListPoliciesRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.maxItems = builder.maxItems;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItems
     */
    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<ListPoliciesRequest, Builder> {
        private String marker; 
        private Integer maxItems; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(ListPoliciesRequest request) {
            super(request);
            this.marker = request.marker;
            this.maxItems = request.maxItems;
            this.policyType = request.policyType;
        } 

        /**
         * <p>The <code>Marker</code>. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The number of entries to return. If a response is truncated because it reaches the value of <code>MaxItems</code>, the value of <code>IsTruncated</code> will be <code>true</code>.</p>
         * <p>Valid values: 1 to 1000. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxItems(Integer maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        /**
         * <p>The type of the <code>Policy</code>. Valid values: <code>System</code> and <code>Custom</code>. If you do not specify the parameter, all policies are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public ListPoliciesRequest build() {
            return new ListPoliciesRequest(this);
        } 

    } 

}
