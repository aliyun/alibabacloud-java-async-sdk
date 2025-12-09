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
 * {@link DescribeCloudVendorProductTemplateConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudVendorProductTemplateConfigRequest</p>
 */
public class DescribeCloudVendorProductTemplateConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private DescribeCloudVendorProductTemplateConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudVendorProductTemplateConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<DescribeCloudVendorProductTemplateConfigRequest, Builder> {
        private String lang; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudVendorProductTemplateConfigRequest request) {
            super(request);
            this.lang = request.lang;
            this.vendor = request.vendor;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public DescribeCloudVendorProductTemplateConfigRequest build() {
            return new DescribeCloudVendorProductTemplateConfigRequest(this);
        } 

    } 

}
