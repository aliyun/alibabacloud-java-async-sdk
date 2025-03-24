// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CancelCoordinationForMonitoringRequest} extends {@link RequestModel}
 *
 * <p>CancelCoordinationForMonitoringRequest</p>
 */
public class CancelCoordinationForMonitoringRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> coIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private CancelCoordinationForMonitoringRequest(Builder builder) {
        super(builder);
        this.coIds = builder.coIds;
        this.endUserId = builder.endUserId;
        this.regionId = builder.regionId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCoordinationForMonitoringRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coIds
     */
    public java.util.List<String> getCoIds() {
        return this.coIds;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<CancelCoordinationForMonitoringRequest, Builder> {
        private java.util.List<String> coIds; 
        private String endUserId; 
        private String regionId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(CancelCoordinationForMonitoringRequest request) {
            super(request);
            this.coIds = request.coIds;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.userType = request.userType;
        } 

        /**
         * <p>The IDs of stream collaboration tasks.</p>
         * <p>This parameter is required.</p>
         */
        public Builder coIds(java.util.List<String> coIds) {
            this.putQueryParameter("CoIds", coIds);
            this.coIds = coIds;
            return this;
        }

        /**
         * <p>The ID of the end user that initiates stream collaboration. If the initiator is the administrator, skip this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/436773.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the user.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>TENANT_ADMIN: administrator.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TENANT_ADMIN</p>
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public CancelCoordinationForMonitoringRequest build() {
            return new CancelCoordinationForMonitoringRequest(this);
        } 

    } 

}
