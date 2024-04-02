// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBizTypeRequest} extends {@link RequestModel}
 *
 * <p>UpdateBizTypeRequest</p>
 */
public class UpdateBizTypeRequest extends Request {
    @Query
    @NameInMap("BizTypeName")
    @Validation(required = true)
    private String bizTypeName;

    @Query
    @NameInMap("Description")
    private String description;

    private UpdateBizTypeRequest(Builder builder) {
        super(builder);
        this.bizTypeName = builder.bizTypeName;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBizTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypeName
     */
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateBizTypeRequest, Builder> {
        private String bizTypeName; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBizTypeRequest request) {
            super(request);
            this.bizTypeName = request.bizTypeName;
            this.description = request.description;
        } 

        /**
         * BizTypeName.
         */
        public Builder bizTypeName(String bizTypeName) {
            this.putQueryParameter("BizTypeName", bizTypeName);
            this.bizTypeName = bizTypeName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateBizTypeRequest build() {
            return new UpdateBizTypeRequest(this);
        } 

    } 

}
