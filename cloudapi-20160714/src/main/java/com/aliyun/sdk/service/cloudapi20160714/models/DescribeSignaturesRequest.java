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
 * {@link DescribeSignaturesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSignaturesRequest</p>
 */
public class DescribeSignaturesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureId")
    private String signatureId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureName")
    private String signatureName;

    private DescribeSignaturesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
        this.signatureId = builder.signatureId;
        this.signatureName = builder.signatureName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSignaturesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return signatureId
     */
    public String getSignatureId() {
        return this.signatureId;
    }

    /**
     * @return signatureName
     */
    public String getSignatureName() {
        return this.signatureName;
    }

    public static final class Builder extends Request.Builder<DescribeSignaturesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 
        private String signatureId; 
        private String signatureName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSignaturesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
            this.signatureId = request.signatureId;
            this.signatureName = request.signatureName;
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

        /**
         * <p>The IDs of the keys to query.</p>
         * 
         * <strong>example:</strong>
         * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
         */
        public Builder signatureId(String signatureId) {
            this.putQueryParameter("SignatureId", signatureId);
            this.signatureId = signatureId;
            return this;
        }

        /**
         * <p>The names of the keys to query.</p>
         * 
         * <strong>example:</strong>
         * <p>backendsignature</p>
         */
        public Builder signatureName(String signatureName) {
            this.putQueryParameter("SignatureName", signatureName);
            this.signatureName = signatureName;
            return this;
        }

        @Override
        public DescribeSignaturesRequest build() {
            return new DescribeSignaturesRequest(this);
        } 

    } 

}
