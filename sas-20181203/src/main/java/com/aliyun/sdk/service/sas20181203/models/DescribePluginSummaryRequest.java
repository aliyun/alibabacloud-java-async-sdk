// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribePluginSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribePluginSummaryRequest</p>
 */
public class DescribePluginSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginName")
    private String pluginName;

    private DescribePluginSummaryRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.pluginName = builder.pluginName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginSummaryRequest create() {
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
     * @return pluginName
     */
    public String getPluginName() {
        return this.pluginName;
    }

    public static final class Builder extends Request.Builder<DescribePluginSummaryRequest, Builder> {
        private String lang; 
        private String pluginName; 

        private Builder() {
            super();
        } 

        private Builder(DescribePluginSummaryRequest request) {
            super(request);
            this.lang = request.lang;
            this.pluginName = request.pluginName;
        } 

        /**
         * <p>The language of the content within the request and response.**** Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default)</li>
         * <li><strong>en</strong></li>
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
         * <p>The name of the plug-in. Valid values:</p>
         * <ul>
         * <li>alinet: AliNet.</li>
         * <li>alisecguard: client protection.</li>
         * <li>alihips: AliHips.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alihips</p>
         */
        public Builder pluginName(String pluginName) {
            this.putQueryParameter("PluginName", pluginName);
            this.pluginName = pluginName;
            return this;
        }

        @Override
        public DescribePluginSummaryRequest build() {
            return new DescribePluginSummaryRequest(this);
        } 

    } 

}
