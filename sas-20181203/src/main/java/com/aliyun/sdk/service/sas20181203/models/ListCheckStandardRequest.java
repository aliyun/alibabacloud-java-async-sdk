// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckStandardRequest} extends {@link RequestModel}
 *
 * <p>ListCheckStandardRequest</p>
 */
public class ListCheckStandardRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSubTypes")
    private java.util.List < String > instanceSubTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List < String > vendors;

    private ListCheckStandardRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.instanceSubTypes = builder.instanceSubTypes;
        this.instanceTypes = builder.instanceTypes;
        this.lang = builder.lang;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckStandardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceSubTypes
     */
    public java.util.List < String > getInstanceSubTypes() {
        return this.instanceSubTypes;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return vendors
     */
    public java.util.List < String > getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<ListCheckStandardRequest, Builder> {
        private java.util.List < String > instanceIds; 
        private java.util.List < String > instanceSubTypes; 
        private java.util.List < String > instanceTypes; 
        private String lang; 
        private java.util.List < String > vendors; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckStandardRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.instanceSubTypes = request.instanceSubTypes;
            this.instanceTypes = request.instanceTypes;
            this.lang = request.lang;
            this.vendors = request.vendors;
        } 

        /**
         * The instance IDs of the cloud services to which the check items belong.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The subtypes of cloud services.
         */
        public Builder instanceSubTypes(java.util.List < String > instanceSubTypes) {
            this.putQueryParameter("InstanceSubTypes", instanceSubTypes);
            this.instanceSubTypes = instanceSubTypes;
            return this;
        }

        /**
         * The asset types of cloud services.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.putQueryParameter("InstanceTypes", instanceTypes);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
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
         * The cloud service providers. Valid values:
         * <p>
         * 
         * *   **ALIYUN**: Alibaba Cloud
         */
        public Builder vendors(java.util.List < String > vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public ListCheckStandardRequest build() {
            return new ListCheckStandardRequest(this);
        } 

    } 

}
