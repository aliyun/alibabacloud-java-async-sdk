// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link DescribeEventMetaInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventMetaInfoRequest</p>
 */
public class DescribeEventMetaInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCode")
    private String sourceCode;

    private DescribeEventMetaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
        this.sourceCode = builder.sourceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventMetaInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sourceCode
     */
    public String getSourceCode() {
        return this.sourceCode;
    }

    public static final class Builder extends Request.Builder<DescribeEventMetaInfoRequest, Builder> {
        private String regionId; 
        private String securityToken; 
        private String sourceCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventMetaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.securityToken = request.securityToken;
            this.sourceCode = request.sourceCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        /**
         * SourceCode.
         */
        public Builder sourceCode(String sourceCode) {
            this.putQueryParameter("SourceCode", sourceCode);
            this.sourceCode = sourceCode;
            return this;
        }

        @Override
        public DescribeEventMetaInfoRequest build() {
            return new DescribeEventMetaInfoRequest(this);
        } 

    } 

}
