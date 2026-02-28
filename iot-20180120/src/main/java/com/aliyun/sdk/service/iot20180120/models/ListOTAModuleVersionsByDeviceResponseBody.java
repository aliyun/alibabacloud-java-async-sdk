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
 * {@link ListOTAModuleVersionsByDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>ListOTAModuleVersionsByDeviceResponseBody</p>
 */
public class ListOTAModuleVersionsByDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

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

    private ListOTAModuleVersionsByDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTAModuleVersionsByDeviceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Integer currentPage; 
        private Data data; 
        private String errorMessage; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListOTAModuleVersionsByDeviceResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.pageCount = model.pageCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The module version information returned if the call is successful. The information was submitted by the device. For more information, see the <strong>SimpleOTAModuleInfo</strong> parameter in this table.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The number of module versions returned on each page.</p>
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
         * <p>291438BA-6E10-4C4C-B761-243B9A0D324F</p>
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
         * <p>The total number of module versions that was submitted by the device.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOTAModuleVersionsByDeviceResponseBody build() {
            return new ListOTAModuleVersionsByDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOTAModuleVersionsByDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAModuleVersionsByDeviceResponseBody</p>
     */
    public static class SimpleOTAModuleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("ModuleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        private SimpleOTAModuleInfo(Builder builder) {
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.moduleName = builder.moduleName;
            this.moduleVersion = builder.moduleVersion;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleOTAModuleInfo create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String deviceName; 
            private String iotId; 
            private String moduleName; 
            private String moduleVersion; 
            private String productKey; 

            private Builder() {
            } 

            private Builder(SimpleOTAModuleInfo model) {
                this.deviceName = model.deviceName;
                this.iotId = model.iotId;
                this.moduleName = model.moduleName;
                this.moduleVersion = model.moduleVersion;
                this.productKey = model.productKey;
            } 

            /**
             * <p>The DeviceName of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>newDevice</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>QjIFT***000101</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The name of the OTA module.</p>
             * 
             * <strong>example:</strong>
             * <p>barcodeScanner</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The module version that was submitted by the device.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>aluctKe****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public SimpleOTAModuleInfo build() {
                return new SimpleOTAModuleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOTAModuleVersionsByDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAModuleVersionsByDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SimpleOTAModuleInfo")
        private java.util.List<SimpleOTAModuleInfo> simpleOTAModuleInfo;

        private Data(Builder builder) {
            this.simpleOTAModuleInfo = builder.simpleOTAModuleInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return simpleOTAModuleInfo
         */
        public java.util.List<SimpleOTAModuleInfo> getSimpleOTAModuleInfo() {
            return this.simpleOTAModuleInfo;
        }

        public static final class Builder {
            private java.util.List<SimpleOTAModuleInfo> simpleOTAModuleInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.simpleOTAModuleInfo = model.simpleOTAModuleInfo;
            } 

            /**
             * SimpleOTAModuleInfo.
             */
            public Builder simpleOTAModuleInfo(java.util.List<SimpleOTAModuleInfo> simpleOTAModuleInfo) {
                this.simpleOTAModuleInfo = simpleOTAModuleInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
