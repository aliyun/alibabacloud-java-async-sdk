// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulDetailsRequest</p>
 */
public class DescribeVulDetailsRequest extends Request {
    @Query
    @NameInMap("AliasName")
    private String aliasName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeVulDetailsRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.lang = builder.lang;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeVulDetailsRequest, Builder> {
        private String aliasName; 
        private String lang; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulDetailsRequest response) {
            super(response);
            this.aliasName = response.aliasName;
            this.lang = response.lang;
            this.name = response.name;
            this.type = response.type;
        } 

        /**
         * AliasName.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
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

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeVulDetailsRequest build() {
            return new DescribeVulDetailsRequest(this);
        } 

    } 

}
