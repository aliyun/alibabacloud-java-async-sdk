// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ListCredentialsRequest} extends {@link RequestModel}
 *
 * <p>ListCredentialsRequest</p>
 */
public class ListCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("credentialAuthType")
    private String credentialAuthType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("credentialSourceType")
    private String credentialSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    private ListCredentialsRequest(Builder builder) {
        super(builder);
        this.credentialAuthType = builder.credentialAuthType;
        this.credentialName = builder.credentialName;
        this.credentialSourceType = builder.credentialSourceType;
        this.enabled = builder.enabled;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.provider = builder.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCredentialsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialAuthType
     */
    public String getCredentialAuthType() {
        return this.credentialAuthType;
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return credentialSourceType
     */
    public String getCredentialSourceType() {
        return this.credentialSourceType;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder extends Request.Builder<ListCredentialsRequest, Builder> {
        private String credentialAuthType; 
        private String credentialName; 
        private String credentialSourceType; 
        private Boolean enabled; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String provider; 

        private Builder() {
            super();
        } 

        private Builder(ListCredentialsRequest request) {
            super(request);
            this.credentialAuthType = request.credentialAuthType;
            this.credentialName = request.credentialName;
            this.credentialSourceType = request.credentialSourceType;
            this.enabled = request.enabled;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.provider = request.provider;
        } 

        /**
         * <p>credentialAuthType</p>
         * 
         * <strong>example:</strong>
         * <p>credentialAuthType</p>
         */
        public Builder credentialAuthType(String credentialAuthType) {
            this.putQueryParameter("credentialAuthType", credentialAuthType);
            this.credentialAuthType = credentialAuthType;
            return this;
        }

        /**
         * <p>credentialName</p>
         * 
         * <strong>example:</strong>
         * <p>credentialName</p>
         */
        public Builder credentialName(String credentialName) {
            this.putQueryParameter("credentialName", credentialName);
            this.credentialName = credentialName;
            return this;
        }

        /**
         * <p>credentialSourceType</p>
         * 
         * <strong>example:</strong>
         * <p>credentialSourceType</p>
         */
        public Builder credentialSourceType(String credentialSourceType) {
            this.putQueryParameter("credentialSourceType", credentialSourceType);
            this.credentialSourceType = credentialSourceType;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.putQueryParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        @Override
        public ListCredentialsRequest build() {
            return new ListCredentialsRequest(this);
        } 

    } 

}
