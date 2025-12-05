// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetUserVpcVSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserVpcVSwitchResponseBody</p>
 */
public class GetUserVpcVSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("VSwitchCount")
    private Integer vSwitchCount;

    @com.aliyun.core.annotation.NameInMap("VSwitchList")
    private java.util.List<VSwitchList> vSwitchList;

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
    public java.util.List<VSwitchList> getVSwitchList() {
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
        private java.util.List<VSwitchList> vSwitchList; 

        private Builder() {
        } 

        private Builder(GetUserVpcVSwitchResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.vSwitchCount = model.vSwitchCount;
            this.vSwitchList = model.vSwitchList;
        } 

        /**
         * <p>The system status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, this parameter is left empty.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of returned entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0235E5FC-4C7C-5F0C-843C-FC674F15F947</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The number of vSwitches.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder vSwitchCount(Integer vSwitchCount) {
            this.vSwitchCount = vSwitchCount;
            return this;
        }

        /**
         * <p>The vSwitches.</p>
         */
        public Builder vSwitchList(java.util.List<VSwitchList> vSwitchList) {
            this.vSwitchList = vSwitchList;
            return this;
        }

        public GetUserVpcVSwitchResponseBody build() {
            return new GetUserVpcVSwitchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserVpcVSwitchResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserVpcVSwitchResponseBody</p>
     */
    public static class VSwitchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableIpAddressCount")
        private Long availableIpAddressCount;

        @com.aliyun.core.annotation.NameInMap("MaxAgentCount")
        private Integer maxAgentCount;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(VSwitchList model) {
                this.availableIpAddressCount = model.availableIpAddressCount;
                this.maxAgentCount = model.maxAgentCount;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchName = model.vSwitchName;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The number of available IP addresses in the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder availableIpAddressCount(Long availableIpAddressCount) {
                this.availableIpAddressCount = availableIpAddressCount;
                return this;
            }

            /**
             * <p>The maximum number of stress testers to be added.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxAgentCount(Integer maxAgentCount) {
                this.maxAgentCount = maxAgentCount;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1eil9df23rsd8l1sevebiszooj</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The vSwitch name.</p>
             * 
             * <strong>example:</strong>
             * <p>my-vswitch</p>
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9bpdaebft6j23fesdf84v2f1um3a</p>
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
