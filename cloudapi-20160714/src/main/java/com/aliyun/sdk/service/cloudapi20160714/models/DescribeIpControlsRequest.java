// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeIpControlsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpControlsRequest</p>
 */
public class DescribeIpControlsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlId")
    private String ipControlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlName")
    private String ipControlName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlType")
    private String ipControlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeIpControlsRequest(Builder builder) {
        super(builder);
        this.ipControlId = builder.ipControlId;
        this.ipControlName = builder.ipControlName;
        this.ipControlType = builder.ipControlType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpControlsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipControlId
     */
    public String getIpControlId() {
        return this.ipControlId;
    }

    /**
     * @return ipControlName
     */
    public String getIpControlName() {
        return this.ipControlName;
    }

    /**
     * @return ipControlType
     */
    public String getIpControlType() {
        return this.ipControlType;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeIpControlsRequest, Builder> {
        private String ipControlId; 
        private String ipControlName; 
        private String ipControlType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpControlsRequest request) {
            super(request);
            this.ipControlId = request.ipControlId;
            this.ipControlName = request.ipControlName;
            this.ipControlType = request.ipControlType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The ID of the ACL. The ID is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>7ea91319a34d48a09b5c9c871d9768b1</p>
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * <p>The name of the ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL test</p>
         */
        public Builder ipControlName(String ipControlName) {
            this.putQueryParameter("IpControlName", ipControlName);
            this.ipControlName = ipControlName;
            return this;
        }

        /**
         * <p>The type of the ACL. Valid values:</p>
         * <ul>
         * <li><strong>ALLOW</strong>: a whitelist</li>
         * <li><strong>REFUSE</strong>: a blacklist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALLOW</p>
         */
        public Builder ipControlType(String ipControlType) {
            this.putQueryParameter("IpControlType", ipControlType);
            this.ipControlType = ipControlType;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeIpControlsRequest build() {
            return new DescribeIpControlsRequest(this);
        } 

    } 

}
