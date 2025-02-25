// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRegionsRequest</p>
 */
public class DescribeRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
    private Long authorizedUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcType")
    private String vpcType;

    private DescribeRegionsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.authorizedUserId = builder.authorizedUserId;
        this.lang = builder.lang;
        this.scene = builder.scene;
        this.userClientIp = builder.userClientIp;
        this.vpcType = builder.vpcType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return authorizedUserId
     */
    public Long getAuthorizedUserId() {
        return this.authorizedUserId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return vpcType
     */
    public String getVpcType() {
        return this.vpcType;
    }

    public static final class Builder extends Request.Builder<DescribeRegionsRequest, Builder> {
        private String acceptLanguage; 
        private Long authorizedUserId; 
        private String lang; 
        private String scene; 
        private String userClientIp; 
        private String vpcType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRegionsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.authorizedUserId = request.authorizedUserId;
            this.lang = request.lang;
            this.scene = request.scene;
            this.userClientIp = request.userClientIp;
            this.vpcType = request.vpcType;
        } 

        /**
         * <p>The supported language. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US: English</li>
         * </ul>
         * <p>Default value: en-US.</p>
         * <blockquote>
         * <p> AcceptLanguage has a higher priority than Lang.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the permissions on the resources are granted.</p>
         * 
         * <strong>example:</strong>
         * <p>141339776561****</p>
         */
        public Builder authorizedUserId(Long authorizedUserId) {
            this.putQueryParameter("AuthorizedUserId", authorizedUserId);
            this.authorizedUserId = authorizedUserId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
         * <blockquote>
         * <p> Lang has a lower priority than AcceptLanguage.</p>
         * </blockquote>
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
         * <p>The scenario. Valid values:</p>
         * <ul>
         * <li>AUTH: the built-in authoritative module</li>
         * <li>FWD: the forward module</li>
         * <li>RA: the traffic analysis module</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTH</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>The VPC type. Valid values:</p>
         * <ul>
         * <li>STANDARD: standard VPC</li>
         * <li>EDS: Elastic Desktop Service (EDS) workspace VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder vpcType(String vpcType) {
            this.putQueryParameter("VpcType", vpcType);
            this.vpcType = vpcType;
            return this;
        }

        @Override
        public DescribeRegionsRequest build() {
            return new DescribeRegionsRequest(this);
        } 

    } 

}
