// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityEventOperationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityEventOperationsRequest</p>
 */
public class DescribeSecurityEventOperationsRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityEventId")
    @Validation(required = true)
    private Long securityEventId;

    private DescribeSecurityEventOperationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.securityEventId = builder.securityEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventOperationsRequest create() {
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
     * @return securityEventId
     */
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityEventOperationsRequest, Builder> {
        private String regionId; 
        private Long securityEventId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityEventOperationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.securityEventId = request.securityEventId;
        } 

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The code of the operation performed on the alert. Valid values:
         * <p>
         * 
         * *   mark_mis_info: adds the alert to the whitelist without configuring rules. This operation is triggered by adding multiple alerts to the whitelist at a time.
         * *   advance_mark_mis_inf: adds the alert to the whitelist by configuring advanced rules.
         * *   defense_mark_mis_info: adds the alert to the whitelist by configuring precise defense rules.
         * *   rm_mark_mis_info: removes the alert from the whitelist.
         * *   rm_defense_mark_mis_info: removes the alert from the whitelist configured with precise defense rules.
         * *   manual_handled: manually handles the alert.
         * *   ignore: ignores the alert.
         * *   quara: quarantines the source file of the malicious process.
         * *   block_ip: blocks access from the source IP address.
         * *   kill_and_quara: terminates the malicious process and quarantines the source file.
         */
        public Builder securityEventId(Long securityEventId) {
            this.putQueryParameter("SecurityEventId", securityEventId);
            this.securityEventId = securityEventId;
            return this;
        }

        @Override
        public DescribeSecurityEventOperationsRequest build() {
            return new DescribeSecurityEventOperationsRequest(this);
        } 

    } 

}
