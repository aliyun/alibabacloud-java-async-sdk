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
 * {@link GetHotwordLibraryRequest} extends {@link RequestModel}
 *
 * <p>GetHotwordLibraryRequest</p>
 */
public class GetHotwordLibraryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotwordLibraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotwordLibraryId;

    private GetHotwordLibraryRequest(Builder builder) {
        super(builder);
        this.hotwordLibraryId = builder.hotwordLibraryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotwordLibraryRequest create() {
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

    public static final class Builder extends Request.Builder<GetHotwordLibraryRequest, Builder> {
        private String hotwordLibraryId; 

        private Builder() {
            super();
        } 

        private Builder(GetHotwordLibraryRequest request) {
            super(request);
            this.hotwordLibraryId = request.hotwordLibraryId;
        } 

        /**
         * <p>The ID of the hotword library.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        public Builder hotwordLibraryId(String hotwordLibraryId) {
            this.putQueryParameter("HotwordLibraryId", hotwordLibraryId);
            this.hotwordLibraryId = hotwordLibraryId;
            return this;
        }

        @Override
        public GetHotwordLibraryRequest build() {
            return new GetHotwordLibraryRequest(this);
        } 

    } 

}
