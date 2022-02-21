// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEmailVerificationRequest} extends {@link RequestModel}
 *
 * <p>ListEmailVerificationRequest</p>
 */
public class ListEmailVerificationRequest extends Request {
    @Query
    @NameInMap("BeginCreateTime")
    private Long beginCreateTime;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("EndCreateTime")
    private Long endCreateTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    @Query
    @NameInMap("VerificationStatus")
    private Integer verificationStatus;

    private ListEmailVerificationRequest(Builder builder) {
        super(builder);
        this.beginCreateTime = builder.beginCreateTime;
        this.email = builder.email;
        this.endCreateTime = builder.endCreateTime;
        this.lang = builder.lang;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.userClientIp = builder.userClientIp;
        this.verificationStatus = builder.verificationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEmailVerificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginCreateTime
     */
    public Long getBeginCreateTime() {
        return this.beginCreateTime;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return endCreateTime
     */
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return verificationStatus
     */
    public Integer getVerificationStatus() {
        return this.verificationStatus;
    }

    public static final class Builder extends Request.Builder<ListEmailVerificationRequest, Builder> {
        private Long beginCreateTime; 
        private String email; 
        private Long endCreateTime; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String userClientIp; 
        private Integer verificationStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListEmailVerificationRequest response) {
            super(response);
            this.beginCreateTime = response.beginCreateTime;
            this.email = response.email;
            this.endCreateTime = response.endCreateTime;
            this.lang = response.lang;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.userClientIp = response.userClientIp;
            this.verificationStatus = response.verificationStatus;
        } 

        /**
         * BeginCreateTime.
         */
        public Builder beginCreateTime(Long beginCreateTime) {
            this.putQueryParameter("BeginCreateTime", beginCreateTime);
            this.beginCreateTime = beginCreateTime;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * EndCreateTime.
         */
        public Builder endCreateTime(Long endCreateTime) {
            this.putQueryParameter("EndCreateTime", endCreateTime);
            this.endCreateTime = endCreateTime;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * VerificationStatus.
         */
        public Builder verificationStatus(Integer verificationStatus) {
            this.putQueryParameter("VerificationStatus", verificationStatus);
            this.verificationStatus = verificationStatus;
            return this;
        }

        @Override
        public ListEmailVerificationRequest build() {
            return new ListEmailVerificationRequest(this);
        } 

    } 

}
