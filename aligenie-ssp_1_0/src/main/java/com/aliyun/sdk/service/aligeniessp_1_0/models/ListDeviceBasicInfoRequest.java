// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListDeviceBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceBasicInfoRequest</p>
 */
public class ListDeviceBasicInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceInfos")
    private DeviceInfos deviceInfos;

    private ListDeviceBasicInfoRequest(Builder builder) {
        super(builder);
        this.deviceInfos = builder.deviceInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceBasicInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceInfos
     */
    public DeviceInfos getDeviceInfos() {
        return this.deviceInfos;
    }

    public static final class Builder extends Request.Builder<ListDeviceBasicInfoRequest, Builder> {
        private DeviceInfos deviceInfos; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceBasicInfoRequest request) {
            super(request);
            this.deviceInfos = request.deviceInfos;
        } 

        /**
         * <p>List of device identity information.</p>
         */
        public Builder deviceInfos(DeviceInfos deviceInfos) {
            String deviceInfosShrink = shrink(deviceInfos, "DeviceInfos", "json");
            this.putQueryParameter("DeviceInfos", deviceInfosShrink);
            this.deviceInfos = deviceInfos;
            return this;
        }

        @Override
        public ListDeviceBasicInfoRequest build() {
            return new ListDeviceBasicInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListDeviceBasicInfoRequest} extends {@link TeaModel}
     *
     * <p>ListDeviceBasicInfoRequest</p>
     */
    public static class DeviceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String idType;

        @com.aliyun.core.annotation.NameInMap("Ids")
        private java.util.List<String> ids;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private DeviceInfos(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.idType = builder.idType;
            this.ids = builder.ids;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfos create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return ids
         */
        public java.util.List<String> getIds() {
            return this.ids;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String idType; 
            private java.util.List<String> ids; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(DeviceInfos model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.idType = model.idType;
                this.ids = model.ids;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>Value corresponding to the encoding type. Enter the Project ID of the project where the product resides. You can view this in the Tmall Genie AI Platform console.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12**45</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding type. Enter <strong>PROJECT_ID</strong> here.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>Type of device ID:</p>
             * <ul>
             * <li>OPEN_ID: Default device ID identity.</li>
             * <li>UNION_ID: Organization-dimension device ID identity. You must request an organization in advance on the Open Platform.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>List of device identity information.</p>
             */
            public Builder ids(java.util.List<String> ids) {
                this.ids = ids;
                return this;
            }

            /**
             * <p>Organization ID of the device. Required if IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public DeviceInfos build() {
                return new DeviceInfos(this);
            } 

        } 

    }
}
