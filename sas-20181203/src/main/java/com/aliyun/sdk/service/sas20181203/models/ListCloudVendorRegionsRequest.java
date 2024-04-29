// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudVendorRegionsRequest} extends {@link RequestModel}
 *
 * <p>ListCloudVendorRegionsRequest</p>
 */
public class ListCloudVendorRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private ListCloudVendorRegionsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudVendorRegionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListCloudVendorRegionsRequest, Builder> {
        private String lang; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudVendorRegionsRequest request) {
            super(request);
            this.lang = request.lang;
            this.vendor = request.vendor;
        } 

        /**
         * The language of the content in the request and response messages. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The service provider of cloud assets. Valid values:
         * <p>
         * 
         * *   **Tencent**, **HUAWEICLOUD**, **Azure**, and **AWS**: other service providers of cloud assets.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListCloudVendorRegionsRequest build() {
            return new ListCloudVendorRegionsRequest(this);
        } 

    } 

}
