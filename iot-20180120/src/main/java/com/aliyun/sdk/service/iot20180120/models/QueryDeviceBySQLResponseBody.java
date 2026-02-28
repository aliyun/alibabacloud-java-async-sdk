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
 * {@link QueryDeviceBySQLResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceBySQLResponseBody</p>
 */
public class QueryDeviceBySQLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryDeviceBySQLResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceBySQLResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(QueryDeviceBySQLResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
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
         * <p>The device information returned if the call is successful.</p>
         */
        public Builder data(java.util.List<Data> data) {
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
         * <p>Indicates whether the call was successful. Valid values:</p>
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
         * <p>If you specify <code>SELECT count(*) FROM device</code> in the SQL-like statement, the number of rows that match the specified conditions is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryDeviceBySQLResponseBody build() {
            return new QueryDeviceBySQLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceBySQLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceBySQLResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        private Groups(Builder builder) {
            this.groupId = builder.groupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private String groupId; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.groupId = model.groupId;
            } 

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>a1d21d2fas</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceBySQLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceBySQLResponseBody</p>
     */
    public static class OTAModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirmwareVersion")
        private String firmwareVersion;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private OTAModules(Builder builder) {
            this.firmwareVersion = builder.firmwareVersion;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OTAModules create() {
            return builder().build();
        }

        /**
         * @return firmwareVersion
         */
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private String firmwareVersion; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(OTAModules model) {
                this.firmwareVersion = model.firmwareVersion;
                this.moduleName = model.moduleName;
            } 

            /**
             * <p>The version number of each OTA module.</p>
             * 
             * <strong>example:</strong>
             * <p>a1-dads2-dad2</p>
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
                return this;
            }

            /**
             * <p>The name of the OTA module.</p>
             * 
             * <strong>example:</strong>
             * <p>SomeSampleModule</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public OTAModules build() {
                return new OTAModules(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceBySQLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceBySQLResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagName = builder.tagName;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagName; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagName = model.tagName;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Color</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>Red</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceBySQLResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceBySQLResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveTime")
        private String activeTime;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List<Groups> groups;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("OTAModules")
        private java.util.List<OTAModules> OTAModules;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Data(Builder builder) {
            this.activeTime = builder.activeTime;
            this.deviceName = builder.deviceName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groups = builder.groups;
            this.iotId = builder.iotId;
            this.nickname = builder.nickname;
            this.OTAModules = builder.OTAModules;
            this.productKey = builder.productKey;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeTime
         */
        public String getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
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
         * @return groups
         */
        public java.util.List<Groups> getGroups() {
            return this.groups;
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
         * @return OTAModules
         */
        public java.util.List<OTAModules> getOTAModules() {
            return this.OTAModules;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String activeTime; 
            private String deviceName; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.List<Groups> groups; 
            private String iotId; 
            private String nickname; 
            private java.util.List<OTAModules> OTAModules; 
            private String productKey; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeTime = model.activeTime;
                this.deviceName = model.deviceName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groups = model.groups;
                this.iotId = model.iotId;
                this.nickname = model.nickname;
                this.OTAModules = model.OTAModules;
                this.productKey = model.productKey;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The time when the device was activated. The time is in the GMT format.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-04 16:38:18.607</p>
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * <p>The name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The time when the device was created. The time is in the GMT format.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-04 16:38:17.000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the device information was last updated. The time is in the GMT format.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-04 16:38:19.000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The information about the groups to which the device belongs.</p>
             */
            public Builder groups(java.util.List<Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
             * 
             * <strong>example:</strong>
             * <p>Q7uOhVRdZRRlDnTLv****00100</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The alias of the device.</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>The information about the firmware of each device module.</p>
             */
            public Builder OTAModules(java.util.List<OTAModules> OTAModules) {
                this.OTAModules = OTAModules;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
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
             * <li><strong>ONLINE</strong>: The device is online.</li>
             * <li><strong>OFFLINE</strong>: The device is offline.</li>
             * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
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
             * <p>The information about device tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
