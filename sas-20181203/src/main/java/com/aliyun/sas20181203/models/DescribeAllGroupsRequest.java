// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeAllGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAllGroupsRequest</p>
 */
public class DescribeAllGroupsRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;


    private DescribeAllGroupsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllGroupsRequest create() {
        return builder().build();
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String lang; 

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        public DescribeAllGroupsRequest build() {
            return new DescribeAllGroupsRequest(this);
        } 

    } 

}
