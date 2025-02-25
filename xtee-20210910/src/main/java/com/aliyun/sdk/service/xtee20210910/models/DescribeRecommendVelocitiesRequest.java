// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecommendVelocitiesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecommendVelocitiesRequest</p>
 */
public class DescribeRecommendVelocitiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DescribeRecommendVelocitiesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.code = builder.code;
        this.regId = builder.regId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendVelocitiesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeRecommendVelocitiesRequest, Builder> {
        private String lang; 
        private String code; 
        private String regId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecommendVelocitiesRequest request) {
            super(request);
            this.lang = request.lang;
            this.code = request.code;
            this.regId = request.regId;
            this.type = request.type;
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
         * code.
         */
        public Builder code(String code) {
            this.putQueryParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeRecommendVelocitiesRequest build() {
            return new DescribeRecommendVelocitiesRequest(this);
        } 

    } 

}
