// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomLineRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomLineRequest</p>
 */
public class DeleteCustomLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lineId;

    private DeleteCustomLineRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.lineId = builder.lineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomLineRequest create() {
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
     * @return lineId
     */
    public String getLineId() {
        return this.lineId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomLineRequest, Builder> {
        private String lang; 
        private String lineId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomLineRequest request) {
            super(request);
            this.lang = request.lang;
            this.lineId = request.lineId;
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
         * LineId.
         */
        public Builder lineId(String lineId) {
            this.putQueryParameter("LineId", lineId);
            this.lineId = lineId;
            return this;
        }

        @Override
        public DeleteCustomLineRequest build() {
            return new DeleteCustomLineRequest(this);
        } 

    } 

}
