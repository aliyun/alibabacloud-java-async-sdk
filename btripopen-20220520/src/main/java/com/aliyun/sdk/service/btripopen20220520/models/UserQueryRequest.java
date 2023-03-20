// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserQueryRequest} extends {@link RequestModel}
 *
 * <p>UserQueryRequest</p>
 */
public class UserQueryRequest extends Request {
    @Query
    @NameInMap("modified_time_greater_or_equal_than")
    private String modifiedTimeGreaterOrEqualThan;

    @Query
    @NameInMap("page_size")
    private Integer pageSize;

    @Query
    @NameInMap("page_token")
    private String pageToken;

    @Query
    @NameInMap("third_part_job_no")
    private String thirdPartJobNo;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
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
         * 每页的最大数据记录数量；默认10，该值要求大于0且小于等于1000。
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 游标分页的游标值，用来标记当前分页的开始位置，第一次请求不填表示从头开始遍历；
         */
        public Builder pageToken(String pageToken) {
            this.putQueryParameter("page_token", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * 第三方员工工号，user.job_no
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
