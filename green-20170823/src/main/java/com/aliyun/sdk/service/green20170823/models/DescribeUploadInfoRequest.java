// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUploadInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeUploadInfoRequest</p>
 */
public class DescribeUploadInfoRequest extends Request {
    @Query
    @NameInMap("Biz")
    @Validation(required = true)
    private String biz;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeUploadInfoRequest(Builder builder) {
        super(builder);
        this.biz = builder.biz;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUploadInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return biz
     */
    public String getBiz() {
        return this.biz;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeUploadInfoRequest, Builder> {
        private String biz; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUploadInfoRequest request) {
            super(request);
            this.biz = request.biz;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Biz.
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeUploadInfoRequest build() {
            return new DescribeUploadInfoRequest(this);
        } 

    } 

}
