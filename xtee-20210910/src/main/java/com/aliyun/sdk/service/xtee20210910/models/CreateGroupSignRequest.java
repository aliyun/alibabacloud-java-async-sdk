// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupSignRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupSignRequest</p>
 */
public class CreateGroupSignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private CreateGroupSignRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.signList = builder.signList;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupSignRequest create() {
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
     * @return signList
     */
    public String getSignList() {
        return this.signList;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<CreateGroupSignRequest, Builder> {
        private String lang; 
        private String signList; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupSignRequest request) {
            super(request);
            this.lang = request.lang;
            this.signList = request.signList;
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
         * SignList.
         */
        public Builder signList(String signList) {
            this.putQueryParameter("SignList", signList);
            this.signList = signList;
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
        public CreateGroupSignRequest build() {
            return new CreateGroupSignRequest(this);
        } 

    } 

}
