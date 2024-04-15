// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCustomizedListHeadersRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomizedListHeadersRequest</p>
 */
public class ModifyCustomizedListHeadersRequest extends Request {
    @Query
    @NameInMap("Headers")
    private java.util.List < Headers> headers;

    @Query
    @NameInMap("ListType")
    private String listType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * The headers.
         */
        public Builder headers(java.util.List < Headers> headers) {
            this.putQueryParameter("Headers", headers);
            this.headers = headers;
            return this;
        }

        /**
         * The type of the list.
         * <p>
         * 
         * Valid values:
         * 
         * *   desktop: cloud computer
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder listType(String listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
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

    public static class Headers extends TeaModel {
        @NameInMap("DisplayType")
        private String displayType;

        @NameInMap("HeaderKey")
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
             * The display type of the header.
             * <p>
             * 
             * > For the desktop_id_name and office_site_id_name head keys, set the value of this parameter to required. For other header keys, set the value of this parameter to display or hide based on your requirements.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * The key of the header.
             * <p>
             * 
             * > All header keys of the list must be specified.
             * 
             * Valid values:
             * 
             * *   desktop_id_name: the IDs and names of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   system_data_disk: the system disks and data disks of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   office_site_type: the office network types of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   create_time: the time when the cloud computers are created.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   ip: the IP addresses of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   spec_system_protocol: the instance types, OSs, and protocol types of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   monitor: the monitoring information of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   assigned_users: the number of end users that are assigned to the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   encryption: indicates whether the cloud computers are encrypted.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   office_site_id_name: the IDs and names of the office networks.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   pay_type: the billing methods of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   tag: the tags that are attached to the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   hostname: the hostnames of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   status: the statuses of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   current_user: the current end users of the cloud computers.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
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
