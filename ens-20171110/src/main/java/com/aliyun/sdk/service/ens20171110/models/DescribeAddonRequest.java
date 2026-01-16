// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeAddonRequest} extends {@link RequestModel}
 *
 * <p>DescribeAddonRequest</p>
 */
public class DescribeAddonRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonVersion")
    private String addonVersion;

    private DescribeAddonRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.addonVersion = builder.addonVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return addonVersion
     */
    public String getAddonVersion() {
        return this.addonVersion;
    }

    public static final class Builder extends Request.Builder<DescribeAddonRequest, Builder> {
        private String addonName; 
        private String addonVersion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAddonRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.addonVersion = request.addonVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>edge-csi-lite</p>
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("AddonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * AddonVersion.
         */
        public Builder addonVersion(String addonVersion) {
            this.putQueryParameter("AddonVersion", addonVersion);
            this.addonVersion = addonVersion;
            return this;
        }

        @Override
        public DescribeAddonRequest build() {
            return new DescribeAddonRequest(this);
        } 

    } 

}
