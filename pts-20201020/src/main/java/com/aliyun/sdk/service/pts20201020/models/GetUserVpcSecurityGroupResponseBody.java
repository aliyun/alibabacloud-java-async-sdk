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
 * {@link GetUserVpcSecurityGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserVpcSecurityGroupResponseBody</p>
 */
public class GetUserVpcSecurityGroupResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("SecurityGroupCount")
    private Integer securityGroupCount;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupList")
    private java.util.List<SecurityGroupList> securityGroupList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetUserVpcSecurityGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.securityGroupCount = builder.securityGroupCount;
        this.securityGroupList = builder.securityGroupList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserVpcSecurityGroupResponseBody create() {
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
     * @return securityGroupCount
     */
    public Integer getSecurityGroupCount() {
        return this.securityGroupCount;
    }

    /**
     * @return securityGroupList
     */
    public java.util.List<SecurityGroupList> getSecurityGroupList() {
        return this.securityGroupList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer securityGroupCount; 
        private java.util.List<SecurityGroupList> securityGroupList; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetUserVpcSecurityGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.securityGroupCount = model.securityGroupCount;
            this.securityGroupList = model.securityGroupList;
            this.success = model.success;
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
         * <p>The error message. If the operation is successful, this parameter is not returned.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>61B15017-1A68-5C47-834F-87E2BBC44F2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of security groups.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder securityGroupCount(Integer securityGroupCount) {
            this.securityGroupCount = securityGroupCount;
            return this;
        }

        /**
         * <p>The security groups.</p>
         */
        public Builder securityGroupList(java.util.List<SecurityGroupList> securityGroupList) {
            this.securityGroupList = securityGroupList;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
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

        public GetUserVpcSecurityGroupResponseBody build() {
            return new GetUserVpcSecurityGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserVpcSecurityGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserVpcSecurityGroupResponseBody</p>
     */
    public static class SecurityGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
        private String securityGroupName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private SecurityGroupList(Builder builder) {
            this.description = builder.description;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String description; 
            private String securityGroupId; 
            private String securityGroupName; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SecurityGroupList model) {
                this.description = model.description;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupName = model.securityGroupName;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The description of the security group.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp16bt3zuugxpfjkasdfvthxth8</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The name of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>my-security-group</p>
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6tar2ohlasdhsatjln37h30bv</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SecurityGroupList build() {
                return new SecurityGroupList(this);
            } 

        } 

    }
}
