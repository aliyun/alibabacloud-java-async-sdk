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
 * {@link ListOTAFirmwareResponseBody} extends {@link TeaModel}
 *
 * <p>ListOTAFirmwareResponseBody</p>
 */
public class ListOTAFirmwareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FirmwareInfo")
    private FirmwareInfo firmwareInfo;

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

    private ListOTAFirmwareResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.errorMessage = builder.errorMessage;
        this.firmwareInfo = builder.firmwareInfo;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTAFirmwareResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return firmwareInfo
     */
    public FirmwareInfo getFirmwareInfo() {
        return this.firmwareInfo;
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
        private String errorMessage; 
        private FirmwareInfo firmwareInfo; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListOTAFirmwareResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.errorMessage = model.errorMessage;
            this.firmwareInfo = model.firmwareInfo;
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
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * <p>The OTA update packages returned if the call is successful. For more information, see SimpleFirmwareInfo.</p>
         */
        public Builder firmwareInfo(FirmwareInfo firmwareInfo) {
            this.firmwareInfo = firmwareInfo;
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
         * <p>A01829CE-75A1-4920-B775-921146A1AB79</p>
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
         * <p>The total number of OTA update packages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOTAFirmwareResponseBody build() {
            return new ListOTAFirmwareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOTAFirmwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAFirmwareResponseBody</p>
     */
    public static class SimpleFirmwareInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestVersion")
        private String destVersion;

        @com.aliyun.core.annotation.NameInMap("FirmwareDesc")
        private String firmwareDesc;

        @com.aliyun.core.annotation.NameInMap("FirmwareId")
        private String firmwareId;

        @com.aliyun.core.annotation.NameInMap("FirmwareName")
        private String firmwareName;

        @com.aliyun.core.annotation.NameInMap("FirmwareSign")
        private String firmwareSign;

        @com.aliyun.core.annotation.NameInMap("FirmwareSize")
        private Integer firmwareSize;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("SignMethod")
        private String signMethod;

        @com.aliyun.core.annotation.NameInMap("SrcVersion")
        private String srcVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private String utcModified;

        private SimpleFirmwareInfo(Builder builder) {
            this.destVersion = builder.destVersion;
            this.firmwareDesc = builder.firmwareDesc;
            this.firmwareId = builder.firmwareId;
            this.firmwareName = builder.firmwareName;
            this.firmwareSign = builder.firmwareSign;
            this.firmwareSize = builder.firmwareSize;
            this.moduleName = builder.moduleName;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.signMethod = builder.signMethod;
            this.srcVersion = builder.srcVersion;
            this.status = builder.status;
            this.type = builder.type;
            this.utcCreate = builder.utcCreate;
            this.utcModified = builder.utcModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleFirmwareInfo create() {
            return builder().build();
        }

        /**
         * @return destVersion
         */
        public String getDestVersion() {
            return this.destVersion;
        }

        /**
         * @return firmwareDesc
         */
        public String getFirmwareDesc() {
            return this.firmwareDesc;
        }

        /**
         * @return firmwareId
         */
        public String getFirmwareId() {
            return this.firmwareId;
        }

        /**
         * @return firmwareName
         */
        public String getFirmwareName() {
            return this.firmwareName;
        }

        /**
         * @return firmwareSign
         */
        public String getFirmwareSign() {
            return this.firmwareSign;
        }

        /**
         * @return firmwareSize
         */
        public Integer getFirmwareSize() {
            return this.firmwareSize;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return signMethod
         */
        public String getSignMethod() {
            return this.signMethod;
        }

        /**
         * @return srcVersion
         */
        public String getSrcVersion() {
            return this.srcVersion;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        public static final class Builder {
            private String destVersion; 
            private String firmwareDesc; 
            private String firmwareId; 
            private String firmwareName; 
            private String firmwareSign; 
            private Integer firmwareSize; 
            private String moduleName; 
            private String productKey; 
            private String productName; 
            private String signMethod; 
            private String srcVersion; 
            private Integer status; 
            private Integer type; 
            private String utcCreate; 
            private String utcModified; 

            private Builder() {
            } 

            private Builder(SimpleFirmwareInfo model) {
                this.destVersion = model.destVersion;
                this.firmwareDesc = model.firmwareDesc;
                this.firmwareId = model.firmwareId;
                this.firmwareName = model.firmwareName;
                this.firmwareSign = model.firmwareSign;
                this.firmwareSize = model.firmwareSize;
                this.moduleName = model.moduleName;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.signMethod = model.signMethod;
                this.srcVersion = model.srcVersion;
                this.status = model.status;
                this.type = model.type;
                this.utcCreate = model.utcCreate;
                this.utcModified = model.utcModified;
            } 

            /**
             * <p>The version number of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0.0</p>
             */
            public Builder destVersion(String destVersion) {
                this.destVersion = destVersion;
                return this;
            }

            /**
             * <p>The description of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>firmwareDesc</p>
             */
            public Builder firmwareDesc(String firmwareDesc) {
                this.firmwareDesc = firmwareDesc;
                return this;
            }

            /**
             * <p>The unique ID of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>UfuxnwygsuSkVE0VCN****0100</p>
             */
            public Builder firmwareId(String firmwareId) {
                this.firmwareId = firmwareId;
                return this;
            }

            /**
             * <p>The name of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>t3q5rkNm</p>
             */
            public Builder firmwareName(String firmwareName) {
                this.firmwareName = firmwareName;
                return this;
            }

            /**
             * <p>The signature of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>3d04ab6462633508606e5f3daac8****</p>
             */
            public Builder firmwareSign(String firmwareSign) {
                this.firmwareSign = firmwareSign;
                return this;
            }

            /**
             * <p>The size of the update package. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>924</p>
             */
            public Builder firmwareSize(Integer firmwareSize) {
                this.firmwareSize = firmwareSize;
                return this;
            }

            /**
             * <p>The name of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>module1234</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the OTA update package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a19mzPZ****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The name of the product to which the OTA update package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>MyProduct</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The signature method of the OTA update package.</p>
             * 
             * <strong>example:</strong>
             * <p>MD5</p>
             */
            public Builder signMethod(String signMethod) {
                this.signMethod = signMethod;
                return this;
            }

            /**
             * <p>The version number of the original update package to be updated.</p>
             * <blockquote>
             * <p> The return value is null if you perform a full update.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>V1.0.0</p>
             */
            public Builder srcVersion(String srcVersion) {
                this.srcVersion = srcVersion;
                return this;
            }

            /**
             * <p>The status of the OTA update package. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unverified</li>
             * <li><strong>1</strong>: verified</li>
             * <li><strong>2</strong>: verifying</li>
             * <li><strong>3</strong>: failed to be verified</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the OTA update package. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: complete firmware</li>
             * <li><strong>1</strong>: differential firmware</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the update package was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:42:22.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The time when the update task was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:42:22.000Z</p>
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            public SimpleFirmwareInfo build() {
                return new SimpleFirmwareInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOTAFirmwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAFirmwareResponseBody</p>
     */
    public static class FirmwareInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SimpleFirmwareInfo")
        private java.util.List<SimpleFirmwareInfo> simpleFirmwareInfo;

        private FirmwareInfo(Builder builder) {
            this.simpleFirmwareInfo = builder.simpleFirmwareInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirmwareInfo create() {
            return builder().build();
        }

        /**
         * @return simpleFirmwareInfo
         */
        public java.util.List<SimpleFirmwareInfo> getSimpleFirmwareInfo() {
            return this.simpleFirmwareInfo;
        }

        public static final class Builder {
            private java.util.List<SimpleFirmwareInfo> simpleFirmwareInfo; 

            private Builder() {
            } 

            private Builder(FirmwareInfo model) {
                this.simpleFirmwareInfo = model.simpleFirmwareInfo;
            } 

            /**
             * SimpleFirmwareInfo.
             */
            public Builder simpleFirmwareInfo(java.util.List<SimpleFirmwareInfo> simpleFirmwareInfo) {
                this.simpleFirmwareInfo = simpleFirmwareInfo;
                return this;
            }

            public FirmwareInfo build() {
                return new FirmwareInfo(this);
            } 

        } 

    }
}
