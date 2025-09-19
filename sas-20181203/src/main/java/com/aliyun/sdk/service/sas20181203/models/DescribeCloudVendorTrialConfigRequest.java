// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCloudVendorTrialConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudVendorTrialConfigRequest</p>
 */
public class DescribeCloudVendorTrialConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vendor;

    private DescribeCloudVendorTrialConfigRequest(Builder builder) {
        super(builder);
        this.authId = builder.authId;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudVendorTrialConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authId
     */
    public Long getAuthId() {
        return this.authId;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<DescribeCloudVendorTrialConfigRequest, Builder> {
        private Long authId; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudVendorTrialConfigRequest request) {
            super(request);
            this.authId = request.authId;
            this.vendor = request.vendor;
        } 

        /**
         * <p>Unique ID of the AK.</p>
         * <blockquote>
         * <h2>You can call <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> to get the AuthId.</h2>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23**</p>
         */
        public Builder authId(Long authId) {
            this.putQueryParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * <p>Cloud asset vendor. Values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud</li>
         * <li><strong>AWS</strong>: Amazon Web Services</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AWS</p>
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public DescribeCloudVendorTrialConfigRequest build() {
            return new DescribeCloudVendorTrialConfigRequest(this);
        } 

    } 

}
