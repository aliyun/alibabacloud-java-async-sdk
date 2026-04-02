// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTempFileTasksRequest} extends {@link RequestModel}
 *
 * <p>DeleteTempFileTasksRequest</p>
 */
public class DeleteTempFileTasksRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TempFileTaskIds")
    private java.util.List<String> tempFileTaskIds;

    private DeleteTempFileTasksRequest(Builder builder) {
        super(builder);
        this.tempFileTaskIds = builder.tempFileTaskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTempFileTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tempFileTaskIds
     */
    public java.util.List<String> getTempFileTaskIds() {
        return this.tempFileTaskIds;
    }

    public static final class Builder extends Request.Builder<DeleteTempFileTasksRequest, Builder> {
        private java.util.List<String> tempFileTaskIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTempFileTasksRequest request) {
            super(request);
            this.tempFileTaskIds = request.tempFileTaskIds;
        } 

        /**
         * TempFileTaskIds.
         */
        public Builder tempFileTaskIds(java.util.List<String> tempFileTaskIds) {
            this.putBodyParameter("TempFileTaskIds", tempFileTaskIds);
            this.tempFileTaskIds = tempFileTaskIds;
            return this;
        }

        @Override
        public DeleteTempFileTasksRequest build() {
            return new DeleteTempFileTasksRequest(this);
        } 

    } 

}
