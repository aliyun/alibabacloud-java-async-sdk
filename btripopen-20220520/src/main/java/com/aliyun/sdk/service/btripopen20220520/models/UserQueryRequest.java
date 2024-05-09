// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserQueryRequest} extends {@link RequestModel}
 *
 * <p>UserQueryRequest</p>
 */
public class UserQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modified_time_greater_or_equal_than")
    private String modifiedTimeGreaterOrEqualThan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_token")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("third_part_job_no")
    private String thirdPartJobNo;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private UserQueryRequest(Builder builder) {
        super(builder);
        this.modifiedTimeGreaterOrEqualThan = builder.modifiedTimeGreaterOrEqualThan;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.thirdPartJobNo = builder.thirdPartJobNo;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifiedTimeGreaterOrEqualThan
     */
    public String getModifiedTimeGreaterOrEqualThan() {
        return this.modifiedTimeGreaterOrEqualThan;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return thirdPartJobNo
     */
    public String getThirdPartJobNo() {
        return this.thirdPartJobNo;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<UserQueryRequest, Builder> {
        private String modifiedTimeGreaterOrEqualThan; 
        private Integer pageSize; 
        private String pageToken; 
        private String thirdPartJobNo; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(UserQueryRequest request) {
            super(request);
            this.modifiedTimeGreaterOrEqualThan = request.modifiedTimeGreaterOrEqualThan;
            this.pageSize = request.pageSize;
            this.pageToken = request.pageToken;
            this.thirdPartJobNo = request.thirdPartJobNo;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * modified_time_greater_or_equal_than.
         */
        public Builder modifiedTimeGreaterOrEqualThan(String modifiedTimeGreaterOrEqualThan) {
            this.putQueryParameter("modified_time_greater_or_equal_than", modifiedTimeGreaterOrEqualThan);
            this.modifiedTimeGreaterOrEqualThan = modifiedTimeGreaterOrEqualThan;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * page_token.
         */
        public Builder pageToken(String pageToken) {
            this.putQueryParameter("page_token", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * third_part_job_no.
         */
        public Builder thirdPartJobNo(String thirdPartJobNo) {
            this.putQueryParameter("third_part_job_no", thirdPartJobNo);
            this.thirdPartJobNo = thirdPartJobNo;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public UserQueryRequest build() {
            return new UserQueryRequest(this);
        } 

    } 

}
