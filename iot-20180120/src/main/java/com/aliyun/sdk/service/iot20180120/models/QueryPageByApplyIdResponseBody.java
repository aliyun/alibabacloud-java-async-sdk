// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryPageByApplyIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPageByApplyIdResponseBody</p>
 */
public class QueryPageByApplyIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplyDeviceList")
    private ApplyDeviceList applyDeviceList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private QueryPageByApplyIdResponseBody(Builder builder) {
        this.applyDeviceList = builder.applyDeviceList;
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.page = builder.page;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPageByApplyIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyDeviceList
     */
    public ApplyDeviceList getApplyDeviceList() {
        return this.applyDeviceList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private ApplyDeviceList applyDeviceList; 
        private String code; 
        private String errorMessage; 
        private Integer page; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(QueryPageByApplyIdResponseBody model) {
            this.applyDeviceList = model.applyDeviceList;
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.page = model.page;
            this.pageCount = model.pageCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The registered device list information returned if the call succeeds. The <strong>ApplyDeviceInfo</strong> parameter includes the details of the registered devices.</p>
         */
        public Builder applyDeviceList(ApplyDeviceList applyDeviceList) {
            this.applyDeviceList = applyDeviceList;
            return this;
        }

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="/help/en/iot-platform/latest/bce100">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of devices.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryPageByApplyIdResponseBody build() {
            return new QueryPageByApplyIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPageByApplyIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPageByApplyIdResponseBody</p>
     */
    public static class ApplyDeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSecret")
        private String deviceSecret;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        private ApplyDeviceInfo(Builder builder) {
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.iotId = builder.iotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyDeviceInfo create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSecret
         */
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        public static final class Builder {
            private String deviceId; 
            private String deviceName; 
            private String deviceSecret; 
            private String iotId; 

            private Builder() {
            } 

            private Builder(ApplyDeviceInfo model) {
                this.deviceId = model.deviceId;
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.iotId = model.iotId;
            } 

            /**
             * <p>The ID of the device (expired).</p>
             * <blockquote>
             * <p> This parameter is no longer used. Do not use this parameter to identify a device. You can use the <strong>IotId</strong> parameter or a combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters to identify a device.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>gQG2GJ2y10m6hIk8****</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The DeviceName of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The DeviceSecret of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>SkfeXXKrTgp1DbDxYr74mfJ5cnui****</p>
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
             * 
             * <strong>example:</strong>
             * <p>vWxNur6BUApsqjv9****000100</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            public ApplyDeviceInfo build() {
                return new ApplyDeviceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPageByApplyIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPageByApplyIdResponseBody</p>
     */
    public static class ApplyDeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyDeviceInfo")
        private java.util.List<ApplyDeviceInfo> applyDeviceInfo;

        private ApplyDeviceList(Builder builder) {
            this.applyDeviceInfo = builder.applyDeviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyDeviceList create() {
            return builder().build();
        }

        /**
         * @return applyDeviceInfo
         */
        public java.util.List<ApplyDeviceInfo> getApplyDeviceInfo() {
            return this.applyDeviceInfo;
        }

        public static final class Builder {
            private java.util.List<ApplyDeviceInfo> applyDeviceInfo; 

            private Builder() {
            } 

            private Builder(ApplyDeviceList model) {
                this.applyDeviceInfo = model.applyDeviceInfo;
            } 

            /**
             * ApplyDeviceInfo.
             */
            public Builder applyDeviceInfo(java.util.List<ApplyDeviceInfo> applyDeviceInfo) {
                this.applyDeviceInfo = applyDeviceInfo;
                return this;
            }

            public ApplyDeviceList build() {
                return new ApplyDeviceList(this);
            } 

        } 

    }
}
