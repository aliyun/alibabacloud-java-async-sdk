// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTagListRequest</p>
 */
public class DescribeTagListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    private DescribeTagListRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagListRequest create() {
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

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeTagListRequest, Builder> {
        private String id; 
        private String lang; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTagListRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
            this.regId = request.regId;
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

        /**
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeTagListRequest build() {
            return new DescribeTagListRequest(this);
        } 

    } 

}
