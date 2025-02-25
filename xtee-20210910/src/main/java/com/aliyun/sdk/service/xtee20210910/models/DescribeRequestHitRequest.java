// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRequestHitRequest} extends {@link RequestModel}
 *
 * <p>DescribeRequestHitRequest</p>
 */
public class DescribeRequestHitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sRequestId;

    private DescribeRequestHitRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.sRequestId = builder.sRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRequestHitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return sRequestId
     */
    public String getSRequestId() {
        return this.sRequestId;
    }

    public static final class Builder extends Request.Builder<DescribeRequestHitRequest, Builder> {
        private String lang; 
        private String regId; 
        private String sRequestId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRequestHitRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.sRequestId = request.sRequestId;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * sRequestId.
         */
        public Builder sRequestId(String sRequestId) {
            this.putQueryParameter("sRequestId", sRequestId);
            this.sRequestId = sRequestId;
            return this;
        }

        @Override
        public DescribeRequestHitRequest build() {
            return new DescribeRequestHitRequest(this);
        } 

    } 

}
