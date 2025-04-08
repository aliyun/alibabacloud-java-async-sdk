// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ImportCorpNumbersRequest} extends {@link RequestModel}
 *
 * <p>ImportCorpNumbersRequest</p>
 */
public class ImportCorpNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorpName")
    private String corpName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String numberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private String tagList;

    private ImportCorpNumbersRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.corpName = builder.corpName;
        this.numberList = builder.numberList;
        this.provider = builder.provider;
        this.province = builder.province;
        this.tagList = builder.tagList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportCorpNumbersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return corpName
     */
    public String getCorpName() {
        return this.corpName;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return tagList
     */
    public String getTagList() {
        return this.tagList;
    }

    public static final class Builder extends Request.Builder<ImportCorpNumbersRequest, Builder> {
        private String city; 
        private String corpName; 
        private String numberList; 
        private String provider; 
        private String province; 
        private String tagList; 

        private Builder() {
            super();
        } 

        private Builder(ImportCorpNumbersRequest request) {
            super(request);
            this.city = request.city;
            this.corpName = request.corpName;
            this.numberList = request.numberList;
            this.provider = request.provider;
            this.province = request.province;
            this.tagList = request.tagList;
        } 

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * CorpName.
         */
        public Builder corpName(String corpName) {
            this.putQueryParameter("CorpName", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;02912345678&quot;]</p>
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * TagList.
         */
        public Builder tagList(String tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        @Override
        public ImportCorpNumbersRequest build() {
            return new ImportCorpNumbersRequest(this);
        } 

    } 

}
