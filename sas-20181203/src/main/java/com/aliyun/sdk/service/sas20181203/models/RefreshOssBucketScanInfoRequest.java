// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link RefreshOssBucketScanInfoRequest} extends {@link RequestModel}
 *
 * <p>RefreshOssBucketScanInfoRequest</p>
 */
public class RefreshOssBucketScanInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private RefreshOssBucketScanInfoRequest(Builder builder) {
        super(builder);
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshOssBucketScanInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<RefreshOssBucketScanInfoRequest, Builder> {
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(RefreshOssBucketScanInfoRequest request) {
            super(request);
            this.source = request.source;
        } 

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public RefreshOssBucketScanInfoRequest build() {
            return new RefreshOssBucketScanInfoRequest(this);
        } 

    } 

}
