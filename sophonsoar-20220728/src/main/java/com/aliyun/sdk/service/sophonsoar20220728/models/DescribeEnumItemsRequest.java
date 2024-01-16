// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnumItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnumItemsRequest</p>
 */
public class DescribeEnumItemsRequest extends Request {
    @Query
    @NameInMap("EnumType")
    @Validation(required = true)
    private String enumType;

    @Query
    @NameInMap("Lang")
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
         * The type of the enumeration item. Valid values:
         * <p>
         * 
         * *   **process**: scenarios
         */
        public Builder enumType(String enumType) {
            this.putQueryParameter("EnumType", enumType);
            this.enumType = enumType;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Simplified Chinese (default)
         * *   **en_us**: English
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
