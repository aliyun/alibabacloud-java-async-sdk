// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNameListRequest} extends {@link RequestModel}
 *
 * <p>DeleteNameListRequest</p>
 */
public class DeleteNameListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DeleteNameListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.ids = builder.ids;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNameListRequest create() {
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
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DeleteNameListRequest, Builder> {
        private String lang; 
        private String ids; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNameListRequest request) {
            super(request);
            this.lang = request.lang;
            this.ids = request.ids;
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
         * ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("ids", ids);
            this.ids = ids;
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
        public DeleteNameListRequest build() {
            return new DeleteNameListRequest(this);
        } 

    } 

}
