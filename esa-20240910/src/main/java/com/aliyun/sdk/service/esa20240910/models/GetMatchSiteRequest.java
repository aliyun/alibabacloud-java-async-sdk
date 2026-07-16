// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetMatchSiteRequest} extends {@link RequestModel}
 *
 * <p>GetMatchSiteRequest</p>
 */
public class GetMatchSiteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordName;

    private GetMatchSiteRequest(Builder builder) {
        super(builder);
        this.recordName = builder.recordName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMatchSiteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    public static final class Builder extends Request.Builder<GetMatchSiteRequest, Builder> {
        private String recordName; 

        private Builder() {
            super();
        } 

        private Builder(GetMatchSiteRequest request) {
            super(request);
            this.recordName = request.recordName;
        } 

        /**
         * <p>The record name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder recordName(String recordName) {
            this.putQueryParameter("RecordName", recordName);
            this.recordName = recordName;
            return this;
        }

        @Override
        public GetMatchSiteRequest build() {
            return new GetMatchSiteRequest(this);
        } 

    } 

}
