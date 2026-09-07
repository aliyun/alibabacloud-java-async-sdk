// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListNacUserCertResponseBody} extends {@link TeaModel}
 *
 * <p>ListNacUserCertResponseBody</p>
 */
public class ListNacUserCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListNacUserCertResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataList = builder.dataList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNacUserCertResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List<DataList> dataList; 
        private String message; 
        private String requestId; 
        private Long totalNum; 

        private Builder() {
        } 

        private Builder(ListNacUserCertResponseBody model) {
            this.code = model.code;
            this.dataList = model.dataList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>API status or POP error code. Valid values:</p>
         * <ul>
         * <li><p><strong>2xx</strong>: Success.</p>
         * </li>
         * <li><p><strong>3xx</strong>: Redirection.</p>
         * </li>
         * <li><p><strong>4xx</strong>: Request error.</p>
         * </li>
         * <li><p><strong>5xx</strong>: Server error.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>List of onboarding user certificate statuses.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>Additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of entries that match the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListNacUserCertResponseBody build() {
            return new ListNacUserCertResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNacUserCertResponseBody} extends {@link TeaModel}
     *
     * <p>ListNacUserCertResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private DataList(Builder builder) {
            this.aliuid = builder.aliuid;
            this.department = builder.department;
            this.devTag = builder.devTag;
            this.deviceType = builder.deviceType;
            this.expiredTime = builder.expiredTime;
            this.hostname = builder.hostname;
            this.mac = builder.mac;
            this.status = builder.status;
            this.userId = builder.userId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String aliuid; 
            private String department; 
            private String devTag; 
            private String deviceType; 
            private String expiredTime; 
            private String hostname; 
            private String mac; 
            private String status; 
            private String userId; 
            private String username; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.aliuid = model.aliuid;
                this.department = model.department;
                this.devTag = model.devTag;
                this.deviceType = model.deviceType;
                this.expiredTime = model.expiredTime;
                this.hostname = model.hostname;
                this.mac = model.mac;
                this.status = model.status;
                this.userId = model.userId;
                this.username = model.username;
            } 

            /**
             * <p>Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>Department that the user belongs to.</p>
             * 
             * <strong>example:</strong>
             * <p>外包</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>Endpoint device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * <p>Operating system type of the endpoint device. Valid values:</p>
             * <ul>
             * <li><p><strong>windows</strong>: Windows.</p>
             * </li>
             * <li><p><strong>macos</strong>: macOS.</p>
             * </li>
             * <li><p><strong>linux</strong>: Linux.</p>
             * </li>
             * <li><p><strong>android</strong>: Android.</p>
             * </li>
             * <li><p><strong>ios</strong>: iOS.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>Expired At.</p>
             * 
             * <strong>example:</strong>
             * <p>2029-06-30 09:31:54</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>Endpoint device name. The value must be 1 to 128 characters in length. It can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), forward slashes (/), at signs (@), and spaces. If you enter only an underscore (</em>), the system returns all endpoint devices whose names contain 4-byte UTF-8 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>MS-XU****</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Endpoint device MAC address.</p>
             * 
             * <strong>example:</strong>
             * <p>08:f8:<strong>:</strong>:**:5e</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>Onboarding user certificate status. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Username.</p>
             * 
             * <strong>example:</strong>
             * <p>zhang**</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
