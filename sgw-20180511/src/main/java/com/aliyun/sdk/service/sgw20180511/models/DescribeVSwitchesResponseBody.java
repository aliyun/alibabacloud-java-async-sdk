// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVSwitchesResponseBody</p>
 */
public class DescribeVSwitchesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VSwitches")
    private VSwitches vSwitches;

    private DescribeVSwitchesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.vSwitches = builder.vSwitches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVSwitchesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vSwitches
     */
    public VSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private VSwitches vSwitches; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VSwitches.
         */
        public Builder vSwitches(VSwitches vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        public DescribeVSwitchesResponseBody build() {
            return new DescribeVSwitchesResponseBody(this);
        } 

    } 

    public static class VSwitch extends TeaModel {
        @NameInMap("AvailableSelectionInfo")
        private String availableSelectionInfo;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Name")
        private String name;

        @NameInMap("ZoneId")
        private String zoneId;

        private VSwitch(Builder builder) {
            this.availableSelectionInfo = builder.availableSelectionInfo;
            this.id = builder.id;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitch create() {
            return builder().build();
        }

        /**
         * @return availableSelectionInfo
         */
        public String getAvailableSelectionInfo() {
            return this.availableSelectionInfo;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String availableSelectionInfo; 
            private String id; 
            private Boolean isDefault; 
            private String name; 
            private String zoneId; 

            /**
             * AvailableSelectionInfo.
             */
            public Builder availableSelectionInfo(String availableSelectionInfo) {
                this.availableSelectionInfo = availableSelectionInfo;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitch build() {
                return new VSwitch(this);
            } 

        } 

    }
    public static class VSwitches extends TeaModel {
        @NameInMap("VSwitch")
        private java.util.List < VSwitch> vSwitch;

        private VSwitches(Builder builder) {
            this.vSwitch = builder.vSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return vSwitch
         */
        public java.util.List < VSwitch> getVSwitch() {
            return this.vSwitch;
        }

        public static final class Builder {
            private java.util.List < VSwitch> vSwitch; 

            /**
             * VSwitch.
             */
            public Builder vSwitch(java.util.List < VSwitch> vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
