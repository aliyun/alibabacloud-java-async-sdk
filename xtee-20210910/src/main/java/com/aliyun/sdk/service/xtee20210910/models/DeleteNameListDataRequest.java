// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNameListDataRequest} extends {@link RequestModel}
 *
 * <p>DeleteNameListDataRequest</p>
 */
public class DeleteNameListDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("variableId")
    private String variableId;

    private DeleteNameListDataRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.variableId = builder.variableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNameListDataRequest create() {
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
     * @return variableId
     */
    public String getVariableId() {
        return this.variableId;
    }

    public static final class Builder extends Request.Builder<DeleteNameListDataRequest, Builder> {
        private String lang; 
        private String regId; 
        private String variableId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNameListDataRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.variableId = request.variableId;
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
         * variableId.
         */
        public Builder variableId(String variableId) {
            this.putQueryParameter("variableId", variableId);
            this.variableId = variableId;
            return this;
        }

        @Override
        public DeleteNameListDataRequest build() {
            return new DeleteNameListDataRequest(this);
        } 

    } 

}
