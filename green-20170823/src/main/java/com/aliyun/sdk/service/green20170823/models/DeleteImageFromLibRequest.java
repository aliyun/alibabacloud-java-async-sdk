// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageFromLibRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageFromLibRequest</p>
 */
public class DeleteImageFromLibRequest extends Request {
    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private String ids;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DeleteImageFromLibRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageFromLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DeleteImageFromLibRequest, Builder> {
        private String ids; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageFromLibRequest request) {
            super(request);
            this.ids = request.ids;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
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
        public DeleteImageFromLibRequest build() {
            return new DeleteImageFromLibRequest(this);
        } 

    } 

}
