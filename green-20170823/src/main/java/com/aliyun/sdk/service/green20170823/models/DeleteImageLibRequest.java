// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageLibRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageLibRequest</p>
 */
public class DeleteImageLibRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Integer id;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DeleteImageLibRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DeleteImageLibRequest, Builder> {
        private Integer id; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageLibRequest request) {
            super(request);
            this.id = request.id;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public DeleteImageLibRequest build() {
            return new DeleteImageLibRequest(this);
        } 

    } 

}
