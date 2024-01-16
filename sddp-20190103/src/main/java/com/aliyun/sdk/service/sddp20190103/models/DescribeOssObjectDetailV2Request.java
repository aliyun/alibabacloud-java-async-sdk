// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssObjectDetailV2Request} extends {@link RequestModel}
 *
 * <p>DescribeOssObjectDetailV2Request</p>
 */
public class DescribeOssObjectDetailV2Request extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeOssObjectDetailV2Request(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssObjectDetailV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeOssObjectDetailV2Request, Builder> {
        private String id; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssObjectDetailV2Request request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public DescribeOssObjectDetailV2Request build() {
            return new DescribeOssObjectDetailV2Request(this);
        } 

    } 

}
