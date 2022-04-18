// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskLevelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskLevelsRequest</p>
 */
public class DescribeRiskLevelsRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeRiskLevelsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskLevelsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRiskLevelsRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskLevelsRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeRiskLevelsRequest build() {
            return new DescribeRiskLevelsRequest(this);
        } 

    } 

}
