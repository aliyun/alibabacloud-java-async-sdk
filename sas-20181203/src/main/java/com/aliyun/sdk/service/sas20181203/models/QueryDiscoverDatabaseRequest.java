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
 * {@link QueryDiscoverDatabaseRequest} extends {@link RequestModel}
 *
 * <p>QueryDiscoverDatabaseRequest</p>
 */
public class QueryDiscoverDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateMark")
    private String createMark;

    private QueryDiscoverDatabaseRequest(Builder builder) {
        super(builder);
        this.createMark = builder.createMark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDiscoverDatabaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createMark
     */
    public String getCreateMark() {
        return this.createMark;
    }

    public static final class Builder extends Request.Builder<QueryDiscoverDatabaseRequest, Builder> {
        private String createMark; 

        private Builder() {
            super();
        } 

        private Builder(QueryDiscoverDatabaseRequest request) {
            super(request);
            this.createMark = request.createMark;
        } 

        /**
         * <p>The ID of the scan task.</p>
         * <blockquote>
         * <p>You can call the <a href="~~StartDiscoverDatabaseTask~~">StartDiscoverDatabaseTask</a> operation to query the ID of the task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>7f7b051f-7d1c-46da-b253-a03f3a27****</p>
         */
        public Builder createMark(String createMark) {
            this.putQueryParameter("CreateMark", createMark);
            this.createMark = createMark;
            return this;
        }

        @Override
        public QueryDiscoverDatabaseRequest build() {
            return new QueryDiscoverDatabaseRequest(this);
        } 

    } 

}
