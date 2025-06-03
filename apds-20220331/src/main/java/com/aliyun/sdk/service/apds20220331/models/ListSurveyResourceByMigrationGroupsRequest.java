// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link ListSurveyResourceByMigrationGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListSurveyResourceByMigrationGroupsRequest</p>
 */
public class ListSurveyResourceByMigrationGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private ListSurveyResourceByMigrationGroupsRequestBody body;

    private ListSurveyResourceByMigrationGroupsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSurveyResourceByMigrationGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ListSurveyResourceByMigrationGroupsRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListSurveyResourceByMigrationGroupsRequest, Builder> {
        private ListSurveyResourceByMigrationGroupsRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListSurveyResourceByMigrationGroupsRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ListSurveyResourceByMigrationGroupsRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public ListSurveyResourceByMigrationGroupsRequest build() {
            return new ListSurveyResourceByMigrationGroupsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSurveyResourceByMigrationGroupsRequest} extends {@link TeaModel}
     *
     * <p>ListSurveyResourceByMigrationGroupsRequest</p>
     */
    public static class ListSurveyResourceByMigrationGroupsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ids")
        private java.util.List<Integer> ids;

        private ListSurveyResourceByMigrationGroupsRequestBody(Builder builder) {
            this.ids = builder.ids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListSurveyResourceByMigrationGroupsRequestBody create() {
            return builder().build();
        }

        /**
         * @return ids
         */
        public java.util.List<Integer> getIds() {
            return this.ids;
        }

        public static final class Builder {
            private java.util.List<Integer> ids; 

            private Builder() {
            } 

            private Builder(ListSurveyResourceByMigrationGroupsRequestBody model) {
                this.ids = model.ids;
            } 

            /**
             * ids.
             */
            public Builder ids(java.util.List<Integer> ids) {
                this.ids = ids;
                return this;
            }

            public ListSurveyResourceByMigrationGroupsRequestBody build() {
                return new ListSurveyResourceByMigrationGroupsRequestBody(this);
            } 

        } 

    }
}
