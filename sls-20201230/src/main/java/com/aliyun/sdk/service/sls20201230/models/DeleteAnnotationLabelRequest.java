// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link DeleteAnnotationLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteAnnotationLabelRequest</p>
 */
public class DeleteAnnotationLabelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("labelId")
    private String labelId;

    private DeleteAnnotationLabelRequest(Builder builder) {
        super(builder);
        this.labelId = builder.labelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAnnotationLabelRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAnnotationLabelRequest, Builder> {
        private String labelId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAnnotationLabelRequest request) {
            super(request);
            this.labelId = request.labelId;
        } 

        /**
         * <p>The tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sls_builtin_4e0aba6d9664073513e9954fb57bd799</p>
         */
        public Builder labelId(String labelId) {
            this.putPathParameter("labelId", labelId);
            this.labelId = labelId;
            return this;
        }

        @Override
        public DeleteAnnotationLabelRequest build() {
            return new DeleteAnnotationLabelRequest(this);
        } 

    } 

}
