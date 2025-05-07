// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link RecordClickLinkActionRequest} extends {@link RequestModel}
 *
 * <p>RecordClickLinkActionRequest</p>
 */
public class RecordClickLinkActionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private RecordClickLinkActionRequest(Builder builder) {
        super(builder);
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecordClickLinkActionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<RecordClickLinkActionRequest, Builder> {
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(RecordClickLinkActionRequest request) {
            super(request);
            this.tag = request.tag;
        } 

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public RecordClickLinkActionRequest build() {
            return new RecordClickLinkActionRequest(this);
        } 

    } 

}
