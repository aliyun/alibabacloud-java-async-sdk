// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAppInstanceForAdminRequest} extends {@link RequestModel}
 *
 * <p>GetAppInstanceForAdminRequest</p>
 */
public class GetAppInstanceForAdminRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    private GetAppInstanceForAdminRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppInstanceForAdminRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<GetAppInstanceForAdminRequest, Builder> {
        private String bizId; 
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(GetAppInstanceForAdminRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.domain = request.domain;
        } 

        /**
         * <p>The ID of the delivery receipt. The delivery receipt ID is the value of the BizId parameter that is returned when you call the SendSms or SendBatchSms operation.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250801154628000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>Wildcard domain names are supported. You can use the wildcard character asterisk (*) to specify a wildcard domain name.</li>
         * </ul>
         * <p>For example, you can enter *.baidu.com to specify the domain name baidu.com.</p>
         * 
         * <strong>example:</strong>
         * <p>yjdw.bpu.edu.cn-waf</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public GetAppInstanceForAdminRequest build() {
            return new GetAppInstanceForAdminRequest(this);
        } 

    } 

}
