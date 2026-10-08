// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link ListEmailVerificationRequest} extends {@link RequestModel}
 *
 * <p>ListEmailVerificationRequest</p>
 */
public class ListEmailVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginCreateTime")
    private Long beginCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndCreateTime")
    private Long endCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerificationStatus")
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

        private Builder(ListEmailVerificationRequest request) {
            super(request);
            this.beginCreateTime = request.beginCreateTime;
            this.email = request.email;
            this.endCreateTime = request.endCreateTime;
            this.lang = request.lang;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.userClientIp = request.userClientIp;
            this.verificationStatus = request.verificationStatus;
        } 

        /**
         * <p>The start time for querying email verification creation, represented as the number of milliseconds since 00:00 on January 1, 1970, UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder beginCreateTime(Long beginCreateTime) {
            this.putQueryParameter("BeginCreateTime", beginCreateTime);
            this.beginCreateTime = beginCreateTime;
            return this;
        }

        /**
         * <p>The email address to query. You can upload only one email address at a time.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The end time for querying the creation of email verification, calculated as the number of milliseconds since 00:00 UTC on January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder endCreateTime(Long endCreateTime) {
            this.putQueryParameter("EndCreateTime", endCreateTime);
            this.endCreateTime = endCreateTime;
            return this;
        }

        /**
         * <p>Language of error messages returned by the API. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.  </li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default value is <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The page number for paging through the domain list. Default value is <strong>1</strong>. You can set this parameter based on your needs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The page size for paging through the domain list. Default value is <strong>500</strong>, and the maximum value is <strong>5000</strong>. You can set this parameter based on your needs.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>User IP address. You can set it to <strong>127.0.0.1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>Email verification status. Valid values:  </p>
         * <ul>
         * <li><strong>0</strong>: Waiting for verification.  </li>
         * <li><strong>1</strong>: Verification succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
