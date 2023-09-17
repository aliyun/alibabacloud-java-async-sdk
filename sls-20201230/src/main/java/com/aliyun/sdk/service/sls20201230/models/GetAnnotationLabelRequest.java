// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAnnotationLabelRequest} extends {@link RequestModel}
 *
 * <p>GetAnnotationLabelRequest</p>
 */
public class GetAnnotationLabelRequest extends Request {
    @Path
    @NameInMap("labelId")
    private String labelId;

    private GetAnnotationLabelRequest(Builder builder) {
        super(builder);
        this.labelId = builder.labelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAnnotationLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    public static final class Builder extends Request.Builder<GetAnnotationLabelRequest, Builder> {
        private String labelId; 

        private Builder() {
            super();
        } 

        private Builder(GetAnnotationLabelRequest request) {
            super(request);
            this.labelId = request.labelId;
        } 

        /**
         * labelId.
         */
        public Builder labelId(String labelId) {
            this.putPathParameter("labelId", labelId);
            this.labelId = labelId;
            return this;
        }

        @Override
        public GetAnnotationLabelRequest build() {
            return new GetAnnotationLabelRequest(this);
        } 

    } 

}
