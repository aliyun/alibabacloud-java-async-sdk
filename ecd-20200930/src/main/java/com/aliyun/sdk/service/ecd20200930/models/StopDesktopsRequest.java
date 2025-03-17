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
 * {@link StopDesktopsRequest} extends {@link RequestModel}
 *
 * <p>StopDesktopsRequest</p>
 */
public class StopDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoppedMode")
    private String stoppedMode;

    private StopDesktopsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.regionId = builder.regionId;
        this.stoppedMode = builder.stoppedMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDesktopsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stoppedMode
     */
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public static final class Builder extends Request.Builder<StopDesktopsRequest, Builder> {
        private java.util.List<String> desktopId; 
        private String regionId; 
        private String stoppedMode; 

        private Builder() {
            super();
        } 

        private Builder(StopDesktopsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.regionId = request.regionId;
            this.stoppedMode = request.stoppedMode;
        } 

        /**
         * <p>The IDs of the cloud computers. You can specify 1 to 20 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7w78ozhjcwa3u****</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The billing mode after you stop the cloud computer.</p>
         * <p>Default value: StopCharging. Valid values:</p>
         * <ul>
         * <li><p>StopCharging: After the cloud computer is stopped, the system automatically reclaims computing resources. You are no longer charged for computing resources. However, you are still charged for storage resources.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>KeepCharging: After the cloud computer is stopped, the system does not reclaim resources to prevent insufficient resources and startup failures. You are still charged for the resources.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StopCharging</p>
         */
        public Builder stoppedMode(String stoppedMode) {
            this.putQueryParameter("StoppedMode", stoppedMode);
            this.stoppedMode = stoppedMode;
            return this;
        }

        @Override
        public StopDesktopsRequest build() {
            return new StopDesktopsRequest(this);
        } 

    } 

}
