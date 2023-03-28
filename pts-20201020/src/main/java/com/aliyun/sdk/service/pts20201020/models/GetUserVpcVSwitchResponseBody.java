// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserVpcVSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserVpcVSwitchResponseBody</p>
 */
public class GetUserVpcVSwitchResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

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

    @NameInMap("VSwitchCount")
    private Integer vSwitchCount;

    @NameInMap("VSwitchList")
    private java.util.List < VSwitchList> vSwitchList;

    private GetUserVpcVSwitchResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.vSwitchCount = builder.vSwitchCount;
        this.vSwitchList = builder.vSwitchList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserVpcVSwitchResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return vSwitchCount
     */
    public Integer getVSwitchCount() {
        return this.vSwitchCount;
    }

    /**
     * @return vSwitchList
     */
    public java.util.List < VSwitchList> getVSwitchList() {
        return this.vSwitchList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer vSwitchCount; 
        private java.util.List < VSwitchList> vSwitchList; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * VSwitchCount.
         */
        public Builder vSwitchCount(Integer vSwitchCount) {
            this.vSwitchCount = vSwitchCount;
            return this;
        }

        /**
         * VSwitchList.
         */
        public Builder vSwitchList(java.util.List < VSwitchList> vSwitchList) {
            this.vSwitchList = vSwitchList;
            return this;
        }

        public GetUserVpcVSwitchResponseBody build() {
            return new GetUserVpcVSwitchResponseBody(this);
        } 

    } 

    public static class VSwitchList extends TeaModel {
        @NameInMap("AvailableIpAddressCount")
        private Long availableIpAddressCount;

        @NameInMap("MaxAgentCount")
        private Integer maxAgentCount;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VSwitchName")
        private String vSwitchName;

        @NameInMap("VpcId")
        private String vpcId;

        private VSwitchList(Builder builder) {
            this.availableIpAddressCount = builder.availableIpAddressCount;
            this.maxAgentCount = builder.maxAgentCount;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchList create() {
            return builder().build();
        }

        /**
         * @return availableIpAddressCount
         */
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        /**
         * @return maxAgentCount
         */
        public Integer getMaxAgentCount() {
            return this.maxAgentCount;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Long availableIpAddressCount; 
            private Integer maxAgentCount; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 

            /**
             * AvailableIpAddressCount.
             */
            public Builder availableIpAddressCount(Long availableIpAddressCount) {
                this.availableIpAddressCount = availableIpAddressCount;
                return this;
            }

            /**
             * MaxAgentCount.
             */
            public Builder maxAgentCount(Integer maxAgentCount) {
                this.maxAgentCount = maxAgentCount;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VSwitchName.
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VSwitchList build() {
                return new VSwitchList(this);
            } 

        } 

    }
}
