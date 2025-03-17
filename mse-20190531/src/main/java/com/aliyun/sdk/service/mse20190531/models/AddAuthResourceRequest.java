// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link AddAuthResourceRequest} extends {@link RequestModel}
 *
 * <p>AddAuthResourceRequest</p>
 */
public class AddAuthResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthId")
    private Long authId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthResourceHeaderList")
    private java.util.List<AuthResourceHeaderList> authResourceHeaderList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private Long domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreCase")
    private Boolean ignoreCase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    private AddAuthResourceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.authId = builder.authId;
        this.authResourceHeaderList = builder.authResourceHeaderList;
        this.domainId = builder.domainId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.ignoreCase = builder.ignoreCase;
        this.matchType = builder.matchType;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAuthResourceRequest create() {
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
     * @return authId
     */
    public Long getAuthId() {
        return this.authId;
    }

    /**
     * @return authResourceHeaderList
     */
    public java.util.List<AuthResourceHeaderList> getAuthResourceHeaderList() {
        return this.authResourceHeaderList;
    }

    /**
     * @return domainId
     */
    public Long getDomainId() {
        return this.domainId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return ignoreCase
     */
    public Boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<AddAuthResourceRequest, Builder> {
        private String acceptLanguage; 
        private Long authId; 
        private java.util.List<AuthResourceHeaderList> authResourceHeaderList; 
        private Long domainId; 
        private String gatewayUniqueId; 
        private Boolean ignoreCase; 
        private String matchType; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(AddAuthResourceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.authId = request.authId;
            this.authResourceHeaderList = request.authResourceHeaderList;
            this.domainId = request.domainId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.ignoreCase = request.ignoreCase;
            this.matchType = request.matchType;
            this.path = request.path;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the authorization record.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder authId(Long authId) {
            this.putQueryParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * <p>The authentication resource headers.</p>
         */
        public Builder authResourceHeaderList(java.util.List<AuthResourceHeaderList> authResourceHeaderList) {
            String authResourceHeaderListShrink = shrink(authResourceHeaderList, "AuthResourceHeaderList", "json");
            this.putQueryParameter("AuthResourceHeaderList", authResourceHeaderListShrink);
            this.authResourceHeaderList = authResourceHeaderList;
            return this;
        }

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder domainId(Long domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-86575c0bc9f04ecfbacb92b8e392****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>Specifies whether the matching is not case-sensitive. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreCase(Boolean ignoreCase) {
            this.putQueryParameter("IgnoreCase", ignoreCase);
            this.ignoreCase = ignoreCase;
            return this;
        }

        /**
         * <p>The matching type. Valid values:</p>
         * <ul>
         * <li>EQUAL</li>
         * <li>PRE</li>
         * <li>ERGULAR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exact</p>
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/abc</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public AddAuthResourceRequest build() {
            return new AddAuthResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddAuthResourceRequest} extends {@link TeaModel}
     *
     * <p>AddAuthResourceRequest</p>
     */
    public static class AuthResourceHeaderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderKey")
        private String headerKey;

        @com.aliyun.core.annotation.NameInMap("HeaderMethod")
        private String headerMethod;

        @com.aliyun.core.annotation.NameInMap("HeaderValue")
        private String headerValue;

        private AuthResourceHeaderList(Builder builder) {
            this.headerKey = builder.headerKey;
            this.headerMethod = builder.headerMethod;
            this.headerValue = builder.headerValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthResourceHeaderList create() {
            return builder().build();
        }

        /**
         * @return headerKey
         */
        public String getHeaderKey() {
            return this.headerKey;
        }

        /**
         * @return headerMethod
         */
        public String getHeaderMethod() {
            return this.headerMethod;
        }

        /**
         * @return headerValue
         */
        public String getHeaderValue() {
            return this.headerValue;
        }

        public static final class Builder {
            private String headerKey; 
            private String headerMethod; 
            private String headerValue; 

            private Builder() {
            } 

            private Builder(AuthResourceHeaderList model) {
                this.headerKey = model.headerKey;
                this.headerMethod = model.headerMethod;
                this.headerValue = model.headerValue;
            } 

            /**
             * <p>The parameter of the HTTP header.</p>
             * 
             * <strong>example:</strong>
             * <p>Access-Control-Allow-Origin</p>
             */
            public Builder headerKey(String headerKey) {
                this.headerKey = headerKey;
                return this;
            }

            /**
             * <p>The header matching mode.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>SUFFIX</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>EXIST</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>PREFIX</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>EQUAL</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>EXCLUDE</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NOT_EQUAL</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>NOT_EXIST</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>REGREX</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>INCLUDE</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EQUAL</p>
             */
            public Builder headerMethod(String headerMethod) {
                this.headerMethod = headerMethod;
                return this;
            }

            /**
             * <p>The parameter value of the HTTP header.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder headerValue(String headerValue) {
                this.headerValue = headerValue;
                return this;
            }

            public AuthResourceHeaderList build() {
                return new AuthResourceHeaderList(this);
            } 

        } 

    }
}
