// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryUserByMobileAccountRequest} extends {@link RequestModel}
 *
 * <p>QueryUserByMobileAccountRequest</p>
 */
public class QueryUserByMobileAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mobileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mobileUserId;

    private QueryUserByMobileAccountRequest(Builder builder) {
        super(builder);
        this.mobileType = builder.mobileType;
        this.mobileUserId = builder.mobileUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserByMobileAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobileType
     */
    public String getMobileType() {
        return this.mobileType;
    }

    /**
     * @return mobileUserId
     */
    public String getMobileUserId() {
        return this.mobileUserId;
    }

    public static final class Builder extends Request.Builder<QueryUserByMobileAccountRequest, Builder> {
        private String mobileType; 
        private String mobileUserId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserByMobileAccountRequest request) {
            super(request);
            this.mobileType = request.mobileType;
            this.mobileUserId = request.mobileUserId;
        } 

        /**
         * <p>The bound mobile type.</p>
         * <ul>
         * <li>DingTalk: ding</li>
         * <li>WeCom: corp_weixin</li>
         * <li>Lark: feishu</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ding</p>
         */
        public Builder mobileType(String mobileType) {
            this.putQueryParameter("MobileType", mobileType);
            this.mobileType = mobileType;
            return this;
        }

        /**
         * <p>The bound mobile user ID.</p>
         * <ul>
         * <li>DingTalk: The unionId of the DingTalk account.</li>
         * <li>WeCom: The userId of the WeCom account.</li>
         * <li>Lark: The userId of the Lark account.<blockquote>
         * <p>Notice: The mobileUserId must be obtained by calling the relevant API operations of DingTalk, WeCom, or Lark.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sasda</p>
         */
        public Builder mobileUserId(String mobileUserId) {
            this.putQueryParameter("MobileUserId", mobileUserId);
            this.mobileUserId = mobileUserId;
            return this;
        }

        @Override
        public QueryUserByMobileAccountRequest build() {
            return new QueryUserByMobileAccountRequest(this);
        } 

    } 

}
