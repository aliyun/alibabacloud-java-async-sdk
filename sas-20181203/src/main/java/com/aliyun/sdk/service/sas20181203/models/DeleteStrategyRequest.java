// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStrategyRequest} extends {@link RequestModel}
 *
 * <p>DeleteStrategyRequest</p>
 */
public class DeleteStrategyRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DeleteStrategyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStrategyRequest create() {
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DeleteStrategyRequest, Builder> {
        private String id; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStrategyRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
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
         * Deletes a baseline check policy.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DeleteStrategyRequest build() {
            return new DeleteStrategyRequest(this);
        } 

    } 

}
