// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link ScanFileRequest} extends {@link RequestModel}
 *
 * <p>ScanFileRequest</p>
 */
public class ScanFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ScanFileInput body;

    private ScanFileRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ScanFileInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ScanFileRequest, Builder> {
        private ScanFileInput body; 

        private Builder() {
            super();
        } 

        private Builder(ScanFileRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ScanFileInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ScanFileRequest build() {
            return new ScanFileRequest(this);
        } 

    } 

}
