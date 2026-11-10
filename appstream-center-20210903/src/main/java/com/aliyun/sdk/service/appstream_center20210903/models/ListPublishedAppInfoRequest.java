// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903.models;

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
 * {@link ListPublishedAppInfoRequest} extends {@link RequestModel}
 *
 * <p>ListPublishedAppInfoRequest</p>
 */
public class ListPublishedAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Long categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryType")
    private Long categoryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientOS")
    private String clientOS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginRegionId")
    private String loginRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderParam")
    private String orderParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    private ListPublishedAppInfoRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.bizRegionId = builder.bizRegionId;
        this.categoryId = builder.categoryId;
        this.categoryType = builder.categoryType;
        this.clientId = builder.clientId;
        this.clientIp = builder.clientIp;
        this.clientOS = builder.clientOS;
        this.clientVersion = builder.clientVersion;
        this.endUserId = builder.endUserId;
        this.loginRegionId = builder.loginRegionId;
        this.loginToken = builder.loginToken;
        this.orderParam = builder.orderParam;
        this.productType = builder.productType;
        this.sessionId = builder.sessionId;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedAppInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return categoryType
     */
    public Long getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientOS
     */
    public String getClientOS() {
        return this.clientOS;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return loginRegionId
     */
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return orderParam
     */
    public String getOrderParam() {
        return this.orderParam;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<ListPublishedAppInfoRequest, Builder> {
        private String appName; 
        private String bizRegionId; 
        private Long categoryId; 
        private Long categoryType; 
        private String clientId; 
        private String clientIp; 
        private String clientOS; 
        private String clientVersion; 
        private String endUserId; 
        private String loginRegionId; 
        private String loginToken; 
        private String orderParam; 
        private String productType; 
        private String sessionId; 
        private String sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListPublishedAppInfoRequest request) {
            super(request);
            this.appName = request.appName;
            this.bizRegionId = request.bizRegionId;
            this.categoryId = request.categoryId;
            this.categoryType = request.categoryType;
            this.clientId = request.clientId;
            this.clientIp = request.clientIp;
            this.clientOS = request.clientOS;
            this.clientVersion = request.clientVersion;
            this.endUserId = request.endUserId;
            this.loginRegionId = request.loginRegionId;
            this.loginToken = request.loginToken;
            this.orderParam = request.orderParam;
            this.productType = request.productType;
            this.sessionId = request.sessionId;
            this.sortType = request.sortType;
        } 

        /**
         * <p>The application name.
         * This parameter is used for fuzzy search based on the application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Microsoft Word</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The region ID of the delivery group. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The specific category information of the application, which is the secondary category.
         * Valid values:</p>
         * <ul>
         * <li>1: All applications</li>
         * <li>2: Design software</li>
         * <li>3: Programming and development</li>
         * <li>4: Office essentials</li>
         * <li>5: Input methods</li>
         * <li>6: Image and video</li>
         * <li>7: System tools</li>
         * <li>8: Browsers</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The primary category of the application. Valid values:</p>
         * <ul>
         * <li>0: Cloud application</li>
         * <li>1: Cloud game</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder categoryType(Long categoryType) {
            this.putQueryParameter("CategoryType", categoryType);
            this.categoryType = categoryType;
            return this;
        }

        /**
         * <p>The unique ID generated by the client.</p>
         * 
         * <strong>example:</strong>
         * <p>17b38aaa-761f-44c5-9862-2ad0f5025d15</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>125.80.132.13</p>
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The operating system of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>windows_\&quot;Windows 10 Enterprise\&quot; 10.0 (Build 14393)</p>
         */
        public Builder clientOS(String clientOS) {
            this.putQueryParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * <p>The client version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.1-D-20211008.101607</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The username of the convenience account.</p>
         * 
         * <strong>example:</strong>
         * <p>test.test</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The region ID of appstream-center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder loginRegionId(String loginRegionId) {
            this.putQueryParameter("LoginRegionId", loginRegionId);
            this.loginRegionId = loginRegionId;
            return this;
        }

        /**
         * <p>The logon credential.
         * The LoginToken is an encrypted string in v2 format that uses Base64 encoding and must be obtained through a user authentication session. After the client completes the user authentication flow, the authentication service returns the LoginToken, which must be used together with the SessionId returned in the same authentication.
         * RefreshLoginToken belongs to the appstream-center 2021-02-20 version. The current version (2021-09-03) does not provide this operation.
         * Note: This parameter is actually required. If it is not provided, the API returns InvalidParameter.loginToken (400).</p>
         * 
         * <strong>example:</strong>
         * <p>v2c4e2ef03d62******</p>
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The sort field. By default, applications are sorted by application name.</p>
         * 
         * <strong>example:</strong>
         * <p>APP_NAME</p>
         */
        public Builder orderParam(String orderParam) {
            this.putQueryParameter("OrderParam", orderParam);
            this.orderParam = orderParam;
            return this;
        }

        /**
         * <p>The product type. Set the value to CloudApp, which indicates WUYING Cloud App.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The session ID.
         * You can obtain this parameter from the SessionId response parameter of the GetLoginToken logon operation.</p>
         * <p>Note: This parameter is actually required and must be provided together with LoginToken. If it is not provided, the API returns InvalidParameter.sessionId (400).</p>
         * 
         * <strong>example:</strong>
         * <p>c261a6a1-e242-4f4b-813c-5fe807e49f03</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The sort order. By default, applications are sorted in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        @Override
        public ListPublishedAppInfoRequest build() {
            return new ListPublishedAppInfoRequest(this);
        } 

    } 

}
