// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiGroupsRequest</p>
 */
public class DescribeApiGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeApiGroupsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.apiRegionId = builder.apiRegionId;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiGroupsRequest create() {
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
     * @return apiRegionId
     */
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeApiGroupsRequest, Builder> {
        private String lang; 
        private String apiRegionId; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiGroupsRequest request) {
            super(request);
            this.lang = request.lang;
            this.apiRegionId = request.apiRegionId;
            this.regId = request.regId;
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
         * apiRegionId.
         */
        public Builder apiRegionId(String apiRegionId) {
            this.putQueryParameter("apiRegionId", apiRegionId);
            this.apiRegionId = apiRegionId;
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

        @Override
        public DescribeApiGroupsRequest build() {
            return new DescribeApiGroupsRequest(this);
        } 

    } 

}
