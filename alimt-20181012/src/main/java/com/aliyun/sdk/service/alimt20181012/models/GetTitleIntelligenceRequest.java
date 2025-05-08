// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

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
 * {@link GetTitleIntelligenceRequest} extends {@link RequestModel}
 *
 * <p>GetTitleIntelligenceRequest</p>
 */
public class GetTitleIntelligenceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CatLevelThreeId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999999D)
    private Long catLevelThreeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CatLevelTwoId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999999999D)
    private Long catLevelTwoId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keywords")
    private String keywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    private GetTitleIntelligenceRequest(Builder builder) {
        super(builder);
        this.catLevelThreeId = builder.catLevelThreeId;
        this.catLevelTwoId = builder.catLevelTwoId;
        this.extra = builder.extra;
        this.keywords = builder.keywords;
        this.platform = builder.platform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTitleIntelligenceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catLevelThreeId
     */
    public Long getCatLevelThreeId() {
        return this.catLevelThreeId;
    }

    /**
     * @return catLevelTwoId
     */
    public Long getCatLevelTwoId() {
        return this.catLevelTwoId;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    public static final class Builder extends Request.Builder<GetTitleIntelligenceRequest, Builder> {
        private Long catLevelThreeId; 
        private Long catLevelTwoId; 
        private String extra; 
        private String keywords; 
        private String platform; 

        private Builder() {
            super();
        } 

        private Builder(GetTitleIntelligenceRequest request) {
            super(request);
            this.catLevelThreeId = request.catLevelThreeId;
            this.catLevelTwoId = request.catLevelTwoId;
            this.extra = request.extra;
            this.keywords = request.keywords;
            this.platform = request.platform;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder catLevelThreeId(Long catLevelThreeId) {
            this.putBodyParameter("CatLevelThreeId", catLevelThreeId);
            this.catLevelThreeId = catLevelThreeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        public Builder catLevelTwoId(Long catLevelTwoId) {
            this.putBodyParameter("CatLevelTwoId", catLevelTwoId);
            this.catLevelTwoId = catLevelTwoId;
            return this;
        }

        /**
         * Extra.
         */
        public Builder extra(String extra) {
            this.putBodyParameter("Extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(String keywords) {
            this.putBodyParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ae</p>
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        @Override
        public GetTitleIntelligenceRequest build() {
            return new GetTitleIntelligenceRequest(this);
        } 

    } 

}
