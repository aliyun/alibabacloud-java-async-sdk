// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefaultIPSConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefaultIPSConfigRequest</p>
 */
public class DescribeDefaultIPSConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeDefaultIPSConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefaultIPSConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDefaultIPSConfigRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefaultIPSConfigRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh** (default)
         * *   **en**
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeDefaultIPSConfigRequest build() {
            return new DescribeDefaultIPSConfigRequest(this);
        } 

    } 

}
