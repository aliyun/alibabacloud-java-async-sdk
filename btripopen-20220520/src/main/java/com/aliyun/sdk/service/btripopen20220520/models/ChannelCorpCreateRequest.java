// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link ChannelCorpCreateRequest} extends {@link RequestModel}
 *
 * <p>ChannelCorpCreateRequest</p>
 */
public class ChannelCorpCreateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("administrator_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String administratorName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("administrator_phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String administratorPhone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("city")
    private String city;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("corp_name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 50, minLength = 5)
    private String corpName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("province")
    private String province;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    private Integer scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_corp_id")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 50, minLength = 5)
    private String thirdCorpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private ChannelCorpCreateRequest(Builder builder) {
        super(builder);
        this.administratorName = builder.administratorName;
        this.administratorPhone = builder.administratorPhone;
        this.city = builder.city;
        this.corpName = builder.corpName;
        this.province = builder.province;
        this.scope = builder.scope;
        this.thirdCorpId = builder.thirdCorpId;
        this.userId = builder.userId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChannelCorpCreateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return administratorName
     */
    public String getAdministratorName() {
        return this.administratorName;
    }

    /**
     * @return administratorPhone
     */
    public String getAdministratorPhone() {
        return this.administratorPhone;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return corpName
     */
    public String getCorpName() {
        return this.corpName;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return scope
     */
    public Integer getScope() {
        return this.scope;
    }

    /**
     * @return thirdCorpId
     */
    public String getThirdCorpId() {
        return this.thirdCorpId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<ChannelCorpCreateRequest, Builder> {
        private String administratorName; 
        private String administratorPhone; 
        private String city; 
        private String corpName; 
        private String province; 
        private Integer scope; 
        private String thirdCorpId; 
        private String userId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ChannelCorpCreateRequest request) {
            super(request);
            this.administratorName = request.administratorName;
            this.administratorPhone = request.administratorPhone;
            this.city = request.city;
            this.corpName = request.corpName;
            this.province = request.province;
            this.scope = request.scope;
            this.thirdCorpId = request.thirdCorpId;
            this.userId = request.userId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder administratorName(String administratorName) {
            this.putBodyParameter("administrator_name", administratorName);
            this.administratorName = administratorName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18378889782</p>
         */
        public Builder administratorPhone(String administratorPhone) {
            this.putBodyParameter("administrator_phone", administratorPhone);
            this.administratorPhone = administratorPhone;
            return this;
        }

        /**
         * city.
         */
        public Builder city(String city) {
            this.putBodyParameter("city", city);
            this.city = city;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder corpName(String corpName) {
            this.putBodyParameter("corp_name", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * province.
         */
        public Builder province(String province) {
            this.putBodyParameter("province", province);
            this.province = province;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(Integer scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00001</p>
         */
        public Builder thirdCorpId(String thirdCorpId) {
            this.putBodyParameter("third_corp_id", thirdCorpId);
            this.thirdCorpId = thirdCorpId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public ChannelCorpCreateRequest build() {
            return new ChannelCorpCreateRequest(this);
        } 

    } 

}
