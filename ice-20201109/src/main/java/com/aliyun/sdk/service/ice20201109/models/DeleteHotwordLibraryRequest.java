// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteHotwordLibraryRequest} extends {@link RequestModel}
 *
 * <p>DeleteHotwordLibraryRequest</p>
 */
public class DeleteHotwordLibraryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotwordLibraryId")
    private String hotwordLibraryId;

    private DeleteHotwordLibraryRequest(Builder builder) {
        super(builder);
        this.hotwordLibraryId = builder.hotwordLibraryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHotwordLibraryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotwordLibraryId
     */
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

    public static final class Builder extends Request.Builder<DeleteHotwordLibraryRequest, Builder> {
        private String hotwordLibraryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHotwordLibraryRequest request) {
            super(request);
            this.hotwordLibraryId = request.hotwordLibraryId;
        } 

        /**
         * <p>The ID of the hotword library that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        public Builder hotwordLibraryId(String hotwordLibraryId) {
            this.putQueryParameter("HotwordLibraryId", hotwordLibraryId);
            this.hotwordLibraryId = hotwordLibraryId;
            return this;
        }

        @Override
        public DeleteHotwordLibraryRequest build() {
            return new DeleteHotwordLibraryRequest(this);
        } 

    } 

}
