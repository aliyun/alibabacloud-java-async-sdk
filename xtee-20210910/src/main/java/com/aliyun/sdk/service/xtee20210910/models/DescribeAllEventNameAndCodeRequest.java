// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllEventNameAndCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeAllEventNameAndCodeRequest</p>
 */
public class DescribeAllEventNameAndCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeAllEventNameAndCodeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllEventNameAndCodeRequest create() {
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
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeAllEventNameAndCodeRequest, Builder> {
        private String lang; 
        private String createType; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAllEventNameAndCodeRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.regId = request.regId;
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
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
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

        @Override
        public DescribeAllEventNameAndCodeRequest build() {
            return new DescribeAllEventNameAndCodeRequest(this);
        } 

    } 

}
