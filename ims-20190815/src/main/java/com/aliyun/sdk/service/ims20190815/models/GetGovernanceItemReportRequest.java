// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetGovernanceItemReportRequest} extends {@link RequestModel}
 *
 * <p>GetGovernanceItemReportRequest</p>
 */
public class GetGovernanceItemReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GovernanceItemType")
    private String governanceItemType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxItems")
    private String maxItems;

    private GetGovernanceItemReportRequest(Builder builder) {
        super(builder);
        this.governanceItemType = builder.governanceItemType;
        this.marker = builder.marker;
        this.maxItems = builder.maxItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGovernanceItemReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return governanceItemType
     */
    public String getGovernanceItemType() {
        return this.governanceItemType;
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
    public String getMaxItems() {
        return this.maxItems;
    }

    public static final class Builder extends Request.Builder<GetGovernanceItemReportRequest, Builder> {
        private String governanceItemType; 
        private String marker; 
        private String maxItems; 

        private Builder() {
            super();
        } 

        private Builder(GetGovernanceItemReportRequest request) {
            super(request);
            this.governanceItemType = request.governanceItemType;
            this.marker = request.marker;
            this.maxItems = request.maxItems;
        } 

        /**
         * GovernanceItemType.
         */
        public Builder governanceItemType(String governanceItemType) {
            this.putQueryParameter("GovernanceItemType", governanceItemType);
            this.governanceItemType = governanceItemType;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * MaxItems.
         */
        public Builder maxItems(String maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        @Override
        public GetGovernanceItemReportRequest build() {
            return new GetGovernanceItemReportRequest(this);
        } 

    } 

}
