// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceListRequest</p>
 */
public class DescribeServiceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeServiceListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceListRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeServiceListRequest, Builder> {
        private String lang; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceListRequest request) {
            super(request);
            this.lang = request.lang;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeServiceListRequest build() {
            return new DescribeServiceListRequest(this);
        } 

    } 

}
