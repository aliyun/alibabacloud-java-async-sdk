// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRegistrantProfileRealNameVerificationInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryRegistrantProfileRealNameVerificationInfoRequest</p>
 */
public class QueryRegistrantProfileRealNameVerificationInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FetchImage")
    private Boolean fetchImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long registrantProfileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryRegistrantProfileRealNameVerificationInfoRequest(Builder builder) {
        super(builder);
        this.fetchImage = builder.fetchImage;
        this.lang = builder.lang;
        this.registrantProfileId = builder.registrantProfileId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRegistrantProfileRealNameVerificationInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fetchImage
     */
    public Boolean getFetchImage() {
        return this.fetchImage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return registrantProfileId
     */
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryRegistrantProfileRealNameVerificationInfoRequest, Builder> {
        private Boolean fetchImage; 
        private String lang; 
        private Long registrantProfileId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryRegistrantProfileRealNameVerificationInfoRequest request) {
            super(request);
            this.fetchImage = request.fetchImage;
            this.lang = request.lang;
            this.registrantProfileId = request.registrantProfileId;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * FetchImage.
         */
        public Builder fetchImage(Boolean fetchImage) {
            this.putQueryParameter("FetchImage", fetchImage);
            this.fetchImage = fetchImage;
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
         * <p>This parameter is required.</p>
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryRegistrantProfileRealNameVerificationInfoRequest build() {
            return new QueryRegistrantProfileRealNameVerificationInfoRequest(this);
        } 

    } 

}
