// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudAccessRequest} extends {@link RequestModel}
 *
 * <p>ListCloudAccessRequest</p>
 */
public class ListCloudAccessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudName")
    private String cloudName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    private String secretId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    private ListCloudAccessRequest(Builder builder) {
        super(builder);
        this.cloudName = builder.cloudName;
        this.currentPage = builder.currentPage;
        this.secretId = builder.secretId;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAccessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudName
     */
    public String getCloudName() {
        return this.cloudName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<ListCloudAccessRequest, Builder> {
        private String cloudName; 
        private Integer currentPage; 
        private String secretId; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudAccessRequest request) {
            super(request);
            this.cloudName = request.cloudName;
            this.currentPage = request.currentPage;
            this.secretId = request.secretId;
            this.showSize = request.showSize;
        } 

        /**
         * The cloud service provider.
         */
        public Builder cloudName(String cloudName) {
            this.putQueryParameter("CloudName", cloudName);
            this.cloudName = cloudName;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The AccessKey secret used to access the cloud service.
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        /**
         * The number of certificates per page. Default value: **20**.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public ListCloudAccessRequest build() {
            return new ListCloudAccessRequest(this);
        } 

    } 

}
