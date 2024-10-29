// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCustomizedListHeadersRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomizedListHeadersRequest</p>
 */
public class ModifyCustomizedListHeadersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Headers")
    private java.util.List < Headers> headers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListType")
    private String listType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyCustomizedListHeadersRequest(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.listType = builder.listType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomizedListHeadersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.List < Headers> getHeaders() {
        return this.headers;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyCustomizedListHeadersRequest, Builder> {
        private java.util.List < Headers> headers; 
        private String listType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomizedListHeadersRequest request) {
            super(request);
            this.headers = request.headers;
            this.listType = request.listType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The headers.</p>
         */
        public Builder headers(java.util.List < Headers> headers) {
            this.putQueryParameter("Headers", headers);
            this.headers = headers;
            return this;
        }

        /**
         * <p>The type of the list.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>desktop: cloud computer</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        public Builder listType(String listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
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
        public ModifyCustomizedListHeadersRequest build() {
            return new ModifyCustomizedListHeadersRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCustomizedListHeadersRequest} extends {@link TeaModel}
     *
     * <p>ModifyCustomizedListHeadersRequest</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("HeaderKey")
        private String headerKey;

        private Headers(Builder builder) {
            this.displayType = builder.displayType;
            this.headerKey = builder.headerKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return headerKey
         */
        public String getHeaderKey() {
            return this.headerKey;
        }

        public static final class Builder {
            private String displayType; 
            private String headerKey; 

            /**
             * <p>The display type of the header.</p>
             * <blockquote>
             * <p>For the desktop_id_name and office_site_id_name head keys, set the value of this parameter to required. For other header keys, set the value of this parameter to display or hide based on your requirements.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>display</p>
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * <p>The key of the header.</p>
             * <blockquote>
             * <p>All header keys of the list must be specified.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>desktop_id_name: the IDs and names of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>system_data_disk: the system disks and data disks of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>office_site_type: the office network types of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>create_time: the time when the cloud computers are created.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>ip: the IP addresses of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>spec_system_protocol: the instance types, OSs, and protocol types of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>monitor: the monitoring information of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>assigned_users: the number of end users that are assigned to the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>encryption: indicates whether the cloud computers are encrypted.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>office_site_id_name: the IDs and names of the office networks.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>pay_type: the billing methods of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>tag: the tags that are attached to the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>hostname: the hostnames of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>status: the statuses of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>current_user: the current end users of the cloud computers.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pay_type</p>
             */
            public Builder headerKey(String headerKey) {
                this.headerKey = headerKey;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
}
