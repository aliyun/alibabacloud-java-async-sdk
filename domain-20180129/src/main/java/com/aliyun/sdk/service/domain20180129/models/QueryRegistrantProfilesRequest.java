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
 * {@link QueryRegistrantProfilesRequest} extends {@link RequestModel}
 *
 * <p>QueryRegistrantProfilesRequest</p>
 */
public class QueryRegistrantProfilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRegistrantProfile")
    private Boolean defaultRegistrantProfile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

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
    @com.aliyun.core.annotation.NameInMap("RealNameStatus")
    private String realNameStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantOrganization")
    private String registrantOrganization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
    private Long registrantProfileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileType")
    private String registrantProfileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantType")
    private String registrantType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZhRegistrantOrganization")
    private String zhRegistrantOrganization;

    private QueryRegistrantProfilesRequest(Builder builder) {
        super(builder);
        this.defaultRegistrantProfile = builder.defaultRegistrantProfile;
        this.email = builder.email;
        this.lang = builder.lang;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.realNameStatus = builder.realNameStatus;
        this.registrantOrganization = builder.registrantOrganization;
        this.registrantProfileId = builder.registrantProfileId;
        this.registrantProfileType = builder.registrantProfileType;
        this.registrantType = builder.registrantType;
        this.remark = builder.remark;
        this.userClientIp = builder.userClientIp;
        this.zhRegistrantOrganization = builder.zhRegistrantOrganization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRegistrantProfilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultRegistrantProfile
     */
    public Boolean getDefaultRegistrantProfile() {
        return this.defaultRegistrantProfile;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
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
     * @return realNameStatus
     */
    public String getRealNameStatus() {
        return this.realNameStatus;
    }

    /**
     * @return registrantOrganization
     */
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    /**
     * @return registrantProfileId
     */
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    /**
     * @return registrantProfileType
     */
    public String getRegistrantProfileType() {
        return this.registrantProfileType;
    }

    /**
     * @return registrantType
     */
    public String getRegistrantType() {
        return this.registrantType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return zhRegistrantOrganization
     */
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

    public static final class Builder extends Request.Builder<QueryRegistrantProfilesRequest, Builder> {
        private Boolean defaultRegistrantProfile; 
        private String email; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String realNameStatus; 
        private String registrantOrganization; 
        private Long registrantProfileId; 
        private String registrantProfileType; 
        private String registrantType; 
        private String remark; 
        private String userClientIp; 
        private String zhRegistrantOrganization; 

        private Builder() {
            super();
        } 

        private Builder(QueryRegistrantProfilesRequest request) {
            super(request);
            this.defaultRegistrantProfile = request.defaultRegistrantProfile;
            this.email = request.email;
            this.lang = request.lang;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.realNameStatus = request.realNameStatus;
            this.registrantOrganization = request.registrantOrganization;
            this.registrantProfileId = request.registrantProfileId;
            this.registrantProfileType = request.registrantProfileType;
            this.registrantType = request.registrantType;
            this.remark = request.remark;
            this.userClientIp = request.userClientIp;
            this.zhRegistrantOrganization = request.zhRegistrantOrganization;
        } 

        /**
         * <p>Specifies whether to query the default profile. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder defaultRegistrantProfile(Boolean defaultRegistrantProfile) {
            this.putQueryParameter("DefaultRegistrantProfile", defaultRegistrantProfile);
            this.defaultRegistrantProfile = defaultRegistrantProfile;
            return this;
        }

        /**
         * <p>The email address of the domain name registrant.</p>
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
         * <p>The language of the error message to return if the request fails. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
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
         * <p>The number of the page to return. Default value: <strong>0</strong>.</p>
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
         * <p>The number of entries per page. Default value: <strong>0</strong>. Maximum value: <strong>5000</strong>.</p>
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
         * <p>The state of real-name verification for the domain name registrant. Valid values:</p>
         * <ul>
         * <li><strong>FAILED</strong>: Real-name verification for the domain name fails.</li>
         * <li><strong>SUCCEED</strong>: Real-name verification for the domain name is successful.</li>
         * <li><strong>NONAUDIT</strong>: Real-name verification for the domain name is not performed.</li>
         * <li><strong>AUDITING</strong>: Real-name verification for the domain name is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        public Builder realNameStatus(String realNameStatus) {
            this.putQueryParameter("RealNameStatus", realNameStatus);
            this.realNameStatus = realNameStatus;
            return this;
        }

        /**
         * <p>The name of the domain name registrant.</p>
         * 
         * <strong>example:</strong>
         * <p>li si</p>
         */
        public Builder registrantOrganization(String registrantOrganization) {
            this.putQueryParameter("RegistrantOrganization", registrantOrganization);
            this.registrantOrganization = registrantOrganization;
            return this;
        }

        /**
         * <p>The ID of the registrant profile that you want to query. The system generates an ID after you create a registrant profile.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.putQueryParameter("RegistrantProfileId", registrantProfileId);
            this.registrantProfileId = registrantProfileId;
            return this;
        }

        /**
         * <p>The type of the registrant profile. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: common profile.</li>
         * <li><strong>cnnic</strong>: China Internet Network Information Center (CNNIC) profile.</li>
         * </ul>
         * <blockquote>
         * <p> Only the Alibaba Cloud international site (alibabacloud.com) supports CNNIC profiles. To register domain names provided by CNNIC such as the .cn and . domain names on the Alibaba Cloud international site, you must use a CNNIC profile. To register other domain names, use a common profile.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        public Builder registrantProfileType(String registrantProfileType) {
            this.putQueryParameter("RegistrantProfileType", registrantProfileType);
            this.registrantProfileType = registrantProfileType;
            return this;
        }

        /**
         * <p>The type of the domain name registrant. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: individual.</li>
         * <li><strong>2</strong>: enterprise.</li>
         * </ul>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder registrantType(String registrantType) {
            this.putQueryParameter("RegistrantType", registrantType);
            this.registrantType = registrantType;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Test domain name</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The IP address of the client. Set the value to 127.0.0.1.</p>
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
         * <p>The Chinese name of the domain name registrant.</p>
         */
        public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
            this.putQueryParameter("ZhRegistrantOrganization", zhRegistrantOrganization);
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }

        @Override
        public QueryRegistrantProfilesRequest build() {
            return new QueryRegistrantProfilesRequest(this);
        } 

    } 

}
