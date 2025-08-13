// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeServiceCodeNameRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceCodeNameRequest</p>
 */
public class DescribeServiceCodeNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tab")
    private String tab;

    private DescribeServiceCodeNameRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.tab = builder.tab;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceCodeNameRequest create() {
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
     * @return tab
     */
    public String getTab() {
        return this.tab;
    }

    public static final class Builder extends Request.Builder<DescribeServiceCodeNameRequest, Builder> {
        private String lang; 
        private String tab; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceCodeNameRequest request) {
            super(request);
            this.lang = request.lang;
            this.tab = request.tab;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>FNAENIC</p>
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        @Override
        public DescribeServiceCodeNameRequest build() {
            return new DescribeServiceCodeNameRequest(this);
        } 

    } 

}
