// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryFaceDeviceGroupsByDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaceDeviceGroupsByDeviceResponseBody</p>
 */
public class QueryFaceDeviceGroupsByDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryFaceDeviceGroupsByDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceDeviceGroupsByDeviceResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryFaceDeviceGroupsByDeviceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A13279A-5640-45E7-87AA-83750541AD0E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryFaceDeviceGroupsByDeviceResponseBody build() {
            return new QueryFaceDeviceGroupsByDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFaceDeviceGroupsByDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceDeviceGroupsByDeviceResponseBody</p>
     */
    public static class DeviceGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
        private String deviceGroupId;

        @com.aliyun.core.annotation.NameInMap("DeviceGroupName")
        private String deviceGroupName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        private DeviceGroupList(Builder builder) {
            this.deviceGroupId = builder.deviceGroupId;
            this.deviceGroupName = builder.deviceGroupName;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceGroupList create() {
            return builder().build();
        }

        /**
         * @return deviceGroupId
         */
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        /**
         * @return deviceGroupName
         */
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String deviceGroupId; 
            private String deviceGroupName; 
            private String modifiedTime; 

            private Builder() {
            } 

            private Builder(DeviceGroupList model) {
                this.deviceGroupId = model.deviceGroupId;
                this.deviceGroupName = model.deviceGroupName;
                this.modifiedTime = model.modifiedTime;
            } 

            /**
             * <p>The device group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>TestDeviceGroupId</p>
             */
            public Builder deviceGroupId(String deviceGroupId) {
                this.deviceGroupId = deviceGroupId;
                return this;
            }

            /**
             * <p>The device group name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestDeviceGroupName</p>
             */
            public Builder deviceGroupName(String deviceGroupName) {
                this.deviceGroupName = deviceGroupName;
                return this;
            }

            /**
             * <p>The time when the device group was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-12 17:12:37</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public DeviceGroupList build() {
                return new DeviceGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFaceDeviceGroupsByDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceDeviceGroupsByDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceGroupList")
        private java.util.List<DeviceGroupList> deviceGroupList;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.deviceGroupList = builder.deviceGroupList;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceGroupList
         */
        public java.util.List<DeviceGroupList> getDeviceGroupList() {
            return this.deviceGroupList;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<DeviceGroupList> deviceGroupList; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deviceGroupList = model.deviceGroupList;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The list of device groups.</p>
             */
            public Builder deviceGroupList(java.util.List<DeviceGroupList> deviceGroupList) {
                this.deviceGroupList = deviceGroupList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of device groups.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
