// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeComponentAssetFormRequest} extends {@link RequestModel}
 *
 * <p>DescribeComponentAssetFormRequest</p>
 */
public class DescribeComponentAssetFormRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeComponentAssetFormRequest(Builder builder) {
        super(builder);
        this.componentName = builder.componentName;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentAssetFormRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeComponentAssetFormRequest, Builder> {
        private String componentName; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComponentAssetFormRequest request) {
            super(request);
            this.componentName = request.componentName;
            this.lang = request.lang;
        } 

        /**
         * <p>The component name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python3</p>
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
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

        @Override
        public DescribeComponentAssetFormRequest build() {
            return new DescribeComponentAssetFormRequest(this);
        } 

    } 

}
