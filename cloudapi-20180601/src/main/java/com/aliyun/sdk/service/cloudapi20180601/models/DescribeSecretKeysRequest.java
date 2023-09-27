// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecretKeysRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecretKeysRequest</p>
 */
public class DescribeSecretKeysRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SecretKeyId")
    private String secretKeyId;

    @Query
    @NameInMap("SecretKeyName")
    private String secretKeyName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeSecretKeysRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.secretKeyId = builder.secretKeyId;
        this.secretKeyName = builder.secretKeyName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecretKeysRequest create() {
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
     * @return secretKeyId
     */
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    /**
     * @return secretKeyName
     */
    public String getSecretKeyName() {
        return this.secretKeyName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeSecretKeysRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String secretKeyId; 
        private String secretKeyName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecretKeysRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.secretKeyId = request.secretKeyId;
            this.secretKeyName = request.secretKeyName;
            this.securityToken = request.securityToken;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SecretKeyId.
         */
        public Builder secretKeyId(String secretKeyId) {
            this.putQueryParameter("SecretKeyId", secretKeyId);
            this.secretKeyId = secretKeyId;
            return this;
        }

        /**
         * SecretKeyName.
         */
        public Builder secretKeyName(String secretKeyName) {
            this.putQueryParameter("SecretKeyName", secretKeyName);
            this.secretKeyName = secretKeyName;
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
        public DescribeSecretKeysRequest build() {
            return new DescribeSecretKeysRequest(this);
        } 

    } 

}
