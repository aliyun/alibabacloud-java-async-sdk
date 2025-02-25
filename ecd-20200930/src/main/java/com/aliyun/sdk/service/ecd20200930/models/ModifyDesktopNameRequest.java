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
 * {@link ModifyDesktopNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopNameRequest</p>
 */
public class ModifyDesktopNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDesktopName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newDesktopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyDesktopNameRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.newDesktopName = builder.newDesktopName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopNameRequest create() {
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
     * @return newDesktopName
     */
    public String getNewDesktopName() {
        return this.newDesktopName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopNameRequest, Builder> {
        private String desktopId; 
        private String newDesktopName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopNameRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.newDesktopName = request.newDesktopName;
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
         * <p>The new name of the cloud computer. The name of the cloud computer must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 1 to 64 characters in length.</li>
         * <li>The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The name can only contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder newDesktopName(String newDesktopName) {
            this.putQueryParameter("NewDesktopName", newDesktopName);
            this.newDesktopName = newDesktopName;
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
        public ModifyDesktopNameRequest build() {
            return new ModifyDesktopNameRequest(this);
        } 

    } 

}
