// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRegistrantProfilesRequest} extends {@link RequestModel}
 *
 * <p>QueryRegistrantProfilesRequest</p>
 */
public class QueryRegistrantProfilesRequest extends Request {
    @Query
    @NameInMap("DefaultRegistrantProfile")
    private Boolean defaultRegistrantProfile;

    @Query
    @NameInMap("Email")
    private String email;

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
    @NameInMap("RealNameStatus")
    private String realNameStatus;

    @Query
    @NameInMap("RegistrantOrganization")
    private String registrantOrganization;

    @Query
    @NameInMap("RegistrantProfileId")
    private Long registrantProfileId;

    @Query
    @NameInMap("RegistrantProfileType")
    private String registrantProfileType;

    @Query
    @NameInMap("RegistrantType")
    private String registrantType;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

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
        this.userClientIp = builder.userClientIp;
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
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
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
        private String userClientIp; 

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
            this.userClientIp = request.userClientIp;
        } 

        /**
         * DefaultRegistrantProfile.
         */
        public Builder defaultRegistrantProfile(Boolean defaultRegistrantProfile) {
            this.putQueryParameter("DefaultRegistrantProfile", defaultRegistrantProfile);
            this.defaultRegistrantProfile = defaultRegistrantProfile;
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
         * RealNameStatus.
         */
        public Builder realNameStatus(String realNameStatus) {
            this.putQueryParameter("RealNameStatus", realNameStatus);
            this.realNameStatus = realNameStatus;
            return this;
        }

        /**
         * RegistrantOrganization.
         */
        public Builder registrantOrganization(String registrantOrganization) {
            this.putQueryParameter("RegistrantOrganization", registrantOrganization);
            this.registrantOrganization = registrantOrganization;
            return this;
        }

        /**
         * RegistrantProfileId.
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.putQueryParameter("RegistrantProfileId", registrantProfileId);
            this.registrantProfileId = registrantProfileId;
            return this;
        }

        /**
         * RegistrantProfileType.
         */
        public Builder registrantProfileType(String registrantProfileType) {
            this.putQueryParameter("RegistrantProfileType", registrantProfileType);
            this.registrantProfileType = registrantProfileType;
            return this;
        }

        /**
         * RegistrantType.
         */
        public Builder registrantType(String registrantType) {
            this.putQueryParameter("RegistrantType", registrantType);
            this.registrantType = registrantType;
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

        @Override
        public QueryRegistrantProfilesRequest build() {
            return new QueryRegistrantProfilesRequest(this);
        } 

    } 

}
