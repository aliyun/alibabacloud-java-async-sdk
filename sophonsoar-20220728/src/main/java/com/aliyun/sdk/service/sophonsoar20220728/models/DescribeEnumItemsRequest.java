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
 * {@link DescribeEnumItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnumItemsRequest</p>
 */
public class DescribeEnumItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnumType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enumType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeEnumItemsRequest(Builder builder) {
        super(builder);
        this.enumType = builder.enumType;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnumItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enumType
     */
    public String getEnumType() {
        return this.enumType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeEnumItemsRequest, Builder> {
        private String enumType; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnumItemsRequest request) {
            super(request);
            this.enumType = request.enumType;
            this.lang = request.lang;
        } 

        /**
         * <p>The type of the enumeration item. Valid values:</p>
         * <ul>
         * <li><strong>process</strong>: scenarios</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>process</p>
         */
        public Builder enumType(String enumType) {
            this.putQueryParameter("EnumType", enumType);
            this.enumType = enumType;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Simplified Chinese (default)</li>
         * <li><strong>en_us</strong>: English</li>
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
        public DescribeEnumItemsRequest build() {
            return new DescribeEnumItemsRequest(this);
        } 

    } 

}
