// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVariableBindDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeVariableBindDetailRequest</p>
 */
public class DescribeVariableBindDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("defineId")
    private Long defineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeVariableBindDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.defineId = builder.defineId;
        this.id = builder.id;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableBindDetailRequest create() {
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
     * @return defineId
     */
    public Long getDefineId() {
        return this.defineId;
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

    public static final class Builder extends Request.Builder<DescribeVariableBindDetailRequest, Builder> {
        private String lang; 
        private Long defineId; 
        private Long id; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVariableBindDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.defineId = request.defineId;
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
         * defineId.
         */
        public Builder defineId(Long defineId) {
            this.putQueryParameter("defineId", defineId);
            this.defineId = defineId;
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
        public DescribeVariableBindDetailRequest build() {
            return new DescribeVariableBindDetailRequest(this);
        } 

    } 

}
