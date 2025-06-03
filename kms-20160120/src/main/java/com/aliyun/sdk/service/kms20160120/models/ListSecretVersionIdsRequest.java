// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link ListSecretVersionIdsRequest} extends {@link RequestModel}
 *
 * <p>ListSecretVersionIdsRequest</p>
 */
public class ListSecretVersionIdsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeDeprecated")
    private String includeDeprecated;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to return deprecated secret versions.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>false: no</li>
         * <li>true: yes</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeDeprecated(String includeDeprecated) {
            this.putQueryParameter("IncludeDeprecated", includeDeprecated);
            this.includeDeprecated = includeDeprecated;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Default value: 10.</p>
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
         * <p>The name of the secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
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
