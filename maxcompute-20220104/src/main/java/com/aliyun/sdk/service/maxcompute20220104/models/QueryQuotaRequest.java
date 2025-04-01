// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link QueryQuotaRequest} extends {@link RequestModel}
 *
 * <p>QueryQuotaRequest</p>
 */
public class QueryQuotaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AkProven")
    private String akProven;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mock")
    private Boolean mock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private QueryQuotaRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.akProven = builder.akProven;
        this.mock = builder.mock;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return akProven
     */
    public String getAkProven() {
        return this.akProven;
    }

    /**
     * @return mock
     */
    public Boolean getMock() {
        return this.mock;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryQuotaRequest, Builder> {
        private String nickname; 
        private String akProven; 
        private Boolean mock; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryQuotaRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.akProven = request.akProven;
            this.mock = request.mock;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The quota name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>%E9%BB%98%E8%AE%A4%E9%A2%84%E4%BB%98%E8%B4%B9Quota_p</p>
         * <h1>The Chinese name must be encoded and escaped by using UTF-8 URL encoding.</h1>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The trusted AccessKey pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder akProven(String akProven) {
            this.putQueryParameter("AkProven", akProven);
            this.akProven = akProven;
            return this;
        }

        /**
         * <p>Specifies whether to include submodules. Valid values: true and false. -true: The request includes submodules. -false (default): The request does not include submodules.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder mock(Boolean mock) {
            this.putQueryParameter("mock", mock);
            this.mock = mock;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>483212237127906</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryQuotaRequest build() {
            return new QueryQuotaRequest(this);
        } 

    } 

}
