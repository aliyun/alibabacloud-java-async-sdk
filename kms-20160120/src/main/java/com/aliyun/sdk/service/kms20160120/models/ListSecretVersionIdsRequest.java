// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretVersionIdsRequest} extends {@link RequestModel}
 *
 * <p>ListSecretVersionIdsRequest</p>
 */
public class ListSecretVersionIdsRequest extends Request {
    @Query
    @NameInMap("IncludeDeprecated")
    private String includeDeprecated;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    private ListSecretVersionIdsRequest(Builder builder) {
        super(builder);
        this.includeDeprecated = builder.includeDeprecated;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretVersionIdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeDeprecated
     */
    public String getIncludeDeprecated() {
        return this.includeDeprecated;
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
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder extends Request.Builder<ListSecretVersionIdsRequest, Builder> {
        private String includeDeprecated; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(ListSecretVersionIdsRequest request) {
            super(request);
            this.includeDeprecated = request.includeDeprecated;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.secretName = request.secretName;
        } 

        /**
         * IncludeDeprecated.
         */
        public Builder includeDeprecated(String includeDeprecated) {
            this.putQueryParameter("IncludeDeprecated", includeDeprecated);
            this.includeDeprecated = includeDeprecated;
            return this;
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
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        @Override
        public ListSecretVersionIdsRequest build() {
            return new ListSecretVersionIdsRequest(this);
        } 

    } 

}
