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
 * {@link ListAgentlessRegionResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentlessRegionResponseBody</p>
 */
public class ListAgentlessRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionList")
    private java.util.List<String> regionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VendorRegionList")
    private java.util.List<VendorRegionList> vendorRegionList;

    private ListAgentlessRegionResponseBody(Builder builder) {
        this.regionList = builder.regionList;
        this.requestId = builder.requestId;
        this.vendorRegionList = builder.vendorRegionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionList
     */
    public java.util.List<String> getRegionList() {
        return this.regionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRegionList
     */
    public java.util.List<VendorRegionList> getVendorRegionList() {
        return this.vendorRegionList;
    }

    public static final class Builder {
        private java.util.List<String> regionList; 
        private String requestId; 
        private java.util.List<VendorRegionList> vendorRegionList; 

        private Builder() {
        } 

        private Builder(ListAgentlessRegionResponseBody model) {
            this.regionList = model.regionList;
            this.requestId = model.requestId;
            this.vendorRegionList = model.vendorRegionList;
        } 

        /**
         * <p>The information about the regions.</p>
         */
        public Builder regionList(java.util.List<String> regionList) {
            this.regionList = regionList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the regions.</p>
         */
        public Builder vendorRegionList(java.util.List<VendorRegionList> vendorRegionList) {
            this.vendorRegionList = vendorRegionList;
            return this;
        }

        public ListAgentlessRegionResponseBody build() {
            return new ListAgentlessRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentlessRegionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentlessRegionResponseBody</p>
     */
    public static class VendorRegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private VendorRegionList(Builder builder) {
            this.regionId = builder.regionId;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VendorRegionList create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String regionId; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(VendorRegionList model) {
                this.regionId = model.regionId;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The type of the server. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Alibaba Cloud</li>
             * <li><strong>3</strong>: Tencent Cloud</li>
             * <li><strong>4</strong>: Huawei Cloud</li>
             * <li><strong>5</strong>: Azure</li>
             * <li><strong>7</strong>: AWS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public VendorRegionList build() {
                return new VendorRegionList(this);
            } 

        } 

    }
}
