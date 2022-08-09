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
    @NameInMap("third_part_corp_id")
    @Validation(required = true)
    private String thirdPartCorpId;

    @Query
    @NameInMap("third_part_job_no")
    private String thirdPartJobNo;

    private UserQueryRequest(Builder builder) {
        super(builder);
        this.modifiedTimeGreaterOrEqualThan = builder.modifiedTimeGreaterOrEqualThan;
        this.thirdPartCorpId = builder.thirdPartCorpId;
        this.thirdPartJobNo = builder.thirdPartJobNo;
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
     * @return thirdPartCorpId
     */
    public String getThirdPartCorpId() {
        return this.thirdPartCorpId;
    }

    /**
     * @return thirdPartJobNo
     */
    public String getThirdPartJobNo() {
        return this.thirdPartJobNo;
    }

    public static final class Builder extends Request.Builder<UserQueryRequest, Builder> {
        private String modifiedTimeGreaterOrEqualThan; 
        private String thirdPartCorpId; 
        private String thirdPartJobNo; 

        private Builder() {
            super();
        } 

        private Builder(UserQueryRequest request) {
            super(request);
            this.modifiedTimeGreaterOrEqualThan = request.modifiedTimeGreaterOrEqualThan;
            this.thirdPartCorpId = request.thirdPartCorpId;
            this.thirdPartJobNo = request.thirdPartJobNo;
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
         * 第三方企业ID，isv_api_authority.corp_id
         */
        public Builder thirdPartCorpId(String thirdPartCorpId) {
            this.putQueryParameter("third_part_corp_id", thirdPartCorpId);
            this.thirdPartCorpId = thirdPartCorpId;
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

        @Override
        public UserQueryRequest build() {
            return new UserQueryRequest(this);
        } 

    } 

}
