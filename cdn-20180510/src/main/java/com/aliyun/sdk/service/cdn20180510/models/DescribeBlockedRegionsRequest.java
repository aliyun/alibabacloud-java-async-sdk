// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeBlockedRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBlockedRegionsRequest</p>
 */
public class DescribeBlockedRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    private DescribeBlockedRegionsRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlockedRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder extends Request.Builder<DescribeBlockedRegionsRequest, Builder> {
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBlockedRegionsRequest request) {
            super(request);
            this.language = request.language;
        } 

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: simplified Chinese</li>
         * <li><strong>en</strong>: English</li>
         * <li><strong>jp</strong>: Japanese</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        @Override
        public DescribeBlockedRegionsRequest build() {
            return new DescribeBlockedRegionsRequest(this);
        } 

    } 

}
