// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomOcrTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomOcrTemplateRequest</p>
 */
public class DescribeCustomOcrTemplateRequest extends Request {
    @Query
    @NameInMap("Ids")
    private String ids;

    private DescribeCustomOcrTemplateRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomOcrTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCustomOcrTemplateRequest, Builder> {
        private String ids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomOcrTemplateRequest request) {
            super(request);
            this.ids = request.ids;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        @Override
        public DescribeCustomOcrTemplateRequest build() {
            return new DescribeCustomOcrTemplateRequest(this);
        } 

    } 

}
