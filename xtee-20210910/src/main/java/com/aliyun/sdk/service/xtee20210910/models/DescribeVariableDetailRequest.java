// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVariableDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeVariableDetailRequest</p>
 */
public class DescribeVariableDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeVariableDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.id = builder.id;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableDetailRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeVariableDetailRequest, Builder> {
        private String lang; 
        private Long id; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVariableDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.id = request.id;
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
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
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
        public DescribeVariableDetailRequest build() {
            return new DescribeVariableDetailRequest(this);
        } 

    } 

}
