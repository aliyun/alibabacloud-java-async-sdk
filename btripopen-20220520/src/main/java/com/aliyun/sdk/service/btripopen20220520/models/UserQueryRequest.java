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

    @Query
    @NameInMap("top_app_key_owner_id")
    private String topAppKeyOwnerId;

    @Query
    @NameInMap("top_authorized_havana_id")
    private String topAuthorizedHavanaId;

    @Query
    @NameInMap("top_authorized_user_nick")
    private String topAuthorizedUserNick;

    private UserQueryRequest(Builder builder) {
        super(builder);
        this.modifiedTimeGreaterOrEqualThan = builder.modifiedTimeGreaterOrEqualThan;
        this.thirdPartCorpId = builder.thirdPartCorpId;
        this.thirdPartJobNo = builder.thirdPartJobNo;
        this.topAppKeyOwnerId = builder.topAppKeyOwnerId;
        this.topAuthorizedHavanaId = builder.topAuthorizedHavanaId;
        this.topAuthorizedUserNick = builder.topAuthorizedUserNick;
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

    /**
     * @return topAppKeyOwnerId
     */
    public String getTopAppKeyOwnerId() {
        return this.topAppKeyOwnerId;
    }

    /**
     * @return topAuthorizedHavanaId
     */
    public String getTopAuthorizedHavanaId() {
        return this.topAuthorizedHavanaId;
    }

    /**
     * @return topAuthorizedUserNick
     */
    public String getTopAuthorizedUserNick() {
        return this.topAuthorizedUserNick;
    }

    public static final class Builder extends Request.Builder<UserQueryRequest, Builder> {
        private String modifiedTimeGreaterOrEqualThan; 
        private String thirdPartCorpId; 
        private String thirdPartJobNo; 
        private String topAppKeyOwnerId; 
        private String topAuthorizedHavanaId; 
        private String topAuthorizedUserNick; 

        private Builder() {
            super();
        } 

        private Builder(UserQueryRequest request) {
            super(request);
            this.modifiedTimeGreaterOrEqualThan = request.modifiedTimeGreaterOrEqualThan;
            this.thirdPartCorpId = request.thirdPartCorpId;
            this.thirdPartJobNo = request.thirdPartJobNo;
            this.topAppKeyOwnerId = request.topAppKeyOwnerId;
            this.topAuthorizedHavanaId = request.topAuthorizedHavanaId;
            this.topAuthorizedUserNick = request.topAuthorizedUserNick;
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

        /**
         * TOP系统参数：appkey拥有者淘宝用户id
         */
        public Builder topAppKeyOwnerId(String topAppKeyOwnerId) {
            this.putQueryParameter("top_app_key_owner_id", topAppKeyOwnerId);
            this.topAppKeyOwnerId = topAppKeyOwnerId;
            return this;
        }

        /**
         * TOP系统参数：授权(淘宝)用户id(Havana id)
         */
        public Builder topAuthorizedHavanaId(String topAuthorizedHavanaId) {
            this.putQueryParameter("top_authorized_havana_id", topAuthorizedHavanaId);
            this.topAuthorizedHavanaId = topAuthorizedHavanaId;
            return this;
        }

        /**
         * TOP系统参数：授权(淘宝)用户nick
         */
        public Builder topAuthorizedUserNick(String topAuthorizedUserNick) {
            this.putQueryParameter("top_authorized_user_nick", topAuthorizedUserNick);
            this.topAuthorizedUserNick = topAuthorizedUserNick;
            return this;
        }

        @Override
        public UserQueryRequest build() {
            return new UserQueryRequest(this);
        } 

    } 

}
