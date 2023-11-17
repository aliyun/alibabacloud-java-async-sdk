// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentAssetFormRequest} extends {@link RequestModel}
 *
 * <p>DescribeComponentAssetFormRequest</p>
 */
public class DescribeComponentAssetFormRequest extends Request {
    @Query
    @NameInMap("ComponentName")
    @Validation(required = true)
    private String componentName;

    @Query
    @NameInMap("Lang")
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
         * ComponentName.
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
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
        public DescribeComponentAssetFormRequest build() {
            return new DescribeComponentAssetFormRequest(this);
        } 

    } 

}
