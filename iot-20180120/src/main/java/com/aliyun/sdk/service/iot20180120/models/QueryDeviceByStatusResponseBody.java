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
 * {@link QueryDeviceByStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceByStatusResponseBody</p>
 */
public class QueryDeviceByStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    private QueryDeviceByStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
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

    public static QueryDeviceByStatusResponseBody create() {
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private Integer page; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(QueryDeviceByStatusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.page = model.page;
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
         * <p>The device list information returned if the call succeeds. The <strong>SimpleDeviceInfo</strong> parameter includes the details of the devices.</p>
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
         * <p>The number of the returned page.</p>
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
         * <p>The total number of devices returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryDeviceByStatusResponseBody build() {
            return new QueryDeviceByStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceByStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceByStatusResponseBody</p>
     */
    public static class SimpleDeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSecret")
        private String deviceSecret;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private String utcModified;

        private SimpleDeviceInfo(Builder builder) {
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.iotId = builder.iotId;
            this.nickname = builder.nickname;
            this.productKey = builder.productKey;
            this.status = builder.status;
            this.utcCreate = builder.utcCreate;
            this.utcModified = builder.utcModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleDeviceInfo create() {
            return builder().build();
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String deviceName; 
            private String deviceSecret; 
            private String gmtCreate; 
            private String gmtModified; 
            private String iotId; 
            private String nickname; 
            private String productKey; 
            private String status; 
            private String utcCreate; 
            private String utcModified; 

            private Builder() {
            } 

            private Builder(SimpleDeviceInfo model) {
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.iotId = model.iotId;
                this.nickname = model.nickname;
                this.productKey = model.productKey;
                this.status = model.status;
                this.utcCreate = model.utcCreate;
                this.utcModified = model.utcModified;
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
             * <p>The secret of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>sLefbFmN9SYfnWLJTePG893XNuRV****</p>
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * <p>The time when the device was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-18 10:46:32</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the device information was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-18 10:46:32</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>Av8NGHGtwPrH9BYGLMBi00****</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The alias of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>SensorInShanghai</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The status of the device. Valid values:</p>
             * <ul>
             * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
             * <li><strong>ONLINE</strong>: The device is online.</li>
             * <li><strong>OFFLINE</strong>: The device is offline.</li>
             * <li><strong>DISABLE</strong>: The device is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the device was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-18T02:46:32.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The time when the device information was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-18T02:46:32.000Z</p>
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            public SimpleDeviceInfo build() {
                return new SimpleDeviceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceByStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceByStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SimpleDeviceInfo")
        private java.util.List<SimpleDeviceInfo> simpleDeviceInfo;

        private Data(Builder builder) {
            this.simpleDeviceInfo = builder.simpleDeviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return simpleDeviceInfo
         */
        public java.util.List<SimpleDeviceInfo> getSimpleDeviceInfo() {
            return this.simpleDeviceInfo;
        }

        public static final class Builder {
            private java.util.List<SimpleDeviceInfo> simpleDeviceInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.simpleDeviceInfo = model.simpleDeviceInfo;
            } 

            /**
             * SimpleDeviceInfo.
             */
            public Builder simpleDeviceInfo(java.util.List<SimpleDeviceInfo> simpleDeviceInfo) {
                this.simpleDeviceInfo = simpleDeviceInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
