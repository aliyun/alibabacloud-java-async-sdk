// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPageByApplyIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPageByApplyIdResponseBody</p>
 */
public class QueryPageByApplyIdResponseBody extends TeaModel {
    @NameInMap("ApplyDeviceList")
    private ApplyDeviceList applyDeviceList;

    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Page")
    private Integer page;

    @NameInMap("PageCount")
    private Integer pageCount;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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

        /**
         * ApplyDeviceList.
         */
        public Builder applyDeviceList(ApplyDeviceList applyDeviceList) {
            this.applyDeviceList = applyDeviceList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryPageByApplyIdResponseBody build() {
            return new QueryPageByApplyIdResponseBody(this);
        } 

    } 

    public static class ApplyDeviceInfo extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceSecret")
        private String deviceSecret;

        @NameInMap("IotId")
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

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceSecret.
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * IotId.
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
    public static class ApplyDeviceList extends TeaModel {
        @NameInMap("ApplyDeviceInfo")
        private java.util.List < ApplyDeviceInfo> applyDeviceInfo;

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
        public java.util.List < ApplyDeviceInfo> getApplyDeviceInfo() {
            return this.applyDeviceInfo;
        }

        public static final class Builder {
            private java.util.List < ApplyDeviceInfo> applyDeviceInfo; 

            /**
             * ApplyDeviceInfo.
             */
            public Builder applyDeviceInfo(java.util.List < ApplyDeviceInfo> applyDeviceInfo) {
                this.applyDeviceInfo = applyDeviceInfo;
                return this;
            }

            public ApplyDeviceList build() {
                return new ApplyDeviceList(this);
            } 

        } 

    }
}
