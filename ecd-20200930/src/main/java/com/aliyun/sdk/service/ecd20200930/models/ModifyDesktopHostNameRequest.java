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
 * {@link ModifyDesktopHostNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopHostNameRequest</p>
 */
public class ModifyDesktopHostNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewHostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newHostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyDesktopHostNameRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.newHostName = builder.newHostName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopHostNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return newHostName
     */
    public String getNewHostName() {
        return this.newHostName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopHostNameRequest, Builder> {
        private String desktopId; 
        private String newHostName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopHostNameRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.newHostName = request.newHostName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the cloud computer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The new hostname of the cloud computer. The hostname must meet the following requirements:</p>
         * <ul>
         * <li>The hostname must be 2 to 15 characters in length.</li>
         * <li>The hostname can contain only letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NewName</p>
         */
        public Builder newHostName(String newHostName) {
            this.putQueryParameter("NewHostName", newHostName);
            this.newHostName = newHostName;
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

        @Override
        public ModifyDesktopHostNameRequest build() {
            return new ModifyDesktopHostNameRequest(this);
        } 

    } 

}
